@file:Suppress("unused")

package p5.io

import kotlinx.js.Object
import p5.core.p5
import kotlin.js.RegExp


/**
 *  Table Options
 *  Generic class for handling tabular data, typically from a
 *  CSV, TSV, or other sort of spreadsheet file.
 *  CSV files are
 *  <a href="http://en.wikipedia.org/wiki/Comma-separated_values">
 *  comma separated values</a>, often with the data in quotes. TSV
 *  files use tabs as separators, and usually don't bother with the
 *  quotes.
 *  File names should end with .csv if they're comma separated.
 *  A rough "spec" for CSV can be found
 *  <a href="http://tools.ietf.org/html/rfc4180">here</a>.
 *  To load files, use the <a href="#/p5/loadTable">loadTable</a> method.
 *  To save tables to your computer, use the <a href="#/p5/save">save</a> method
 *   or the <a href="#/p5/saveTable">saveTable</a> method.
 *
 *  Possible options include:
 *  <ul>
 *  <li>csv - parse the table as comma-separated values
 *  <li>tsv - parse the table as tab-separated values
 *  <li>header - this table has a header (title) row
 *  </ul>
 */


/**
 * Use <a href="#/p5/addRow">addRow()</a> to add a new row of data to a <a href="#/p5.Table">p5.Table</a> object. By default,
 * an empty row is created. Typically, you would store a reference to
 * the new row in a TableRow object (see newRow in the example above),
 * and then set individual values using <a href="#/p5/set">set()</a>.
 *
 * If a <a href="#/p5.TableRow">p5.TableRow</a> object is included as a parameter, then that row is
 * duplicated and added to the table.
 *
 * @method  addRow
 * @param   {p5.TableRow} [row] row to be added to the table
 * @return  {p5.TableRow} the row that was added
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   //add a row
 *   let newRow = table.addRow();
 *   newRow.setString('id', table.getRowCount() - 1);
 *   newRow.setString('species', 'Canis Lupus');
 *   newRow.setString('name', 'Wolf');
 *
 *   //print the results
 *   for (let r = 0; r < table.getRowCount(); r++)
 *     for (let c = 0; c < table.getColumnCount(); c++)
 *       print(table.getString(r, c));
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.addRow(row: p5.TableRow? = undefined): p5.TableRow =
    asDynamic().addRow(row).unsafeCast<p5.TableRow>()


/**
 * Removes a row from the table object.
 *
 * @method  removeRow
 * @param   {Integer} [id] ID number of the row to remove
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   //remove the first row
 *   table.removeRow(0);
 *
 *   //print the results
 *   for (let r = 0; r < table.getRowCount(); r++)
 *     for (let c = 0; c < table.getColumnCount(); c++)
 *       print(table.getString(r, c));
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.removeRow(id: Int) { asDynamic().removeRow(id) }


/**
 * Returns a reference to the specified <a href="#/p5.TableRow">p5.TableRow</a>. The reference
 * can then be used to get and set values of the selected row.
 *
 * @method  getRow
 * @param  {Integer} [r] ID number of the row to get
 * @return {p5.TableRow} <a href="#/p5.TableRow">p5.TableRow</a> object
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   let row = table.getRow(1);
 *   //print it column by column
 *   //note: a row is an object, not an array
 *   for (let c = 0; c < table.getColumnCount(); c++) {
 *     print(row.getString(c));
 *   }
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getRow(r: Int): p5.TableRow = asDynamic().getRow(r).unsafeCast<p5.TableRow>()


/**
 * Gets all rows from the table. Returns an array of <a href="#/p5.TableRow">p5.TableRow</a>s.
 *
 * @method  getRows
 * @return {p5.TableRow[]}   Array of <a href="#/p5.TableRow">p5.TableRow</a>s
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *
 *   //warning: rows is an array of objects
 *   for (let r = 0; r < rows.length; r++) {
 *     rows[r].set('name', 'Unicorn');
 *   }
 *
 *   //print the results
 *   for (let r = 0; r < table.getRowCount(); r++)
 *     for (let c = 0; c < table.getColumnCount(); c++)
 *       print(table.getString(r, c));
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getRows(): Array<p5.TableRow> = asDynamic().getRows().unsafeCast<Array<p5.TableRow>>()


/**
 * Finds the first row in the Table that contains the value
 * provided, and returns a reference to that row. Even if
 * multiple rows are possible matches, only the first matching
 * row is returned. The column to search may be specified by
 * either its ID or title.
 *
 * @method  findRow
 * @param  {String|Number} [value]  The value to match
 * @param  {Integer|String} [column] ID number or title of the column to search
 * @return {p5.TableRow}
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   //find the animal named zebra
 *   let row = table.findRow('Zebra', 'name');
 *   //find the corresponding species
 *   print(row.getString('species'));
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.findRow(value: String, column: String): p5.TableRow? =
    asDynamic().findRow(value, column).unsafeCast<p5.TableRow?>()

inline fun p5.Table.findRow(value: String, column: Int): p5.TableRow? =
    asDynamic().findRow(value, column).unsafeCast<p5.TableRow?>()

inline fun p5.Table.findRow(value: Number, column: String): p5.TableRow? =
    asDynamic().findRow(value, column).unsafeCast<p5.TableRow?>()

inline fun p5.Table.findRow(value: Number, column: Int): p5.TableRow? =
    asDynamic().findRow(value, column).unsafeCast<p5.TableRow?>()


/**
 *  Finds the rows in the Table that contain the value
 *  provided, and returns references to those rows. Returns an
 *  Array, so for must be used to iterate through all the rows,
 *  as shown in the example above. The column to search may be
 *  specified by either its ID or title.
 *
 *  @method  findRows
 *  @param  {String} [value]  The value to match
 *  @param  {Integer|String} [column] ID number or title of the column to search
 *  @return {p5.TableRow[]} An Array of TableRow objects
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   //add another goat
 *   let newRow = table.addRow();
 *   newRow.setString('id', table.getRowCount() - 1);
 *   newRow.setString('species', 'Scape Goat');
 *   newRow.setString('name', 'Goat');
 *
 *   //find the rows containing animals named Goat
 *   let rows = table.findRows('Goat', 'name');
 *   print(rows.length + ' Goats found');
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.findRows(value: String, column: String): Array<p5.TableRow> =
    asDynamic().findRows(value, column).unsafeCast<Array<p5.TableRow>>()

inline fun p5.Table.findRows(value: String, column: Int): Array<p5.TableRow> =
    asDynamic().findRows(value, column).unsafeCast<Array<p5.TableRow>>()

inline fun p5.Table.findRows(value: Int, column: String): Array<p5.TableRow> =
    asDynamic().findRows(value, column).unsafeCast<Array<p5.TableRow>>()

inline fun p5.Table.findRows(value: Int, column: Int): Array<p5.TableRow> =
    asDynamic().findRows(value, column).unsafeCast<Array<p5.TableRow>>()


/**
 * Finds the first row in the Table that matches the regular
 * expression provided, and returns a reference to that row.
 * Even if multiple rows are possible matches, only the first
 * matching row is returned. The column to search may be
 * specified by either its ID or title.
 *
 * @method  matchRow
 * @param  {String|RegExp} [regexp] The regular expression to match
 * @param  {String|Integer} [column] The column ID (number) or
 *                                  title (string)
 * @return {p5.TableRow}        TableRow object
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   //Search using specified regex on a given column, return TableRow object
 *   let mammal = table.matchRow(new RegExp('ant'), 1);
 *   print(mammal.getString(1));
 *   //Output "Panthera pardus"
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.matchRow(regexp: String, column: String): p5.TableRow? =
    asDynamic().matchRow(regexp, column).unsafeCast<p5.TableRow?>()

inline fun p5.Table.matchRow(regexp: String, column: Int): p5.TableRow? =
    asDynamic().matchRow(regexp, column).unsafeCast<p5.TableRow?>()

inline fun p5.Table.matchRow(regexp: RegExp, column: String): p5.TableRow? =
    asDynamic().matchRow(regexp, column).unsafeCast<p5.TableRow?>()

inline fun p5.Table.matchRow(regexp: RegExp, column: Int): p5.TableRow? =
    asDynamic().matchRow(regexp, column).unsafeCast<p5.TableRow?>()


/**
 * Finds the rows in the Table that match the regular expression provided,
 * and returns references to those rows. Returns an array, so for must be
 * used to iterate through all the rows, as shown in the example. The
 * column to search may be specified by either its ID or title.
 *
 * @method  matchRows
 * @param  {String} regexp The regular expression to match
 * @param  {String|Integer} [column] The column ID (number) or
 *                                  title (string)
 * @return {p5.TableRow[]}          An Array of TableRow objects
 * @example
 * <div class="norender">
 * <code>
 * let table;
 *
 * function setup() {
 *   table = new p5.Table();
 *
 *   table.addColumn('name');
 *   table.addColumn('type');
 *
 *   let newRow = table.addRow();
 *   newRow.setString('name', 'Lion');
 *   newRow.setString('type', 'Mammal');
 *
 *   newRow = table.addRow();
 *   newRow.setString('name', 'Snake');
 *   newRow.setString('type', 'Reptile');
 *
 *   newRow = table.addRow();
 *   newRow.setString('name', 'Mosquito');
 *   newRow.setString('type', 'Insect');
 *
 *   newRow = table.addRow();
 *   newRow.setString('name', 'Lizard');
 *   newRow.setString('type', 'Reptile');
 *
 *   let rows = table.matchRows('R.*', 'type');
 *   for (let i = 0; i < rows.length; i++) {
 *     print(rows[i].getString('name') + ': ' + rows[i].getString('type'));
 *   }
 * }
 * // Sketch prints:
 * // Snake: Reptile
 * // Lizard: Reptile
 * </code>
 * </div>
 */
