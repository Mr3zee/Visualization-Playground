@file:Suppress("unused")

package p5.events

import p5.core.p5


/**
 * The system variable deviceOrientation always contains the orientation of
 * the device. The value of this variable will either be set 'landscape'
 * or 'portrait'. If no data is available it will be set to 'undefined'.
 * either LANDSCAPE or PORTRAIT.
 *
 * @property {Constant} deviceOrientation
 * @readOnly
 */
inline val p5.deviceOrientation: String get() = asDynamic().deviceOrientation as String


/**
 * The system variable accelerationX always contains the acceleration of the
 * device along the x axis. Value is represented as meters per second squared.
 *
 * @property {Number} accelerationX
 * @readOnly
 * @example
 * <div>
 * <code>
 * // Move a touchscreen device to register
 * // acceleration changes.
 * function draw() {
 *   background(220, 50);
 *   fill('magenta');
 *   ellipse(width / 2, height / 2, accelerationX);
 *   describe('Magnitude of device acceleration is displayed as ellipse size.');
 * }
 * </code>
 * </div>
 */
inline val p5.accelerationX: Double get() = asDynamic().accelerationX as Double


/**
 * The system variable accelerationY always contains the acceleration of the
 * device along the y axis. Value is represented as meters per second squared.
 *
 * @property {Number} accelerationY
 * @readOnly
 * @example
 * <div>
 * <code>
 * // Move a touchscreen device to register
 * // acceleration changes.
 * function draw() {
 *   background(220, 50);
 *   fill('magenta');
 *   ellipse(width / 2, height / 2, accelerationY);
 *   describe('Magnitude of device acceleration is displayed as ellipse size');
 * }
 * </code>
 * </div>
 */
inline val p5.accelerationY: Double get() = asDynamic().accelerationY as Double


/**
 * The system variable accelerationZ always contains the acceleration of the
 * device along the z axis. Value is represented as meters per second squared.
 *
 * @property {Number} accelerationZ
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * // Move a touchscreen device to register
 * // acceleration changes.
 * function draw() {
 *   background(220, 50);
 *   fill('magenta');
 *   ellipse(width / 2, height / 2, accelerationZ);
 *   describe('Magnitude of device acceleration is displayed as ellipse size');
 * }
 * </code>
 * </div>
 */
inline val p5.accelerationZ: Double get() = asDynamic().accelerationZ as Double


/**
 * The system variable pAccelerationX always contains the acceleration of the
 * device along the x axis in the frame previous to the current frame. Value
 * is represented as meters per second squared.
 *
 * @property {Number} pAccelerationX
 * @readOnly
 */
inline val p5.pAccelerationX: Double get() = asDynamic().pAccelerationX as Double


/**
 * The system variable pAccelerationY always contains the acceleration of the
 * device along the y axis in the frame previous to the current frame. Value
 * is represented as meters per second squared.
 *
 * @property {Number} pAccelerationY
 * @readOnly
 */
inline val p5.pAccelerationY: Double get() = asDynamic().pAccelerationY as Double


/**
 * The system variable pAccelerationZ always contains the acceleration of the
 * device along the z axis in the frame previous to the current frame. Value
 * is represented as meters per second squared.
 *
 * @property {Number} pAccelerationZ
 * @readOnly
 */
inline val p5.pAccelerationZ: Double get() = asDynamic().pAccelerationZ as Double


/**
 * The system variable rotationX always contains the rotation of the
 * device along the x axis. If the sketch <a href="#/p5/angleMode">
 * angleMode()</a> is set to DEGREES, the value will be -180 to 180. If
 * it is set to RADIANS, the value will be -PI to PI.
 *
 * Note: The order the rotations are called is important, i.e. if used
 * together, it must be called in the order Z-X-Y or there might be
 * unexpected behaviour.
 *
 * @property {Number} rotationX
 * @readOnly
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 *
 * function draw() {
 *   background(200);
 *   //rotateZ(radians(rotationZ));
 *   rotateX(radians(rotationX));
 *   //rotateY(radians(rotationY));
 *   box(200, 200, 200);
 *   describe(`red horizontal line right, green vertical line bottom.
 *     black background.`);
 * }
 * </code>
 * </div>
 */
inline val p5.rotationX: Double get() = asDynamic().rotationX as Double


/**
 * The system variable rotationY always contains the rotation of the
 * device along the y axis. If the sketch <a href="#/p5/angleMode">
 * angleMode()</a> is set to DEGREES, the value will be -90 to 90. If
 * it is set to RADIANS, the value will be -PI/2 to PI/2.
 *
 * Note: The order the rotations are called is important, i.e. if used
 * together, it must be called in the order Z-X-Y or there might be
 * unexpected behaviour.
 *
 * @property {Number} rotationY
 * @readOnly
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 *
 * function draw() {
 *   background(200);
 *   //rotateZ(radians(rotationZ));
 *   //rotateX(radians(rotationX));
 *   rotateY(radians(rotationY));
 *   box(200, 200, 200);
 *   describe(`red horizontal line right, green vertical line bottom.
 *     black background.`);
 * }
 * </code>
 * </div>
 */
