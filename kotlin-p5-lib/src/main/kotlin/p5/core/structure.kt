/**
 * @file The structure.kt module is best thought of as a collection of ways to make modifications
 * to the typical loop structure exposed by the draw() function.
 * The functions in this module allow you to add and extract individual renders from the loop,
 * draw the loop one frame at a time, pause and resume the loop, and so on.
 *
 * @see <a href="https://github.com/processing/p5.js/blob/main/src/core/constants.js">source</a>
 */
@file:Suppress("unused")

package p5.core

/**
 * Stops p5.js from continuously executing the code within <a href="#/p5/draw">draw()</a>.
 * If <a href="#/p5/loop">loop()</a> is called, the code in <a href="#/p5/draw">draw()</a>
 * begins to run continuously again. If using <a href="#/p5/noLoop">noLoop()</a>
 * in <a href="#/p5/setup">setup()</a>, it should be the last line inside the block.
 *
 * When <a href="#/p5/noLoop">noLoop()</a> is used, it's not possible to manipulate
 * or access the screen inside event handling functions such as
 * <a href="#/p5/mousePressed">mousePressed()</a> or
 * <a href="#/p5/keyPressed">keyPressed()</a>. Instead, use those functions to
 * call <a href="#/p5/redraw">redraw()</a> or <a href="#/p5/loop">loop()</a>,
 * which will run <a href="#/p5/draw">draw()</a>, which can update the screen
 * properly. This means that when <a href="#/p5/noLoop">noLoop()</a> has been
 * called, no drawing can happen, and functions like <a href="#/p5/saveFrames">saveFrames()</a>
 * or <a href="#/p5/loadPixels">loadPixels()</a> may not be used.
 *
 * Note that if the sketch is resized, <a href="#/p5/redraw">redraw()</a> will
 * be called to update the sketch, even after <a href="#/p5/noLoop">noLoop()</a>
 * has been specified. Otherwise, the sketch would enter an odd state until
 * <a href="#/p5/loop">loop()</a> was called.
 *
 * Use <a href="#/p5/isLooping">isLooping()</a> to check the current state of <a href="#/p5/loop">loop()</a>.
 *
 * @method noLoop
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100);
 *   background(200);
 *   noLoop();
 * }
 * function draw() {
 *   line(10, 10, 90, 90);
 * }
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * let x = 0;
 * function setup() {
 *   createCanvas(100, 100);
 * }
 *
 * function draw() {
 *   background(204);
 *   x = x + 0.1;
 *   if (x > width) {
 *     x = 0;
 *   }
 *   line(x, 0, x, height);
 * }
 *
 * function mousePressed() {
 *   noLoop();
 * }
 *
 * function mouseReleased() {
 *   loop();
 * }
 * </code>
 * </div>
 *
 * @alt
 * 113 pixel long line extending from top-left to bottom right of canvas.
 * horizontal line moves slowly from left. Loops but stops on mouse press.
 */
inline fun p5.noLoop() { asDynamic().noLoop() }

/**
 * By default, p5.js loops through draw() continuously, executing the code within
 * it. However, the <a href="#/p5/draw">draw()</a> loop may be stopped by calling
 * <a href="#/p5/noLoop">noLoop()</a>. In that case, the <a href="#/p5/draw">draw()</a>
 * loop can be resumed with loop().
 *
 * Avoid calling loop() from inside setup().
 *
 * Use <a href="#/p5/isLooping">isLooping()</a> to check the current state of <a href="#/p5/loop">loop()</a>.
 *
 * @method loop
 * @example
 * <div>
 * <code>
 * let x = 0;
 * function setup() {
 *   createCanvas(100, 100);
 *   noLoop();
 * }
 *
 * function draw() {
 *   background(204);
 *   x = x + 0.1;
 *   if (x > width) {
 *     x = 0;
 *   }
 *   line(x, 0, x, height);
 * }
 *
 * function mousePressed() {
 *   loop();
 * }
 *
 * function mouseReleased() {
 *   noLoop();
 * }
 * </code>
 * </div>
 *
 * @alt
 * horizontal line moves slowly from left. Loops but stops on mouse press.
 */
