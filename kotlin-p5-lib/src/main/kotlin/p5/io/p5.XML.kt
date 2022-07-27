@file:Suppress("unused")

package p5.io

import p5.core.p5


/**
 * Gets a copy of the element's parent. Returns the parent as another
 * <a href="#/p5.XML">p5.XML</a> object.
 *
 * @method getParent
 * @return {p5.XML}   element parent
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let children = xml.getChildren('animal');
 *   let parent = children[1].getParent();
 *   print(parent.getName());
 * }
 *
 * // Sketch prints:
 * // mammals
 * </code></div>
 */
inline fun p5.XML.getParent(): p5.XML = asDynamic().getParent().unsafeCast<p5.XML>()


/**
 *  Gets the element's full name, which is returned as a String.
 *
 * @method getName
 * @return {String} the name of the node
 * @example &lt;animal
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   print(xml.getName());
 * }
 *
 * // Sketch prints:
 * // mammals
 * </code></div>
 */
inline fun p5.XML.getName(): String = asDynamic().getName() as String


/**
 * Sets the element's name, which is specified as a String.
 *
 * @method setName
 * @param {String} the new name of the node
 * @example&lt;animal
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   print(xml.getName());
 *   xml.setName('fish');
 *   print(xml.getName());
 * }
 *
 * // Sketch prints:
 * // mammals
 * // fish
 * </code></div>
 */
inline fun p5.XML.setName(name: String) { asDynamic().setName(name) }


/**
 * Checks whether the element has any children, and returns the result
 * as a boolean.
 *
 * @method hasChildren
 * @return {boolean}
 * @example&lt;animal
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   print(xml.hasChildren());
 * }
 *
 * // Sketch prints:
 * // true
 * </code></div>
 */
inline fun p5.XML.hasChildren(): Boolean = asDynamic().hasChildren() as Boolean


/**
 * Get the names of all element's children, and returns the names as an
 * array of Strings. This is the same as looping through and calling <a href="#/p5.XML/getName">getName()</a>
 * on each child element individually.
 *
 * @method listChildren
 * @return {String[]} names of the children of the element
 * @example&lt;animal
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   print(xml.listChildren());
 * }
 *
 * // Sketch prints:
 * // ["animal", "animal", "animal"]
 * </code></div>
 */
inline fun p5.XML.listChildren(): Array<String> = asDynamic().listChildren().unsafeCast<Array<String>>()


/**
 * Returns all element's children as an array of <a href="#/p5.XML">p5.XML</a> objects. When
 * the name parameter is specified, then it will return all children that match
 * that name.
 *
 * @method getChildren
 * @param {String} [name] element name
 * @return {p5.XML[]} children of the element
 * @example&lt;animal
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let animals = xml.getChildren('animal');
 *
 *   for (let i = 0; i < animals.length; i++) {
 *     print(animals[i].getContent());
 *   }
 * }
 *
 * // Sketch prints:
 * // "Goat"
 * // "Leopard"
 * // "Zebra"
 * </code></div>
 */
inline fun p5.XML.getChildren(name: String? = undefined): Array<p5.XML> = asDynamic().getChildren(name).unsafeCast<Array<p5.XML>>()


/**
 * Returns the first of the element's children that matches the name parameter
 * or the child of the given index.It returns undefined if no matching
 * child is found.
 *
 * @method getChild
 * @param {String|Integer} [name] element name or index
 * @return {p5.XML}
 * @example&lt;animal
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getContent());
 * }
 *
 * // Sketch prints:
 * // "Goat"
 * </code></div>
 * <div class='norender'><code>
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let secondChild = xml.getChild(1);
 *   print(secondChild.getContent());
 * }
 *
 * // Sketch prints:
 * // "Leopard"
 * </code></div>
 */
inline fun p5.XML.getChild(name: String): p5.XML = asDynamic().getChild(name).unsafeCast<p5.XML>()

