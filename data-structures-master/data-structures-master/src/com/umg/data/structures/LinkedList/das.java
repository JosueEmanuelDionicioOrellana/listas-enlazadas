package com.umg.data.structures.LinkedList;


import java.util.Scanner;

public class das
{
    public static void main(String[] args)
    {
        // Declarar el objeto e inicializar con
        // el objeto de entrada est�ndar predefinido

        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        String name = sc.nextLine();

        // entrada de un car�cter
        char gender = sc.next().charAt(0);

        // Entrada de datos num�ricos
        // byte, short y float
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: "+name);
        System.out.println("G�nero: "+gender);
        System.out.println("Edad: "+age);
        System.out.println("Tel�fono: "+mobileNo);
        System.out.println("Promedio: "+average);
    }
}