inline val p5.rotationY: Double get() = asDynamic().rotationY as Double


/**
 * The system variable rotationZ always contains the rotation of the
 * device along the z axis. If the sketch <a href="#/p5/angleMode">
 * angleMode()</a> is set to DEGREES, the value will be 0 to 360. If
 * it is set to RADIANS, the value will be 0 to 2*PI.
 *
 * Unlike rotationX and rotationY, this variable is available for devices
 * with a built-in compass only.
 *
 * Note: The order the rotations are called is important, i.e. if used
 * together, it must be called in the order Z-X-Y or there might be
 * unexpected behaviour.
 *
 * @example
 * <div>
 * <code>
 * function setup() {
 *   createCanvas(100, 100, WEBGL);
 * }
 *
 * function draw() {
 *   background(200);
 *   rotateZ(radians(rotationZ));
 *   //rotateX(radians(rotationX));
 *   //rotateY(radians(rotationY));
 *   box(200, 200, 200);
 *   describe(`red horizontal line right, green vertical line bottom.
 *     black background.`);
 * }
 * </code>
 * </div>
 *
 * @property {Number} rotationZ
 * @readOnly
 */
inline val p5.rotationZ: Double get() = asDynamic().rotationZ as Double


/**
 * The system variable pRotationX always contains the rotation of the
 * device along the x axis in the frame previous to the current frame.
 * If the sketch <a href="#/p5/angleMode"> angleMode()</a> is set to DEGREES,
 * the value will be -180 to 180. If it is set to RADIANS, the value will
 * be -PI to PI.
 *
 * pRotationX can also be used with rotationX to determine rotate
 * direction of the device along the X-axis.
 * @example
 * <div class='norender'>
 * <code>
 * // A simple if statement looking at whether
 * // rotationX - pRotationX < 0 is true or not will be
 * // sufficient for determining rotate direction
 * // in most cases.
 *
 * // Some extra logic is needed to account for cases where
 * // the angles wrap around.
 * let rotateDirection = 'clockwise';
 *
 * // Simple range conversion to make things simpler.
 * // This is not absolutely necessary but the logic
 * // will be different in that case.
 *
 * let rX = rotationX + 180;
 * let pRX = pRotationX + 180;
 *
 * if ((rX - pRX > 0 && rX - pRX < 270) || rX - pRX < -270) {
 *   rotateDirection = 'clockwise';
 * } else if (rX - pRX < 0 || rX - pRX > 270) {
 *   rotateDirection = 'counter-clockwise';
 * }
 *
 * print(rotateDirection);
 * describe('no image to display.');
 * </code>
 * </div>
 *
 * @property {Number} pRotationX
 * @readOnly
 */
inline val p5.pRotationX: Double get() = asDynamic().pRotationX as Double


/**
 * The system variable pRotationY always contains the rotation of the
 * device along the y axis in the frame previous to the current frame.
 * If the sketch <a href="#/p5/angleMode"> angleMode()</a> is set to DEGREES,
 * the value will be -90 to 90. If it is set to RADIANS, the value will
 * be -PI/2 to PI/2.
 *
 * pRotationY can also be used with rotationY to determine rotate
 * direction of the device along the Y-axis.
 * @example
 * <div class='norender'>
 * <code>
 * // A simple if statement looking at whether
 * // rotationY - pRotationY < 0 is true or not will be
 * // sufficient for determining rotate direction
 * // in most cases.
 *
 * // Some extra logic is needed to account for cases where
 * // the angles wrap around.
 * let rotateDirection = 'clockwise';
 *
 * // Simple range conversion to make things simpler.
 * // This is not absolutely necessary but the logic
 * // will be different in that case.
 *
 * let rY = rotationY + 180;
 * let pRY = pRotationY + 180;
 *
 * if ((rY - pRY > 0 && rY - pRY < 270) || rY - pRY < -270) {
 *   rotateDirection = 'clockwise';
 * } else if (rY - pRY < 0 || rY - pRY > 270) {
 *   rotateDirection = 'counter-clockwise';
 * }
 * print(rotateDirection);
 * describe('no image to display.');
 * </code>
 * </div>
 *
 * @property {Number} pRotationY
 * @readOnly
 */
inline val p5.pRotationY: Double get() = asDynamic().pRotationY as Double


