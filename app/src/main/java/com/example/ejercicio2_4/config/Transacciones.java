package com.example.ejercicio2_4.config;



public class Transacciones
{

    public static final String NameDatabase = "PM01DB";
    public static final int versionDatabase=1;
    public static final String tablapersonasfirm = "PersonaFirm";
    public static final String descripciones = "descripciones";
    public static final String firmas = "firmas";

    public static final String createTablePersonasFirm = "CREATE TABLE " + tablapersonasfirm +
            "(descripciones TEXT, firmas BLOB)";
    public static final String dropTablePersonasFirm = "DROP TABLE IF EXIST" + tablapersonasfirm;


}