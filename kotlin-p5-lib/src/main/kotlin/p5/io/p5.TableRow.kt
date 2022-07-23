@file:Suppress("unused")

package p5.io

import kotlinx.js.Object
import p5.core.p5


/**
 *  Stores a value in the TableRow's specified column.
 *  The column may be specified by either its ID or title.
 *
 *  @method  set
 *  @param {String|Integer} [column] Column ID (Number) or Title (String)
 *  @param {String|Number} [value] The value to be stored
 *
 * @example
 * <div class="norender"><code>
 * // Given the CSV file "mammals.csv" in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   //my table is comma separated value "csv"
 *   //and has a header specifying the columns labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let rows = table.getRows();
 *   for (let r = 0; r < rows.length; r++) {
 *     rows[r].set('name', 'Unicorn');
 *   }
 *
 *   //print the results
 *   print(table.getArray());
 *
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.TableRow.set(column: String, value: String) { asDynamic().set(column, value) }

inline fun p5.TableRow.set(column: Int, value: String) { asDynamic().set(column, value) }

inline fun p5.TableRow.set(column: String, value: Number) { asDynamic().set(column, value) }

inline fun p5.TableRow.set(column: Int, value: Number) { asDynamic().set(column, value) }


/**
 * Stores a Float value in the TableRow's specified column.
 * The column may be specified by either its ID or title.
 *
 * @method  setNum
 * @param {String|Integer} [column] Column ID (Number) or Title (String)
 * @param {Number|String} [value] The value to be stored as a Float
 * @example
 * <div class="norender"><code>
 * // Given the CSV file "mammals.csv" in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   //my table is comma separated value "csv"
 *   //and has a header specifying the columns labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let rows = table.getRows();
 *   for (let r = 0; r < rows.length; r++) {
 *     rows[r].setNum('id', r + 10);
 *   }
 *
 *   print(table.getArray());
 *
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.TableRow.setNum(column: String, value: String) { asDynamic().setNum(column, value) }

inline fun p5.TableRow.setNum(column: Int, value: String) { asDynamic().setNum(column, value) }

inline fun p5.TableRow.setNum(column: String, value: Number) { asDynamic().setNum(column, value) }

inline fun p5.TableRow.setNum(column: Int, value: Number) { asDynamic().setNum(column, value) }


/**
 *  Stores a String value in the TableRow's specified column.
 *  The column may be specified by either its ID or title.
 *
 *  @method  setString
 *  @param {String|Integer} [column] Column ID (Number) or Title (String)
 *  @param {String|Number|Boolean|Object} [value] The value to be stored as a String
 * @example
 * <div class="norender"><code>
 * // Given the CSV file "mammals.csv" in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   //my table is comma separated value "csv"
 *   //and has a header specifying the columns labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let rows = table.getRows();
 *   for (let r = 0; r < rows.length; r++) {
 *     let name = rows[r].getString('name');
 *     rows[r].setString('name', 'A ' + name + ' named George');
 *   }
 *
 *   print(table.getArray());
 *
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.TableRow.setString(column: String, value: String) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: Int, value: String) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: String, value: Number) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: Int, value: Number) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: String, value: Boolean) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: Int, value: Boolean) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: String, value: Object) { asDynamic().setString(column, value) }

inline fun p5.TableRow.setString(column: Int, value: Object) { asDynamic().setString(column, value) }


/**
 * Retrieves a value from the TableRow's specified column.
 * The column may be specified by either its ID or title.
 *
 * @method  get
 * @param  {String|Integer} [column] columnName (string) or ID (number)
 * @return {String|Number}
 *
 * @example
 * <div class="norender"><code>
 * // Given the CSV file "mammals.csv" in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   //my table is comma separated value "csv"
 *   //and has a header specifying the columns labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let names = [];
 *   let rows = table.getRows();
 *   for (let r = 0; r < rows.length; r++) {
 *     names.push(rows[r].get('name'));
 *   }
 *
 *   print(names);
 *
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.TableRow.get(column: String): Object = asDynamic().get(column) as Object

inline fun p5.TableRow.get(column: Int): Object = asDynamic().get(column) as Object


/**
 *  Retrieves a Float value from the TableRow's specified
 *  column. The column may be specified by either its ID or
 *  title.
 *
 *  @method  getNum
 *  @param  {String|Integer} column columnName (string) or
 *                                   ID (number)
 *  @return {Number}  Float Floating point number
 * @example
 * <div class="norender"><code>
 * // Given the CSV file "mammals.csv" in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   //my table is comma separated value "csv"
 *   //and has a header specifying the columns labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let rows = table.getRows();
 *   let minId = Infinity;
 *   let maxId = -Infinity;
 *   for (let r = 0; r < rows.length; r++) {
 *     let id = rows[r].getNum('id');
 *     minId = min(minId, id);
 *     maxId = min(maxId, id);
 *   }
 *   print('minimum id = ' + minId + ', maximum id = ' + maxId);
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.TableRow.getNum(column: String): Number = asDynamic().getNum(column) as Number

inline fun p5.TableRow.getNum(column: Int): Number = asDynamic().getNum(column) as Number


/**
 * Retrieves a String value from the TableRow's specified
 * column. The column may be specified by either its ID or
 * title.
 *
 * @method  getString
 * @param  {String|Integer} column columnName (string) or
 *                                   ID (number)
 *  @return {String}  String
 * @example
 * <div class="norender"><code>
 * // Given the CSV file "mammals.csv" in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   //my table is comma separated value "csv"
 *   //and has a header specifying the columns labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let rows = table.getRows();
 *   let longest = '';
 *   for (let r = 0; r < rows.length; r++) {
 *     let species = rows[r].getString('species');
 *     if (longest.length < species.length) {
 *       longest = species;
 *     }
 *   }
 *
 *   print('longest: ' + longest);
 *
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.TableRow.getString(column: String): String = asDynamic().getString(column) as String

inline fun p5.TableRow.getString(column: Int): String = asDynamic().getString(column) as String
