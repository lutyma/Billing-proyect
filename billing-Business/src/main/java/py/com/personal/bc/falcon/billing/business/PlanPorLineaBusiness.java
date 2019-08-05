package py.com.personal.bc.falcon.billing.business;

import py.com.personal.bc.falcon.billing.dao.PlanPorLineaDAO;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;

public class PlanPorLineaBusiness {

	private PlanPorLineaDAO dao;
	
	 public PlanPorLinea getPlanByLinea(String linea) throws Exception {
	        return dao.getPlanByLinea(linea);
	    }
	 
}