inline fun p5.Table.matchRows(regexp: String, column: String): Array<p5.TableRow> =
    asDynamic().matchRows(regexp, column).unsafeCast<Array<p5.TableRow>>()

inline fun p5.Table.matchRows(regexp: String, column: Int): Array<p5.TableRow> =
    asDynamic().matchRows(regexp, column).unsafeCast<Array<p5.TableRow>>()

inline fun p5.Table.matchRows(regexp: RegExp, column: String): Array<p5.TableRow> =
    asDynamic().matchRows(regexp, column).unsafeCast<Array<p5.TableRow>>()

inline fun p5.Table.matchRows(regexp: RegExp, column: Int): Array<p5.TableRow> =
    asDynamic().matchRows(regexp, column).unsafeCast<Array<p5.TableRow>>()


/**
 * Retrieves all values in the specified column, and returns them
 * as an array. The column may be specified by either its ID or title.
 *
 * @method  getColumn
 * @param  {String|Number} [column] String or Number of the column to return
 * @return {Array} Array of column values
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   //getColumn returns an array that can be printed directly
 *   print(table.getColumn('species'));
 *   //outputs ["Capra hircus", "Panthera pardus", "Equus zebra"]
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getColumn(column: String): Array<Object> = asDynamic().getColumn(column).unsafeCast<Array<Object>>()

inline fun p5.Table.getColumn(column: Int): Array<Object> = asDynamic().getColumn(column).unsafeCast<Array<Object>>()


/**
 * Removes all rows from a Table. While all rows are removed,
 * columns and column titles are maintained.
 *
 * @method clearRows
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   table.clearRows();
 *   print(table.getRowCount() + ' total rows in table');
 *   print(table.getColumnCount() + ' total columns in table');
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.clearRows() { asDynamic().clearRows() }


/**
 *  Use <a href="#/p5/addColumn">addColumn()</a> to add a new column to a <a href="#/p5.Table">Table</a> object.
 *  Typically, you will want to specify a title, so the column
 *  may be easily referenced later by name. (If no title is
 *  specified, the new column's title will be null.)
 *
 *  @method  addColumn
 *  @param {String} [title] title of the given column
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   table.addColumn('carnivore');
 *   table.set(0, 'carnivore', 'no');
 *   table.set(1, 'carnivore', 'yes');
 *   table.set(2, 'carnivore', 'no');
 *
 *   //print the results
 *   for (let r = 0; r < table.getRowCount(); r++)
 *     for (let c = 0; c < table.getColumnCount(); c++)
 *       print(table.getString(r, c));
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.addColumn(title: String? = undefined) { asDynamic().addColumn(title) }


/**
 *  Returns the total number of columns in a Table.
 *
 *  @method  getColumnCount
 *  @return {Integer} Number of columns in this table
 * @example
 * <div>
 * <code>
 * // given the cvs file "blobs.csv" in /assets directory
 * // ID, Name, Flavor, Shape, Color
 * // Blob1, Blobby, Sweet, Blob, Pink
 * // Blob2, Saddy, Savory, Blob, Blue
 *
 * let table;
 *
 * function preload() {
 *   table = loadTable('assets/blobs.csv');
 * }
 *
 * function setup() {
 *   createCanvas(200, 100);
 *   textAlign(CENTER);
 *   background(255);
 * }
 *
 * function draw() {
 *   let numOfColumn = table.getColumnCount();
 *   text('There are ' + numOfColumn + ' columns in the table.', 100, 50);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getColumnCount(): Int = asDynamic().getColumnCount() as Int


/**
 *  Returns the total number of rows in a Table.
 *
 *  @method  getRowCount
 *  @return {Integer} Number of rows in this table
 * @example
 * <div>
 * <code>
 * // given the cvs file "blobs.csv" in /assets directory
 * //
 * // ID, Name, Flavor, Shape, Color
 * // Blob1, Blobby, Sweet, Blob, Pink
 * // Blob2, Saddy, Savory, Blob, Blue
 *
 * let table;
 *
 * function preload() {
 *   table = loadTable('assets/blobs.csv');
 * }
 *
 * function setup() {
 *   createCanvas(200, 100);
 *   textAlign(CENTER);
 *   background(255);
 * }
 *
 * function draw() {
 *   text('There are ' + table.getRowCount() + ' rows in the table.', 100, 50);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getRowCount(): Int = asDynamic().getRowCount() as Int


/**
 *  Removes any of the specified characters (or "tokens").
 *
 *  If no column is specified, then the values in all columns and
 *  rows are processed. A specific column may be referenced by
 *  either its ID or title.
 *
 *  @method  removeTokens
 *  @param  {String} [chars]  String listing characters to be removed
 *  @param  {String|Integer} [column] Column ID (number)
 *                                   or name (string)
 *
 * @example
 * <div class="norender"><code>
 * function setup() {
 *   let table = new p5.Table();
 *
 *   table.addColumn('name');
 *   table.addColumn('type');
 *
 *   let newRow = table.addRow();
 *   newRow.setString('name', '   $Lion  ,');
 *   newRow.setString('type', ',,,Mammal');
 *
 *   newRow = table.addRow();
 *   newRow.setString('name', '$Snake  ');
 *   newRow.setString('type', ',,,Reptile');
 *
 *   table.removeTokens(',$ ');
 *   print(table.getArray());
 * }
 *
 * // prints:
 * //  0  "Lion"   "Mamal"
 * //  1  "Snake"  "Reptile"
 * </code></div>
 */
