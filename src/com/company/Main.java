package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pilas p = new  Pilas ();

        Scanner sc = new Scanner(System.in);


        String insertar = "1.Insertar",mostrar ="2.Mostrar",buscar="3.Buscar",
                eliminar = "4.Eliminar",contar="5.Contar",maximo="6.Valor Maximo",minimo="7.Valor Minimo";

        boolean salir = false;
          int min = 10000;
          int max = 0;


        while (!salir){
            System.out.println("          Bienvenido");
            System.out.println(" " );
            System.out.println("**********************************");
            System.out.println("1.Insertar");
            System.out.println("2.Mostrar");
            System.out.println("3.Buscar");
            System.out.println("4.Eliminar");
            System.out.println("5.Contar");
            System.out.println("6.Valor Maximo");
            System.out.println("7.Valor Minimo");
            System.out.println("8.Salir");
            System.out.println("**********************************");
            System.out.println(" " );

            System.out.println("Elige una opción de nuestro menú");
            int opcion = sc.nextInt();
            System.out.println(" " );

            try{


                switch (opcion){
                    case 1:
                        System.out.println("**********************************");

                        System.out.println("Tamaño de la pila " );
                        int tamaño = sc.nextInt();

                        for (int i=0; i<tamaño; i++ ) {
                            System.out.println("Inserta Valor ");
                            int valor = sc.nextInt();
                            p.push(valor);

                            System.out.println("**********************************");
                            System.out.println(" " );

                            if (valor< min){
                                min = valor;
                            }
                            if (valor > max){
                                max = valor;
                            }
                        }


                        break;

                   case 2:
                       if (p.vacia()){
                           System.out.println("La lista esta vacia no puedes Mostrar los elementos ");
                       }else {
                           System.out.println("**********************************");
                           p.peek();

                           System.out.println("**********************************");
                           System.out.println(" ");
                           break;
                       }
                       break;
                     case 3:
                         if(p.vacia()) {
                             System.out.println("La lista esta vacia no puedes buscar elementos ");
                         }
                         else
                         {
                             System.out.println("**********************************");

                             System.out.println("Inserta el valor que deseas buscar ");
                             int valor1 = sc.nextInt();
                             p.cima(valor1);
                             System.out.println("\n");
                         }

                        break;

                    case 4:
                        if(p.vacia()){
                            System.out.println("La lista esta vacia no puedes eliminar elementos ");
                        }
                        else {
                            System.out.println("**********************************");
                            int Sig1;
                            System.out.println("Inserta el Numero que deseas Eliminar ");
                            Sig1 = sc.nextInt();
                            p.borrar(Sig1);
                            System.out.println("\n");
                        }



                        break;
                    case 5:
                        if(p.vacia()){
                        System.out.println("La lista esta vacia no hay elementos ");
                    }
                    else {
                            System.out.println("**********************************");
                            System.out.println("\nEl total de elementos es de :" + p.pop());
                            System.out.println("**********************************");
                            System.out.println(" ");
                        }
                        break;

                    case 6:
                        if(p.vacia()){
                            System.out.println("La lista esta vacia no hay elementos ");
                        }else {
                            System.out.println("**********************************");
                            System.out.println("\nEl Valor Maximo es:" + max);
                            System.out.println("**********************************");
                            System.out.println(" ");
                        }
                        break;

                    case 7:
                        if(p.vacia()){
                            System.out.println("La lista esta vacia no hay elementos ");
                        }else {
                            System.out.println("**********************************");
                            System.out.println("\nEl Valor Minimo es:" + min);
                            System.out.println("**********************************");
                            System.out.println(" ");
                        }
                        break;

                    case 8:
                        salir = true;
                        System.out.println("**********************************");
                        System.out.println("Vuelve Pronto Amiguto :*" );
                        System.out.println("**********************************");
                        break;


                    default:
                        System.out.println("**********************************");
                        System.out.println("Solo numeros entre 1 y 6");
                        System.out.println("**********************************");
                }
            }catch (InputMismatchException e){
                System.out.println("**********************************");
                System.out.println("Solo se permiten numeros");
                sc.next();
                System.out.println("**********************************");
            }
        }







    }


    }

