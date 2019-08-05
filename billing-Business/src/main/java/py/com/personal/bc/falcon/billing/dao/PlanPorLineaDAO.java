package py.com.personal.bc.falcon.billing.dao;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;

public class PlanPorLineaDAO extends TransactionalDAO<PlanPorLinea> {

	public PlanPorLinea getPlanByLinea(String linea) throws Exception {

		PlanPorLinea plan = new PlanPorLinea();
		plan.setLinea(linea);
		MapConfig mapConfig = new MapConfig(PlanPorLinea.class, PlanPorLinea.class, true);

		return singlePartitionedLoad(plan, mapConfig, plan.getLinea(), null);
	}


}
