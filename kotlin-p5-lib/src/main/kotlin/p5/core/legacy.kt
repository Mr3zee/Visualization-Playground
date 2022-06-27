/**
 * @file These are functions that are part of the Processing API
 * but are not part of the p5.js API. In some cases they have a new name, in others,
 * they are removed completely. Not all unsupported Processing functions are listed here,
 * but we try to include ones that a user coming from Processing might likely call.
 */

@file:Suppress("unused")

package p5.core

inline fun p5.pushStyle() { asDynamic().pushStyle() }

inline fun p5.popStyle() { asDynamic().popStyle() }

inline fun p5.popMatrix() { asDynamic().popMatrix() }

inline fun p5.pushMatrix() { asDynamic().pushMatrix() }
