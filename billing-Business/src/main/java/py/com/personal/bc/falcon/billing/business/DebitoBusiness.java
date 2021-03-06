package py.com.personal.bc.falcon.billing.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import py.com.personal.bc.falcon.billing.model.Bolsa;
import py.com.personal.bc.falcon.billing.model.Linea;

@ApplicationScoped
public class DebitoBusiness {

	@Inject
	private LineaBusiness lineabusiness;
	
	public void debito(String linea, String tipoCredito, double cantidad) throws Exception {
		
		   try {
				Linea lineaCredito = lineabusiness.load(linea);
				for (Bolsa bolsa : lineaCredito.getBolsas()) {
					
					if(bolsa.getTipo_credito() == tipoCredito) {
						double cant = bolsa.getCantidad() - cantidad;
						bolsa.setCantidad(cant);
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("No se pudo debitar a la linea");
			}
		
	}
	
}
