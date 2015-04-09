package serializer;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import es.uniovi.asw.quizStructure.Question;

public class toJSON {
	
	public static String serialize (List<Question> questions)
	{
		
		String jsonResult = "";
		
		for (Question p : questions)
			jsonResult += new GsonBuilder().create().toJson(p) + "\n";
		
		return jsonResult;
	}

}