/**
 * The system variable pRotationZ always contains the rotation of the
 * device along the z axis in the frame previous to the current frame.
 * If the sketch <a href="#/p5/angleMode"> angleMode()</a> is set to DEGREES,
 * the value will be 0 to 360. If it is set to RADIANS, the value will
 * be 0 to 2*PI.
 *
 * pRotationZ can also be used with rotationZ to determine rotate
 * direction of the device along the Z-axis.
 * @example
 * <div class='norender'>
 * <code>
 * // A simple if statement looking at whether
 * // rotationZ - pRotationZ < 0 is true or not will be
 * // sufficient for determining rotate direction
 * // in most cases.
 *
 * // Some extra logic is needed to account for cases where
 * // the angles wrap around.
 * let rotateDirection = 'clockwise';
 *
 * if (
 *   (rotationZ - pRotationZ > 0 && rotationZ - pRotationZ < 270) ||
 *   rotationZ - pRotationZ < -270
 * ) {
 *   rotateDirection = 'clockwise';
 * } else if (rotationZ - pRotationZ < 0 || rotationZ - pRotationZ > 270) {
 *   rotateDirection = 'counter-clockwise';
 * }
 * print(rotateDirection);
 * describe('no image to display.');
 * </code>
 * </div>
 *
 * @property {Number} pRotationZ
 * @readOnly
 */
inline val p5.pRotationZ: Double get() = asDynamic().pRotationZ as Double


/**
 * When a device is rotated, the axis that triggers the <a href="#/p5/deviceTurned">deviceTurned()</a>
 * method is stored in the turnAxis variable. The turnAxis variable is only defined within
 * the scope of deviceTurned().
 * @property {String} turnAxis
 * @readOnly
 * @example
 * <div>
 * <code>
 * // Run this example on a mobile device
 * // Rotate the device by 90 degrees in the
 * // X-axis to change the value.
 *
 * let value = 0;
 * function draw() {
 *   fill(value);
 *   rect(25, 25, 50, 50);
 *   describe(`50-by-50 black rect in center of canvas.
 *     turns white on mobile when device turns`);
 *   describe(`50-by-50 black rect in center of canvas.
 *     turns white on mobile when x-axis turns`);
 * }
 * function deviceTurned() {
 *   if (turnAxis === 'X') {
 *     if (value === 0) {
 *       value = 255;
 *     } else if (value === 255) {
 *       value = 0;
 *     }
 *   }
 * }
 * </code>
 * </div>
 */
inline val p5.turnAxis: String get() = asDynamic().turnAxis as String


/**
 * The <a href="#/p5/setMoveThreshold">setMoveThreshold()</a> function is used to set the movement threshold for
 * the <a href="#/p5/deviceMoved">deviceMoved()</a> function. The default threshold is set to 0.5.
 *
 * @method setMoveThreshold
 * @param {number} value The threshold value
 * @example
 * <div class="norender">
 * <code>
 * // Run this example on a mobile device
 * // You will need to move the device incrementally further
 * // the closer the square's color gets to white in order to change the value.
 *
 * let value = 0;
 * let threshold = 0.5;
 * function setup() {
 *   setMoveThreshold(threshold);
 * }
 * function draw() {
 *   fill(value);
 *   rect(25, 25, 50, 50);
 *   describe(`50-by-50 black rect in center of canvas.
 *     turns white on mobile when device moves`);
 * }
 * function deviceMoved() {
 *   value = value + 5;
 *   threshold = threshold + 0.1;
 *   if (value > 255) {
 *     value = 0;
 *     threshold = 30;
 *   }
 *   setMoveThreshold(threshold);
 * }
 * </code>
 * </div>
 */
inline fun p5.setMoveThreshold(value: Number) { asDynamic().setMoveThreshold(value) }


/**
 * The <a href="#/p5/setShakeThreshold">setShakeThreshold()</a> function is used to set the movement threshold for
 * the <a href="#/p5/deviceShaken">deviceShaken()</a> function. The default threshold is set to 30.
 *
 * @method setShakeThreshold
 * @param {number} [value] The threshold value
 * @example
 * <div class="norender">
 * <code>
 * // Run this example on a mobile device
 * // You will need to shake the device more firmly
 * // the closer the box's fill gets to white in order to change the value.
 *
 * let value = 0;
 * let threshold = 30;
 * function setup() {
 *   setShakeThreshold(threshold);
 * }
 * function draw() {
 *   fill(value);
 *   rect(25, 25, 50, 50);
 *   describe(`50-by-50 black rect in center of canvas.
 *     turns white on mobile when device is being shaken`);
 * }
 * function deviceMoved() {
 *   value = value + 5;
 *   threshold = threshold + 5;
 *   if (value > 255) {
 *     value = 0;
 *     threshold = 30;
 *   }
 *   setShakeThreshold(threshold);
 * }
 * </code>
 * </div>
 */
inline fun p5.setShakeThreshold(value: Number) { asDynamic().setShakeThreshold(value) }
