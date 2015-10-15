package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import models.*;
import com.avaje.ebean.Ebean;
import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public Result index()
    {
        List<Cliente> clientes = Ebean.createQuery(Cliente.class).findList();
        return ok(index.render(clientes));
    }

    public Result formularioNovoCliente() {
        Form<Cliente> form = Form.form(Cliente.class);
        return ok(formularioNovoCliente.render(form));
    }

    public Result novoCliente()
    {
        Form<Cliente> form = Form.form(Cliente.class).bindFromRequest();
        if (form.hasErrors()){
            return badRequest(formularioNovoCliente.render(form));
        }
        Cliente cliente = form.get();
        cliente.save();
        return redirect(routes.Application.index());
    }

}
