
--------------------------------------------------------------------
-- execute the following statements to create a user name STATEMENT and
-- grant priviledges
--------------------------------------------------------------------

-- create new user
CREATE USER STATEMENT IDENTIFIED BY STATEMENT;

-- grant priviledges
GRANT CONNECT, RESOURCE, DBA TO STATEMENT;