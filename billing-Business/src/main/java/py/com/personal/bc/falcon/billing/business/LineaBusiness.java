package py.com.personal.bc.falcon.billing.business;

import java.util.List;

import py.com.personal.bc.falcon.billing.dao.LineaDAO;
import py.com.personal.bc.falcon.billing.model.Linea;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;

public class LineaBusiness {

	private LineaDAO dao;
	
	 public Linea load(Linea linea) throws Exception {
	        return dao.load(linea);
	    }
	 
	 public List<Linea> getListLineaByPlan(PlanPorLinea planEspecifico) throws Exception{
		 
		     return dao.getListLineaByPlan(planEspecifico);
		 
	 }
}
