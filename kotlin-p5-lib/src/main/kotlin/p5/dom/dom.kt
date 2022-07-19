/**
 * @file The web is much more than just canvas and the DOM functionality makes it easy to interact
 * with other HTML5 objects, including text, hyperlink, image, input, video,
 * audio, and webcam.
 * There is a set of creation methods, DOM manipulation methods, and
 * an extended <a href="#/p5.Element">p5.Element</a> that supports a range of HTML elements. See the
 * <a href='https://github.com/processing/p5.js/wiki/Beyond-the-canvas'>
 * beyond the canvas tutorial</a> for a full overview of how this addon works.
 *
 * See <a href='https://github.com/processing/p5.js/wiki/Beyond-the-canvas'>tutorial: beyond the canvas</a>
 * for more info on how to use this library.</a>
 *
 * @module DOM
 * @submodule DOM
 * @for p5
 * @requires p5
 */

@file:Suppress("unused", "KDocUnresolvedReference")

package p5.dom

import kotlinx.js.Object
import org.w3c.dom.DragEvent
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.mediacapture.MediaStream
import p5.core.p5


/**
 * Searches the page for the first element that matches the given CSS selector string (can be an
 * ID, class, tag name or a combination) and returns it as a <a href="#/p5.Element">p5.Element</a>.
 * The DOM node itself can be accessed with .elt.
 * Returns null if none found. You can also specify a container to search within.
 *
 * @method select
 * @param  {String} [e] CSS selector string of element to search for
 * @param  {String|p5.Element|HTMLElement} [p] CSS selector string, <a href="#/p5.Element">p5.Element</a>, or
 *                                                     HTML element to search within
 * @return {p5.Element|null} <a href="#/p5.Element">p5.Element</a> containing node found
 * @example
 * <div><code>
 * function setup() {
 *   createCanvas(50, 50);
 *   background(30);
 *   // move canvas down and right
 *   select('canvas').position(10, 30);
 * }
 * </code></div>
 *
 * <div class="norender"><code>
 * // select using ID
 * let a = select('#container');
 * let b = select('#beep', '#container');
 * let c;
 * if (a) {
 *   // select using class
 *   c = select('.boop', a);
 * }
 * // select using CSS selector string
 * let d = select('#container #bleep');
 * let e = select('#container p');
 * [a, b, c, d, e]; // unused
 * </code></div>
 */
inline fun p5.select(e: String, p: p5.Element): p5.Element? =
    asDynamic().select(e, p).unsafeCast<p5.Element?>()

inline fun p5.select(e: String, p: String): p5.Element? =
    asDynamic().select(e, p).unsafeCast<p5.Element?>()

inline fun p5.select(e: String, p: Element): p5.Element? =
    asDynamic().select(e, p).unsafeCast<p5.Element?>()


/**
 * Searches the page for elements that match the given CSS selector string (can be an ID a class,
 * tag name or a combination) and returns them as <a href="#/p5.Element">p5.Element</a>s in
 * an array.
 * The DOM node itself can be accessed with .elt.
 * Returns an empty array if none found.
 * You can also specify a container to search within.
 *
 * @method selectAll
 * @param  {String} [e] CSS selector string of elements to search for
 * @param  {String|p5.Element|HTMLElement} [p] CSS selector string, <a href="#/p5.Element">p5.Element</a>
 *                                             , or HTML element to search within
 * @return {p5.Element[]} Array of <a href="#/p5.Element">p5.Element</a>s containing nodes found
 * @example
 * <div><code>
 * function setup() {
 *   createButton('btn');
 *   createButton('2nd btn');
 *   createButton('3rd btn');
 *   let buttons = selectAll('button');
 *
 *   for (let i = 0; i < 3; i++) {
 *     buttons[i].size(100);
 *     buttons[i].position(0, i * 30);
 *   }
 * }
 * </code></div>
 * <div><code>
 * // these are all valid calls to selectAll()
 * let a = selectAll('.beep');
 * a = selectAll('div');
 * a = selectAll('button', '#container');
 *
 * let b = createDiv();
 * b.id('container');
 * let c = select('#container');
 * a = selectAll('p', c);
 * a = selectAll('#container p');
 *
 * let d = document.getElementById('container');
 * a = selectAll('.boop', d);
 * a = selectAll('#container .boop');
 * console.log(a);
 * </code></div>
 */
inline fun p5.selectAll(e: String, p: p5.Element): Array<p5.Element> =
    asDynamic().selectAll(e, p).unsafeCast<Array<p5.Element>>()

inline fun p5.selectAll(e: String, p: String): Array<p5.Element> =
    asDynamic().selectAll(e, p).unsafeCast<Array<p5.Element>>()

inline fun p5.selectAll(e: String, p: Element): Array<p5.Element> =
    asDynamic().selectAll(e, p).unsafeCast<Array<p5.Element>>()


/**
 * Removes all elements created by p5, except any canvas / graphics
 * elements created by <a href="#/p5/createCanvas">createCanvas</a> or <a href="#/p5/createGraphics">createGraphics</a>.
 * Event handlers are removed, and element is removed from the DOM.
 * @method removeElements
 * @example
 * <div><code>
 * function setup() {
 *   createCanvas(100, 100);
 *   background('grey');
 *   let div = createDiv('this is some text');
 *   let p = createP('this is a paragraph');
 *   div.style('font-size', '16px');
 *   p.style('font-size', '16px');
 * }
 * function mousePressed() {
 *   removeElements(); // this will remove the div and p, not canvas
 * }
 * </code></div>
 */
inline fun p5.removeElements() { asDynamic().removeElements() }


/**
 * The .<a href="#/p5.Element/changed">changed()</a> function is called when the value of an
 * element changes.
 * This can be used to attach an element specific event listener.
 *
 * @method changed
 * @param  {Function|Boolean} [fxn] function to be fired when the value of
 *                                  an element changes.
 *                                  if `false` is passed instead, the previously
 *                                  firing function will no longer fire.
 * @chainable
 * @example
 * <div><code>
 * let sel;
 *
 * function setup() {
 *   textAlign(CENTER);
 *   background(200);
 *   sel = createSelect();
 *   sel.position(10, 10);
 *   sel.option('pear');
 *   sel.option('kiwi');
 *   sel.option('grape');
 *   sel.changed(mySelectEvent);
 * }
 *
 * function mySelectEvent() {
 *   let item = sel.value();
 *   background(200);
 *   text("it's a " + item + '!', 50, 50);
 * }
 * </code></div>
 *
 * <div><code>
 * let checkbox;
 * let cnv;
 *
 * function setup() {
 *   checkbox = createCheckbox(' fill');
 *   checkbox.changed(changeFill);
 *   cnv = createCanvas(100, 100);
 *   cnv.position(0, 30);
 *   noFill();
 * }
 *
 * function draw() {
 *   background(200);
 *   ellipse(50, 50, 50, 50);
 * }
 *
 * function changeFill() {
 *   if (checkbox.checked()) {
 *     fill(0);
 *   } else {
 *     noFill();
 *   }
 * }
 * </code></div>
 *
 * @alt
 * dropdown: pear, kiwi, grape. When selected text "it's a" + selection shown.
 */
inline fun p5.Element.changed(noinline fxn: () -> Unit): p5.Element = asDynamic().changed(fxn).unsafeCast<p5.Element>()

inline fun p5.Element.changed(): p5.Element = asDynamic().changed(false).unsafeCast<p5.Element>()


/**
 * The .<a href="#/p5.Element/input">input()</a> function is called when any user input is
 * detected with an element. The input event is often used
 * to detect keystrokes in a input element, or changes on a
 * slider element. This can be used to attach an element specific
 * event listener.
 *
 * @method input
 * @param  {Function|Boolean} [fxn] function to be fired when any user input is
 *                                  detected within the element.
 *                                  if `false` is passed instead, the previously
 *                                  firing function will no longer fire.
 * @chainable
 * @example
 * <div><code>
 * // Open your console to see the output
 * function setup() {
 *   createCanvas(100, 100);
 *   background('grey');
 *   let inp = createInput('');
 *   inp.position(0, 0);
 *   inp.size(100);
 *   inp.input(myInputEvent);
 * }
 *
 * function myInputEvent() {
 *   console.log('you are typing: ', this.value());
 * }
 * </code></div>
 *
 * @alt
 * no display.
 */
inline fun p5.Element.input(noinline fxn: () -> Unit): p5.Element = asDynamic().input(fxn).unsafeCast<p5.Element>()

inline fun p5.Element.input(): p5.Element = asDynamic().input(false).unsafeCast<p5.Element>()


/**
 * Creates a `&lt;div&gt;&lt;/div&gt;` element in the DOM with given inner HTML.
 *
 * @method createDiv
 * @param  {String} [html] inner HTML for element created
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let div = createDiv('this is some text');
 * div.style('font-size', '16px');
 * div.position(10, 0);
 * </code></div>
 */
inline fun p5.createDiv(html: String? = undefined): p5.Element = asDynamic().createDiv(html).unsafeCast<p5.Element>()


/**
 * Creates a `&lt;p&gt;&lt;/p&gt;` element in the DOM with given inner HTML. Used
 * for paragraph length text.
 *
 * @method createP
 * @param  {String} [html] inner HTML for element created
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let p = createP('this is some text');
 * p.style('font-size', '16px');
 * p.position(10, 0);
 * </code></div>
 */
