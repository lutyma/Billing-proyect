package py.com.personal.bc.falcon.billing.business;

import java.util.Calendar;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import py.com.personal.bc.falcon.billing.model.Bolsa;
import py.com.personal.bc.falcon.billing.model.HistorialDeOperacion;
import py.com.personal.bc.falcon.billing.model.Linea;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;

@ApplicationScoped
public class MiddlewareBusiness {

	@Inject
	private LineaBusiness lineabusiness;

	@Inject
	private PlanPorLineaBusiness planbusiness;

	@Inject
	private BolsaBusiness bolsabusiness;

	@Inject
	private HistorialOperacionesBusiness historialbusiness;

	public void activar(String linea, String perfil, String plan, List<Bolsa> bolsa) throws Exception {

		Linea verificarLinea = lineabusiness.load(linea);

		if(verificarLinea == null) {

			Linea lineaNueva = new Linea();
			PlanPorLinea planNuevo = new PlanPorLinea();

			Calendar calendar = Calendar.getInstance();
			java.sql.Timestamp actualizacion_perfil = new java.sql.Timestamp(calendar.getTimeInMillis());
			planNuevo.setLinea(linea);
			planNuevo.setPlan(plan);
			lineaNueva.setLinea(linea);
			lineaNueva.setPerfil(perfil);
			lineaNueva.setActualizacion_perfil(actualizacion_perfil);
			lineaNueva.setBolsas(bolsa);
			lineaNueva.setPlanes(planNuevo);
			lineabusiness.insert(lineaNueva);
			planbusiness.insert(planNuevo);

			for(Bolsa b : bolsa) {

				bolsabusiness.insert(b);
			}
		}

	}

	public void desactivar(String linea)throws Exception {

		Linea verificarLinea;
		try {
			verificarLinea = lineabusiness.load(linea);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception (" Error al buscar linea a eliminar");
		}

		if(verificarLinea != null) {

			lineabusiness.delete(verificarLinea);
		}

	}

	public Linea consulta(String linea) throws Exception{

		try {
			Linea lineaConsultada = lineabusiness.load(linea);

			return lineaConsultada;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error al consultar la linea");
		}
	}

	public List<HistorialDeOperacion> consultaDetalle(String linea) throws Exception{

		try {
			List<HistorialDeOperacion> historial = historialbusiness.load(linea);

			return historial;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("No se pudo obtener el historial de la linea");
		}



	}

}