inline fun p5.XML.getChild(index: Int): p5.XML = asDynamic().getChild(index).unsafeCast<p5.XML>()


/**
 * Appends a new child to the element. The child can be specified with
 * either a String, which will be used as the new tag's name, or as a
 * reference to an existing <a href="#/p5.XML">p5.XML</a> object.
 * A reference to the newly created child is returned as an <a href="#/p5.XML">p5.XML</a> object.
 *
 * @method addChild
 * @param {p5.XML} [node] a <a href="#/p5.XML">p5.XML</a> Object which will be the child to be added
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let child = new p5.XML();
 *   child.setName('animal');
 *   child.setAttribute('id', '3');
 *   child.setAttribute('species', 'Ornithorhynchus anatinus');
 *   child.setContent('Platypus');
 *   xml.addChild(child);
 *
 *   let animals = xml.getChildren('animal');
 *   print(animals[animals.length - 1].getContent());
 * }
 *
 * // Sketch prints:
 * // "Goat"
 * // "Leopard"
 * // "Zebra"
 * </code></div>
 */
inline fun p5.XML.addChild(node: p5.XML) { asDynamic().addChild(node) }


/**
 * Removes the element specified by name or index.
 *
 * @method removeChild
 * @param {String|Integer} [name] element name or index
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   xml.removeChild('animal');
 *   let children = xml.getChildren();
 *   for (let i = 0; i < children.length; i++) {
 *     print(children[i].getContent());
 *   }
 * }
 *
 * // Sketch prints:
 * // "Leopard"
 * // "Zebra"
 * </code></div>
 * <div class='norender'><code>
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   xml.removeChild(1);
 *   let children = xml.getChildren();
 *   for (let i = 0; i < children.length; i++) {
 *     print(children[i].getContent());
 *   }
 * }
 *
 * // Sketch prints:
 * // "Goat"
 * // "Zebra"
 * </code></div>
 */
inline fun p5.XML.removeChild(name: String): p5.XML = asDynamic().removeChild(name).unsafeCast<p5.XML>()

inline fun p5.XML.removeChild(index: Int): p5.XML = asDynamic().removeChild(index).unsafeCast<p5.XML>()


/**
 * Counts the specified element's number of attributes, returned as a Number.
 *
 * @method getAttributeCount
 * @return {Integer}
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getAttributeCount());
 * }
 *
 * // Sketch prints:
 * // 2
 * </code></div>
 */
inline fun p5.XML.getAttributeCount(): Int = asDynamic().getAttributeCount() as Int


/**
 * Gets all specified element's attributes, and returns them as an
 * array of Strings.
 *
 * @method listAttributes
 * @return {String[]} an array of strings containing the names of attributes
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.listAttributes());
 * }
 *
 * // Sketch prints:
 * // ["id", "species"]
 * </code></div>
 */
inline fun p5.XML.listAttributes(): Array<String> = asDynamic().listAttributes().unsafeCast<Array<String>>()


/**
 *  Checks whether an element has the specified attribute.
 *
 * @method hasAttribute
 * @param {String} the attribute to be checked
 * @return {boolean} true if attribute found else false
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.hasAttribute('species'));
 *   print(firstChild.hasAttribute('color'));
 * }
 *
 * // Sketch prints:
 * // true
 * // false
 * </code></div>
 */
inline fun p5.XML.hasAttribute(name: String): Boolean = asDynamic().hasAttribute(name) as Boolean


/**
 * Returns an attribute value of the element as a Number. If the defaultValue
 * parameter is specified and the attribute doesn't exist, then defaultValue
 * is returned. If no defaultValue is specified and the attribute doesn't
 * exist, the value 0 is returned.
 *
 * @method getNum
 * @param {String} [name]            the non-null full name of the attribute
 * @param {Number} [defaultValue]  the default value of the attribute
 * @return {Number}
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getNum('id'));
 * }
 *
 * // Sketch prints:
 * // 0
 * </code></div>
 */
