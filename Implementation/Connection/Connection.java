package Connection;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class Connection {

	public static void connection() {
		try {
		Mongo conn = new Mongo();
		
		DB db = conn.getDB("Questions");
		
		DBCollection coll = db.getCollection("Questions");
		
		BasicDBObject query = new BasicDBObject();
		query.put("id", 1001);
		DBCursor cursor = coll.find(query);
		while (cursor.hasNext()) {
		System.out.println(cursor.next());
		}
		} catch (UnknownHostException e) {
		e.printStackTrace();
		} catch (MongoException  e) {
		e.printStackTrace();
		}
		}
}