inline fun p5.createP(html: String? = undefined): p5.Element = asDynamic().createP(html).unsafeCast<p5.Element>()


/**
 * Creates a `&lt;span&gt;&lt;/span&gt;` element in the DOM with given inner HTML.
 *
 * @method createSpan
 * @param  {String} [html] inner HTML for element created
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let span = createSpan('this is some text');
 * span.position(0, 0);
 * </code></div>
 */
inline fun p5.createSpan(html: String? = undefined): p5.Element = asDynamic().createSpan(html).unsafeCast<p5.Element>()


/**
 * Creates an `&lt;img&gt;` element in the DOM with given src and
 * alternate text.
 *
 * @method createImg
 * @param  {String} [src]
 * @param  {String} [alt]
 * @param  {String} [crossOrigin] <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes">crossOrigin property</a>
 *                  of the `img` element; use either 'anonymous' or 'use-credentials' to retrieve the image with cross-origin
 *                  access (for later use with `canvas`. if an empty string(`""`) is passed, CORS is not used
 * @param  {Function} [successCallback] callback to be called once image data is loaded with the <a href="#/p5.Element">p5.Element</a> as argument
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 *  <div><code>
 * let img = createImg(
 *   'https://p5js.org/assets/img/asterisk-01.png',
 *   'the p5 magenta asterisk'
 * );
 * img.position(0, -10);
 * </code></div>
 */
inline fun p5.createImg(
    src: String,
    alt: String? = undefined,
    crossOrigin: String? = undefined,
    noinline successCallback: (p5.Element) -> Unit = {}
): p5.Element = asDynamic().createImg(src, alt, crossOrigin, successCallback).unsafeCast<p5.Element>()


/**
 * Creates an `&lt;a&gt;&lt;/a&gt;` element in the DOM for including a hyperlink.
 *
 * @method createA
 * @param  {String} [href] url of page to link to
 * @param  {String} [html] inner html of link element to display
 * @param  {String} [target] target where new link should open,
 *                             could be _blank, _self, _parent, _top.
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let a = createA('http://p5js.org/', 'this is a link');
 * a.position(0, 0);
 * </code></div>
 */
inline fun p5.createA(href: String, html: String, target: String? = undefined): p5.Element =
    asDynamic().createA(href, html, target).unsafeCast<p5.Element>()


/** INPUT **/


/**
 * Creates a slider `&lt;input&gt;&lt;/input&gt;` element in the DOM.
 * Use .size() to set the display length of the slider.
 *
 * @method createSlider
 * @param  {Number} [min] minimum value of the slider
 * @param  {Number} [max] maximum value of the slider
 * @param  {Number} [value] default value of the slider
 * @param  {Number} [step] step size for each tick of the slider (if step is set to 0, the slider will move continuously from the minimum to the maximum value)
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding the created node
 * @example
 * <div><code>
 * let slider;
 * function setup() {
 *   slider = createSlider(0, 255, 100);
 *   slider.position(10, 10);
 *   slider.style('width', '80px');
 * }
 *
 * function draw() {
 *   let val = slider.value();
 *   background(val);
 * }
 * </code></div>
 *
 * <div><code>
 * let slider;
 * function setup() {
 *   colorMode(HSB);
 *   slider = createSlider(0, 360, 60, 40);
 *   slider.position(10, 10);
 *   slider.style('width', '80px');
 * }
 *
 * function draw() {
 *   let val = slider.value();
 *   background(val, 100, 100, 1);
 * }
 * </code></div>
 */
inline fun p5.createSlider(min: Double, max: Double, value: Double? = undefined, step: Double? = undefined): p5.Element =
    asDynamic().createSlider(min, max, value, step).unsafeCast<p5.Element>()

inline fun p5.createSlider(min: Float, max: Float, value: Float? = undefined, step: Float? = undefined): p5.Element =
    asDynamic().createSlider(min, max, value, step).unsafeCast<p5.Element>()

inline fun p5.createSlider(min: Int, max: Int, value: Int? = undefined, step: Int? = undefined): p5.Element =
    asDynamic().createSlider(min, max, value, step).unsafeCast<p5.Element>()

inline fun p5.createSlider(min: Long, max: Long, value: Long? = undefined, step: Long? = undefined): p5.Element =
    asDynamic().createSlider(min, max, value, step).unsafeCast<p5.Element>()


/**
 * Creates a `&lt;button&gt;&lt;/button&gt;` element in the DOM.
 * Use .size() to set the display size of the button.
 * Use .mousePressed() to specify behavior on press.
 *
 * @method createButton
 * @param  {String} [label] label displayed on the button
 * @param  {String} [value] value of the button
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let button;
 * function setup() {
 *   createCanvas(100, 100);
 *   background(0);
 *   button = createButton('click me');
 *   button.position(0, 0);
 *   button.mousePressed(changeBG);
 * }
 *
 * function changeBG() {
 *   let val = random(255);
 *   background(val);
 * }
 * </code></div>
 */
inline fun p5.createButton(label: String, value: String? = undefined): p5.Element =
    asDynamic().createButton(label, value).unsafeCast<p5.Element>()


/**
 * Creates a checkbox `&lt;input&gt;&lt;/input&gt;` element in the DOM.
 * Calling .checked() on a checkbox returns a boolean indicating whether
 * it is checked or not.
 *
 * @method createCheckbox
 * @param  {String} [label] label displayed after checkbox
 * @param  {boolean} [value] value of the checkbox; checked is true, unchecked is false
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let checkbox;
 *
 * function setup() {
 *   checkbox = createCheckbox('label', false);
 *   checkbox.changed(myCheckedEvent);
 * }
 *
 * function myCheckedEvent() {
 *   if (checkbox.checked()) {
 *     console.log('Checking!');
 *   } else {
 *     console.log('Unchecking!');
 *   }
 * }
 * </code></div>
 */
inline fun p5.createCheckbox(label: String? = undefined, checked: Boolean? = undefined): p5.Element =
    asDynamic().createCheckbox(label, checked).unsafeCast<p5.Element>()


/**
 * Creates a dropdown menu `&lt;select&gt;&lt;/select&gt;` element in the DOM.
 * It also helps to assign select-box methods to <a href="#/p5.Element">p5.Element</a> when selecting existing select box.
 * - `.option(name, value)` can be used to set options for the select after it is created.
 * - `.value()` will return the currently selected option.
 * - `.selected()` will return the current dropdown element which is an instance of <a href="#/p5.Element">p5.Element</a>.
 * - `.selected(value)` can be used to make given option selected by default when the page first loads.
 * - `.disable()` marks the whole dropdown element as disabled.
 * - `.disable(value)` marks a given option as disabled.
 *
 * @method createSelect
 * @param {boolean} [multiple] true if dropdown should support multiple selections
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let sel;
 *
 * function setup() {
 *   textAlign(CENTER);
 *   background(200);
 *   sel = createSelect();
 *   sel.position(10, 10);
 *   sel.option('pear');
 *   sel.option('kiwi');
 *   sel.option('grape');
 *   sel.selected('kiwi');
 *   sel.changed(mySelectEvent);
 * }
 *
 * function mySelectEvent() {
 *   let item = sel.value();
 *   background(200);
 *   text('It is a ' + item + '!', 50, 50);
 * }
 * </code></div>
 *
 * <div><code>
 * let sel;
 *
 * function setup() {
 *   textAlign(CENTER);
 *   background(200);
 *   sel = createSelect();
 *   sel.position(10, 10);
 *   sel.option('oil');
 *   sel.option('milk');
 *   sel.option('bread');
 *   sel.disable('milk');
 * }
 * </code></div>
 */
inline fun p5.createSelect(multiple: Boolean? = undefined): p5.Element =
    asDynamic().createSelection(multiple).unsafeCast<p5.Element>()


/**
 * Creates a radio button element in the DOM. It also helps existing radio buttons
 * to assign methods of <a href="#/p5.Element/">p5.Element</a>.
 * - `.option(value, label)` can be used to create a new option for the
 *   element. If an option with a value already exists, it will be returned.
 *   It is recommended to use string values as input for `value`.
 *   Optionally, a label can be provided as second argument for the option.
 * - `.remove(value)` can be used to remove an option for the element. String
 *   values recommended as input for `value`.
 * - `.value()` method will return the currently selected value.
 * - `.selected()` method will return the currently selected input element.
 * - `.selected(value)` method will select the option and return it. String
 *   values recommended as input for `value`.
 * - `.disable(Boolean)` method will enable/disable the whole radio button element.
 *
 * @method createRadio
 * @param  {Object} [containerElement] A container HTML Element, either a div
 *                                     or span, inside which all existing radio inputs will be considered as options.
 * @param {string} [name] A name parameter for each Input Element.
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let radio;
 *
 * function setup() {
 *   radio = createRadio();
 *   radio.option('black');
 *   radio.option('white');
 *   radio.option('gray');
 *   radio.style('width', '60px');
 *   textAlign(CENTER);
 *   fill(255, 0, 0);
 * }
 *
 * function draw() {
 *   let val = radio.value();
 *   background(val);
 *   text(val, width / 2, height / 2);
 * }
 * </code></div>
 * <div><code>
 * let radio;
 *
 * function setup() {
 *   radio = createRadio();
 *   radio.option('1', 'apple');
 *   radio.option('2', 'bread');
 *   radio.option('3', 'juice');
 *   radio.style('width', '30px');
 *   radio.selected('2');
 *   textAlign(CENTER);
 * }
 *
 * function draw() {
 *   background(200);
 *   let val = radio.value();
 *   if (val) {
 *     text('item cost is $' + val, width / 2, height / 2);
 *   }
 * }
 * </code></div>
 */
