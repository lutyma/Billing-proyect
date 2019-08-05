package py.com.personal.bc.falcon.billing.model;

import java.sql.Timestamp;
import py.com.personal.bc.voltdb.utils.annotations.*;

@Table("ls_historial_operaciones")
@ID({
        HistorialDeOperacion.Columnas.LINEA
})

public class HistorialDeOperacion {

	 public static class Columnas {
	        public static final String LINEA = "LINEA";
	        public static final String TIPO_CREDITO = "TIPO_CREDITO";
	        public static final String PROCESO = "CANTIDAD";
	        public static final String FECHA = "FECHA";
	        public static final String PLAN = "PLAN";
	        public static final String PERFIL_ORIGINAL = "PERFIL_ORIGINAL";
	        public static final String PERFIL_FINAL = "PERFIL_FINAL";
	        public static final String CREDITO_ORIGINAL = "CREDITO_ORIGINAL";
	        public static final String CREDITO_FINAL = "CREDITO_FINAL";
	        public static final String DATOS_ORIGINAL = "DATOS_ORIGINAL";
	        public static final String DATOS_FINAL = "DATOS_FINAL";
	        public static final String VOZ_ORIGINAL = "VOZ_ORIGINAL";
	        public static final String VOZ_FINAL = "VOZ_FINAL";
	        public static final String SMS_ORIGINAL = "SMS_ORIGINAL";
	        public static final String SMS_FINAL = "SMS_FINAL";
	        public static final String TRANSACCION = "TRANSACCION";
	        
	    }
	   
	    @Column(value = Columnas.LINEA, order = 1)
	    private String linea;
	    
	    @Column(value = Columnas.TIPO_CREDITO, order = 2)
	    private String tipo_credito;
	    
	    @Column(value = Columnas.PROCESO, order = 3)
	    private double proceso;

	    @Column(value = Columnas.FECHA, order = 4)
	    private Timestamp fecha;
	    
	    @Column(value = Columnas.PLAN, order = 5)
	    private String plan;
	    
	    @Column(value = Columnas.PERFIL_ORIGINAL, order = 6)
	    private String perfil_original;
	    
	    @Column(value = Columnas.PERFIL_FINAL, order = 7)
	    private String perfil_final;
	    
	    @Column(value = Columnas.CREDITO_ORIGINAL, order = 8)
	    private double credito_original;
	    
	    @Column(value = Columnas.CREDITO_FINAL, order = 9)
	    private double credito_final;

	    @Column(value = Columnas.DATOS_ORIGINAL, order = 10)
	    private double datos_original;
	    
	    @Column(value = Columnas.DATOS_FINAL, order = 11)
	    private double datos_final;
	    
	    @Column(value = Columnas.VOZ_ORIGINAL, order = 12)
	    private double voz_original;
	    
	    @Column(value = Columnas.VOZ_FINAL, order = 13)
	    private double voz_final;

	    @Column(value = Columnas.SMS_ORIGINAL, order = 14)
	    private double sms_original;
	    
	    @Column(value = Columnas.SMS_FINAL, order = 15)
	    private double sms_final;
	    
	    @Column(value = Columnas.TRANSACCION, order = 16)
	    private long transaccion;
	    
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

		public double getProceso() {
			return proceso;
		}

		public void setProceso(double proceso) {
			this.proceso = proceso;
		}

		public Timestamp getFecha() {
			return fecha;
		}

		public void setFecha(Timestamp fecha) {
			this.fecha = fecha;
		}

		public String getPlan() {
			return plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}

		public String getPerfil_original() {
			return perfil_original;
		}

		public void setPerfil_original(String perfil_original) {
			this.perfil_original = perfil_original;
		}

		public String getPerfil_final() {
			return perfil_final;
		}

		public void setPerfil_final(String perfil_final) {
			this.perfil_final = perfil_final;
		}

		public double getCredito_original() {
			return credito_original;
		}

		public void setCredito_original(double credito_original) {
			this.credito_original = credito_original;
		}

		public double getCredito_final() {
			return credito_final;
		}

		public void setCredito_final(double credito_final) {
			this.credito_final = credito_final;
		}

		public double getDatos_original() {
			return datos_original;
		}

		public void setDatos_original(double datos_original) {
			this.datos_original = datos_original;
		}

		public double getDatos_final() {
			return datos_final;
		}

		public void setDatos_final(double datos_final) {
			this.datos_final = datos_final;
		}

		public double getVoz_original() {
			return voz_original;
		}

		public void setVoz_original(double voz_original) {
			this.voz_original = voz_original;
		}

		public double getVoz_final() {
			return voz_final;
		}

		public void setVoz_final(double voz_final) {
			this.voz_final = voz_final;
		}

		public double getSms_original() {
			return sms_original;
		}

		public void setSms_original(double sms_original) {
			this.sms_original = sms_original;
		}

		public double getSms_final() {
			return sms_final;
		}

		public void setSms_final(double sms_final) {
			this.sms_final = sms_final;
		}

		public long getTransaccion() {
			return transaccion;
		}

		public void setTransaccion(long transaccion) {
			this.transaccion = transaccion;
		}
	   
	    
}
