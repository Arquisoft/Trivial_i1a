package es.uniovi.asw.parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import java.util.List;

import serializer.ParserBuilder;
import serializer.toJSON;
import es.uniovi.asw.connection.MongoDBJDBC;
import es.uniovi.asw.quizStructure.Answer;
import es.uniovi.asw.quizStructure.Question;


public class Extractor {

	public static void main(String[] args) throws UnknownHostException, FileNotFoundException {
		new Extractor().run(args);
	}
	
	private void createJSON(String outputFile, String jsonconvert) {
		BufferedWriter buffered;
		try {
			
			buffered = new BufferedWriter(
						new FileWriter(
							new File(outputFile)));
			
			buffered.write(jsonconvert);
			buffered.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int run(String[] args) throws UnknownHostException, FileNotFoundException {

		System.out.println("Welcome to Trivial Extractor");

		String inputFilePath = args[0];
		String inputFileFormat = args[1];
		String outputFile = args[2];

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		List<Question> questions = ParserBuilder.build(inputFilePath,
				inputFileFormat).parse();

		getQuestions(questions);

		String jsonconvert = toJSON.serialize(questions);
		createJSON(outputFile, jsonconvert);
		String option = "";
		
		System.out.println("LOAD DATA INTO DB? (Y/N)");
		
		try {
			option = br.readLine();
		} catch (IOException e) {
			System.out.println("Wrong key.");
		}
		
		if (option.equals("Y") || option.equals("y"))
			MongoDBJDBC.toDB(outputFile);

		return -1;
	}

	private void getQuestions(List<Question> questions) {
		for (Question q : questions) {

			System.out.println(q.getTitle());

			List<Answer> answers = q.getAnswers();

			for (int i = 0; i < answers.size(); i++)
				System.out.println("\t" + answers.get(i).text);

			System.out.println();
		}
	}

}
