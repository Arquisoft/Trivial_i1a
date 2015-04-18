package es.uniovi.asw.connection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.UnknownHostException;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.util.JSON;

public class MongoDBJDBC {
	
	/**
	 * This method conects with the data base and inserts in it the info from the json file.
	 * 
	 * @param filePath
	 *            Archivo con los objetos JSON
	 * @throws UnknownHostException 
	 * @throws FileNotFoundException 
	 */
public static void toDB(String file) throws UnknownHostException, FileNotFoundException {
		
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		MongoClient dbClient = new MongoClient("localhost", 27017);
		DB db = dbClient.getDB("preguntas");
		
		
		try {

			while (br.ready()) {
				boolean alreadyInDB = false;
				
				String json = br.readLine();
				DBObject jsonObjectFichero = (DBObject) JSON.parse(json);
				DBCollection collection = db.getCollection("Questions");
				
				if (collection.getCount() > 0) {
					DBCursor cursorDoc = collection.find();
					while (cursorDoc.hasNext()) {
						DBObject jsonObject = cursorDoc.next();
						String enunciadoFichero = (String) jsonObjectFichero
								.get("Question");
						String question = (String) jsonObject.get("Question");
						
						/**
						 * Now we check if the given question is already
						 * in the database.
						 */
//						if (enunciadoFichero.equalsIgnoreCase(question)) {
//							alreadyInDB = true;
//							System.out.println("Is already in the Database");
//						}
					}
					if (!alreadyInDB) {
						jsonObjectFichero.put("_id", collection.getCount() + 1);
						collection.insert(jsonObjectFichero);
					}
					
				} 
				
				else {
					
					jsonObjectFichero.put("_id", collection.getCount() + 1);
					collection.insert(jsonObjectFichero);
					
				}
			}
			
			br.close();
			

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			dbClient.close();
		}
	}
}
