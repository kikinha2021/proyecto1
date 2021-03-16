
/*1. La clase forma parte del paquete cuentas*/
/*Este proyecto esta reflejado los ejercicios 1,2,3,4,5,6,7,8 y 9 */
/*https://github.com/kikinha2021/proyecto1.git*/


package cuentas;

/**
 *
 * @author Erika Machado de Lima
 * @version 1.0 febrero_2021
 */


public class CCuenta {
  
     /*Se instancia las variables utilando private */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
      /*Constructor por defecto */
    public CCuenta()
    {
    }

    
      /*Constructor por parametros*/
     
     /**      
      * @param nombre  nombre de la persona
      * @param cuenta se refiere la cuenta 
      * @param saldo  el saldo que tendra el cliente 
      * @param tipoInterés el tiepo de interes de la cuenta
      */
    
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
    this.nombre = nombre;
    this.cuenta = cuenta;
    this.saldo = saldo;
    this.tipoInterés = tipoInterés;
  }

   /*Añadimos los getter y setter */
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


    
    
    /**
     * *@return .Devuelve el saldo actual
     * 
     */
    

    public double estado()
    {
        return saldo;
    }

    
       /*@throws Exception , ha una llamada a Exception y lanzara la excepcion correspodiente
       *al error encontrado
        */
    
       /**
       * @param cantidad hace referencia la cantidad que va ingresar la cuenta 
       *
       */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
  
    
    
       /**
       * @param cantidad hace referencia la cantidad que va retirar la cuenta 
       */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    
    /*3. Introduccion el metodo operativa_cuenta*/
    /*5. Se añade un parametro cantida tipo float y creamos algo para probar con el objeto*/
    public void  operativa_cuenta(double cantidad){
      
      System.out.println("Datos de la cuenta ");
      
      /*. Creo una salida aqui para probar las modificacione con git*/
      System.out.println("prueba para Git ");
      System.out.println("Nombre del cliente "+nombre);
      System.out.println("Cuenta Bancaria "+cuenta);
      System.out.println("Su saldo actual es : "+saldo);
      
      if( cantidad > 1000) {
        
        System.out.println("Has ultrapasado su limite de retirada, maximo 1000");
      }
      
      else {
        saldo = saldo - cantidad;
        System.out.println("Su saldo actual es"+saldo);
      }
      
     
      
      
    }
   
    public void prueba(){
      
    }
    
    
}