inline fun p5.Table.removeTokens(chars: String, column: String) { asDynamic().removeTokens(chars, column) }

inline fun p5.Table.removeTokens(chars: String, column: Int? = undefined) { asDynamic().removeTokens(chars, column) }


/**
 * Trims leading and trailing whitespace, such as spaces and tabs,
 * from String table values. If no column is specified, then the
 * values in all columns and rows are trimmed. A specific column
 * may be referenced by either its ID or title.
 *
 * @method  trim
 * @param  {String|Integer} [column] Column ID (number) or name (string)
 * @example
 * <div class="norender"><code>
 * function setup() {
 *   let table = new p5.Table();
 *
 *   table.addColumn('name');
 *   table.addColumn('type');
 *
 *   let newRow = table.addRow();
 *   newRow.setString('name', '   Lion  ,');
 *   newRow.setString('type', ' Mammal  ');
 *
 *   newRow = table.addRow();
 *   newRow.setString('name', '  Snake  ');
 *   newRow.setString('type', '  Reptile  ');
 *
 *   table.trim();
 *   print(table.getArray());
 * }
 *
 * // prints:
 * //  0  "Lion"   "Mamal"
 * //  1  "Snake"  "Reptile"
 * </code></div>
 */
inline fun p5.Table.trim(column: String) { asDynamic().trim(column) }

