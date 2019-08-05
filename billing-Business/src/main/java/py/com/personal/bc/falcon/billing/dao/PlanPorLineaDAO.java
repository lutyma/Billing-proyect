package py.com.personal.bc.falcon.billing.dao;

import java.util.List;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;

public class PlanPorLineaDAO extends TransactionalDAO<PlanPorLinea> {

	public List<PlanPorLinea> getPlanByLinea(String linea) throws Exception {

		PlanPorLinea plan = new PlanPorLinea();
		plan.setLinea(linea);
		MapConfig mapConfig = new MapConfig(PlanPorLinea.class, PlanPorLinea.class, true);

		return singlePartitionedLoadList(plan, mapConfig, plan.getLinea(), null);
	}


}
