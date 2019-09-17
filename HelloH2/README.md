# Welcome to H2, the Java SQL database. [![Build Status](https://travis-ci.org/h2database/h2database.svg?branch=master)](https://travis-ci.org/h2database/h2database)



## Step by step:

1. Download from H2 web the Windows Installer (http://www.h2database.com/h2-setup-2019-03-13.exe) and install the package.
2. Download from H2 web the .jar file library h2-1.4.199.jar (http://repo2.maven.org/maven2/com/h2database/h2/1.4.199/h2-1.4.199.jar)
3. Test the db H2 on mode server (create a db if it's necessary)
4. Create the Java Project and configure path, external library: h2-1.4.199.jar.
5. Download, print and pin on your wall cork: (http://www.sqltutorial.org/wp-content/uploads/2016/04/SQL-cheat-sheet.pdf)
6. If you don't like cork, so you are a web guy, go: (https://www.w3schools.com/sql/)
7. You may start practicing with that: (https://docs.oracle.com/cd/E17952_01/workbench-en/wb-documenting-sakila.html)



## The main features of H2 are:

1. Very fast, open source, JDBC API
2. Embedded and server modes; in-memory databases
3. Browser based Console application
4. Small footprint: around 2 MB jar file size

More information: https://h2database.com

## Features

| | [H2](https://h2database.com/) | [Derby](https://db.apache.org/derby) | [HSQLDB](http://hsqldb.org) | [MySQL](https://www.mysql.com/) | [PostgreSQL](https://www.postgresql.org) |
|--------------------------------|---------|---------|---------|-------|---------|
| Pure Java                      | Yes     | Yes     | Yes     | No    | No      |
| Memory Mode                    | Yes     | Yes     | Yes     | No    | No      |
| Encrypted Database             | Yes     | Yes     | Yes     | No    | No      |
| ODBC Driver                    | Yes     | No      | No      | Yes   | Yes     |
| Fulltext Search                | Yes     | No      | No      | Yes   | Yes     |
| Multi Version Concurrency      | Yes     | No      | Yes     | Yes   | Yes     |
| Footprint (embedded database)  | ~2 MB   | ~3 MB   | ~1.5 MB | —     | —       |
| Footprint (JDBC client driver) | ~500 KB | ~600 KB | ~1.5 MB | ~1 MB | ~700 KB |