inline fun p5.createRadio(containerElement: p5.Element? = undefined, name: String? = undefined): p5.Element =
    asDynamic().createRadio(containerElement, name).unsafeCast<p5.Element>()

inline fun p5.createRadio(containerElement: Element? = undefined, name: String? = undefined): p5.Element =
    asDynamic().createRadio(containerElement, name).unsafeCast<p5.Element>()


/**
 * Creates a colorPicker element in the DOM for color input.
 * The .value() method will return a hex string (#rrggbb) of the color.
 * The .color() method will return a <a href="#/p5.Color">p5.Color</a>
 * object with the current chosen color.
 *
 * @method createColorPicker
 * @param {String|p5.Color} [value] default color of element
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * let colorPicker;
 * function setup() {
 *   createCanvas(100, 100);
 *   colorPicker = createColorPicker('#ed225d');
 *   colorPicker.position(0, height + 5);
 * }
 *
 * function draw() {
 *   background(colorPicker.color());
 * }
 * </code></div>
 * <div><code>
 * let inp1, inp2;
 * function setup() {
 *   createCanvas(100, 100);
 *   background('grey');
 *   inp1 = createColorPicker('#ff0000');
 *   inp1.position(0, height + 5);
 *   inp1.input(setShade1);
 *   inp2 = createColorPicker(color('yellow'));
 *   inp2.position(0, height + 30);
 *   inp2.input(setShade2);
 *   setMidShade();
 * }
 *
 * function setMidShade() {
 *   // Finding a shade between the two
 *   let commonShade = lerpColor(inp1.color(), inp2.color(), 0.5);
 *   fill(commonShade);
 *   rect(20, 20, 60, 60);
 * }
 *
 * function setShade1() {
 *   setMidShade();
 *   console.log('You are choosing shade 1 to be : ', this.value());
 * }
 * function setShade2() {
 *   setMidShade();
 *   console.log('You are choosing shade 2 to be : ', this.value());
 * }
 * </code></div>
 */
inline fun p5.createColorPicker(value: p5.Color? = undefined): p5.Element =
    asDynamic().createColorPicker(value).unsafeCast<p5.Element>()

inline fun p5.createColorPicker(value: String): p5.Element =
    asDynamic().createColorPicker(value).unsafeCast<p5.Element>()


/**
 * Creates an `&lt;input&gt;&lt;/input&gt;` element in the DOM for text input.
 * Use .<a href="#/p5.Element/size">size()</a> to set the display length of the box.
 *
 * @method createInput
 * @param {String} [value] default value of the input box
 * @param {String} [type] type of text, ie text, password etc. Defaults to text.
 *   Needs a value to be specified first.
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 * function setup() {
 *   createCanvas(100, 100);
 *   background('grey');
 *   let inp = createInput('');
 *   inp.position(0, 0);
 *   inp.size(100);
 *   inp.input(myInputEvent);
 * }
 *
 * function myInputEvent() {
 *   console.log('you are typing: ', this.value());
 * }
 * </code></div>
 */
inline fun p5.createInput(value: String, type: String? = undefined): p5.Element =
    asDynamic().createInput(value, type).unsafeCast<p5.Element>()

inline fun p5.createInput(value: String? = undefined): p5.Element =
    asDynamic().createInput(value).unsafeCast<p5.Element>()


/**
 * Creates an `&lt;input&gt;&lt;/input&gt;` element in the DOM of type 'file'.
 * This allows users to select local files for use in a sketch.
 *
 * @method createFileInput
 * @param  {Function} [callback] callback function for when a file is loaded
 * @param  {Boolean} [multiple] optional, to allow multiple files to be selected
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created DOM element
 * @example
 * <div><code>
 * let input;
 * let img;
 *
 * function setup() {
 *   input = createFileInput(handleFile);
 *   input.position(0, 0);
 * }
 *
 * function draw() {
 *   background(255);
 *   if (img) {
 *     image(img, 0, 0, width, height);
 *   }
 * }
 *
 * function handleFile(file) {
 *   print(file);
 *   if (file.type === 'image') {
 *     img = createImg(file.data, '');
 *     img.hide();
 *   } else {
 *     img = null;
 *   }
 * }
 * </code></div>
 */
inline fun p5.createFileInput(noinline callback: (p5.File) -> Unit, multiple: Boolean? = undefined) =
    asDynamic().createFileInput(callback, multiple).unsafeCast<p5.Element>()


/** VIDEO STUFF **/


/**
 * Creates an HTML5 `&lt;video&gt;` element in the DOM for simple playback
 * of audio/video. Shown by default, can be hidden with .<a href="#/p5.Element/hide">hide()</a>
 * and drawn into canvas using <a href="#/p5/image">image()</a>. The first parameter
 * can be either a single string path to a video file, or an array of string
 * paths to different formats of the same video. This is useful for ensuring
 * that your video can play across different browsers, as each supports
 * different formats. See <a href='https://developer.mozilla.org/en-US/docs/Web/HTML/Supported_media_formats'>this
 * page</a> for further information about supported formats.
 *
 * @method createVideo
 * @param  {String|String[]} [src] path to a video file, or array of paths for
 *                                 supporting different browsers
 * @param  {Function} [callback] callback function to be called upon
 *                               'canplaythrough' event fire, that is, when the
 *                               browser can play the media, and estimates that
 *                               enough data has been loaded to play the media
 *                               up to its end without having to stop for
 *                               further buffering of content
 * @return {p5.MediaElement} pointer to video <a href="#/p5.MediaElement">p5.MediaElement</a>
 * @example
 * <div><code>
 * let vid;
 * function setup() {
 *   noCanvas();
 *
 *   vid = createVideo(
 *     ['assets/small.mp4', 'assets/small.ogv', 'assets/small.webm'],
 *     vidLoad
 *   );
 *
 *   vid.size(100, 100);
 * }
 *
 * // This function is called when the video loads
 * function vidLoad() {
 *   vid.loop();
 *   vid.volume(0);
 * }
 * </code></div>
 */
inline fun p5.createVideo(src: String, noinline callback: (p5.MediaElement) -> Unit  ={}): p5.MediaElement =
    asDynamic().createVideo(src, callback) as p5.MediaElement

inline fun p5.createVideo(src: Array<String>, noinline callback: (p5.MediaElement) -> Unit = {}): p5.MediaElement =
    asDynamic().createVideo(src, callback) as p5.MediaElement


/** AUDIO STUFF **/


/**
 * Creates a hidden HTML5 `&lt;audio&gt;` element in the DOM for simple audio
 * playback. The first parameter can be either a single string path to a
 * audio file, or an array of string paths to different formats of the same
 * audio. This is useful for ensuring that your audio can play across
 * different browsers, as each supports different formats.
 * See <a href='https://developer.mozilla.org/en-US/docs/Web/HTML/Supported_media_formats'>this
 * page for further information about supported formats</a>.
 *
 * @method createAudio
 * @param  {String|String[]} [src] path to an audio file, or array of paths
 *                                 for supporting different browsers
 * @param  {Function} [callback] callback function to be called upon
 *                               'canplaythrough' event fire, that is, when the
 *                               browser can play the media, and estimates that
 *                               enough data has been loaded to play the media
 *                               up to its end without having to stop for
 *                               further buffering of content
 * @return {p5.MediaElement}   pointer to audio <a href="#/p5.MediaElement">p5.MediaElement</a>
 * @example
 * <div><code>
 * let ele;
 * function setup() {
 *   ele = createAudio('assets/beat.mp3');
 *
 *   // here we set the element to autoplay
 *   // The element will play as soon
 *   // as it is able to do so.
 *   ele.autoplay(true);
 * }
 * </code></div>
 */
inline fun p5.createAudio(src: String, noinline callback: (p5.MediaElement) -> Unit = {}): p5.MediaElement =
    asDynamic().createAudio(src, callback) as p5.MediaElement

inline fun p5.createAudio(src: Array<String>, noinline callback: (p5.MediaElement) -> Unit = {}): p5.MediaElement =
    asDynamic().createAudio(src, callback) as p5.MediaElement


/** CAMERA STUFF **/


/**
 * @property {String} VIDEO
 * @final
 * @category Constants
 */
inline val p5.VIDEO: String get() = asDynamic().VIDEO as String
/**
 * @property {String} AUDIO
 * @final
 * @category Constants
 */
inline val p5.AUDIO: String get() = asDynamic().AUDIO as String


