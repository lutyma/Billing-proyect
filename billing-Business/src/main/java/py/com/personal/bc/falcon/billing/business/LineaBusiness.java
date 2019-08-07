package py.com.personal.bc.falcon.billing.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import py.com.personal.bc.falcon.billing.dao.BolsaDAO;
import py.com.personal.bc.falcon.billing.dao.LineaDAO;
import py.com.personal.bc.falcon.billing.dao.PlanPorLineaDAO;
import py.com.personal.bc.falcon.billing.model.Bolsa;
import py.com.personal.bc.falcon.billing.model.Linea;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;

@ApplicationScoped
public class LineaBusiness {

	@Inject
	private LineaDAO daoLinea;

	@Inject
	private PlanPorLineaDAO daoPlan;

	@Inject
	private BolsaDAO daoBolsa;

	public Linea load(String linea) throws Exception {
		return daoLinea.load(linea);
	}

	public void insert(String linea, String perfil, String plan, String tipoCredito) throws Exception {

		Linea lineaNueva = new Linea();
		PlanPorLinea lineaPlan = new PlanPorLinea();
		Bolsa bolsaNueva = new Bolsa();
		Linea verificarLinea = daoLinea.load(linea);

		if(verificarLinea == null) {

			lineaNueva.setLinea(linea);
			lineaNueva.setPerfil(perfil);
			lineaPlan.setLinea(linea);
			lineaPlan.setPlan(plan);
			bolsaNueva.setLinea(linea);
			bolsaNueva.setTipo_credito(tipoCredito);

			daoLinea.insert(lineaNueva);

			daoPlan.insert(lineaPlan);

			daoBolsa.insert(bolsaNueva);

		}
	} 

	public void delete(String linea) throws Exception{
		Linea LineaEliminar = daoLinea.load(linea);

		if(LineaEliminar != null) {
			try {
				daoLinea.delete(LineaEliminar);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			throw new Exception("no se encontró linea a eliminar");
		}

	}

}
