package py.com.personal.bc.falcon.billing.model;

import py.com.personal.bc.voltdb.utils.annotations.*;

@Table("ls_planes_x_linea")
@ID({
        PlanPorLinea.Columnas.LINEA
})

public class PlanPorLinea {

	 public static class Columnas {
	        public static final String LINEA = "LINEA";
	        public static final String PLAN = "PLAN";
	     
	    }
	    
	    @Column(value = Columnas.LINEA, order = 1)
	    private String linea;
	    
	    @Column(value = Columnas.PLAN, order = 2)
	    private String plan;
	    
		public String getLinea() {
			return linea;
		}

		public void setLinea(String linea) {
			this.linea = linea;
		}

		public String getPlan() {
			return plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}
	   	
	      
}
