import java.util.Vector;

public class Revista extends Manuscris {

  public String postfata;

  public String titlu;

  public Integer data_aparitie;

  public Integer nr_pagini;

  public String prefata;

  public Integer editie;

  public Integer nr_volume;

  public String cod;

  public Integer pret;

    /**
   * 
   * @element-type Autor
   */
  public Vector  myAutor;
    public Editura myEditura;
    /**
   * 
   * @element-type Coperta
   */
  public Vector  myCoperta;
    public Vector  mycolectie;
    /**
   * 
   * @element-type colectie
   */
  public Vector  mycolectie;
  
}