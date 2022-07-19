@file:Suppress("unused")

package p5.events

import p5.core.p5

/**
 * The system variable touches[] contains an array of the positions of all
 * current touch points, relative to (0, 0) of the canvas, and IDs identifying a
 * unique touch as it moves. Each element in the array is an object with x, y,
 * and id properties.
 *
 * The touches[] array is not supported on Safari and IE on touch-based
 * desktops (laptops).
 *
 * @property {Object[]} touches
 * @readOnly
 *
 * @example
 * <div>
 * <code>
 * // On a touchscreen device, touch
 * // the canvas using one or more fingers
 * // at the same time
 * function draw() {
 *   clear();
 *   let display = touches.length + ' touches';
 *   text(display, 5, 10);
 *   describe(`Number of touches currently registered are displayed
 *     on the canvas`);
 * }
 * </code>
 * </div>
 */
inline val p5.touches: Array<TouchProps> get() =  asDynamic().touches.unsafeCast<Array<TouchProps>>()

external interface TouchProps {
    val x: Int
    val y: Int
    val id: String
}
