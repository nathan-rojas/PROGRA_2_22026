/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author F20LAB207E18
 */

import java.util.Scanner;
import modelo.operaciones;


public class Trabajo01 {
   

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        operaciones operacion =new operaciones();
        System.out.println("Ingrese primer valor:");
        int numero=teclado.nextInt();
        operacion.setOperador1(numero);
        System.out.println("Ingrese segundo valor:");
        numero=teclado.nextInt();
        operacion.setOperador2(numero);
        System.out.println("la suma es "+ operacion.sumar());
        System.out.println("la multiplicacion es "+ operacion.multiplicar());
        System.out.println("la resta es "+ operacion.restar());

    }
}
