package com.example.proyectopokemon;

public class cPokemon {

    private int id;
    private String nombre;
    private String numero_pokedex;
    private String descripcion;
    private String tipo1;
    private String tipo2;
    private double altura;
    private double peso;
    private String habilidad;
    private String habilidad_oculta;
    private String especie;
    private String link_pokedex;
    private String fotografia;



    public cPokemon(int iId, String sNombre, String sNumero_pokedex, String sDescripcion, String sTipo1, String sTipo2, double sAltura, double sPeso, String sHabilidad, String sHabilidad_Oculta, String sEspecie, String sLink_pokedex, String sFoto) {

        id = iId;
        nombre = sNombre;
        numero_pokedex = sNumero_pokedex;
        descripcion = sDescripcion;
        tipo1 = sTipo1;
        tipo2 = sTipo2;
        altura = sAltura;
        peso = sPeso;
        habilidad = sHabilidad;
        habilidad_oculta = sHabilidad_Oculta;
        especie = sEspecie;
        link_pokedex = sLink_pokedex;
        fotografia = sFoto;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero_pokedex() {
        return numero_pokedex;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getHabilidad_oculta() {
        return habilidad_oculta;
    }

    public String getEspecie() {
        return especie;
    }

    public String getLink_pokedex() {
        return link_pokedex;
    }

    public String getFotografia() {
        return fotografia;
    }

 /*   public Boolean getRandom() {
        return random;
    }

    public void setRandom(Boolean random) {
        this.random = random;
    }

  */
}
