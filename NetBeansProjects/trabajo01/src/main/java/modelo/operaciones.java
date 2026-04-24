/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author F20LAB207E18
 */
public class operaciones {
     private int operador1;
    private int operador2;

    public operaciones(int operador1) {
        this.operador1 = operador1;
    }

    public operaciones() {
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
    public int sumar(){
        return operador1+operador2;
    }
    public int multiplicar(){
        return operador1*operador2;
    }
    public int restar(){
        return operador1-operador2;
    }
    
}
