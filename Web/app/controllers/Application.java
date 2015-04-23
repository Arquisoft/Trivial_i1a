package controllers;

import java.util.Random;

import play.*;
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
    	return ok(error.render("Error"));
    }
    public static Result error() {
        
        return ok(error.render("Error"));
    }
    public static Result newGame() {
        
        return ok(game.render("New Game"));
    }


}
