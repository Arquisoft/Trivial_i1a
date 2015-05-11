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
public class Users extends Model {
	@Id
	public Long id;

	@Required 
	public String login;
	public String password;
	
	public static Finder<Long, Users> finder = new Finder<Long, Users>(Long.class, Users.class);

	public Users(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public static Users findById(Long id) {
		return finder.byId(id);
	}

	public static List<Users> all() {
		List<Users> us= new ArrayList<Users>();
		for(String s: JDBCPersistence.getUsers("Usuario"))
		{
			Users u1 =new Users(s,"wy");
			us.add(u1);
		}
		return us;
		
	}

	public static void create(Users user) {
		user.save();
	}
	public static void delete(Long id) {
		finder.ref(id).delete();
	}
	
	public static void deleteAll() {
		finder.all().clear();
	}
	
	

}
