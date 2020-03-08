# anzyaccount
 SprinBootDemo
 - H2 DB is used to populate the data in memory
 - when application runs code in AnzyaccountApplication.java will populate Account and Transaction data in H2 tablles
 - to see all the accounts following REST api with GET to use
 http://localhost:8080/anzyaccount/anz/accounts
 - to see transactions of a particular account following REST api with GET to use
 http://localhost:8080/anzyaccount/anz/transactions/123456
 
 to see table in H2DB use : http://localhost:8080/anzyaccount/h2db
 note : JDBC url should be entered as jdbc:h2:mem:anzaccount
 
