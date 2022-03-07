/**
 * Paquete Tarea ED04
 */
package cuentas;

/**
 * Clase Main para crear los objetos de la Clase CCuenta y operar con sus métodos.
 * @author Elsa
 * @version 06/03/2022
 */
public class Main {

    /**
     * Método main
     * @param args sin argumentos
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    
    /**
     * Método operativa_cuenta crea los objetos de la clase cuenta y opera con ellos.
     * @param cantidad
     */
    public static void operativa_cuenta(float cantidad) {
        //Declaramos objeto cuenta1 y variable saldoActual
        CCuenta cuenta1;
        double saldoActual;
        
        //Inicializamos
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
    }

}
