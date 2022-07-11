@file:Suppress("unused")

package p5.accessibility

import p5.core.p5

/**
 * <code class="language-javascript">textOutput()</code> creates a screen reader
 * accessible output that describes the shapes present on the canvas.
 * The general description of the canvas includes canvas size,
 * canvas color, and number of elements in the canvas
 * (example: 'Your output is a 400 by 400 pixels, lavender blue
 * canvas containing the following 4 shapes:'). This description
 * is followed by a list of shapes where the color, position, and area
 * of each shape are described (example: "orange ellipse at top left
 * covering 1% of the canvas"). Each element can be selected to get
 * more details. A table of elements is also provided. In this table,
 * shape, color, location, coordinates and area are described
 * (example: "orange ellipse location=top left area=2").
 *
 * <code class="language-javascript">textOutput()</code> and <code class="language-javascript">textOutput(FALLBACK)</code>
 * make the output available in <a href="https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API/Tutorial/Hit_regions_and_accessibility" target="_blank">
 * a sub DOM inside the canvas element</a> which is accessible to screen readers.
 * <code class="language-javascript">textOutput(LABEL)</code> creates an
 * additional div with the output adjacent to the canvas, this is useful
 * for non-screen reader users that might want to display the output outside
 * the canvas' sub DOM as they code. However, using LABEL will create
 * unnecessary redundancy for screen reader users. We recommend using LABEL
 * only as part of the development process of a sketch and removing it before
 * publishing or sharing with screen reader users.
 *
 * @method textOutput
 * @param  {Constant} [display] either FALLBACK or LABEL
 *
 * @example
 * <div>
 * <code>
 * textOutput();
 * background(148, 196, 0);
 * fill(255, 0, 0);
 * ellipse(20, 20, 20, 20);
 * fill(0, 0, 255);
 * rect(50, 50, 50, 50);
 * </code>
 * </div>
 *
 *
 * <div>
 * <code>
 * let x = 0;
 * function draw() {
 *   textOutput();
 *   background(148, 196, 0);
 *   fill(255, 0, 0);
 *   ellipse(x, 20, 20, 20);
 *   fill(0, 0, 255);
 *   rect(50, 50, 50, 50);
 *   ellipse(20, 20, 20, 20);
 *   x += 0.1;
 * }
 * </code>
 * </div>
 *
 */
inline fun p5.textOutput(display: String) { asDynamic().textOutput(display) }


/**
 * <code class="language-javascript">gridOutput()</code> lays out the
 * content of the canvas in the form of a grid (html table) based
 * on the spatial location of each shape. A brief
 * description of the canvas is available before the table output.
 * This description includes: color of the background, size of the canvas,
 * number of objects, and object types (example: "lavender blue canvas is
 * 200 by 200 and contains 4 objects - 3 ellipses 1 rectangle"). The grid
 * describes the content spatially, each element is placed on a cell of the
 * table depending on its position. Within each cell an element the color
 * and type of shape of that element are available (example: "orange ellipse").
 * These descriptions can be selected individually to get more details.
 * A list of elements where shape, color, location, and area are described
 * (example: "orange ellipse location=top left area=1%") is also available.
 *
 * <code class="language-javascript">gridOutput()</code> and <code class="language-javascript">gridOutput(FALLBACK)</code>
 * make the output available in <a href="https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API/Tutorial/Hit_regions_and_accessibility" target="_blank">
 * a sub DOM inside the canvas element</a> which is accessible to screen readers.
 * <code class="language-javascript">gridOutput(LABEL)</code> creates an
 * additional div with the output adjacent to the canvas, this is useful
 * for non-screen reader users that might want to display the output outside
 * the canvas' sub DOM as they code. However, using LABEL will create
 * unnecessary redundancy for screen reader users. We recommend using LABEL
 * only as part of the development process of a sketch and removing it before
 * publishing or sharing with screen reader users.
 *
 * @method gridOutput
 * @param  {Constant} [display] either FALLBACK or LABEL
 *
 * @example
 * <div>
 * <code>
 * gridOutput();
 * background(148, 196, 0);
 * fill(255, 0, 0);
 * ellipse(20, 20, 20, 20);
 * fill(0, 0, 255);
 * rect(50, 50, 50, 50);
 * </code>
 * </div>
 *
 *
 * <div>
 * <code>
 * let x = 0;
 * function draw() {
 *   gridOutput();
 *   background(148, 196, 0);
 *   fill(255, 0, 0);
 *   ellipse(x, 20, 20, 20);
 *   fill(0, 0, 255);
 *   rect(50, 50, 50, 50);
 *   ellipse(20, 20, 20, 20);
 *   x += 0.1;
 * }
 * </code>
 * </div>
 *
 */
inline fun p5.gridOutput(display: String) { asDynamic().gridOutput(display) }