/**
 * Creates a new HTML5 `&lt;video&gt;` element that contains the audio/video feed
 * from a webcam. The element is separate from the canvas and is displayed by
 * default. The element can be hidden using .<a href="#/p5.Element/hide">hide()</a>.
 * The feed can be drawn onto the canvas using <a href="#/p5/image">image()</a>.
 * The loadedmetadata property can be used to detect when the element has fully
 * loaded (see second example).
 *
 * More specific properties of the feed can be passing in a Constraints object.
 * See the <a href='http://w3c.github.io/mediacapture-main/getusermedia.html#media-track-constraints'>
 * W3C spec</a> for possible properties. Note that not all of these are supported
 * by all browsers.
 *
 * <em>Security note</em>: A new browser security specification requires that
 * getUserMedia, which is behind <a href="#/p5/createCapture">createCapture()</a>,
 * only works when you're running the code locally, or on HTTPS. Learn more
 * <a href='http://stackoverflow.com/questions/34197653/getusermedia-in-chrome-47-without-using-https'>here</a>
 * and <a href='https://developer.mozilla.org/en-US/docs/Web/API/MediaDevices/getUserMedia'>here</a>.
 *
 * @method createCapture
 * @param  {String|Constant|Object} [type] type of capture, either VIDEO or
 *                                         AUDIO if none specified, default both,
 *                                         or a Constraints object
 * @param  {Function} [callback] function to be called once
 *                               stream has loaded
 * @return {p5.Element} capture video <a href="#/p5.Element">p5.Element</a>
 * @example
 * <div class='notest'>
 * <code>
 * let capture;
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   capture = createCapture(VIDEO);
 *   capture.hide();
 * }
 *
 * function draw() {
 *   image(capture, 0, 0, width, width * capture.height / capture.width);
 *   filter(INVERT);
 * }
 * </code>
 * </div>
 *
 * <div class='notest norender'>
 * <code>
 * function setup() {
 *   createCanvas(480, 120);
 *   let constraints = {
 *     video: {
 *       mandatory: {
 *         minWidth: 1280,
 *         minHeight: 720
 *       },
 *       optional: [{ maxFrameRate: 10 }]
 *     },
 *     audio: true
 *   };
 *   createCapture(constraints, function(stream) {
 *     console.log(stream);
 *   });
 * }
 * </code>
 * </div>
 * <div class='notest norender'>
 * <code>
 * let capture;
 *
 * function setup() {
 *   createCanvas(640, 480);
 *   capture = createCapture(VIDEO);
 * }
 * function draw() {
 *   background(0);
 *   if (capture.loadedmetadata) {
 *     let c = capture.get(0, 0, 100, 100);
 *     image(c, 0, 0);
 *   }
 * }
 * </code>
 * </div>
 */
inline fun p5.createCapture(type: String, noinline callback: (MediaStream) -> Unit = {}): p5.Element =
    asDynamic().createCapture(type, callback) as p5.Element

inline fun p5.createCapture(noinline callback: (MediaStream) -> Unit = {}): p5.Element =
    asDynamic().createCapture(callback) as p5.Element

// todo make typed constrains
inline fun p5.createCapture(type: Object, noinline callback: (MediaStream) -> Unit = {}): p5.Element =
    asDynamic().createCapture(type, callback) as p5.Element


/**
 * Creates element with given tag in the DOM with given content.
 *
 * @method createElement
 * @param  {String} [tag] tag for the new element
 * @param  {String} [content] html content to be inserted into the element
 * @return {p5.Element} pointer to <a href="#/p5.Element">p5.Element</a> holding created node
 * @example
 * <div><code>
 *   let h5 = createElement('h5', 'im an h5 p5.element!');
 *   h5.style('color', '#00a1d3');
 *   h5.position(0, 0);
 * </code></div>
 */
inline fun p5.createElement(tag: String, content: String): p5.Element = asDynamic().createElement(tag, content) as p5.Element


// =============================================================================
//                         p5.Element additions
// =============================================================================


/**
 *
 * Adds specified class to the element.
 *
 * @for p5.Element
 * @method addClass
 * @param  {String} class name of class to add
 * @chainable
 * @example
 * <div class='norender'><code>
 * let div = createDiv('div');
 * div.addClass('myClass');
 * </code></div>
 */
inline fun p5.Element.addClass(c: String): p5.Element = asDynamic().addClass(c) as p5.Element


/**
 * Removes specified class from the element.
 *
 * @method removeClass
 * @param  {String} [c] class name of class to remove
 * @chainable
 * @example
 * <div class='norender'><code>
 * // In this example, a class is set when the div is created
 * // and removed when mouse is pressed. This could link up
 * // with a CSS style rule to toggle style properties.
 *
 * let div;
 *
 * function setup() {
 *   div = createDiv('div');
 *   div.addClass('myClass');
 * }
 *
 * function mousePressed() {
 *   div.removeClass('myClass');
 * }
 * </code></div>
 */
inline fun p5.Element.removeClass(c: String): p5.Element = asDynamic().removeClass(c) as p5.Element


/**
 * Checks if specified class is already applied to element.
 *
 * @method hasClass
 * @param {String} [c] class name of class to check
 * @returns {boolean} a boolean value if element has specified class
 * @example
 * <div class='norender'><code>
 * let div;
 *
 * function setup() {
 *   div = createDiv('div');
 *   div.addClass('show');
 * }
 *
 * function mousePressed() {
 *   if (div.hasClass('show')) {
 *     div.addClass('show');
 *   } else {
 *     div.removeClass('show');
 *   }
 * }
 * </code></div>
 */
inline fun p5.Element.hasClass(c: String): Boolean = asDynamic().hasClass(c) as Boolean


/**
 * Toggles element class.
 *
 * @method toggleClass
 * @param {String} [c] class name to toggle
 * @chainable
 * @example
 * <div class='norender'><code>
 * let div;
 *
 * function setup() {
 *   div = createDiv('div');
 *   div.addClass('show');
 * }
 *
 * function mousePressed() {
 *   div.toggleClass('show');
 * }
 * </code></div>
 */
inline fun p5.Element.toggleClass(c: String): p5.Element = asDynamic().toggleClass(c) as p5.Element


/**
 *
 * Attaches the element  as a child to the parent specified.
 * Accepts either a string ID, DOM node, or <a href="#/p5.Element">p5.Element</a>.
 * If no argument is specified, an array of children DOM nodes is returned.
 *
 * @method child
 * @param  {String|p5.Element} [child] the ID, DOM node, or <a href="#/p5.Element">p5.Element</a>
 *                                     to add to the current element
 * @example
 * <div class='norender'><code>
 *   let div0 = createDiv('this is the parent');
 *   let div1 = createDiv('this is the child');
 *   div0.child(div1); // use p5.Element
 * </code></div>
 *
 * <div class='norender'><code>
 *   let div0 = createDiv('this is the parent');
 *   let div1 = createDiv('this is the child');
 *   div1.id('apples');
 *   div0.child('apples'); // use id
 * </code></div>
 *
 * <div class='norender notest'><code>
 *   // this example assumes there is a div already on the page
 *   // with id "myChildDiv"
 *   let div0 = createDiv('this is the parent');
 *   let elt = document.getElementById('myChildDiv');
 *   div0.child(elt); // use element from page
 * </code></div>
 */
inline fun p5.Element.child(childNode: Node): p5.Element = asDynamic().child(childNode) as p5.Element

inline fun p5.Element.child(childNode: String): p5.Element = asDynamic().child(childNode) as p5.Element

inline fun p5.Element.child(childNode: p5.Element): p5.Element = asDynamic().child(childNode) as p5.Element

inline fun p5.Element.child(): Array<Node> = asDynamic().child() as Array<Node>


/**
 * Centers a p5.Element either vertically, horizontally,
 * or both, relative to its parent or according to
 * the body if the p5.Element has no parent. If no argument is passed
 * the p5.Element is aligned both vertically and horizontally.
 *
 * @method center
 * @param  {String} [align] passing 'vertical', 'horizontal' aligns element accordingly
 * @chainable
 *
 * @example
 * <div><code>
 * function setup() {
 *   let div = createDiv('').size(10, 10);
 *   div.style('background-color', 'orange');
 *   div.center();
 * }
 * </code></div>
 */
inline fun p5.Element.center(align: String): p5.Element = asDynamic().center(align) as p5.Element


/**
 * If an argument is given, sets the inner HTML of the element,
 * replacing any existing HTML. If true is included as a second
 * argument, HTML is appended instead of replacing existing HTML.
 * If no arguments are given, returns
 * the inner HTML of the element.
 *
 * @for p5.Element
 * @method html
 * @param  {String} [html] the HTML to be placed inside the element
 * @param  {boolean} [append] whether to append HTML to existing
 * @example
 * <div class='norender'><code>
 * let div = createDiv('').size(100, 100);
 * div.html('hi');
 * </code></div>
 * <div class='norender'><code>
 * let div = createDiv('Hello ').size(100, 100);
 * div.html('World', true);
 * </code></div>
 */
inline fun p5.Element.html(html: String, append: Boolean? = undefined): p5.Element =
    asDynamic().html(html, append) as p5.Element

inline fun p5.Element.html(): String = asDynamic().html() as String


