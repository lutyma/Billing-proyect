package py.com.personal.bc.falcon.billing.business;

import py.com.personal.bc.falcon.billing.dao.PerfilDAO;
import py.com.personal.bc.falcon.billing.model.Perfil;

public class PerfilBusiness {

	private PerfilDAO dao;
	
	 public Perfil load(Perfil perfil) throws Exception {
	        return dao.load(perfil);
	    }
}
