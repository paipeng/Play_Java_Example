package controllers;

import play.*;
import play.mvc.*;
import play.twirl.api.Html;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result main() {
        return ok(main.render("Your new application is ready.", Html.apply("<h1>Hello Wolrd Play </h1>")));
    }
    
    public Result test() {
        return ok("Hello Ply");
    }
    
    public Result echo(String value) {
        return ok(value);
    }
}
