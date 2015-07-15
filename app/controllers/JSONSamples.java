package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.libs.Json;

public class JSONSamples extends Controller {
	
    public Result userData(String uname) {
        return ok(Json.toJson(User.fetchByUserName(uname)));
    }
    
}
