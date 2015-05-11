package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import data.persistence.JDBCPersistence;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.Required;

@Entity
public class Questions extends Model {
	@Id
	public Long id;

	@Required 
	public int category;
	public String title;
	public List<String> answers;
	public int correcta=-1;
	
	public static Finder<Long, Questions> finder = new Finder<Long, Questions>(Long.class, Questions.class);

	public Questions(int category, String title,List<String> answers,int correcta) {
		this.category = category;
		this.title=title;
		this.answers=answers;
		this.correcta=correcta;
	}

	public static Questions findById(Long id) {
		return finder.byId(id);
	}

	public static List<Questions> all() {
	
		return  JDBCPersistence.getQuestions(1);
		
	}
	
	
	public static List<Questions> getUnaQuestion1() {
		
		return  JDBCPersistence.getQuestionsCategory(1);
		
	}
	public static List<Questions> getUnaQuestion2() {
		
		return  JDBCPersistence.getQuestionsCategory(2);
		
	}
	public static List<Questions> getUnaQuestion3() {
		
		return  JDBCPersistence.getQuestionsCategory(3);
		
	}public static List<Questions> getUnaQuestion4() {
	
		return  JDBCPersistence.getQuestionsCategory(4);
		
	}
	

}
