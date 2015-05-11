package controllers;

import java.util.ArrayList;
import java.util.Random;

import models.Questions;
import models.Users;
import play.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        Integer n = new Random().nextInt(10);
        return ok(index.render("hi",n));
    }
    public static Result sayHi(int age, String name) {
      
        return ok(hello.render("hi",age,name));
    }
    public static Result login() {
        
        return ok(login.render("Enter the Trivial"));
    }
    public static Result validation(String login,String password) {
        if(login.equals("dani")&& password.equals("dani")){
        	return ok(userMain.render("Trivial!!",login,password));
        }
        if(login.equals("admin")&& password.equals("admin")){
        	return ok(userAdmin.render("Trivial!!",login,password));
        }
    	return ok(error.render("Error"));
    }
    //-------------------------------------------------------------------------------------------------------
    //public static Result getQuestions(){
    	//return ok(JDBCPersistence.getQuestion(1));
	
    //}
    public static Result showUsers() {
        return ok(users.render("Usuarios",Users.all()));
    }
    
    
    public static Result showQuestions() {
        return ok(questions.render("Questions",Questions.all()));
    }
    
    
    public static Result showQuestionsgame(String login,int score) {
        return ok(game.render("New Game",login, score, Questions.getUnaQuestion1(), Questions.getUnaQuestion2(), Questions.getUnaQuestion3(), Questions.getUnaQuestion4()));
    }
    
    //-------------------------------------------------------------------------------------------------------
   
   
    public static Result error() {
        
        return ok(error.render("Error"));
    }
 
 public static Result showInfo(String login,int score) {
        
        return ok(userInfo.render("Your data",login,score));
    }
    public static Result howToPlay() {
        
        return ok(how.render("How to play"));
    }
    public static Result register() {
        
        return ok(register.render("Register"));
    }
public static Result winning(String login,int score) {
        
        return ok(winning.render("WINNER!",login,score));
    }


}
