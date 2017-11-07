# Chapter 2- PROTOTYPE Scope

This example print the DBConnectionPool object and it's scope is prototype

DBConnectionPool object created twice and it printed two different values each time. But it's dependent class MongoDBConnection object is created only once cause it is singleton.

# Output:
ConnectionPool Object1 - scopeprototype.DBConnectionPool@33ecda92
Mongo DB Connection Created!scopeprototype.MongoDBConnection@14fc5f04
ConnectionPool Object2 - scopeprototype.DBConnectionPool@6e2829c7
Mongo DB Connection Created!scopeprototype.MongoDBConnection@14fc5f04