/**
 *
 * Sets the position of the element. If no position type argument is given, the
 * position will be relative to (0, 0) of the window.
 * Essentially, this sets position:absolute and left and top
 * properties of style. If an optional third argument specifying position type is given,
 * the x and y-coordinates will be interpreted based on the <a target="_blank"
 * href="https://developer.mozilla.org/en-US/docs/Web/CSS/position">positioning scheme</a>.
 * If no arguments given, the function returns the x and y position of the element.
 *
 * found documentation on how to be more specific with object type
 * https://stackoverflow.com/questions/14714314/how-do-i-comment-object-literals-in-yuidoc
 *
 * @method position
 * @returns {Object} object of form { x: 0, y: 0 } containing the position of the element in an object
 * @example
 * <div><code class='norender'>
 * function setup() {
 *   let cnv = createCanvas(100, 100);
 *   // positions canvas 50px to the right and 100px
 *   // below upper left corner of the window
 *   cnv.position(50, 100);
 * }
 * </code></div>
 * <div><code class='norender'>
 * function setup() {
 *   let cnv = createCanvas(100, 100);
 *   // positions canvas at upper left corner of the window
 *   // with a 'fixed' position type
 *   cnv.position(0, 0, 'fixed');
 * }
 * </code></div>
 */
inline fun p5.Element.position(x: Int, y: Int, positionType: String? = undefined): p5.Element =
    asDynamic().position(x, y, positionType) as p5.Element

inline fun p5.Element.position(): P5ElementPosition = asDynamic().position().unsafeCast<P5ElementPosition>()

external interface P5ElementPosition {
    val x: Int

    val y: Int
}


/**
 * Sets the given style (CSS) property (1st arg) of the element with the
 * given value (2nd arg). If a single argument is given, .style()
 * returns the value of the given property; however, if a single argument
 * is given in CSS syntax ('text-align:center'), .style() sets the CSS
 * appropriately.
 *
 * @method style
 * @param  {String} [prop] property to be set
 * @returns {String} [value] of property
 * @example
 * <div><code class='norender'>
 * let myDiv = createDiv('I like pandas.');
 * myDiv.style('font-size', '18px');
 * myDiv.style('color', '#ff0000');
 * myDiv.position(0, 0);
 * </code></div>
 * <div><code class='norender'>
 * let col = color(25, 23, 200, 50);
 * let button = createButton('button');
 * button.style('background-color', col);
 * button.position(0, 0);
 * </code></div>
 * <div><code class='norender'>
 * let myDiv, fontSize;
 * function setup() {
 *   background(200);
 *   myDiv = createDiv('I like gray.');
 *   myDiv.position(0, 0);
 *   myDiv.style('z-index', 10);
 * }
 *
 * function draw() {
 *   fontSize = min(mouseX, 90);
 *   myDiv.style('font-size', fontSize + 'px');
 * }
 * </code></div>
 */
inline fun p5.Element.style(prop: String, value: String): p5.Element = asDynamic().style(prop, value) as p5.Element

inline fun p5.Element.style(prop: String, value: p5.Color): p5.Element = asDynamic().style(prop, value) as p5.Element

inline fun p5.Element.style(prop: String): p5.Element = asDynamic().style(prop) as p5.Element


/**
 *
 * Adds a new attribute or changes the value of an existing attribute
 * on the specified element. If no value is specified, returns the
 * value of the given attribute, or null if the attribute is not set.
 *
 * @method attribute
 * @return {String} value of attribute
 *
 * @example
 * <div class='norender'><code>
 * let myDiv = createDiv('I like pandas.');
 * myDiv.attribute('align', 'center');
 * </code></div>
 */
inline fun p5.Element.attribute(attr: String, value: String): p5.Element = asDynamic().attribute(attr, value) as p5.Element

inline fun p5.Element.attribute(attr: String): String = asDynamic().attribute(attr) as String


/**
 *
 * Removes an attribute on the specified element.
 *
 * @method removeAttribute
 * @param  {String} [attr] attribute to remove
 * @chainable
 *
 * @example
 * <div><code>
 * let button;
 * let checkbox;
 *
 * function setup() {
 *   checkbox = createCheckbox('enable', true);
 *   checkbox.changed(enableButton);
 *   button = createButton('button');
 *   button.position(10, 10);
 * }
 *
 * function enableButton() {
 *   if (this.checked()) {
 *     // Re-enable the button
 *     button.removeAttribute('disabled');
 *   } else {
 *     // Disable the button
 *     button.attribute('disabled', '');
 *   }
 * }
 * </code></div>
 */
inline fun p5.Element.removeAttribute(attr: String) { asDynamic().removeAttribute(attr) }


/**
 * Either returns the value of the element if no arguments
 * given, or sets the value of the element.
 *
 * @method value
 * @return {String|Number} value of the element
 * @example
 * <div class='norender'><code>
 * // gets the value
 * let inp;
 * function setup() {
 *   inp = createInput('');
 * }
 *
 * function mousePressed() {
 *   print(inp.value());
 * }
 * </code></div>
 * <div class='norender'><code>
 * // sets the value
 * let inp;
 * function setup() {
 *   inp = createInput('myValue');
 * }
 *
 * function mousePressed() {
 *   inp.value('myValue');
 * }
 * </code></div>
 */
inline fun p5.Element.value(v: Double) { asDynamic().value(v) }

inline fun p5.Element.value(v: Float) { asDynamic().value(v) }

inline fun p5.Element.value(v: Int) { asDynamic().value(v) }

inline fun p5.Element.value(v: Long) { asDynamic().value(v) }

inline fun p5.Element.value(v: String) { asDynamic().value(v) }

inline fun p5.Element.valueDouble(): Double = asDynamic().value() as Double

inline fun p5.Element.valueFloat(): Float = asDynamic().value() as Float

inline fun p5.Element.valueInt(): Int = asDynamic().value() as Int

inline fun p5.Element.valueLong(): Long = asDynamic().value() as Long

inline fun p5.Element.valueString(): String = asDynamic().value() as String


/**
 *
 * Shows the current element. Essentially, setting display:block for the style.
 *
 * @method show
 * @chainable
 * @example
 * <div class='norender'><code>
 * let div = createDiv('div');
 * div.style('display', 'none');
 * div.show(); // turns display to block
 * </code></div>
 */
inline fun p5.Element.show(): p5.Element = asDynamic().show() as p5.Element


/**
 * Hides the current element. Essentially, setting display:none for the style.
 *
 * @method hide
 * @chainable
 * @example
 * <div class='norender'><code>
 * let div = createDiv('this is a div');
 * div.hide();
 * </code></div>
 */
inline fun p5.Element.hide(): p5.Element = asDynamic().hide() as p5.Element


/**
 *
 * Sets the width and height of the element. AUTO can be used to
 * only adjust one dimension at a time. If no arguments are given, it
 * returns the width and height of the element in an Object. In the case of
 * elements that need to be loaded, such as images, it is recommended
 * to call the function after the element has finished loading.
 *
 * @method size
 * @param  {Number|Constant} [w] width of the element, either AUTO, or a number
 * @param  {Number|Constant} [h] height of the element, either AUTO, or a number
 * @example
 * <div class='norender'><code>
 * let div = createDiv('this is a div');
 * div.size(100, 100);
 * let img = createImg(
 *   'assets/rockies.jpg',
 *   'A tall mountain with a small forest and field in front of it on a sunny day',
 *   '',
 *   () => {
 *     img.size(10, AUTO);
 *   }
 * );
 * </code></div>
 */
inline fun p5.Element.size(w: Int, h: Int) { asDynamic().size(w, h) }

inline fun p5.Element.size(w: Int, h: String) { asDynamic().size(w, h) }

inline fun p5.Element.size(w: String, h: Int) { asDynamic().size(w, h) }

inline fun p5.Element.size(w: String, h: String) { asDynamic().size(w, h) }

inline fun p5.Element.size(): P5ElementSize = asDynamic().size().unsafeCast<P5ElementSize>()

external interface P5ElementSize {
    val width: Int
    val height: Int
}

/**
 * Removes the element, stops all media streams, and deregisters all listeners.
 * @method remove
 * @example
 * <div class='norender'><code>
 * let myDiv = createDiv('this is some text');
 * myDiv.remove();
 * </code></div>
 */
inline fun p5.Element.remove() { asDynamic().remove() }


/**
 * Registers a callback that gets called every time a file that is
 * dropped on the element has been loaded.
 * p5 will load every dropped file into memory and pass it as a p5.File object to the callback.
 * Multiple files dropped at the same time will result in multiple calls to the callback.
 *
 * You can optionally pass a second callback which will be registered to the raw
 * <a href="https://developer.mozilla.org/en-US/docs/Web/Events/drop">drop</a> event.
 * The callback will thus be provided the original
 * <a href="https://developer.mozilla.org/en-US/docs/Web/API/DragEvent">DragEvent</a>.
 * Dropping multiple files at the same time will trigger the second callback once per drop,
 * whereas the first callback will trigger for each loaded file.
 *
 * @method drop
 * @param  {Function} [callback]  callback to receive loaded file, called for each file dropped.
 * @param  {Function} [fxn]     callback triggered once when files are dropped with the drop event.
 * @chainable
 * @example
 * <div><code>
 * function setup() {
 *   let c = createCanvas(100, 100);
 *   background(200);
 *   textAlign(CENTER);
 *   text('drop file', width / 2, height / 2);
 *   c.drop(gotFile);
 * }
 *
 * function gotFile(file) {
 *   background(200);
 *   text('received file:', width / 2, height / 2);
 *   text(file.name, width / 2, height / 2 + 50);
 * }
 * </code></div>
 *
 * <div><code>
 * let img;
 *
 * function setup() {
 *   let c = createCanvas(100, 100);
 *   background(200);
 *   textAlign(CENTER);
 *   text('drop image', width / 2, height / 2);
 *   c.drop(gotFile);
 * }
 *
 * function draw() {
 *   if (img) {
 *     image(img, 0, 0, width, height);
 *   }
 * }
 *
 * function gotFile(file) {
 *   img = createImg(file.data, '').hide();
 * }
 * </code></div>
 *
 * @alt
 * Canvas turns into whatever image is dragged/dropped onto it.
 */