inline fun p5.loop() { asDynamic().loop() }

/**
 * By default, p5.js loops through <a href="#/p5/draw">draw()</a> continuously,
 * executing the code within it. If the sketch is stopped with
 * <a href="#/p5/noLoop">noLoop()</a> or resumed with <a href="#/p5/loop">loop()</a>,
 * isLooping() returns the current state for use within custom event handlers.
 *
 * @method isLooping
 * @returns {boolean}
 * @example
 * <div>
 * <code>
 * let checkbox, button, colBG, colFill;
 *
 * function setup() {
 *   createCanvas(100, 100);
 *
 *   button = createButton('Colorize if loop()');
 *   button.position(0, 120);
 *   button.mousePressed(changeBG);
 *
 *   checkbox = createCheckbox('loop()', true);
 *   checkbox.changed(checkLoop);
 *
 *   colBG = color(0);
 *   colFill = color(255);
 * }
 *
 * function changeBG() {
 *   if (isLooping()) {
 *     colBG = color(random(255), random(255), random(255));
 *     colFill = color(random(255), random(255), random(255));
 *   }
 * }
 *
 * function checkLoop() {
 *   if (this.checked()) {
 *     loop();
 *   } else {
 *     noLoop();
 *   }
 * }
 *
 * function draw() {
 *   background(colBG);
 *   fill(colFill);
 *   ellipse(frameCount % width, height / 2, 50);
 * }
 * </code>
 * </div>
 *
 * @alt
 * Ellipse moves slowly from left. Checkbox toggles loop()/noLoop().
 * Button colorizes sketch if isLooping().
 *
 */
inline fun p5.isLooping(): Boolean { return asDynamic().isLooping() as Boolean }

/**
 * The <a href="#/p5/push">push()</a> function saves the current drawing style
 * settings and transformations, while <a href="#/p5/pop">pop()</a> restores these
 * settings. Note that these functions are always used together. They allow you to
 * change the style and transformation settings and later return to what you had.
 * When a new state is started with <a href="#/p5/push">push()</a>, it builds on
 * the current style and transform information. The <a href="#/p5/push">push()</a>
 * and <a href="#/p5/pop">pop()</a> functions can be embedded to provide more
 * control. (See the second example for a demonstration.)
 *
 * <a href="#/p5/push">push()</a> stores information related to the current transformation state
 * and style settings controlled by the following functions:
 * <a href="#/p5/fill">fill()</a>,
 * <a href="#/p5/noFill">noFill()</a>,
 * <a href="#/p5/noStroke">noStroke()</a>,
 * <a href="#/p5/stroke">stroke()</a>,
 * <a href="#/p5/tint">tint()</a>,
 * <a href="#/p5/noTint">noTint()</a>,
 * <a href="#/p5/strokeWeight">strokeWeight()</a>,
 * <a href="#/p5/strokeCap">strokeCap()</a>,
 * <a href="#/p5/strokeJoin">strokeJoin()</a>,
 * <a href="#/p5/imageMode">imageMode()</a>,
 * <a href="#/p5/rectMode">rectMode()</a>,
 * <a href="#/p5/ellipseMode">ellipseMode()</a>,
 * <a href="#/p5/colorMode">colorMode()</a>,
 * <a href="#/p5/textAlign">textAlign()</a>,
 * <a href="#/p5/textFont">textFont()</a>,
 * <a href="#/p5/textSize">textSize()</a>,
 * <a href="#/p5/textLeading">textLeading()</a>,
 * <a href="#/p5/applyMatrix">applyMatrix()</a>,
 * <a href="#/p5/resetMatrix">resetMatrix()</a>,
 * <a href="#/p5/rotate">rotate()</a>,
 * <a href="#/p5/scale">scale()</a>,
 * <a href="#/p5/shearX">shearX()</a>,
 * <a href="#/p5/shearY">shearY()</a>,
 * <a href="#/p5/translate">translate()</a>,
 * <a href="#/p5/noiseSeed">noiseSeed()</a>.
 *
 * In WEBGL mode additional style settings are stored. These are controlled by the
 * following functions: <a href="#/p5/setCamera">setCamera()</a>,
 * <a href="#/p5/ambientLight">ambientLight()</a>,
 * <a href="#/p5/directionalLight">directionalLight()</a>,
 * <a href="#/p5/pointLight">pointLight()</a>, <a href="#/p5/texture">texture()</a>,
 * <a href="#/p5/specularMaterial">specularMaterial()</a>,
 * <a href="#/p5/shininess">shininess()</a>,
 * <a href="#/p5/normalMaterial">normalMaterial()</a>
 * and <a href="#/p5/shader">shader()</a>.
 *
 * @method push
 * @example
 * <div>
 * <code>
 * ellipse(0, 50, 33, 33); // Left circle
 *
 * push(); // Start a new drawing state
 * strokeWeight(10);
 * fill(204, 153, 0);
 * translate(50, 0);
 * ellipse(0, 50, 33, 33); // Middle circle
 * pop(); // Restore original state
 *
 * ellipse(100, 50, 33, 33); // Right circle
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * ellipse(0, 50, 33, 33); // Left circle
 *
 * push(); // Start a new drawing state
 * strokeWeight(10);
 * fill(204, 153, 0);
 * ellipse(33, 50, 33, 33); // Left-middle circle
 *
 * push(); // Start another new drawing state
 * stroke(0, 102, 153);
 * ellipse(66, 50, 33, 33); // Right-middle circle
 * pop(); // Restore previous state
 *
 * pop(); // Restore original state
 *
 * ellipse(100, 50, 33, 33); // Right circle
 * </code>
 * </div>
 *
 * @alt
 * Gold ellipse + thick black outline @center 2 white ellipses on left and right.
 * 2 Gold ellipses left black right blue stroke. 2 white ellipses on left+right.
 */
