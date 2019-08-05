package py.com.personal.bc.falcon.billing.model;

import java.sql.Timestamp;
import py.com.personal.bc.voltdb.utils.annotations.*;

@Table("ls_bolsa")
@ID({
        Bolsa.Columnas.LINEA
})

public class Bolsa {

	 public static class Columnas {
	        public static final String LINEA = "LINEA";
	        public static final String TIPO_CREDITO = "TIPO_CREDITO";
	        public static final String CANTIDAD = "CANTIDAD";
	        public static final String FECHA_ACTUALIZACION = "FECHA_ACTUALIZACION ";
	        public static final String ULTIMA_TRANSACCION = "ULTIMA_TRANSACCION";
	        public static final String ULTIMO_PROCESO = "ULTIMO_PROCESO";
	    }
	 
	    @Column(value = Columnas.LINEA, order = 1)
	    private String linea;
	    
	    @Column(value = Columnas.TIPO_CREDITO, order = 2)
	    private String tipo_credito;
	    
	    @Column(value = Columnas.CANTIDAD, order = 3)
	    private double cantidad;

	    @Column(value = Columnas.FECHA_ACTUALIZACION, order = 4)
	    private Timestamp fecha_actualizacion;
	    
	    @Column(value = Columnas.ULTIMA_TRANSACCION, order = 5)
	    private long ultima_transacion;
	    
	    @Column(value = Columnas.ULTIMO_PROCESO, order = 6)
	    private String ultimo_proceso;
	    
		public String getLinea() {
			return linea;
		}

		public void setLinea(String linea) {
			this.linea = linea;
		}

		public String getTipo_credito() {
			return tipo_credito;
		}

		public void setTipo_credito(String tipo_credito) {
			this.tipo_credito = tipo_credito;
		}

		public double getCantidad() {
			return cantidad;
		}

		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}

		public Timestamp getFecha_actualizacion() {
			return fecha_actualizacion;
		}

		public void setFecha_actualizacion(Timestamp fecha_actualizacion) {
			this.fecha_actualizacion = fecha_actualizacion;
		}

		public long getUltima_transacion() {
			return ultima_transacion;
		}

		public void setUltima_transacion(long ultima_transacion) {
			this.ultima_transacion = ultima_transacion;
		}

		public String getUltimo_proceso() {
			return ultimo_proceso;
		}

		public void setUltimo_proceso(String ultimo_proceso) {
			this.ultimo_proceso = ultimo_proceso;
		}    
	    
}
