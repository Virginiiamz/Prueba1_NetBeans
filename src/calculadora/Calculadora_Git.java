/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Lenovo
 */
public class Calculadora_Git {

    private String nombre;
    private double numero1;
    private double numero2;

    public Calculadora_Git(String nombre, double numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora_Git(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora_Git() {

    }

    // sets and gets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //métodos aritméticos
    public double suma() {
        double suma = numero1 + numero2;
        return suma;
    }

    public double resta() {
        double resta = numero1 - numero2;
        return resta;
    }

    public double multiplicacion() {
        double multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public double division() {
        double division = numero1 / numero2;
        return division;
    }
}
