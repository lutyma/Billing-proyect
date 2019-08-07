package py.com.personal.bc.falcon.billing.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import py.com.personal.bc.falcon.billing.dao.LineaDAO;
import py.com.personal.bc.falcon.billing.model.Linea;

@ApplicationScoped
public class LineaBusiness {

	@Inject
	private LineaDAO dao;

	public Linea load(String linea) throws Exception {
		return dao.load(linea);
	}

	public void insert(Linea lineaNueva) throws Exception {

		dao.insert(lineaNueva);
	} 

	public void delete(Linea lineaEliminar) throws Exception{

		dao.delete(lineaEliminar);

	}

}
