@file:Suppress("unused")

package p5.events

import p5.core.p5


/**
 *
 * The variable movedX contains the horizontal movement of the mouse since the last frame
 * @property {Number} movedX
 * @readOnly
 * @example
 * <div class="notest">
 * <code>
 * let x = 50;
 * function setup() {
 *   rectMode(CENTER);
 * }
 *
 * function draw() {
 *   if (x > 48) {
 *     x -= 2;
 *   } else if (x < 48) {
 *     x += 2;
 *   }
 *   x += floor(movedX / 5);
 *   background(237, 34, 93);
 *   fill(0);
 *   rect(x, 50, 50, 50);
 *   describe(`box moves left and right according to mouse movement
 *     then slowly back towards the center`);
 * }
 * </code>
 * </div>
 */
inline val p5.movedX: Int get() = asDynamic().movedX as Int


/**
 * The variable movedY contains the vertical movement of the mouse since the last frame
 * @property {Number} movedY
 * @readOnly
 * @example
 * <div class="notest">
 * <code>
 * let y = 50;
 * function setup() {
 *   rectMode(CENTER);
 * }
 *
 * function draw() {
 *   if (y > 48) {
 *     y -= 2;
 *   } else if (y < 48) {
 *     y += 2;
 *   }
 *   y += floor(movedY / 5);
 *   background(237, 34, 93);
 *   fill(0);
 *   rect(y, 50, 50, 50);
 *   describe(`box moves up and down according to mouse movement then
 *     slowly back towards the center`);
 * }
 * </code>
 * </div>
 */
inline val p5.movedY: Int get() = asDynamic().movedY as Int


/**
 * The system variable mouseX always contains the current horizontal
 * position of the mouse, relative to (0, 0) of the canvas. The value in
 * the top-left corner is (0, 0) for 2-D and (-width/2, -height/2) for WebGL.
 * If touch is used instead of mouse input, mouseX will hold the x value
 * of the most recent touch point.
 *
 * @property {Number} mouseX
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * // Move the mouse across the canvas
 * function draw() {
 *   background(244, 248, 252);
 *   line(mouseX, 0, mouseX, 100);
 *   describe(`horizontal black line moves left and right with mouse x-position`);
 * }
 * </code>
 * </div>
 */
inline val p5.mouseX: Int get() = asDynamic().mouseX as Int


/**
 * The system variable mouseY always contains the current vertical
 * position of the mouse, relative to (0, 0) of the canvas. The value in
 * the top-left corner is (0, 0) for 2-D and (-width/2, -height/2) for WebGL.
 * If touch is used instead of mouse input, mouseY will hold the y value
 * of the most recent touch point.
 *
 * @property {Number} mouseY
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * // Move the mouse across the canvas
 * function draw() {
 *   background(244, 248, 252);
 *   line(0, mouseY, 100, mouseY);
 *   describe(`vertical black line moves up and down with mouse y-position`);
 * }
 * </code>
 * </div>
 */
inline val p5.mouseY: Int get() = asDynamic().mouseY as Int


/**
 * The system variable pmouseX always contains the horizontal position of
 * the mouse or finger in the frame previous to the current frame, relative to
 * (0, 0) of the canvas. The value in the top-left corner is (0, 0) for 2-D and
 * (-width/2, -height/2) for WebGL. Note: pmouseX will be reset to the current mouseX
 * value at the start of each touch event.
 *
 * @property {Number} pmouseX
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * // Move the mouse across the canvas to leave a trail
 * function setup() {
 *   //slow down the frameRate to make it more visible
 *   frameRate(10);
 * }
 *
 * function draw() {
 *   background(244, 248, 252);
 *   line(mouseX, mouseY, pmouseX, pmouseY);
 *   print(pmouseX + ' -> ' + mouseX);
 *   describe(`line trail is created from cursor movements.
 *     faster movement make longer line.`);
 * }
 * </code>
 * </div>
 */
inline val p5.pmouseX: Int get() = asDynamic().pmouseX as Int


