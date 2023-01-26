package org.example;

public class Invitado {

    //atributos=variables

    int edad;
    boolean sexo;
    String nombre;
    double valorEntrada;



    //metodos=metodos


    //metodos especiales

    public Invitado() {

    }

    public Invitado(int dato1, boolean dato2, String dato3, double dato4) {
        this.edad = dato1;
        this.sexo = dato2;
        this.nombre = dato3;
        this.valorEntrada = dato4;
    }

    public Invitado(String nombre) {
        this.nombre = nombre;
    }
    //metodos ordinarios


}
