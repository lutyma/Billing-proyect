package py.com.personal.bc.falcon.billing.dao;

import javax.enterprise.context.ApplicationScoped;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.Perfil;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;
import py.com.personal.bc.voltdb.utils.mapper.views.DefaultView;

@ApplicationScoped
public class PerfilDAO extends TransactionalDAO<Perfil>{

	
	 public Perfil load(Perfil perfil) throws Exception {
	        MapConfig config = new MapConfig(Perfil.class, DefaultView.class, true);
	        
	        return singlePartitionedLoad(perfil, config, perfil.getCredito(), null);
	    }
	
}
