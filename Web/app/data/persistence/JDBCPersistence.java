package data.persistence;

import java.util.ArrayList;

import java.util.List;

import scala.util.Random;
import models.Questions;
import models.Users;

import com.mongodb.*;

public class JDBCPersistence {
	
	static int port = 27017;
	
	static MongoClient dbClient = new MongoClient("localhost", port);
	static int maximum=6;
	static int minimum=1;
	
	public static DBCollection getUsers() {
		
		// Establecemos conexión con la base de datos, y devolvemos
		// la lista de usuarios de la base de datos mongoDB.
		@SuppressWarnings("deprecation")
		DBCollection collection = dbClient.getDB("test").getCollection("users");
		
		return collection;

    }
	



	
	public static DBCursor getScore(String username) {
		
		DBObject get = new QueryBuilder().put("name").is(username).get();
		
		return getUsers().find(get);
		
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
	
	public static List<String> getUsers(String rol){
		
			
			Mongo conn = new Mongo();
			DB db = conn.getDB("Users");
			List<String> result= new ArrayList<String>();
			
			
			DBCollection collection = db.getCollection("Users");

			
			BasicDBObject filter = new BasicDBObject();
			filter.put("Rol", rol);
			
		    DBCursor cursor = collection.find(filter);
		    
		    try {
		    	   while(cursor.hasNext()) {
		    	      result.add((String)cursor.next().get("Username"));
		    	   }
		    	} finally {
		    	   cursor.close();
		    	}
		    return result;
	}
	public static List<Questions> getQuestions(int category){
		
		
		Mongo conn = new Mongo();
		DB db = conn.getDB("preguntas");
		
		//ESTO
		List<Questions> result= new ArrayList<Questions>();
		
		
		DBCollection collection = db.getCollection("Questions");

		
		BasicDBObject filter = new BasicDBObject();
		filter.put("category", category);
		
	    DBCursor cursor = collection.find();//---->sacarlas todas
	    
	    try {
	    	   while(cursor.hasNext()) {
	    		   String title=(String)cursor.next().get("title");
	    		   int category2=(Integer)cursor.curr().get("category");
	    		   BasicDBList ans = (BasicDBList)cursor.curr().get("answers");
	    		   
	    		   List<String> a = new ArrayList<String>();
	    		   for (int i = 0; i < ans.size(); i++) {
	    			   	
					    a.add(ans.get(i).toString().split(",")[0].split(":")[1]);
				}
	    		   int correct=0;
	    		   Questions q = new Questions(category2,title,a,correct);
	    	       result.add(q);
	    	      
	    	   }
	    	} finally {
	    	   cursor.close();
	    	}
	    return result;
}
public static List<Questions> getQuestionsCategory(int category){
		
		
		Mongo conn = new Mongo();
		DB db = conn.getDB("preguntas");
		
		//ESTO
		List<Questions> result= new ArrayList<Questions>();
		
		
		DBCollection collection = db.getCollection("Questions");

		
		BasicDBObject filter = new BasicDBObject();
		filter.put("category", category);
		
	    DBCursor cursor = collection.find(filter);//---->sacarlas todas
	    
	    try {
	    	   while(cursor.hasNext()) {
	    		   String title=(String)cursor.next().get("title");
	    		   int category2=(Integer)cursor.curr().get("category");
	    		   BasicDBList ans = (BasicDBList)cursor.curr().get("answers");
	    		   
	    		   List<String> a = new ArrayList<String>();
	    		   for (int i = 0; i < ans.size(); i++) {
	    			   	
					    a.add(ans.get(i).toString().split(",")[0].split(":")[1]);
				}
	    		   int correct=0;
	    		   Questions q = new Questions(category2,title,a,correct);
	    	       result.add(q);
	    	      
	    	   }
	    	} finally {
	    	   cursor.close();
	    	}
	    return result;
}

	public static void getAnswer(){
		//IMPLEMENTAR.
	}

}
