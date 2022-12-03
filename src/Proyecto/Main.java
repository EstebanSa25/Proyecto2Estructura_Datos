package Proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.BreakableNode;
import java.io.IOException;

public class Main {

    static int opcion = 0;
    static int elemento = 0;
    static int num_cajero = 0;
    static int contador_cajero1 = 0, contador_cajero2 = 0, contador_cajero3 = 0, contador_cajero4 = 0;
    static int posicion;
    static int Frente_cajero1 = 0, Frente_cajero2 = 0, Frente_cajero3 = 0, Frente_cajero4 = 0;

    public static void main(String[] args) throws IOException, InterruptedException, Exception {
//        Clasecola cola = new Clasecola();
        Clasecola cajero1 = new Clasecola();
        Clasecola cajero2 = new Clasecola();
        Clasecola cajero3 = new Clasecola();
        Clasecola cajero4 = new Clasecola();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.flush();
            try {
                System.out.println("\n**** Elija una opcion ****");
                System.out.println("1- Ingresar elementos");
                System.out.println("2-Eliminar elementos");
                System.out.println("3- Ver si la cola esta vacia");
                System.out.println("4- Ver el frente de la cola");
                System.out.println("5- Limpiar consola");
                System.out.println("6- Ver si la cola esta llena");
                System.out.println("7-Ver contenido de una cola");
                System.out.println("8- Salir");
                opcion = Integer.parseInt(leer.readLine());

                if (opcion == 1) {

                    int[] Cajeros = new int[]{cajero1.getTamanio_actual(), cajero2.getTamanio_actual(), cajero3.getTamanio_actual(), cajero4.getTamanio_actual()};//arreglo que maneja el tamanio actual de las colas 
                    int menor = Cajeros[0];//Se utiliza para identificar el menor
                    posicion = 0;
                    for (int i = 0; i < 4; i++) {//metodo para saber cual es el menor en caso que todas las colas esten vacias entrara al cajero numero 1 primero y luego ya validaria cual es el menor.
                        if (Cajeros[i] < menor) {
                            menor=Cajeros[i];
                            posicion = i;
                        }
                    }
                    int cajero_mas_vacio = posicion + 1;
                    System.out.println("Se ingreso al cajero mas vacio el #" + cajero_mas_vacio);
                    System.err.print("Digite un elemento: ");
                    elemento = Integer.parseInt(leer.readLine());
                    try {
                        if (posicion == 0) {
                            if (cajero1.Colallena(contador_cajero1)) {
                                System.out.println("lA FILA DEL CAJERO #1 ESTA LLENA");
                            } else {

                                cajero1.insertar(elemento, contador_cajero1);
                                contador_cajero1++;
                                cajero1.setTamanio_actual(cajero1.getTamanio_actual() + 1);
                            }

                        } else if (posicion == 1) {
                            if (cajero2.Colallena(contador_cajero2)) {
                                System.out.println("lA FILA DEL CAJERO #2 ESTA LLENA");
                            } else {
                                cajero2.insertar(elemento, contador_cajero2);
                                contador_cajero2++;
                                cajero2.setTamanio_actual(cajero2.getTamanio_actual() + 1);
                            }
                        } else if (posicion == 2) {
                            if (cajero3.Colallena(contador_cajero3)) {
                                System.out.println("lA FILA DEL CAJERO #3 ESTA LLENA");
                            } else {
                                cajero3.insertar(elemento, contador_cajero3);
                                contador_cajero3++;
                                cajero3.setTamanio_actual(cajero3.getTamanio_actual() + 1);
                            }
                        } else if (posicion == 3) {
                            if (cajero4.Colallena(contador_cajero4)) {
                                System.out.println("lA FILA DEL CAJERO #3 ESTA LLENA");
                            } else {
                                cajero4.insertar(elemento, contador_cajero4);
                                contador_cajero4++;
                                cajero4.setTamanio_actual(cajero4.getTamanio_actual() + 1);
                            }
                        } else {
                            if (cajero1.Colallena(contador_cajero1)) {
                                System.out.println("lA FILA DEL CAJERO #3 ESTA LLENA");
                            } else {
                                cajero1.insertar(elemento, contador_cajero1);
                                contador_cajero1++;
                                cajero1.setTamanio_actual(cajero1.getTamanio_actual() + 1);
                            }
                        }

                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //CIERRE
                    //CIERRE

                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (opcion == 2) {//Es para eliminar elementos de una cola
                System.err.print("Seleccione el numero del cajero: ");
                num_cajero = Integer.parseInt(leer.readLine());
                if (num_cajero == 1) {
                    if (cajero1.ColaVacia(Frente_cajero1)) {
                        System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                    } else {
                        try {
                            Frente_cajero1++;
                            cajero1.setTamanio_actual(cajero1.getTamanio_actual()-1);
                            System.out.println(cajero1.eliminar(Frente_cajero1));
                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else if (num_cajero == 2) {
                    if (cajero2.ColaVacia(Frente_cajero2)) {
                        System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                    } else {
                        try {
                            Frente_cajero2++;
                            cajero2.setTamanio_actual(cajero2.getTamanio_actual()-1);
                            System.out.println(cajero2.eliminar(Frente_cajero2));

                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else if (num_cajero == 3) {
                    if (cajero3.ColaVacia(Frente_cajero3)) {
                        System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                    } else {
                        try {
                            Frente_cajero3++;
                            cajero3.setTamanio_actual(cajero3.getTamanio_actual()-1);
                            System.out.println(cajero3.eliminar(Frente_cajero3));

                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                } else if (num_cajero == 4) {
                    if (cajero4.ColaVacia(Frente_cajero4)) {
                        System.err.println("LA COLA ESTA VACIA NO PUEDE ELIMINAR ELEMENTOS");
                    } else {
                        try {
                            Frente_cajero4++;
                            cajero4.setTamanio_actual(cajero4.getTamanio_actual()-1);
                            System.out.println(cajero4.eliminar(Frente_cajero4));

                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }
            }

            if (opcion == 3) {//Se valida si la cola esta vacia
                System.err.print("Seleccione el numero del cajero: ");
                num_cajero = Integer.parseInt(leer.readLine());
                if (num_cajero == 1) {
                    if (cajero1.ColaVacia(Frente_cajero1)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        System.err.println("LA COLA NO ESTA VACIA");
                    }
                } else if (num_cajero == 2) {

                    if (cajero2.ColaVacia(Frente_cajero2)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        System.err.println("LA COLA NO ESTA VACIA");
                    }
                } else if (num_cajero == 3) {

                    if (cajero3.ColaVacia(Frente_cajero3)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        System.err.println("LA COLA NO ESTA VACIA");
                    }
                } else if (num_cajero == 4) {

                    if (cajero4.ColaVacia(Frente_cajero4)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        System.err.println("LA COLA NO ESTA VACIA");
                    }
                }

            }

            if (opcion == 4) {//funciona para ver el frente de la cola
                System.err.print("Seleccione el numero del cajero: ");
                num_cajero = Integer.parseInt(leer.readLine());
                if (num_cajero == 1) {
                    if (cajero1.ColaVacia(Frente_cajero1)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        try {
                            System.out.println("El frente es: " + cajero1.frente(Frente_cajero1));
                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else if (num_cajero == 2) {
                    if (cajero2.ColaVacia(Frente_cajero2)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        try {
                            System.out.println("El frente es: " + cajero2.frente(Frente_cajero2));
                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else if (num_cajero == 3) {
                    if (cajero3.ColaVacia(Frente_cajero3)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        try {
                            System.out.println("El frente es: " + cajero3.frente(Frente_cajero3));
                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else if (num_cajero == 4) {
                    if (cajero4.ColaVacia(Frente_cajero4)) {
                        System.err.println("LA COLA ESTA VACIA");
                    } else {
                        try {
                            System.out.println("El frente es: " + cajero4.frente(Frente_cajero4));
                        } catch (Exception ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            }

            if (opcion == 5) {
              System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//No encontre otro metodo que me funcionara en java
              //Profe si usted conoce un metodo o forma de limpiar la consola me gustaria que me lo comentara ya que ningun metodo de internet me funciono.
              
            }

            if (opcion == 6) {//Opcion para ver si la cola esta llena
                System.err.print("Seleccione el numero del cajero: ");
                num_cajero = Integer.parseInt(leer.readLine());
                if (num_cajero == 1) {
                    if (cajero1.Colallena(contador_cajero1)) {
                        System.err.println("LA COLA ESTA LLENA");
                        System.out.println("La cola posee los siguientes valores:\n");
                        cajero1.MostrarContenido();
                    } else {
                        System.err.println("LA COLA NO ESTA LLENA");
                    }
                } else if (num_cajero == 2) {
                    if (cajero2.Colallena(contador_cajero2)) {
                        System.err.println("LA COLA ESTA LLENA");
                         System.out.println("La cola posee los siguientes valores:\n");
                        cajero2.MostrarContenido();
                    } else {
                        System.err.println("LA COLA NO ESTA LLENA");
                    }

                } else if (num_cajero == 3) {
                    if (cajero3.Colallena(contador_cajero3)) {
                        System.err.println("LA COLA ESTA LLENA");
                         System.out.println("La cola posee los siguientes valores:\n");
                        cajero3.MostrarContenido();
                    } else {
                        System.err.println("LA COLA NO ESTA LLENA");
                    }
                } else if (num_cajero == 4) {
                    if (cajero4.Colallena(contador_cajero4)) {
                        System.err.println("LA COLA ESTA LLENA");
                         System.out.println("La cola posee los siguientes valores:\n");
                        cajero4.MostrarContenido();
                    } else {
                        System.err.println("LA COLA NO ESTA LLENA");
                    }
                }
            }
            if (opcion == 7) {//Funciona para ver Contenido de una cola
                System.err.print("Seleccione el numero del cajero: ");
                num_cajero = Integer.parseInt(leer.readLine());
                if (num_cajero == 1) {
                    cajero1.MostrarContenido();
                } else if (num_cajero == 2) {
                    cajero2.MostrarContenido();
                } else if (num_cajero == 3) {
                    cajero3.MostrarContenido();
                } else if (num_cajero == 4) {
                    cajero4.MostrarContenido();
                } else {
                    System.out.println("Este cajero no existe");
                }
            }
            System.out.println("---------------------------------------");
if(opcion!=1&&opcion!=2&&opcion!=3&&opcion!=4&&opcion!=5&&opcion!=6&&opcion!=7&&opcion!=8){
        System.out.println("Esta opcion no existe");
        }
        } while (opcion != 8);

    }

}
