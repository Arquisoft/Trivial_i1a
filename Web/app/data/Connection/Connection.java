package data.Connection;
import java.net.UnknownHostException;



import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.util.JSON;

public class Connection {

	public static void connection(String contentToTransform) {
		try {
		Mongo conn = new Mongo();
		
		DB db = conn.getDB("Questions");
	
		DBCollection coll = db.getCollection("Questions");
		
		BasicDBObject query = new BasicDBObject();
		
		query.put("question", 1);
		
		coll.createIndex(query, "question", true);
		
		DBCursor cursor = coll.find(query);
		
		BasicDBList list= (BasicDBList) JSON.parse(contentToTransform);
		
		for(Object obj:list){
			coll.insert((DBObject)obj);
		}
		
		while (cursor.hasNext()) {
		System.out.println(cursor.next());
		}
		} catch (MongoException  e) {
		e.printStackTrace();
		}
		}
}