inline fun p5.Element.drop(noinline callback: (p5.File) -> Unit, noinline fxn: (DragEvent) -> Unit = {}): p5.Element =
    asDynamic().drag(callback, fxn) as p5.Element


// =============================================================================
//                         p5.MediaElement additions
// =============================================================================


/**
 * Play an HTML5 media element.
 *
 * @method play
 * @chainable
 * @example
 * <div><code>
 * let ele;
 *
 * function setup() {
 *   //p5.MediaElement objects are usually created
 *   //by calling the createAudio(), createVideo(),
 *   //and createCapture() functions.
 *
 *   //In this example we create
 *   //a new p5.MediaElement via createAudio().
 *   ele = createAudio('assets/beat.mp3');
 *
 *   background(250);
 *   textAlign(CENTER);
 *   text('Click to Play!', width / 2, height / 2);
 * }
 *
 * function mouseClicked() {
 *   //here we test if the mouse is over the
 *   //canvas element when it's clicked
 *   if (mouseX >= 0 && mouseX <= width && mouseY >= 0 && mouseY <= height) {
 *     //Here we call the play() function on
 *     //the p5.MediaElement we created above.
 *     //This will start the audio sample.
 *     ele.play();
 *
 *     background(200);
 *     text('You clicked Play!', width / 2, height / 2);
 *   }
 * }
 * </code></div>
 */
inline fun p5.MediaElement.play(): p5.MediaElement = asDynamic().play() as p5.MediaElement


/**
 * Stops an HTML5 media element (sets current time to zero).
 *
 * @method stop
 * @chainable
 * @example
 * <div><code>
 * //This example both starts
 * //and stops a sound sample
 * //when the user clicks the canvas
 *
 * //We will store the p5.MediaElement
 * //object in here
 * let ele;
 *
 * //while our audio is playing,
 * //this will be set to true
 * let sampleIsPlaying = false;
 *
 * function setup() {
 *   //Here we create a p5.MediaElement object
 *   //using the createAudio() function.
 *   ele = createAudio('assets/beat.mp3');
 *   background(200);
 *   textAlign(CENTER);
 *   text('Click to play!', width / 2, height / 2);
 * }
 *
 * function mouseClicked() {
 *   //here we test if the mouse is over the
 *   //canvas element when it's clicked
 *   if (mouseX >= 0 && mouseX <= width && mouseY >= 0 && mouseY <= height) {
 *     background(200);
 *
 *     if (sampleIsPlaying) {
 *       //if the sample is currently playing
 *       //calling the stop() function on
 *       //our p5.MediaElement will stop
 *       //it and reset its current
 *       //time to 0 (i.e. it will start
 *       //at the beginning the next time
 *       //you play it)
 *       ele.stop();
 *
 *       sampleIsPlaying = false;
 *       text('Click to play!', width / 2, height / 2);
 *     } else {
 *       //loop our sound element until we
 *       //call ele.stop() on it.
 *       ele.loop();
 *
 *       sampleIsPlaying = true;
 *       text('Click to stop!', width / 2, height / 2);
 *     }
 *   }
 * }
 * </code></div>
 */
inline fun p5.MediaElement.stop(): p5.MediaElement = asDynamic().stop() as p5.MediaElement


/**
 * Pauses an HTML5 media element.
 *
 * @method pause
 * @chainable
 * @example
 * <div><code>
 * //This example both starts
 * //and pauses a sound sample
 * //when the user clicks the canvas
 *
 * //We will store the p5.MediaElement
 * //object in here
 * let ele;
 *
 * //while our audio is playing,
 * //this will be set to true
 * let sampleIsPlaying = false;
 *
 * function setup() {
 *   //Here we create a p5.MediaElement object
 *   //using the createAudio() function.
 *   ele = createAudio('assets/lucky_dragons.mp3');
 *   background(200);
 *   textAlign(CENTER);
 *   text('Click to play!', width / 2, height / 2);
 * }
 *
 * function mouseClicked() {
 *   //here we test if the mouse is over the
 *   //canvas element when it's clicked
 *   if (mouseX >= 0 && mouseX <= width && mouseY >= 0 && mouseY <= height) {
 *     background(200);
 *
 *     if (sampleIsPlaying) {
 *       //Calling pause() on our
 *       //p5.MediaElement will stop it
 *       //playing, but when we call the
 *       //loop() or play() functions
 *       //the sample will start from
 *       //where we paused it.
 *       ele.pause();
 *
 *       sampleIsPlaying = false;
 *       text('Click to resume!', width / 2, height / 2);
 *     } else {
 *       //loop our sound element until we
 *       //call ele.pause() on it.
 *       ele.loop();
 *
 *       sampleIsPlaying = true;
 *       text('Click to pause!', width / 2, height / 2);
 *     }
 *   }
 * }
 * </code></div>
 */
inline fun p5.MediaElement.pause(): p5.MediaElement = asDynamic().pause() as p5.MediaElement


/**
 * Set 'loop' to true for an HTML5 media element, and starts playing.
 *
 * @method loop
 * @chainable
 * @example
 * <div><code>
 * //Clicking the canvas will loop
 * //the audio sample until the user
 * //clicks again to stop it
 *
 * //We will store the p5.MediaElement
 * //object in here
 * let ele;
 *
 * //while our audio is playing,
 * //this will be set to true
 * let sampleIsLooping = false;
 *
 * function setup() {
 *   //Here we create a p5.MediaElement object
 *   //using the createAudio() function.
 *   ele = createAudio('assets/lucky_dragons.mp3');
 *   background(200);
 *   textAlign(CENTER);
 *   text('Click to loop!', width / 2, height / 2);
 * }
 *
 * function mouseClicked() {
 *   //here we test if the mouse is over the
 *   //canvas element when it's clicked
 *   if (mouseX >= 0 && mouseX <= width && mouseY >= 0 && mouseY <= height) {
 *     background(200);
 *
 *     if (!sampleIsLooping) {
 *       //loop our sound element until we
 *       //call ele.stop() on it.
 *       ele.loop();
 *
 *       sampleIsLooping = true;
 *       text('Click to stop!', width / 2, height / 2);
 *     } else {
 *       ele.stop();
 *
 *       sampleIsLooping = false;
 *       text('Click to loop!', width / 2, height / 2);
 *     }
 *   }
 * }
 * </code></div>
 */
inline fun p5.MediaElement.loop(): p5.MediaElement = asDynamic().loop() as p5.MediaElement


/**
 * Set 'loop' to false for an HTML5 media element. Element will stop
 * when it reaches the end.
 *
 * @method noLoop
 * @chainable
 * @example
 * <div><code>
 * //This example both starts
 * //and stops loop of sound sample
 * //when the user clicks the canvas
 *
 * //We will store the p5.MediaElement
 * //object in here
 * let ele;
 * //while our audio is playing,
 * //this will be set to true
 * let sampleIsPlaying = false;
 *
 * function setup() {
 *   //Here we create a p5.MediaElement object
 *   //using the createAudio() function.
 *   ele = createAudio('assets/beat.mp3');
 *   background(200);
 *   textAlign(CENTER);
 *   text('Click to play!', width / 2, height / 2);
 * }
 *
 * function mouseClicked() {
 *   //here we test if the mouse is over the
 *   //canvas element when it's clicked
 *   if (mouseX >= 0 && mouseX <= width && mouseY >= 0 && mouseY <= height) {
 *     background(200);
 *
 *     if (sampleIsPlaying) {
 *       ele.noLoop();
 *       sampleIsPlaying = false;
 *       text('No more Loops!', width / 2, height / 2);
 *     } else {
 *       ele.loop();
 *       sampleIsPlaying = true;
 *       text('Click to stop looping!', width / 2, height / 2);
 *     }
 *   }
 * }
 * </code></div>
 */
inline fun p5.MediaElement.noLoop(): p5.MediaElement = asDynamic().noLoop() as p5.MediaElement


/**
 * Set HTML5 media element to autoplay or not. If no argument is specified, by
 * default it will autoplay.
 *
 * @method autoplay
 * @param {Boolean} [shouldAutoplay] whether the element should autoplay
 * @chainable
 * @example
 * <div><code>
 * let videoElement;
 * function setup() {
 *   noCanvas();
 *   videoElement = createVideo(['assets/small.mp4'], onVideoLoad);
 * }
 * function onVideoLoad() {
 *   // The media will play as soon as it is loaded.
 *   videoElement.autoplay();
 *   videoElement.volume(0);
 *   videoElement.size(100, 100);
 * }
 * </code></div>
 *
 * <div><code>
 * let videoElement;
 * function setup() {
 *   noCanvas();
 *   videoElement = createVideo(['assets/small.mp4'], onVideoLoad);
 * }
 * function onVideoLoad() {
 *   // The media will not play until some explicitly triggered.
 *   videoElement.autoplay(false);
 *   videoElement.volume(0);
 *   videoElement.size(100, 100);
 * }
 *
 * function mouseClicked() {
 *   videoElement.play();
 * }
 * </code></div>
 *
 * @alt
 * An example of a video element which autoplays after it is loaded.
 * An example of a video element which waits for a trigger for playing.
 */