inline fun p5.push() { asDynamic().push() }


/**
 * The <a href="#/p5/push">push()</a> function saves the current drawing style
 * settings and transformations, while <a href="#/p5/pop">pop()</a> restores
 * these settings. Note that these functions are always used together. They allow
 * you to change the style and transformation settings and later return to what
 * you had. When a new state is started with <a href="#/p5/push">push()</a>, it
 * builds on the current style and transform information. The <a href="#/p5/push">push()</a>
 * and <a href="#/p5/pop">pop()</a> functions can be embedded to provide more
 * control. (See the second example for a demonstration.)
 *
 * <a href="#/p5/push">push()</a> stores information related to the current transformation state
 * and style settings controlled by the following functions:
 * <a href="#/p5/fill">fill()</a>,
 * <a href="#/p5/noFill">noFill()</a>,
 * <a href="#/p5/noStroke">noStroke()</a>,
 * <a href="#/p5/stroke">stroke()</a>,
 * <a href="#/p5/tint">tint()</a>,
 * <a href="#/p5/noTint">noTint()</a>,
 * <a href="#/p5/strokeWeight">strokeWeight()</a>,
 * <a href="#/p5/strokeCap">strokeCap()</a>,
 * <a href="#/p5/strokeJoin">strokeJoin()</a>,
 * <a href="#/p5/imageMode">imageMode()</a>,
 * <a href="#/p5/rectMode">rectMode()</a>,
 * <a href="#/p5/ellipseMode">ellipseMode()</a>,
 * <a href="#/p5/colorMode">colorMode()</a>,
 * <a href="#/p5/textAlign">textAlign()</a>,
 * <a href="#/p5/textFont">textFont()</a>,
 * <a href="#/p5/textSize">textSize()</a>,
 * <a href="#/p5/textLeading">textLeading()</a>,
 * <a href="#/p5/applyMatrix">applyMatrix()</a>,
 * <a href="#/p5/resetMatrix">resetMatrix()</a>,
 * <a href="#/p5/rotate">rotate()</a>,
 * <a href="#/p5/scale">scale()</a>,
 * <a href="#/p5/shearX">shearX()</a>,
 * <a href="#/p5/shearY">shearY()</a>,
 * <a href="#/p5/translate">translate()</a>,
 * <a href="#/p5/noiseSeed">noiseSeed()</a>.
 *
 * In WEBGL mode additional style settings are stored. These are controlled by
 * the following functions:
 * <a href="#/p5/setCamera">setCamera()</a>,
 * <a href="#/p5/ambientLight">ambientLight()</a>,
 * <a href="#/p5/directionalLight">directionalLight()</a>,
 * <a href="#/p5/pointLight">pointLight()</a>,
 * <a href="#/p5/texture">texture()</a>,
 * <a href="#/p5/specularMaterial">specularMaterial()</a>,
 * <a href="#/p5/shininess">shininess()</a>,
 * <a href="#/p5/normalMaterial">normalMaterial()</a> and
 * <a href="#/p5/shader">shader()</a>.
 *
 * @method pop
 * @example
 * <div>
 * <code>
 * ellipse(0, 50, 33, 33); // Left circle
 *
 * push(); // Start a new drawing state
 * translate(50, 0);
 * strokeWeight(10);
 * fill(204, 153, 0);
 * ellipse(0, 50, 33, 33); // Middle circle
 * pop(); // Restore original state
 *
 * ellipse(100, 50, 33, 33); // Right circle
 * </code>
 * </div>
 *
 * <div>
 * <code>
 * ellipse(0, 50, 33, 33); // Left circle
 *
 * push(); // Start a new drawing state
 * strokeWeight(10);
 * fill(204, 153, 0);
 * ellipse(33, 50, 33, 33); // Left-middle circle
 *
 * push(); // Start another new drawing state
 * stroke(0, 102, 153);
 * ellipse(66, 50, 33, 33); // Right-middle circle
 * pop(); // Restore previous state
 *
 * pop(); // Restore original state
 *
 * ellipse(100, 50, 33, 33); // Right circle
 * </code>
 * </div>
 *
 * @alt
 * Gold ellipse + thick black outline @center 2 white ellipses on left and right.
 * 2 Gold ellipses left black right blue stroke. 2 white ellipses on left+right.
 */
