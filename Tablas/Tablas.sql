CREATE TABLE ls_bolsa (
   linea varchar(12) NOT NULL,
   tipo_credito varchar(1),
   cantidad FLOAT,
   fecha_actualizacion timestamp,
   ultima_transaccion bigint,
   ultimo_proceso varchar(20),
   PRIMARY KEY(linea)
);
PARTITION TABLE ls_bolsa ON COLUMN linea;

CREATE TABLE ls_linea (
   linea varchar(12) NOT NULL,
   perfil varchar(10),
   actualizacion_perfil timestamp,
   PRIMARY KEY(linea)
);
PARTITION TABLE ls_linea ON COLUMN linea;

CREATE TABLE ls_planes_x_linea (
   linea varchar(12) NOT NULL,
   plan varchar(2),
   PRIMARY KEY(linea)
);
PARTITION TABLE ls_planes_x_linea ON COLUMN linea;

CREATE TABLE ls_precios (
   plan_id varchar(2),
   tipo_credito varchar(1),
   precio FLOAT,
   PRIMARY KEY(plan_id)
);

CREATE TABLE ls_perfiles (
   credito varchar(1),
   voz varchar(1), 
   sms varchar(1), 
   datos varchar(1),
   perfil varchar(10),
   PRIMARY KEY(credito)
);

CREATE TABLE ls_historial_operaciones (
   linea varchar(12) NOT NULL,
   tipo_credito varchar(1),
   proceso varchar(20),
   fecha timestamp,
   plan varchar(2),
   perfil_original varchar(10),
   perfil_final varchar(10),
   credito_original FLOAT,
   credito_final FLOAT,
   datos_original FLOAT,
   datos_final FLOAT,
   voz_original FLOAT,
   voz_final FLOAT,
   sms_original FLOAT,
   sms_final FLOAT,
   transaccion bigint,
   PRIMARY KEY(linea)
);
PARTITION TABLE ls_historial_operaciones ON COLUMN linea;