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
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //_______________Ejercicio 2_______________
     //  Camabiamos la variabe que estaba antes ( miCuenta ) para cuenta1 
       CCuenta cuenta1;
       double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
        // Ejercicio 3 - He creado un metodo que saca todos los datos en el objeto cuenta1
        cuenta1.operativa_cuenta(200);
        
    }
}


    
    