inline fun p5.Table.trim(column: Int) { asDynamic().trim(column) }


/**
 * Use <a href="#/p5/removeColumn">removeColumn()</a> to remove an existing column from a Table
 * object. The column to be removed may be identified by either
 * its title (a String) or its index value (an int).
 * removeColumn(0) would remove the first column, removeColumn(1)
 * would remove the second column, and so on.
 *
 * @method  removeColumn
 * @param  {String|Integer} [c] columnName (string) or ID (number)
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   table.removeColumn('id');
 *   print(table.getColumnCount());
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.removeColumn(c: String) { asDynamic().removeColumn(c) }

inline fun p5.Table.removeColumn(c: Int) { asDynamic().removeColumn(c) }


/**
 * Stores a value in the Table's specified row and column.
 * The row is specified by its ID, while the column may be specified
 * by either its ID or title.
 *
 * @method  set
 * @param {Integer} [row] row ID
 * @param {String|Integer} [column] column ID (Number) or title (String)
 * @param {String|Number} [value] value to assign
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   table.set(0, 'species', 'Canis Lupus');
 *   table.set(0, 'name', 'Wolf');
 *
 *   //print the results
 *   for (let r = 0; r < table.getRowCount(); r++)
 *     for (let c = 0; c < table.getColumnCount(); c++)
 *       print(table.getString(r, c));
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.set(row: Int, column: Int, value: Any?) { asDynamic().set(row, column, value) }

inline fun p5.Table.set(row: Int, column: String, value: Any?) { asDynamic().set(row, column, value) }


/**
 * Stores a Float value in the Table's specified row and column.
 * The row is specified by its ID, while the column may be specified
 * by either its ID or title.
 *
 * @method setNum
 * @param {Integer} row row ID
 * @param {String|Integer} column column ID (Number)
 *                               or title (String)
 * @param {Number} value  value to assign
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   table.setNum(1, 'id', 1);
 *
 *   print(table.getColumn(0));
 *   //["0", 1, "2"]
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.setNum(row: Int, column: Int, value: Number) { asDynamic().setNum(row, column, value) }

inline fun p5.Table.setNum(row: Int, column: String, value: Number) { asDynamic().setNum(row, column, value) }

/**
 * Stores a String value in the Table's specified row and column.
 * The row is specified by its ID, while the column may be specified
 * by either its ID or title.
 *
 * @method  setString
 * @param {Integer} [row] row ID
 * @param {String|Integer} [column] column ID (Number) or title (String)
 * @param {String} [value] value to assign
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
 *   //add a row
 *   let newRow = table.addRow();
 *   newRow.setString('id', table.getRowCount() - 1);
 *   newRow.setString('species', 'Canis Lupus');
 *   newRow.setString('name', 'Wolf');
 *
 *   print(table.getArray());
 *
 *   describe(`no image displayed`);
 * }
 * </code></div>
 */
