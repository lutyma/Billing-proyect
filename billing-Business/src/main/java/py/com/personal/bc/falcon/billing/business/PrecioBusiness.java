package py.com.personal.bc.falcon.billing.business;

import py.com.personal.bc.falcon.billing.dao.PrecioDAO;
import py.com.personal.bc.falcon.billing.model.Precio;

public class PrecioBusiness {

	private PrecioDAO dao;

	public Precio load(String plan_id) throws Exception {
		return dao.getPreciosXplanId(plan_id);

	}	
}
