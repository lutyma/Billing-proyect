package py.com.personal.bc.falcon.billing.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.common.transactions.voltdb.util.loader.LoadSettings;
import py.com.personal.bc.falcon.billing.model.Linea;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;
import py.com.personal.bc.voltdb.utils.mapper.views.DefaultView;

@ApplicationScoped
public class PlanPorLineaDAO extends TransactionalDAO<PlanPorLinea> {

	public PlanPorLinea getPlanByLinea(String linea) throws Exception {

		PlanPorLinea plan = new PlanPorLinea();
		plan.setLinea(linea);
		MapConfig mapConfig = new MapConfig(PlanPorLinea.class, PlanPorLinea.class, true);

		return singlePartitionedLoad(plan, mapConfig, plan.getLinea(), null);
	}

	// obtener en todas la particiones lineas de un plan especifico.
	public List<String> getLineaByPlanEspecifico(String plan, String partitionKey) throws Exception{

		List<String> lineas = null;
		List<PlanPorLinea> planes = null;

		PlanPorLinea Plan = new PlanPorLinea();
		Plan.setPlan(plan);

		LoadSettings settings = new LoadSettings();
		settings.setQueryStatement("GetLineasPorPlanEspecifico");
		settings.setColumns(PlanPorLinea.Columnas.PLAN);

		MapConfig config = new MapConfig(Linea.class,DefaultView.class,true);

		try {
			planes = this.singlePartitionedLoadList(Plan, config, partitionKey, settings);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		if (planes != null) {
			for(PlanPorLinea p : planes) {		
				lineas.add(p.getLinea());
			}

		}

		return lineas;
	}
	
}
