@file:Suppress("unused")

package p5.utilities

import p5.core.p5


/**
 * p5.js communicates with the clock on your computer. The <a href="#/p5/day">day()</a> function
 * returns the current day as a value from 1 to 31.
 *
 * @method day
 * @return {Integer} the current day
 * @example
 * <div>
 * <code>
 * let d = day();
 * text('Current day: \n' + d, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * Current day is displayed
 */
inline fun p5.day(): Int = asDynamic().day() as Int


/**
 * p5.js communicates with the clock on your computer. The <a href="#/p5/hour">hour()</a> function
 * returns the current hour as a value from 0 to 23.
 *
 * @method hour
 * @return {Integer} the current hour
 * @example
 * <div>
 * <code>
 * let h = hour();
 * text('Current hour:\n' + h, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * Current hour is displayed
 */
inline fun p5.hour(): Int = asDynamic().hour() as Int


/**
 * p5.js communicates with the clock on your computer. The <a href="#/p5/minute">minute()</a> function
 * returns the current minute as a value from 0 to 59.
 *
 * @method minute
 * @return {Integer} the current minute
 * @example
 * <div>
 * <code>
 * let m = minute();
 * text('Current minute: \n' + m, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * Current minute is displayed
 */
inline fun p5.minute(): Int = asDynamic().minute() as Int


/**
 * Returns the number of milliseconds (thousandths of a second) since
 * starting the sketch (when `setup()` is called). This information is often
 * used for timing events and animation sequences.
 *
 * @method millis
 * @return {Number} the number of milliseconds since starting the sketch
 * @example
 * <div>
 * <code>
 * let millisecond = millis();
 * text('Milliseconds \nrunning: \n' + millisecond, 5, 40);
 * </code>
 * </div>
 *
 * @alt
 * number of milliseconds since sketch has started displayed
 */
inline fun p5.millis(): Long = asDynamic().millis() as Long


/**
 * p5.js communicates with the clock on your computer. The <a href="#/p5/month">month()</a> function
 * returns the current month as a value from 1 to 12.
 *
 * @method month
 * @return {Integer} the current month
 * @example
 * <div>
 * <code>
 * let m = month();
 * text('Current month: \n' + m, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * Current month is displayed
 */
inline fun p5.month(): Int = asDynamic().month() as Int


/**
 * p5.js communicates with the clock on your computer. The <a href="#/p5/second">second()</a> function
 * returns the current second as a value from 0 to 59.
 *
 * @method second
 * @return {Integer} the current second
 * @example
 * <div>
 * <code>
 * let s = second();
 * text('Current second: \n' + s, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * Current second is displayed
 */
inline fun p5.second(): Int = asDynamic().second() as Int


/**
 * p5.js communicates with the clock on your computer. The <a href="#/p5/year">year()</a> function
 * returns the current year as an integer (2014, 2015, 2016, etc).
 *
 * @method year
 * @return {Integer} the current year
 * @example
 * <div>
 * <code>
 * let y = year();
 * text('Current year: \n' + y, 5, 50);
 * </code>
 * </div>
 *
 * @alt
 * Current year is displayed
 */
inline fun p5.year(): Int = asDynamic().year() as Int