inline fun p5.MediaElement.autoplay(shouldAutoplay: Boolean) { asDynamic().autoplay(shouldAutoplay) }


/**
 * Sets volume for this HTML5 media element. If no argument is given,
 * returns the current volume.
 *
 * @method volume
 * @return {Number} current volume
 *
 * @example
 * <div><code>
 * let ele;
 * function setup() {
 *   // p5.MediaElement objects are usually created
 *   // by calling the createAudio(), createVideo(),
 *   // and createCapture() functions.
 *   // In this example we create
 *   // a new p5.MediaElement via createAudio().
 *   ele = createAudio('assets/lucky_dragons.mp3');
 *   background(250);
 *   textAlign(CENTER);
 *   text('Click to Play!', width / 2, height / 2);
 * }
 * function mouseClicked() {
 *   // Here we call the volume() function
 *   // on the sound element to set its volume
 *   // Volume must be between 0.0 and 1.0
 *   ele.volume(0.2);
 *   ele.play();
 *   background(200);
 *   text('You clicked Play!', width / 2, height / 2);
 * }
 * </code></div>
 * <div><code>
 * let audio;
 * let counter = 0;
 *
 * function loaded() {
 *   audio.play();
 * }
 *
 * function setup() {
 *   audio = createAudio('assets/lucky_dragons.mp3', loaded);
 *   textAlign(CENTER);
 * }
 *
 * function draw() {
 *   if (counter === 0) {
 *     background(0, 255, 0);
 *     text('volume(0.9)', width / 2, height / 2);
 *   } else if (counter === 1) {
 *     background(255, 255, 0);
 *     text('volume(0.5)', width / 2, height / 2);
 *   } else if (counter === 2) {
 *     background(255, 0, 0);
 *     text('volume(0.1)', width / 2, height / 2);
 *   }
 * }
 *
 * function mousePressed() {
 *   counter++;
 *   if (counter === 0) {
 *     audio.volume(0.9);
 *   } else if (counter === 1) {
 *     audio.volume(0.5);
 *   } else if (counter === 2) {
 *     audio.volume(0.1);
 *   } else {
 *     counter = 0;
 *     audio.volume(0.9);
 *   }
 * }
 * </code>
 * </div>
 */
inline fun p5.MediaElement.volume(value: Double) { asDynamic().volume(value) }

inline fun p5.MediaElement.volume(): Double = asDynamic().volume() as Double


/**
 * If no arguments are given, returns the current playback speed of the
 * element. The speed parameter sets the speed where 2.0 will play the
 * element twice as fast, 0.5 will play at half the speed, and -1 will play
 * the element in normal speed in reverse.(Note that not all browsers support
 * backward playback and even if they do, playback might not be smooth.)
 *
 * @method speed
 * @return {Number} current playback speed of the element
 *
 * @example
 * <div class='norender notest'><code>
 * //Clicking the canvas will loop
 * //the audio sample until the user
 * //clicks again to stop it
 *
 * //We will store the p5.MediaElement
 * //object in here
 * let ele;
 * let button;
 *
 * function setup() {
 *   createCanvas(710, 400);
 *   //Here we create a p5.MediaElement object
 *   //using the createAudio() function.
 *   ele = createAudio('assets/beat.mp3');
 *   ele.loop();
 *   background(200);
 *
 *   button = createButton('2x speed');
 *   button.position(100, 68);
 *   button.mousePressed(twice_speed);
 *
 *   button = createButton('half speed');
 *   button.position(200, 68);
 *   button.mousePressed(half_speed);
 *
 *   button = createButton('reverse play');
 *   button.position(300, 68);
 *   button.mousePressed(reverse_speed);
 *
 *   button = createButton('STOP');
 *   button.position(400, 68);
 *   button.mousePressed(stop_song);
 *
 *   button = createButton('PLAY!');
 *   button.position(500, 68);
 *   button.mousePressed(play_speed);
 * }
 *
 * function twice_speed() {
 *   ele.speed(2);
 * }
 *
 * function half_speed() {
 *   ele.speed(0.5);
 * }
 *
 * function reverse_speed() {
 *   ele.speed(-1);
 * }
 *
 * function stop_song() {
 *   ele.stop();
 * }
 *
 * function play_speed() {
 *   ele.play();
 * }
 * </code></div>
 */
inline fun p5.MediaElement.speed(value: Double) { asDynamic().speed(value) }

inline fun p5.MediaElement.speed(): Double = asDynamic().speed() as Double


/**
 * If no arguments are given, returns the current time of the element.
 * If an argument is given the current time of the element is set to it.
 *
 * @method time
 * @return {Number} current time (in seconds)
 *
 * @example
 * <div><code>
 * let ele;
 * let beginning = true;
 * function setup() {
 *   //p5.MediaElement objects are usually created
 *   //by calling the createAudio(), createVideo(),
 *   //and createCapture() functions.
 *
 *   //In this example we create
 *   //a new p5.MediaElement via createAudio().
 *   ele = createAudio('assets/lucky_dragons.mp3');
 *   background(250);
 *   textAlign(CENTER);
 *   text('start at beginning', width / 2, height / 2);
 * }
 *
 * // this function fires with click anywhere
 * function mousePressed() {
 *   if (beginning === true) {
 *     // here we start the sound at the beginning
 *     // time(0) is not necessary here
 *     // as this produces the same result as
 *     // play()
 *     ele.play().time(0);
 *     background(200);
 *     text('jump 2 sec in', width / 2, height / 2);
 *     beginning = false;
 *   } else {
 *     // here we jump 2 seconds into the sound
 *     ele.play().time(2);
 *     background(250);
 *     text('start at beginning', width / 2, height / 2);
 *     beginning = true;
 *   }
 * }
 * </code></div>
 */
inline fun p5.MediaElement.time(value: Long) { asDynamic().time(value) }

inline fun p5.MediaElement.time(): Long = asDynamic().time() as Long


/**
 * Returns the duration of the HTML5 media element.
 *
 * @method duration
 * @return {Number} duration
 *
 * @example
 * <div><code>
 * let ele;
 * function setup() {
 *   //p5.MediaElement objects are usually created
 *   //by calling the createAudio(), createVideo(),
 *   //and createCapture() functions.
 *   //In this example we create
 *   //a new p5.MediaElement via createAudio().
 *   ele = createAudio('assets/doorbell.mp3');
 *   background(250);
 *   textAlign(CENTER);
 *   text('Click to know the duration!', 10, 25, 70, 80);
 * }
 * function mouseClicked() {
 *   ele.play();
 *   background(200);
 *   //ele.duration dislpay the duration
 *   text(ele.duration() + ' seconds', width / 2, height / 2);
 * }
 * </code></div>
 */
inline fun p5.MediaElement.duration(): Long = asDynamic().duration() as Long


/**
 * @see [p5.pixels]
 */
inline val p5.MediaElement.pixels: Array<Byte> get() = asDynamic().pixels as Array<Byte>


/**
 * @see [p5.loadPixels]
 */
inline fun p5.MediaElement.loadPixels() { asDynamic().loadPixels() }


/**
 * @see [p5.updatePixels]
 */
inline fun p5.MediaElement.updatePixels(x: Int, y: Int, w: Int, h: Int) {
    asDynamic().updatePixels(x, y, w, h)
}

inline fun p5.MediaElement.updatePixels() {
    asDynamic().updatePixels()
}


/**
 * @see [p5.get]
 */
inline fun p5.MediaElement.get(x: Int, y: Int, w: Int, h: Int): p5.Image = asDynamic().get(x ,y, w, h) as p5.Image

inline fun p5.MediaElement.get(): p5.Image = asDynamic().get() as p5.Image

inline fun p5.MediaElement.get(x: Int, y: Int): Array<Int> = asDynamic().get(x ,y) as Array<Int>


/**
 * @see [p5.set]
 */
inline fun p5.MediaElement.set(x: Int, y: Int, imgOrCol: Int) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.MediaElement.set(x: Int, y: Int, imgOrCol: Array<Int>) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.MediaElement.set(x: Int, y: Int, imgOrCol: p5.Image) { asDynamic().set(x, y, imgOrCol) }

inline fun p5.MediaElement.set(x: Int, y: Int, imgOrCol: p5.Color) { asDynamic().set(x, y, imgOrCol) }


/**
 * @see [p5.copy]
 */
inline fun p5.MediaElement.copy(
    srcImage: p5.Image,
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    dx: Int,
    dy: Int,
    dw: Int,
    dh: Int,
): p5.Image = asDynamic().copy(srcImage, sx, sy, sw, sh, dx, dy, dw, dh) as p5.Image

