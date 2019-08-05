package py.com.personal.bc.falcon.billing.model;

import py.com.personal.bc.voltdb.utils.annotations.*;

@Table("ls_precios")
@ID({
        Precio.Columnas.PLAN_ID
})

public class Precio {

	 public static class Columnas {
	        public static final String PLAN_ID = "PLAN_ID";
	        public static final String TIPO_CREDITO = "TIPO_CREDITO";
	        public static final String PRECIO = "PRECIO";
	     
	    }
	    
	    @Column(value = Columnas.PLAN_ID, order = 1)
	    private String plan_id;
	    
	    @Column(value = Columnas.TIPO_CREDITO, order = 2)
	    private String tipo_credito;
	    
	    @Column(value = Columnas.TIPO_CREDITO, order = 3)
	    private double precio;

		public String getPlan_id() {
			return plan_id;
		}

		public void setPlan_id(String plan_id) {
			this.plan_id = plan_id;
		}

		public String getTipo_credito() {
			return tipo_credito;
		}

		public void setTipo_credito(String tipo_credito) {
			this.tipo_credito = tipo_credito;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
	          
}
