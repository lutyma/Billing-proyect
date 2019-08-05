package py.com.personal.bc.falcon.billing.business;

import java.util.List;

import py.com.personal.bc.falcon.billing.dao.HistorialOperacionDAO;
import py.com.personal.bc.falcon.billing.model.HistorialDeOperacion;

public class HistorialOperacionesBusiness {

	private HistorialOperacionDAO dao;
	
	 public List<HistorialDeOperacion> load(String linea) throws Exception {
	        return dao.getHistorialByLinea(linea);
	    }
	 
}