inline fun p5.MediaElement.copy(
    sx: Int,
    sy: Int,
    sw: Int,
    sh: Int,
    dx: Int,
    dy: Int,
    dw: Int,
    dh: Int,
): p5.Image = asDynamic().copy(sx, sy, sw, sh, dx, dy, dw, dh) as p5.Image


/**
 * @see [p5.Image.mask]
 */
inline fun p5.MediaElement.mask(p5Image: p5.Image) { asDynamic().mask(p5Image) }


/**
 * helper method for web GL mode to figure out if the element
 * has been modified and might need to be re-uploaded to texture
 * memory between frames.
 * @method isModified
 * @private
 * @return {boolean} a boolean indicating whether or not the
 * image has been updated or modified since last texture upload.
 */
inline fun p5.MediaElement.isModified(): Boolean = asDynamic().isModified() as Boolean


/**
 * helper method for web GL mode to indicate that an element has been
 * changed or unchanged since last upload. gl texture upload will
 * set this value to false after uploading the texture; or might set
 * it to true if metadata has become available but there is no actual
 * texture data available yet.
 * @method setModified
 * @param {boolean} [value] sets whether the element has been
 * modified.
 * @private
 */
private fun p5.MediaElement.setModified(value: Boolean) { asDynamic().setModified(value) }


/**
 * Schedule an event to be called when the audio or video
 * element reaches the end. If the element is looping,
 * this will not be called. The element is passed in
 * as the argument to the onended callback.
 *
 * @method  onended
 * @param  {Function} [callback] function to call when the
 *                             sound file has ended. The
 *                             media element will be passed
 *                             in as the argument to the
 *                             callback.
 * @chainable
 * @example
 * <div><code>
 * function setup() {
 *   let audioEl = createAudio('assets/beat.mp3');
 *   audioEl.showControls();
 *   audioEl.onended(sayDone);
 * }
 *
 * function sayDone(elt) {
 *   alert('done playing ' + elt.src);
 * }
 * </code></div>
 */
inline fun p5.MediaElement.onended(noinline callback: (p5.MediaElement) -> Unit) { asDynamic().onended(callback) }


/*** CONNECT TO WEB AUDIO API / p5.sound.js ***/


/**
 * Send the audio output of this element to a specified audioNode or
 * p5.sound object. If no element is provided, connects to p5's main
 * output. That connection is established when this method is first called.
 * All connections are removed by the .disconnect() method.
 *
 * This method is meant to be used with the p5.sound.js addon library.
 *
 * @method  connect
 * @param  {AudioNode|Object} [audioNode] AudioNode from the Web Audio API,
 * or an object from the p5.sound library
 */
// TODO need to implement Web Audio API and p5-sound libs to make types work
inline fun p5.MediaElement.connect(audioNode: Object) { asDynamic().connect(audioNode) }


/**
 * Disconnect all Web Audio routing, including to main output.
 * This is useful if you want to re-route the output through
 * audio effects, for example.
 *
 * @method  disconnect
 */
inline fun p5.MediaElement.disconnect() { asDynamic().disconnect() }


/*** SHOW / HIDE CONTROLS ***/


/**
 * Show the default MediaElement controls, as determined by the web browser.
 *
 * @method  showControls
 * @example
 * <div><code>
 * let ele;
 * function setup() {
 *   //p5.MediaElement objects are usually created
 *   //by calling the createAudio(), createVideo(),
 *   //and createCapture() functions.
 *   //In this example we create
 *   //a new p5.MediaElement via createAudio()
 *   ele = createAudio('assets/lucky_dragons.mp3');
 *   background(200);
 *   textAlign(CENTER);
 *   text('Click to Show Controls!', 10, 25, 70, 80);
 * }
 * function mousePressed() {
 *   ele.showControls();
 *   background(200);
 *   text('Controls Shown', width / 2, height / 2);
 * }
 * </code></div>
 */
inline fun p5.MediaElement.showControls() { asDynamic().showControls() }


/**
 * Hide the default mediaElement controls.
 * @method hideControls
 * @example
 * <div><code>
 * let ele;
 * function setup() {
 *   //p5.MediaElement objects are usually created
 *   //by calling the createAudio(), createVideo(),
 *   //and createCapture() functions.
 *   //In this example we create
 *   //a new p5.MediaElement via createAudio()
 *   ele = createAudio('assets/lucky_dragons.mp3');
 *   ele.showControls();
 *   background(200);
 *   textAlign(CENTER);
 *   text('Click to hide Controls!', 10, 25, 70, 80);
 * }
 * function mousePressed() {
 *   ele.hideControls();
 *   background(200);
 *   text('Controls hidden', width / 2, height / 2);
 * }
 * </code></div>
 */
inline fun p5.MediaElement.hideControls() { asDynamic().hideControls() }


/*** SCHEDULE EVENTS ***/


/**
 * Schedule events to trigger every time a MediaElement
 * (audio/video) reaches a playback cue point.
 *
 * Accepts a callback function, a time (in seconds) at which to trigger
 * the callback, and an optional parameter for the callback.
 *
 * Time will be passed as the first parameter to the callback function,
 * and param will be the second parameter.
 *
 * @method  addCue
 * @param {Number} [time] Time in seconds, relative to this media
 *                        element's playback. For example, to trigger
 *                        an event every time playback reaches two
 *                        seconds, pass in the number 2. This will be
 *                        passed as the first parameter to
 *                        the callback function.
 * @param {Function} [callback] Name of a function that will be
 *                              called at the given time. The callback will
 *                              receive time and (optionally) param as its
 *                              two parameters.
 * @param {Object} [value] An object to be passed as the
 *                         second parameter to the
 *                         callback function.
 * @return {Number} ID of this cue, useful for removeCue(id)
 * @example
 * <div><code>
 * //
 * //
 * function setup() {
 *   createCanvas(200, 200);
 *
 *   let audioEl = createAudio('assets/beat.mp3');
 *   audioEl.showControls();
 *
 *   // schedule three calls to changeBackground
 *   audioEl.addCue(0.5, changeBackground, color(255, 0, 0));
 *   audioEl.addCue(1.0, changeBackground, color(0, 255, 0));
 *   audioEl.addCue(2.5, changeBackground, color(0, 0, 255));
 *   audioEl.addCue(3.0, changeBackground, color(0, 255, 255));
 *   audioEl.addCue(4.2, changeBackground, color(255, 255, 0));
 *   audioEl.addCue(5.0, changeBackground, color(255, 255, 0));
 * }
 *
 * function changeBackground(val) {
 *   background(val);
 * }
 * </code></div>
 */
inline fun <T> p5.MediaElement.addCue(time: Int, noinline callback: (Int, T?) -> Unit, value: T? = undefined): Long =
    asDynamic().addCue(time, callback, value) as Long


/**
 * Remove a callback based on its ID. The ID is returned by the
 * addCue method.
 * @method removeCue
 * @param  {Number} [id] ID of the cue, as returned by addCue
 * @example
 * <div><code>
 * let audioEl, id1, id2;
 * function setup() {
 *   background(255, 255, 255);
 *   audioEl = createAudio('assets/beat.mp3');
 *   audioEl.showControls();
 *   // schedule five calls to changeBackground
 *   id1 = audioEl.addCue(0.5, changeBackground, color(255, 0, 0));
 *   audioEl.addCue(1.0, changeBackground, color(0, 255, 0));
 *   audioEl.addCue(2.5, changeBackground, color(0, 0, 255));
 *   audioEl.addCue(3.0, changeBackground, color(0, 255, 255));
 *   id2 = audioEl.addCue(4.2, changeBackground, color(255, 255, 0));
 *   text('Click to remove first and last Cue!', 10, 25, 70, 80);
 * }
 * function mousePressed() {
 *   audioEl.removeCue(id1);
 *   audioEl.removeCue(id2);
 * }
 * function changeBackground(val) {
 *   background(val);
 * }
 * </code></div>
 */
inline fun p5.MediaElement.removeCue(id: Long) { asDynamic().removeCue(id) }


/**
 * Remove all of the callbacks that had originally been scheduled
 * via the addCue method.
 * @method  clearCues
 * @example
 * <div><code>
 * let audioEl;
 * function setup() {
 *   background(255, 255, 255);
 *   audioEl = createAudio('assets/beat.mp3');
 *   //Show the default MediaElement controls, as determined by the web browser
 *   audioEl.showControls();
 *   // schedule calls to changeBackground
 *   background(200);
 *   text('Click to change Cue!', 10, 25, 70, 80);
 *   audioEl.addCue(0.5, changeBackground, color(255, 0, 0));
 *   audioEl.addCue(1.0, changeBackground, color(0, 255, 0));
 *   audioEl.addCue(2.5, changeBackground, color(0, 0, 255));
 *   audioEl.addCue(3.0, changeBackground, color(0, 255, 255));
 *   audioEl.addCue(4.2, changeBackground, color(255, 255, 0));
 * }
 * function mousePressed() {
 *   // here we clear the scheduled callbacks
 *   audioEl.clearCues();
 *   // then we add some more callbacks
 *   audioEl.addCue(1, changeBackground, color(2, 2, 2));
 *   audioEl.addCue(3, changeBackground, color(255, 255, 0));
 * }
 * function changeBackground(val) {
 *   background(val);
 * }
 * </code></div>
 */
inline fun p5.MediaElement.clearCues() { asDynamic().clearCues() }
