# anzyaccount
 SprinBootDemo
 - H2 DB is used to create tables and populate the data in memory
 - Spring's CrudRepository is used to work with DB
 - when springboot application starts then code in AnzyaccountApplication.java will populate Account and Transaction data in H2 tables
 - to see all the accounts following REST api with GET to use, this link even works in browser where we can see JSON response
 http://localhost:8080/anzyaccount/anz/accounts
 - to see transactions of a particular account(e.g. accountnumber 123456) following REST api with GET to use, this link even works in browser where we can see JSON response
 http://localhost:8080/anzyaccount/anz/transactions/123456
 
 - link to see tables and data in H2DB : http://localhost:8080/anzyaccount/h2db
 note : JDBC url should be entered as jdbc:h2:mem:anzaccount
 
