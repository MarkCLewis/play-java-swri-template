package controllers;

import java.util.ArrayList;
import java.util.List;

import views.html.*;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result userList(int userNum) {
    	List<User> users = new ArrayList<User>();
    	users.add(new User("mlewis","Mark","Lewis"));
    	users.add(new User("llacher","Lisa","Lacher"));
    	return ok(userList.render(users));
    }

}
