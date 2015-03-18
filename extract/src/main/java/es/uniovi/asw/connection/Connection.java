package es.uniovi.asw.connection;

import java.net.UnknownHostException;

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

			BasicDBObject query = new BasicDBObject();
			query.put("id", 1001);
			DBCursor cursor = coll.find(query);
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		} catch (MongoException e) {
			e.printStackTrace();
		}
	}
}
