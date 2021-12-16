package com.diego.bernal.ciclo4_app_v1.Modelo;


/**
 * @author danielme.com
 */
public class Color {

  private final String name;
  private final String hex;

  public Color(String name, String hex) {
    this.hex = hex;
    this.name = name;
  }

  public String getName() {
    return name;
  }


  public String getHex() {
    return hex;
  }

}
