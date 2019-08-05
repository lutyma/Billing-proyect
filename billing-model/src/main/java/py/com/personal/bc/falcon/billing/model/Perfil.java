package py.com.personal.bc.falcon.billing.model;

import py.com.personal.bc.voltdb.utils.annotations.*;

@Table("ls_perfiles")
@ID({
        Perfil.Columnas.CREDITO
})

public class Perfil {

	 public static class Columnas {
	        public static final String CREDITO = "CREDITO";
	        public static final String VOZ = "VOZ";
	        public static final String SMS = "SMS";
	        public static final String DATOS = "DATOS ";
	        public static final String PERFIL = "PERFIL";
	    }
	    
	    @Column(value = Columnas.CREDITO, order = 1)
	    private String credito;
	    
	    @Column(value = Columnas.VOZ, order = 2)
	    private String voz;
	    
	    @Column(value = Columnas.SMS, order = 3)
	    private String sms;

	    @Column(value = Columnas.DATOS, order = 4)
	    private String datos;
	    
	    @Column(value = Columnas.PERFIL, order = 5)
	    private String perfil;
	    
		public String getCredito() {
			return credito;
		}

		public void setCredito(String credito) {
			this.credito = credito;
		}

		public String getVoz() {
			return voz;
		}

		public void setVoz(String voz) {
			this.voz = voz;
		}

		public String getSms() {
			return sms;
		}

		public void setSms(String sms) {
			this.sms = sms;
		}

		public String getDatos() {
			return datos;
		}

		public void setDatos(String datos) {
			this.datos = datos;
		}

		public String getPerfil() {
			return perfil;
		}

		public void setPerfil(String perfil) {
			this.perfil = perfil;
		}    
	
}
