//Realizar un programa que lea tantos números enteros como desee el usuario y los introduzca en una lista. Muestre la lista e intercambie los números que se encuentren en la 2ª y 4ª posición, y muestre de nuevo la lista por consola. Utilice al menos 3 métodos: uno para introducir los datos, otro para mostrar los datos y otro para intercambiar los datos.

package semana_dos_ejercicios;

import java.util.*;

public class intercambioNumero {

    public static void introducirValores(ArrayList<Integer> listaNumeros) {

        Scanner sc = new Scanner(System.in);
        Integer numero;
        System.out.print("Introduce un numero: ");

        do {
            numero = sc.nextInt();
            listaNumeros.add(numero);
            System.out.print("Introduce otro numero. Para salir introduzca un número negativo: ");
        } while (numero >= 0);

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) < 0) {
                listaNumeros.remove(i);
            }
        }
        sc.close();
    }

    public static void mostrarLista(ArrayList<Integer> listaNumeros) {
        System.out.println("La lista contiene los siguientes números");
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        introducirValores(listaNumeros);
        mostrarLista(listaNumeros);
    }
}