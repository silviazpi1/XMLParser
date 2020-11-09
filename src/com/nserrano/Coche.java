package com.nserrano;

public class Coche {

    private int attr_id;
    private String marca;
    private String modelo;
    private float cilindrada;

    public int getAttr_id() {
        return attr_id;
    }

    public void setAttr_id(int attr_id) {
        this.attr_id = attr_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Coche() {};

    public Coche(int attr_id, String marca, String modelo, int cilindrada) {
        this.attr_id = attr_id;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }
}
