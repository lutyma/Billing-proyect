package py.com.personal.bc.falcon.billing.business;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import py.com.personal.bc.falcon.billing.model.HistorialDeOperacion;
import py.com.personal.bc.falcon.billing.model.Linea;

@ApplicationScoped
public class MiddlewareBusiness {

	@Inject
	private LineaBusiness lbusiness;

	public void activar(String linea, String perfil, String plan, String tipoCredito) throws Exception {

		lbusiness.insert(linea, perfil, plan, tipoCredito);	

	}

	public void desactivar(String linea) {

		try {
			lbusiness.delete(linea);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Linea consulta(Linea linea){
		Linea RespuestaLinea = null;


		return RespuestaLinea;
	}

	public List<HistorialDeOperacion> consultaDetalle(){
		List<HistorialDeOperacion> historial = null;

		return historial;

	}

}
