package py.com.personal.bc.falcon.billing.business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import py.com.personal.bc.falcon.billing.model.Bolsa;
import py.com.personal.bc.falcon.billing.model.Linea;

@ApplicationScoped
public class CreditoBusiness {

	@Inject
	private LineaBusiness lineabusiness;
	
	public void credito(String linea, String tipoCredito, double cantidad) throws Exception{
		
		   try {
			Linea lineaCredito = lineabusiness.load(linea);
			for (Bolsa bolsa : lineaCredito.getBolsas()) {
				
				if(bolsa.getTipo_credito() == tipoCredito) {
					double cant = cantidad + bolsa.getCantidad();
					bolsa.setCantidad(cant);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("No se pudo acreditar a la linea");
		}
		
		
	}
	
	
}