inline fun p5.Table.setString(row: Int, column: Int, value: String) { asDynamic().setString(row, column, value) }

inline fun p5.Table.setString(row: Int, column: String, value: String) { asDynamic().setString(row, column, value) }


/**
 * Retrieves a value from the Table's specified row and column.
 * The row is specified by its ID, while the column may be specified by
 * either its ID or title.
 *
 * @method  get
 * @param {Integer} row row ID
 * @param  {String|Integer} column columnName (string) or
 *                                   ID (number)
 * @return {String|Number}
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   print(table.get(0, 1));
 *   //Capra hircus
 *   print(table.get(0, 'species'));
 *   //Capra hircus
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.get(row: Int, column: Int): Object = asDynamic().get(row, column) as Object

inline fun p5.Table.get(row: Int, column: String): Object = asDynamic().get(row, column) as Object


/**
 * Retrieves a Float value from the Table's specified row and column.
 * The row is specified by its ID, while the column may be specified by
 * either its ID or title.
 *
 * @method  getNum
 * @param {Integer} row row ID
 * @param  {String|Integer} column columnName (string) or
 *                                   ID (number)
 * @return {Number}
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   print(table.getNum(1, 0) + 100);
 *   //id 1 + 100 = 101
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getNum(row: Int, column: Int): Number = asDynamic().getNum(row, column) as Number

inline fun p5.Table.getNum(row: Int, column: String): Number = asDynamic().getNum(row, column) as Number


/**
 * Retrieves a String value from the Table's specified row and column.
 * The row is specified by its ID, while the column may be specified by
 * either its ID or title.
 *
 * @method  getString
 * @param {Integer} row row ID
 * @param  {String|Integer} column columnName (string) or
 *                                   ID (number)
 * @return {String}
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   // table is comma separated value "CSV"
 *   // and has specifying header for column labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   print(table.getString(0, 0)); // 0
 *   print(table.getString(0, 1)); // Capra hircus
 *   print(table.getString(0, 2)); // Goat
 *   print(table.getString(1, 0)); // 1
 *   print(table.getString(1, 1)); // Panthera pardus
 *   print(table.getString(1, 2)); // Leopard
 *   print(table.getString(2, 0)); // 2
 *   print(table.getString(2, 1)); // Equus zebra
 *   print(table.getString(2, 2)); // Zebra
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getString(row: Int, column: Int): String = asDynamic().getString(row, column) as String

inline fun p5.Table.getString(row: Int, column: String): String = asDynamic().getString(row, column) as String


/**
 * Retrieves all table data and returns as an object. If a column name is
 * passed in, each row object will be stored with that attribute as its
 * title.
 *
 * @method  getObject
 * @param {String} [headerColumn] Name of the column which should be used to
 *                              title each row object (optional)
 * @return {Object}
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder:
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
 *   let tableObject = table.getObject();
 *
 *   print(tableObject);
 *   //outputs an object
 *
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getObject(headerColumn: String? = undefined): Object = asDynamic().getObject(headerColumn) as Object


/**
 * Retrieves all table data and returns it as a multidimensional array.
 *
 * @method  getArray
 * @return {Array}
 *
 * @example
 * <div class="norender">
 * <code>
 * // Given the CSV file "mammals.csv"
 * // in the project's "assets" folder
 * //
 * // id,species,name
 * // 0,Capra hircus,Goat
 * // 1,Panthera pardus,Leopard
 * // 2,Equus zebra,Zebra
 *
 * let table;
 *
 * function preload() {
 *   // table is comma separated value "CSV"
 *   // and has specifying header for column labels
 *   table = loadTable('assets/mammals.csv', 'csv', 'header');
 * }
 *
 * function setup() {
 *   let tableArray = table.getArray();
 *   for (let i = 0; i < tableArray.length; i++) {
 *     print(tableArray[i]);
 *   }
 *   describe(`no image displayed`);
 * }
 * </code>
 * </div>
 */
inline fun p5.Table.getArray(): Array<Array<Object>> = asDynamic().getArray().unsafeCast<Array<Array<Object>>>()
