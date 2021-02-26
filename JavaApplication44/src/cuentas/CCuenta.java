/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author PERSONAL
 */
public class CCuenta {
  
 private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    
    //________________Ejercicio 4 _______________________
    // Se encapsula los atributos de la classe CCuenta
    // Se verifica que las variables estan encapsuladas utilizando private 
    // Se genera los metodos get y setter 
  public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
    this.nombre = nombre;
    this.cuenta = cuenta;
    this.saldo = saldo;
    this.tipoInterés = tipoInterés;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCuenta() {
    return cuenta;
  }

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getTipoInterés() {
    return tipoInterés;
  }

  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }


    
    
    
    
    
    

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    //_______________Ejercicio 3_______________
    //_______________Ejercicio 5_______________
    // - Introducir operativa_cuenta que englobe las sentencias de la clase Main que operan con
    // el objeto cuenta1 - He creado un metodo cualquiera solo para interagir con el objeto en la clase Main
    // Añadimos un nuevo parametro al metodo operativa_cantidad y de tipo float 
    public void  operativa_cuenta(double cantidad){
      
      System.out.println("Datos de la cuenta ");
      System.out.println("Nombre del cliente "+nombre);
      System.out.println("Cuenta Bancaria "+cuenta);
      System.out.println("Su saldo actual es : "+saldo);
      
    }
   
    
}

