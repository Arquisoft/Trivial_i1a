package serializer;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import quizStructure.Question;

public class toJSON {
	
	public String serialize(List<Question> questions)
	{
		Gson gson = new GsonBuilder().create();
		return gson.toJson(questions);
	}

}
