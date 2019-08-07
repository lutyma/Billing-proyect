package py.com.personal.bc.falcon.billing.model;

import java.sql.Timestamp;
import java.util.List;

import py.com.personal.bc.voltdb.utils.annotations.*;
import py.com.personal.bc.voltdb.utils.mapper.views.DefaultView;


@Table("ls_linea")
@ID({
        Linea.Columnas.LINEA
})

public class Linea {

	 public static class Columnas {
	        public static final String LINEA = "LINEA";
	        public static final String PERFIL = "PERFIL";
	        public static final String ACTUALIZACION_PERFIL = "ACTUALIZACION_PERFIL";
	     
	    }
	    
	    public static class Relaciones {
	        public static final String PLAN_LINEA = "PlanPorLinea";
	        public static final String BOLSAS = "Bolsas";
	    }
        
	    @Column(value = Columnas.LINEA, order = 1)
	    private String linea;
	    
	    @Column(value = Columnas.PERFIL, order = 2)
	    private String perfil;
	    
	    @Column(value = Columnas.ACTUALIZACION_PERFIL, order = 3)
	    private Timestamp actualizacion_perfil;

	    @IncludeWithView(value = DefaultView.class, lock = true)
	    @Relation(value = Relaciones.PLAN_LINEA, joinColumns = Columnas.LINEA)
	    private PlanPorLinea planes;
	    
	//  @IncludeWithView(value = SaldoView.class, lock = true)
	    @IncludeWithView(value = DefaultView.class, lock = true)
	    @Relation(value = Relaciones.BOLSAS, joinColumns = Columnas.LINEA)
	    private List<Bolsa> bolsas;
	    
		public String getLinea() {
			return linea;
		}

		public void setLinea(String linea) {
			this.linea = linea;
		}

		public String getPerfil() {
			return perfil;
		}

		public void setPerfil(String perfil) {
			this.perfil = perfil;
		}

		public Timestamp getActualizacion_perfil() {
			return actualizacion_perfil;
		}

		public void setActualizacion_perfil(Timestamp actualizacion_perfil) {
			this.actualizacion_perfil = actualizacion_perfil;
		}

		public PlanPorLinea getPlanes() {
			return planes;
		}

		public void setPlanes(PlanPorLinea planes) {
			this.planes = planes;
		}

		public List<Bolsa> getBolsas() {
			return bolsas;
		}

		public void setBolsas(List<Bolsa> bolsas) {
			this.bolsas = bolsas;
		}
	     
}
