package py.com.personal.bc.falcon.billing.business;

import java.util.List;

import py.com.personal.bc.falcon.billing.dao.PlanPorLineaDAO;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;

public class PlanPorLineaBusiness {

	private PlanPorLineaDAO dao;

	public PlanPorLinea getPlanByLinea(String linea) throws Exception {
		return dao.getPlanByLinea(linea);
	}

	public List<String> getLineasByPlanEspecifico(String plan, String partitionKey) throws Exception{

		return dao.getLineaByPlanEspecifico(plan, partitionKey);

	}

}
