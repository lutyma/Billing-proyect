package py.com.personal.bc.falcon.billing.dao;

import java.util.List;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.common.transactions.voltdb.util.loader.LoadSettings;
import py.com.personal.bc.falcon.billing.model.Linea;
import py.com.personal.bc.falcon.billing.model.PlanPorLinea;
import py.com.personal.bc.falcon.billing.model.Linea.Relaciones;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;
import py.com.personal.bc.voltdb.utils.mapper.views.DefaultView;

public class LineaDAO extends TransactionalDAO<Linea> {

	public Linea load(Linea linea) throws Exception {

		MapConfig config = new MapConfig(Linea.class, DefaultView.class, true);

		return singlePartitionedLoad(linea, config, linea.getLinea(), null);

	}


	// obtener en todas la particiones lineas de un plan especifico.
	public List<Linea> getListLineaByPlan (PlanPorLinea planEspecifico) throws Exception{

		List<Linea> lineas = null;
		Linea linea = new Linea();
		linea.setPlanes(planEspecifico);
		linea.setLinea(planEspecifico.getLinea());

		LoadSettings settings = new LoadSettings();
		settings.setQueryStatement("GetLineasPorPlanEspecifico");
		settings.setColumns(Linea.Columnas.LINEA);
		settings.setColumns(Relaciones.PLAN_LINEA);

		MapConfig config = new MapConfig(Linea.class,DefaultView.class,true);

		try {
			lineas = this.singlePartitionedLoadList(linea, config, linea.getLinea(), settings);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}

		return lineas;
	}
}
