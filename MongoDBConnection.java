
/**
* @author Vivek Narang
*
* This is an example of how we can write components that can be re-used in any software that 
* requires connection to mongoDB client
*
**/
public class MongoDBConnection {

 //create an object of MongoDBConnection
 private static MongoDBConnection instance = new MongoDBConnection();

 //reference to mongoclient
 private MongoClient mongoClient = null;

 //making constructor private to follow singleton pattern
 private MongoDBConnection() {}
 
 //get the only object available
 public static MongoDBConnection getInstance(){
  return instance;
 }

 //get reference to the database 
 public DB getDB(String host, Long port, String db) {
     if (mongoClient == null) {
         mongoClient = new MongoClient(host, port);
         return mongoClient.getDB(db);
     } else {
         return mongoClient.getDB(db);
     }
 }

}