/**
 * The system variable pmouseY always contains the vertical position of
 * the mouse or finger in the frame previous to the current frame, relative to
 * (0, 0) of the canvas. The value in the top-left corner is (0, 0) for 2-D and
 * (-width/2, -height/2) for WebGL. Note: pmouseY will be reset to the current mouseY
 * value at the start of each touch event.
 *
 * @property {Number} pmouseY
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(237, 34, 93);
 *   fill(0);
 *   //draw a square only if the mouse is not moving
 *   if (mouseY === pmouseY && mouseX === pmouseX) {
 *     rect(20, 20, 60, 60);
 *   }
 *
 *   print(pmouseY + ' -> ' + mouseY);
 *   describe(`60-by-60 black rect center, fuchsia background.
 *     rect flickers on mouse movement`);
 * }
 * </code>
 * </div>
 */
inline val p5.pmouseY: Int get() = asDynamic().pmouseY as Int


/**
 * The system variable winMouseX always contains the current horizontal
 * position of the mouse, relative to (0, 0) of the window.
 *
 * @property {Number} winMouseX
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * let myCanvas;
 *
 * function setup() {
 *   //use a variable to store a pointer to the canvas
 *   myCanvas = createCanvas(100, 100);
 *   let body = document.getElementsByTagName('body')[0];
 *   myCanvas.parent(body);
 * }
 *
 * function draw() {
 *   background(237, 34, 93);
 *   fill(0);
 *
 *   //move the canvas to the horizontal mouse position
 *   //relative to the window
 *   myCanvas.position(winMouseX + 1, windowHeight / 2);
 *
 *   //the y of the square is relative to the canvas
 *   rect(20, mouseY, 60, 60);
 *   describe(`60-by-60 black rect y moves with mouse y and fuchsia
 *     canvas moves with mouse x`);
 * }
 * </code>
 * </div>
 */
inline val p5.winMouseX: Int get() = asDynamic().winMouseX as Int


/**
 * The system variable winMouseY always contains the current vertical
 * position of the mouse, relative to (0, 0) of the window.
 *
 * @property {Number} winMouseY
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * let myCanvas;
 *
 * function setup() {
 *   //use a variable to store a pointer to the canvas
 *   myCanvas = createCanvas(100, 100);
 *   let body = document.getElementsByTagName('body')[0];
 *   myCanvas.parent(body);
 * }
 *
 * function draw() {
 *   background(237, 34, 93);
 *   fill(0);
 *
 *   //move the canvas to the vertical mouse position
 *   //relative to the window
 *   myCanvas.position(windowWidth / 2, winMouseY + 1);
 *
 *   //the x of the square is relative to the canvas
 *   rect(mouseX, 20, 60, 60);
 *   describe(`60-by-60 black rect x moves with mouse x and
 *     fuchsia canvas y moves with mouse y`);
 * }
 * </code>
 * </div>
 */
inline val p5.winMouseY: Int get() = asDynamic().winMouseY as Int


/**
 * The system variable pwinMouseX always contains the horizontal position
 * of the mouse in the frame previous to the current frame, relative to
 * (0, 0) of the window. Note: pwinMouseX will be reset to the current winMouseX
 * value at the start of each touch event.
 *
 * @property {Number} pwinMouseX
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * let myCanvas;
 *
 * function setup() {
 *   //use a variable to store a pointer to the canvas
 *   myCanvas = createCanvas(100, 100);
 *   noStroke();
 *   fill(237, 34, 93);
 * }
 *
 * function draw() {
 *   clear();
 *   //the difference between previous and
 *   //current x position is the horizontal mouse speed
 *   let speed = abs(winMouseX - pwinMouseX);
 *   //change the size of the circle
 *   //according to the horizontal speed
 *   ellipse(50, 50, 10 + speed * 5, 10 + speed * 5);
 *   //move the canvas to the mouse position
 *   myCanvas.position(winMouseX + 1, winMouseY + 1);
 *   describe(`fuchsia ellipse moves with mouse x and y.
 *     Grows and shrinks with mouse speed`);
 * }
 * </code>
 * </div>
 */
inline val p5.pwinMouseX: Int get() = asDynamic().pwinMouseX as Int


/**
 * The system variable pwinMouseY always contains the vertical position of
 * the mouse in the frame previous to the current frame, relative to (0, 0)
 * of the window. Note: pwinMouseY will be reset to the current winMouseY
 * value at the start of each touch event.
 *
 * @property {Number} pwinMouseY
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * let myCanvas;
 *
 * function setup() {
 *   //use a variable to store a pointer to the canvas
 *   myCanvas = createCanvas(100, 100);
 *   noStroke();
 *   fill(237, 34, 93);
 * }
 *
 * function draw() {
 *   clear();
 *   //the difference between previous and
 *   //current y position is the vertical mouse speed
 *   let speed = abs(winMouseY - pwinMouseY);
 *   //change the size of the circle
 *   //according to the vertical speed
 *   ellipse(50, 50, 10 + speed * 5, 10 + speed * 5);
 *   //move the canvas to the mouse position
 *   myCanvas.position(winMouseX + 1, winMouseY + 1);
 *   describe(`fuchsia ellipse moves with mouse x and y.
 *     Grows and shrinks with mouse speed`);
 * }
 * </code>
 * </div>
 */
