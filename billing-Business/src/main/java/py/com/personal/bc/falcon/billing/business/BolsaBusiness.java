package py.com.personal.bc.falcon.billing.business;

import py.com.personal.bc.falcon.billing.dao.BolsaDAO;
import py.com.personal.bc.falcon.billing.model.Bolsa;

public class BolsaBusiness {

	private BolsaDAO dao;
	
	 public Bolsa load(Bolsa bolsa) throws Exception {
	        return dao.load(bolsa);
	    }
	 
	 public void insert(Bolsa bolsa) throws Exception {

			dao.insert(bolsa);
	} 
}
