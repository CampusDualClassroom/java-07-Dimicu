package com.campusdual.classroom;


import java.util.*;


public class Exercise07 {

    public static void main(String[] args) {

        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(10);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {


        ArrayList<Integer> listaNumeros;
        listaNumeros = new ArrayList<>(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));


        if (listaNumeros.contains(num)) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + listaNumeros.indexOf(num));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {

        int contador = 0;
        int suma = 0;
        do {
            suma += contador;
            contador++;
        } while (contador <= num);
        System.out.println("la suma de los primeros " + num + " números positivos" + suma);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {

        int contador = 0;

        do {

            contador++;
            System.out.println(contador);
        } while (contador < num);


    }

}