inline val p5.pwinMouseY: Int get() = asDynamic().pwinMouseY as Int


/**
 * p5 automatically tracks if the mouse button is pressed and which
 * button is pressed. The value of the system variable mouseButton is either
 * LEFT, RIGHT, or CENTER depending on which button was pressed last.
 * Warning: different browsers may track mouseButton differently.
 *
 * @property {Constant} mouseButton
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(237, 34, 93);
 *   fill(0);
 *
 *   if (mouseIsPressed === true) {
 *     if (mouseButton === LEFT) {
 *       ellipse(50, 50, 50, 50);
 *     }
 *     if (mouseButton === RIGHT) {
 *       rect(25, 25, 50, 50);
 *     }
 *     if (mouseButton === CENTER) {
 *       triangle(23, 75, 50, 20, 78, 75);
 *     }
 *   }
 *
 *   print(mouseButton);
 *   describe(`50-by-50 black ellipse appears on center of fuchsia
 *     canvas on mouse click/press.`);
 * }
 * </code>
 * </div>
 */
inline val p5.mouseButton: Int get() = asDynamic().mouseButton as Int


/**
 * The boolean system variable mouseIsPressed is true if the mouse is pressed
 * and false if not.
 *
 * @property {Boolean} mouseIsPressed
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * function draw() {
 *   background(237, 34, 93);
 *   fill(0);
 *
 *   if (mouseIsPressed === true) {
 *     ellipse(50, 50, 50, 50);
 *   } else {
 *     rect(25, 25, 50, 50);
 *   }
 *
 *   print(mouseIsPressed);
 *   describe(`black 50-by-50 rect becomes ellipse with mouse click/press.
 *     fuchsia background.`);
 * }
 * </code>
 * </div>
 */
inline val p5.mouseIsPressed: Boolean get() = asDynamic().mouseIsPressed as Boolean


/**
 * The function <a href="#/p5/requestPointerLock">requestPointerLock()</a>
 * locks the pointer to its current position and makes it invisible.
 * Use <a href="#/p5/movedX">movedX</a> and <a href="#/p5/movedY">movedY</a> to get the difference the mouse was moved since
 * the last call of draw.
 * Note that not all browsers support this feature.
 * This enables you to create experiences that aren't limited by the mouse moving out of the screen
 * even if it is repeatedly moved into one direction.
 * For example, a first-person perspective experience.
 *
 * @method requestPointerLock
 * @example
 * <div class="notest">
 * <code>
 * let cam;
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 *   requestPointerLock();
 *   cam = createCamera();
 * }
 *
 * function draw() {
 *   background(255);
 *   cam.pan(-movedX * 0.001);
 *   cam.tilt(movedY * 0.001);
 *   sphere(25);
 *   describe(`3D scene moves according to mouse mouse movement in a
 *     first person perspective`);
 * }
 * </code>
 * </div>
 */
inline fun p5.requestPointerLock() { asDynamic().requestPointerLock() }


/**
 * The function <a href="#/p5/exitPointerLock">exitPointerLock()</a>
 * exits a previously triggered <a href="#/p5/requestPointerLock">pointer Lock</a>
 * for example to make ui elements usable etc
 *
 * @method exitPointerLock
 * @example
 * <div class="notest">
 * <code>
 * //click the canvas to lock the pointer
 * //click again to exit (otherwise escape)
 * let locked = false;
 * function draw() {
 *   background(237, 34, 93);
 *   describe(`cursor gets locked / unlocked on mouse-click`);
 * }
 * function mouseClicked() {
 *   if (!locked) {
 *     locked = true;
 *     requestPointerLock();
 *   } else {
 *     exitPointerLock();
 *     locked = false;
 *   }
 * }
 * </code>
 * </div>
 */
inline fun p5.exitPointerLock() { asDynamic().exitPointerLock() }
