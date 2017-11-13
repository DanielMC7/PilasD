package com.company;
import java.util.Scanner;

/**
 * Created by danippp on 08/11/2017.
 */
public class Pilas {

    Scanner sc = new Scanner(System.in);
    private Nodo top;
    int size;


    public Pilas (){
        top = null;
    }
    public boolean vacia (){
        return ( top == null);
    }

    public void push (int valor){
        Nodo nuevoNodo;
        if(vacia())
            top = new Nodo(valor);
        else{
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }


    public void eliminar(int eliminar) {//elimina
        Nodo temp = top;

        try {

            if (temp.getValor() == eliminar) {

                top = temp.getProx();

            } else {
                while (temp != null) {
                    if (temp.getProx().getValor() == eliminar) {
                        temp.Unir(temp.getProx().getProx());
                        size--;
                        break;
                    }

                    temp = temp.getProx();
                }}
            System.out.println("Valor eliminado:");
        }
        catch (Exception ex)
        {
            System.out.println("El elemento no ha sido encontrado");
        }
    }




    public void peek () {//mostrar
        Nodo temp = top;
        if (temp != null){
            System.out.println("La pila es:");
            while (temp != null){
                System.out.println(temp.getValor());
                temp = temp.getProx();
            }
        }
        else
            System.out.println("Pila Vacía");
    }




    public void cima(int busqueda) {//busca


try {
    Nodo temp = top;
    int posicion = 1;


    if (temp.getValor() == busqueda) {
        System.out.println("El valor esta en la posición 0");
    } else {
        while (temp != null) {
            if (temp.getProx().getValor() == busqueda) {
                System.out.println("valor en la posicion:" + posicion);
                break;
            }
            posicion++;
            temp = temp.getProx();
        }}
}
catch (Exception ex)
{
    System.out.println("El elemento no ha sido encontrado");
}
    }




    public int size (){
        return size;
    }

    public int pop (){//contar
        Nodo aux = null;
        int i=0;
        aux = top;
        while(aux != null){
            aux = aux.getProx();
            i++;
        }
        return i;
    }



}


