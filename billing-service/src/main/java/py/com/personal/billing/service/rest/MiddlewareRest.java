package py.com.personal.billing.service.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.weld.context.ejb.Ejb;

import py.com.personal.bc.falcon.billing.business.CreditoBusiness;
import py.com.personal.bc.falcon.billing.business.MiddlewareBusiness;
import py.com.personal.bc.falcon.billing.model.Bolsa;

@Path("/middleware")
public class MiddlewareRest {

	@Ejb
	MiddlewareBusiness middlewareBusiness;
	@Ejb
	CreditoBusiness creditoBusiness;

	@POST
	@Path("linea")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void activacionLinea() {

		String linea = null;
		String perfil = null;
		String plan = null;
		List<Bolsa> bolsa = null;

		try {
			middlewareBusiness.activar(linea, perfil, plan, bolsa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	@POST
	@Path("linea/credito")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void creditoLinea() {

		String linea = null;
		String credito = null;
		Double cantidad = null;

		try {
			creditoBusiness.credito(linea, credito, cantidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
