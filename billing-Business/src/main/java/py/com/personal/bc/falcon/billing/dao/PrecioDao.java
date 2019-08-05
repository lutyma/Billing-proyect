package py.com.personal.bc.falcon.billing.dao;

import java.util.List;

import py.com.personal.bc.common.transactions.voltdb.dao.TransactionalDAO;
import py.com.personal.bc.falcon.billing.model.Precio;
import py.com.personal.bc.voltdb.utils.mapper.MapConfig;

public class PrecioDao extends TransactionalDAO<Precio> {

	public List<Precio> getListPreciosXplanId (String plan_id) throws Exception{
		Precio precio = new Precio();
		precio.setPlan_id(plan_id);
		MapConfig mapConfig = new MapConfig(Precio.class, Precio.class, true);
		
		return singlePartitionedLoadList(precio, mapConfig, precio.getPlan_id(), null);
	}
	
}
