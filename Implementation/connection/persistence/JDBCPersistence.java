package connection.persistence;

import com.mongodb.*;

public class JDBCPersistence {
	
	static int port = 27017;
	
	static MongoClient dbClient = new MongoClient("localhost", port);
	
	public static DBCollection getUsers() {
		
		// Establecemos conexión con la base de datos, y devolvemos
		// la lista de usuarios de la base de datos mongoDB.
		@SuppressWarnings("deprecation")
		DBCollection collection = dbClient.getDB("test").getCollection("users");
		
		return collection;

    }
	
	
	public static void updateScore(String username, int score){
		
		@SuppressWarnings("deprecation")
		DBCollection collection = dbClient.getDB("test").getCollection("users");
		
		//Encontrar a la persona cuyo nombre coincide con el parámetro.
		DBObject criteria = new QueryBuilder().put("name").is(username).get();
		
		//Incrementar la puntuación de ese usuario.
		DBObject update = new Builder().inc("score", score).get();
		
		collection.update(criteria, update);
		
	}
	public static void getScore(String username) {
		

		Mongo conn = new Mongo();

		DB db = conn.getDB("Users");

		DBCollection collection = db.getCollection("Users");

		BasicDBObject filter = new BasicDBObject();
		filter.put("Username",username);
	    DBCursor cursor = collection.find(filter);
	   // System.out.println(cursor.next());
	    DBObject args= cursor.next();
	    System.out.println(args.get("Puntuacion"));
	}
	
	public static void getGameplay(String username){
		//IMPLEMENTAR.
	}
	
	public static void updateGameplay(String username){
		
		@SuppressWarnings("deprecation")
		DBCollection collection = dbClient.getDB("test").getCollection("users");
		
		//Encontrar a la persona cuyo nombre coincide con el parámetro.
		DBObject criteria = new QueryBuilder().put("name").is(username).get();
		
		//Incrementar el número de partidas de ese usuario.
		DBObject update = new Builder().inc("games", 1).get();
		
		collection.update(criteria, update);
		
	}
	
	public static void getQuestion(){
		//IMPLEMENTAR.
	}
	
	public static void getAnswer(){
		//IMPLEMENTAR.
	}

}
