/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Esta clase simula el comportamiento de una cuenta bancaria  
 * @author adilm
 * @version 1.0
 * @since 07/04/2023
 */
public class CCuenta {

/**
 * Los atributos de la clase
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double TipoInteres;
/**
 * constructor
 */
    public CCuenta()
    {
    }
/**
 * constructor con los parametros:
 * @param nom tipo string, nombre del titular
 * @param cue tipo string, numero de cuenta
 * @param sal tipo double, saldo de la cuenta
 * @param tipo tipo double, tipo de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * @return el saldo de la cuenta 
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * 
 * @param cantidad a ingresar en la cuenta
 * @throws Exception devuelta en caso de que se ingrese unacantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad a retirar de la cuenta
 * @throws Exception devuelta en caso de que se haya puesto una cantidad>saldo o negativa
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return el nombre del titular de cuenta
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre del titular a pasarle como parametro 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * 
     * @param cuenta , el numero de cuenta a pasarle como parametro
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /** 
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param saldo de cuenta a pasrle como parametro
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * @return el tipo de enteres 
     */
    public double getTipoInteres() {
        return TipoInteres;
    }
    /**
     * 
     * @param TipoInteres a pasarle como parametro
     */
    public void setTipoInteres(double TipoInteres) {
        this.TipoInteres = TipoInteres;
    }
}