inline fun p5.pop() { asDynamic().pop() }


/**
 * Executes the code within <a href="#/p5/draw">draw()</a> one time. This
 * function allows the program to update the display window only when necessary,
 * for example when an event registered by <a href="#/p5/mousePressed">mousePressed()</a>
 * or <a href="#/p5/keyPressed">keyPressed()</a> occurs.
 *
 * In structuring a program, it only makes sense to call <a href="#/p5/redraw">redraw()</a>
 * within events such as <a href="#/p5/mousePressed">mousePressed()</a>. This
 * is because <a href="#/p5/redraw">redraw()</a> does not run
 * <a href="#/p5/draw">draw()</a> immediately (it only sets a flag that indicates
 * an update is needed).
 *
 * The <a href="#/p5/redraw">redraw()</a> function does not work properly when
 * called inside <a href="#/p5/draw">draw()</a>.To enable/disable animations,
 * use <a href="#/p5/loop">loop()</a> and <a href="#/p5/noLoop">noLoop()</a>.
 *
 * In addition you can set the number of redraws per method call. Just
 * add an integer as single parameter for the number of redraws.
 *
 * @method redraw
 * @param  {Integer} [n] Redraw for n-times. The default value is 1.
 * @example
 * <div><code>
 * let x = 0;
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   noLoop();
 * }
 *
 * function draw() {
 *   background(204);
 *   line(x, 0, x, height);
 * }
 *
 * function mousePressed() {
 *   x += 1;
 *   redraw();
 * }
 * </code>
 * </div>
 *
 * <div class='norender'>
 * <code>
 * let x = 0;
 *
 * function setup() {
 *   createCanvas(100, 100);
 *   noLoop();
 * }
 *
 * function draw() {
 *   background(204);
 *   x += 1;
 *   line(x, 0, x, height);
 * }
 *
 * function mousePressed() {
 *   redraw(5);
 * }
 * </code>
 * </div>
 *
 * @alt
 * black line on far left of canvas
 * black line on far left of canvas
 */
inline fun p5.redraw(n: Int) { asDynamic().redraw(n) }