inline fun <T : Number> p5.XML.getNum(name: String, defaultValue: T? = undefined): T =
    asDynamic().getNum(name, defaultValue) as T


/**
 * Returns an attribute value of the element as a String. If the defaultValue
 * parameter is specified and the attribute doesn't exist, then defaultValue
 * is returned. If no defaultValue is specified and the attribute doesn't
 * exist, null is returned.
 *
 * @method getString
 * @param {String} [name]            the non-null full name of the attribute
 * @param {Number} [defaultValue]  the default value of the attribute
 * @return {String}
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getString('species'));
 * }
 *
 * // Sketch prints:
 * // "Capra hircus"
 * </code></div>
 */
inline fun p5.XML.getString(name: String, defaultValue: String? = undefined): String? =
    asDynamic().getNum(name, defaultValue) as String?


/**
 * Sets the content of an element's attribute. The first parameter specifies
 * the attribute name, while the second specifies the new content.
 *
 * @method setAttribute
 * @param {String} [name] the full name of the attribute
 * @param {Number|String|Boolean} [value]  the value of the attribute
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getString('species'));
 *   firstChild.setAttribute('species', 'Jamides zebra');
 *   print(firstChild.getString('species'));
 * }
 *
 * // Sketch prints:
 * // "Capra hircus"
 * // "Jamides zebra"
 * </code></div>
 */
inline fun p5.XML.setAttribute(name: String, value: String) { asDynamic().setAttribute(name, value) }

inline fun p5.XML.setAttribute(name: String, value: Number) { asDynamic().setAttribute(name, value) }

inline fun p5.XML.setAttribute(name: String, value: Boolean) { asDynamic().setAttribute(name, value) }


/**
 * Returns the content of an element. If there is no such content,
 * defaultValue is returned if specified, otherwise null is returned.
 *
 * @method getContent
 * @param {String} [defaultValue] value returned if no content is found
 * @return {String}
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getContent());
 * }
 *
 * // Sketch prints:
 * // "Goat"
 * </code></div>
 */
inline fun p5.XML.getContent(defaultValue: String? = undefined): String? = asDynamic().getContent(defaultValue) as String?


/**
 * Sets the element's content.
 *
 * @method setContent
 * @param {String} [text] the new content
 * @example
 * <div class='norender'><code>
 * // The following short XML file called "mammals.xml" is parsed
 * // in the code below.
 * //
 * // <?xml version="1.0"?>
 * // &lt;mammals&gt;
 * //   &lt;animal id="0" species="Capra hircus">Goat&lt;/animal&gt;
 * //   &lt;animal id="1" species="Panthera pardus">Leopard&lt;/animal&gt;
 * //   &lt;animal id="2" species="Equus zebra">Zebra&lt;/animal&gt;
 * // &lt;/mammals&gt;
 *
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   let firstChild = xml.getChild('animal');
 *   print(firstChild.getContent());
 *   firstChild.setContent('Mountain Goat');
 *   print(firstChild.getContent());
 * }
 *
 * // Sketch prints:
 * // "Goat"
 * // "Mountain Goat"
 * </code></div>
 */
inline fun p5.XML.setContent(text: String) { asDynamic().setContent(text) }


/**
 * Serializes the element into a string. This function is useful for preparing
 * the content to be sent over a http request or saved to file.
 *
 * @method serialize
 * @return {String} Serialized string of the element
 * @example
 * <div class='norender'><code>
 * let xml;
 *
 * function preload() {
 *   xml = loadXML('assets/mammals.xml');
 * }
 *
 * function setup() {
 *   print(xml.serialize());
 * }
 *
 * // Sketch prints:
 * // <mammals>
 * //   <animal id="0" species="Capra hircus">Goat</animal>
 * //   <animal id="1" species="Panthera pardus">Leopard</animal>
 * //   <animal id="2" species="Equus zebra">Zebra</animal>
 * // </mammals>
 * </code></div>
 */
inline fun p5.XML.serialize(): String = asDynamic().serialize() as String
