package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {
	
	private static final Form<User> userForm = new Form<User>(User.class);

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result userList() {
    	return ok(userList.render(User.fetchUsers()));
    }
    
    public Result displayUser(String uname) {
    	return ok(displayUser.render(User.fetchByUserName(uname)));
    }
    
    public Result newUser() {
    	return TODO;
    }
    
    public Result deleteUser(String uname) {
    	return TODO;
    }
    
    public Result editUser(String uname) {
    	User user = User.fetchByUserName(uname);
    	if(user==null) {
    		// Consider flash of an error
    		return ok("Invalid user number");
    	} else {
	    	Form<User> filledForm = userForm.fill(user);
	    	return ok(editUser.render(filledForm));
    	}
    }
    
    public Result saveUser() {
    	Form<User> boundForm = userForm.bindFromRequest();
    	return TODO;
    }

}
