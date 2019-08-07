package py.com.personal.bc.falcon.billing.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.Bolsa;
import py.com.personal.bc.falcon.billing.model.HistorialDeOperacion;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;

@ApplicationScoped
public class HistorialOperacionDAO extends TransactionalDAO<HistorialDeOperacion> {

public List<HistorialDeOperacion> getHistorialByLinea(String linea) throws Exception{
		
		HistorialDeOperacion historial = new HistorialDeOperacion();
		historial.setLinea(linea);
		MapConfig mapConfig = new MapConfig(Bolsa.class, Bolsa.class, true);
		return singlePartitionedLoadList(historial, mapConfig, historial.getLinea(), null);
	}
	
}
