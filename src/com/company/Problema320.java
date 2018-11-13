package com.company;

import java.util.Scanner;

public class Problema320 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos; //numero de casos
        int actual = 0; //numero actual de casos
        int nieve; //nieve por palmera
        int palmeras; //cantidad de palmeras
        int aguantan;
        int posicion = 0;
        int[] fila;
        int i;


        casos = in.nextInt();

        while(actual != casos) {

            actual++;

            aguantan = 0;

            nieve = in.nextInt();

            palmeras = in.nextInt();

            fila = new int[palmeras];

            for (i = 0; i < fila.length; i++) {
                fila[i] = in.nextInt();
            }

            for (i = 0; i < fila.length; i++) {
                if (fila[i] < nieve) {
                    fila[i] = 0;
                }
            }

            for (i = 0; i < fila.length; i++) {

                        if (fila[i] != 0 && aguantan != 5) {
                            aguantan++;

                        }
                    }


            System.out.println(posicion);
        }
    }
}