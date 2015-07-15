package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class RoutingSamples extends Controller {
	
    public Result todo() {
        return TODO;
    }

    public Result intArgument(int arg) {
        return ok("arg = " + Integer.toString(arg));
    }

    public Result twoParams(int p1,String p2) {
        return ok("p1 = "+Integer.toString(p1)+", p2 = "+p2);
    }
    
    public Result regexOrSplatArgument(String arg) {
        return ok("arg = "+arg);
    }
    
}
