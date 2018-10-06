/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author yrodr
 */
public class Constructores { int numero1;
    public Constructores (){
        System.out.println("Constructos sin parametros");}
    
public Constructores (int a){
        System.out.println("Constructos con un parametro");
        System.out.println(a);}
public Constructores (int a, int b){
        System.out.println("Constructos con dos parametros");
        System.out.println(a + "," + b);}

  
    public static void main(String[] args) {
        Constructores obj1 = new Constructores ();
        Constructores obj2 = new Constructores (8);
        Constructores obj3 = new Constructores (9,16);
    }
    
}
