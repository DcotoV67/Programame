package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        int bloques = 0;
        int anterior = 0;
        int numero = 0;
        int comparamayor = 1;
        int mayor = 0;

        Scanner in = new Scanner(System.in);

        numero = in.nextInt();

        while (numero != 0) {
            anterior = numero;
            numero = in.nextInt();

            if (numero != anterior) {
                bloques++;
                if (numero !=0) {
                    comparamayor = 1;
                }

            }
            else{
                comparamayor++;
                if (comparamayor>mayor) {
                    mayor = comparamayor;
                }

            }
        }

        System.out.println(bloques);
        System.out.println(mayor);

    }
}