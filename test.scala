var db = new Sqlite
db.open(":memory:")
db.execute("CREATE TABLE foo (i INTEGER, f DOUBLE, t TEXT);")
db.execute("INSERT INTO foo (i, f, t) VALUES (1, 2.0, 'foo');")
db.execute("INSERT INTO foo (i, f, t) VALUES (3, NULL, 'bar');")
for (row <- db.query("SELECT * FROM foo;")) {
    var list = for (elt <- row) yield elt.toString
    println(list.reduceLeft(_ + " " + _))
}
db.close()
