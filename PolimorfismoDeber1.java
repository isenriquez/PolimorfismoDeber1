/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismodeber1;

/**
 *
 * @author cliente
 */
class Gasolina{

    public void ProducirEvaporacion() {
        System.out.println("Porcentaje evaporado");
    }
    public void EspecificarTemperatura(){
         System.out.println("Temperatura de evaporación");
    }
}

class Tipo1 extends Gasolina{

    public void ProducirEvaporacion() {
        System.out.println("10% del volumen utilizado");
    }
    public void EspecificarTemperatura(){
         System.out.println("10ºC de temperatura");
    }
}

class Tipo2 extends Gasolina {

    public void ProducirEvaporacion() {
        System.out.println("20%");
    }
    public void EspecificarTemperatura(){
         System.out.println("20ºC de temperatura");
    }
}
class Tipo3 extends Gasolina {

    public void ProducirEvaporacion() {
        System.out.println("30%");
    }
    public void EspecificarTemperatura(){
         System.out.println("30ºC de temperatura");
    }
}
class Tipo4 extends Gasolina {

    public void ProducirEvaporacion() {
        System.out.println("40%");
    }
    public void EspecificarTemperatura(){
         System.out.println("40ºC de temperatura");
    }
}
class Tipo5 extends Gasolina {

    public void ProducirEvaporacion() {
        System.out.println("50%");
    }
    public void EspecificarTemperatura(){
         System.out.println("50ºC de temperatura");
    }
}
class Tipo6 extends Gasolina {

    public void ProducirEvaporacion() {
        System.out.println("60%");
    }
    public void EspecificarTemperatura(){
         System.out.println("60ºC de temperatura");
    }
}
public class PolimorfismoDeber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE - LATACUNGA\n");
        System.out.println("Nombre: Enríquez Armendariz Israel Sebastian");
        System.out.println("Asignatura: Programación");
        System.out.println("Nrc: 7450");
        System.out.println("Tema: Polimorfismo");

        Gasolina Ob1 = new Tipo1();
        Gasolina Ob2 = new Tipo2();
        Gasolina Ob3 = new Tipo3();
        Gasolina Ob4 = new Tipo4();
        Gasolina Ob5 = new Tipo5();
        Gasolina Ob6 = new Tipo6();


        System.out.println("*Gasolina: Tipo 1");
        System.out.println("Se a evaporado en un:");
        Ob1.ProducirEvaporacion();
        System.out.println("Teniendo en cuenta que esta a:");
        Ob1.EspecificarTemperatura();
        System.out.println("");

        System.out.println("*Gasolina: Tipo 2");
        System.out.println("Se a evaporado en un:");
        Ob2.ProducirEvaporacion();
        System.out.println("Teniendo en cuenta que esta a:");
        Ob2.EspecificarTemperatura();
        System.out.println("");

        System.out.println("*Gasolina: Tipo 3");
        System.out.println("Se a evaporado en un:");
        Ob3.ProducirEvaporacion();
        System.out.println("Teniendo en cuenta que esta a:");
        Ob3.EspecificarTemperatura();
        System.out.println("");

        System.out.println("*Gasolina: Tipo 4");
        System.out.println("Se a evaporado en un:");
        Ob4.ProducirEvaporacion();
        System.out.println("Teniendo en cuenta que esta a:");
        Ob4.EspecificarTemperatura();
        System.out.println("");

        System.out.println("*Gasolina: Tipo 5");
        System.out.println("Se a evaporado en un:");
        Ob5.ProducirEvaporacion();
        System.out.println("Teniendo en cuenta que esta a:");
        Ob5.EspecificarTemperatura();
        System.out.println("");

        System.out.println("*Gasolina: Tipo 6");
        System.out.println("Se a evaporado en un:");
        Ob6.ProducirEvaporacion();
        System.out.println("Teniendo en cuenta que esta a:");
        Ob6.EspecificarTemperatura();

    }

}
