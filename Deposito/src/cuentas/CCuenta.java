/**
 * Paquete Tarea ED04
 */

package cuentas;


/**
 * Clase CCuenta con un constructor para crear objetos de esta clase y 2 métodos, para ingresar o retirar una cantidad del atributo saldo. 
 * @author Elsa
 * @version 06/03/2022
 */
public class CCuenta {
    //Declaración atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * 1er Contructor.
     * Método que se llama automáticamente cada vez que se crea un objeto de la Clase CCuenta.
     * Reserva memoria e inicializa las variables miembro de la Clase.
     * No tiene valor de retorno.
     * El nombre del Constructor es el mismo que el de la Clase.
    */
    public CCuenta()
    {
    }
    
    /**
     * 2º Contructor.
     * Método que se llama automáticamente cada vez que se crea un objeto de la Clase CCuenta.
     * Reserva memoria e inicializa las variables miembro de la Clase.
     * No tiene valor de retorno.
     * El nombre del Constructor es el mismo que el de la Clase.
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método asignarNombre para asignar un nombre.
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Método obtenerNombre, para obtener el nombre.
     * @return String con el nombre.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Métodp estado, para conover el saldo.
     * @return double con el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }

    
    /**
     * Método ingresar, aumenta el saldo en la cantidad introducida por parámetro.
     * @param cantidad
     * @throws Exception si la cantidad a ingresar es menor a 0.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método retirar, decrementa el saldo en la cantidad introducida por parámetro.
     * @param cantidad
     * @throws Exception si la cantidad es menor o igual a 0 o si el saldo es menor a la cantidad.
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
     * Método obteberCuenta, para obtener la cuenta.
     * @return String con la cuenta.
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método getNombre, para obtener el nombre.
     * @return String con el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre, modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método getTipoInteres, obtiene el tipo de interés
     * @return double con el tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setTipoInteres, para modificar el tipo de interés.
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
     /**
      * Método getCuenta, para obtener la cuenta
     * @return String con la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setCuenta, modifica la cuenta.
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getSaldo, obtiene el saldo.
     * @return double con el saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setSaldo, modifica el saldo.
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
