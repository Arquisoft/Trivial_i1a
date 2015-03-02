package es.uniovi.asw.connection;

import java.net.UnknownHostException;

import org.mongojack.JacksonDBCollection;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

import es.uniovi.asw.quizStructure.Question;

public class Connection {

	public static void connection() {
		try {

			DB db = (new MongoClient("localhost", 27017)).getDB("Questions");

			DBCollection coll = db.getCollection("Questions");
			
			// Código de ejemplo de MongoJack, que es lo que se usa
			// para convertir POJO (Plain Old Java Object) a JSON
			// y almacenarlo en la base de datos.
			
			// JacksonDBCollection<Question, String> collection = JacksonDBCollection
			//		.wrap(coll, Question.class, String.class);
			// MyObject myObject = ...
			// WriteResult<Question, String> result = coll.insert(myObject);
			// String id = result.getSavedId();
			// MyObject savedObject = coll.findOneById(id);
			
			// Hay que mirar como trabajar con MongoJack y conseguir convertir
			// la lista de preguntas a JSON, para luego enviar a la DB.
			
			// Probablemente necesitemos un par de clases más.

			BasicDBObject query = new BasicDBObject();
			query.put("id", 1001);
			DBCursor cursor = coll.find(query);
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}
}
