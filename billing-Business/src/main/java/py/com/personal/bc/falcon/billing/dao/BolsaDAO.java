package py.com.personal.bc.falcon.billing.dao;

import javax.enterprise.context.ApplicationScoped;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.Bolsa;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;

@ApplicationScoped
public class BolsaDAO extends TransactionalDAO<Bolsa>{

	public Bolsa load(Bolsa bolsa) throws Exception {
		MapConfig mapConfig = new MapConfig(Bolsa.class, Bolsa.class, true);

		return singlePartitionedLoad(bolsa, mapConfig, bolsa.getLinea(), null );
	}
	

}
