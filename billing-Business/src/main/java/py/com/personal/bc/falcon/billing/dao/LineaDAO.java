package py.com.personal.bc.falcon.billing.dao;

import javax.enterprise.context.ApplicationScoped;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.Linea;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;
import py.com.personal.bc.voltdb.utils.mapper.views.DefaultView;

@ApplicationScoped
public class LineaDAO extends TransactionalDAO<Linea> {

	public Linea load(String linea) throws Exception {

		Linea lin = new Linea();
		lin.setLinea(linea);
		
		MapConfig config = new MapConfig(Linea.class, DefaultView.class, true);

		return singlePartitionedLoad(lin, config, lin.getLinea(), null);

	}

}
