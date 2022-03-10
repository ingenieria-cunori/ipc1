/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.cunori.practica05;

import java.util.Scanner;

/**
 *
 * @author hendrick
 */
public class Practica05 {

    public static void main(String[] args) {
        /*
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido

        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        String name = sc.nextLine();

        // entrada de un carácter
        char gender = sc.next().charAt(0);

        // Entrada de datos numéricos
        // byte, short y float
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre: " + name);
        System.out.println("Género: " + gender);
        System.out.println("Edad: " + age);
        System.out.println("Teléfono: " + mobileNo);
        System.out.println("Promedio: " + average);
         */
        /**
         * Métodos de la clase String.
         */
        //length() = retorna el largo de la cadena
        String s1 = "Bienvenidos";
        System.out.println(s1.length());

        //isEmpty() = retorna true si y solo si el largo es 0
        System.out.println(s1.isEmpty());

        //toUpperCase() = convierte todos los caracteres a mayúscula
        System.out.println(s1.toUpperCase());

        //toLoweCase() = convierte todos los caracteres a minúscula
        System.out.println(s1.toLowerCase());

        //charAt(int index) = retorna el caracter indicado de la cadena
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        //equals(Object anObject) = compara dos cadenas
        String s2 = "Bienvenidos";
        String s3 = new String("Bienvenidos");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        //equalsIgnoreCase(String anotherString) = compara e ignora la 
        //capitalización
        String s4 = "bienvenidos";
        System.out.println(s1.equalsIgnoreCase(s4));

        //contains(CharSequence s) = retorna true si y solo si contiene una
        //secuencia específica de chars.
        System.out.println(s1.contains("env"));

        //compareTo(String anotherString) = compara dos cadenas lexicográficamente
        String s5 = "Hola";
        System.out.println(s1.compareTo(s5));

        //indexOf(String str) = retorna el indice con la primera ocurrencia        
        System.out.println(s1.indexOf("env"));

        /*subString(int beginIndex) = retorna una fragmento de la cadena a
        partir del índice de inicio*/
        String s6 = "env";
        System.out.println(s1.substring(s1.indexOf(s6)));
        
        /*subString(int beginIndex, int endIndex) = retorna una fragmento de la 
        cadena a partir del índice de inicio y fin*/
        System.out.println(s1.substring(s1.indexOf(s6),s1.length()-2));
    }
}
