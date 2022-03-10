/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunori.tipos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hendrick
 */
public class Tipos {

    /**
     * TIPOS DE DATOS PRIMITIVOS, En Java existen cuatro tipos destinados a
     * almacenar números enteros. La única diferencia entre ellos es el número
     * de bytes usados para su almacenamiento y, en consecuencia, el rango de
     * valores que es posible representar con ellos. Todos ellos emplean una
     * representación que permite el almacenamiento de números negativos y
     * positivos. El nombre y características de estos tipos son los siguientes:
     * byte: como su propio nombre denota, emplea un solo byte (8 bits) de
     * almacenamiento. Esto permite almacenar valores en el rango [-128, 127].
     * short: usa el doble de almacenamiento que el anterior, lo cual hace
     * posible representar cualquier valor en el rango [-32.768, 32.767]. int:
     * emplea 4 bytes de almacenamiento y es el tipo de dato entero más
     * empleado. El rango de valores que puede representar va de -2^31 a 2^31-1.
     * long: es el tipo entero de mayor tamaño, 8 bytes (64 bits), con un rango
     * de valores desde -2^63 a 2^63-1.
     */
    private byte b = 127;
    private short s = 32767;
    private int i = 2147483647;
    private long l = 922337203700000000l;

    /**
     * Los tipos numéricos en punto flotante permiten representar números tanto
     * muy grandes como muy pequeños además de números decimales. Java dispone
     * de 2 tipos concretos en esta categoría: float: conocido como tipo de
     * precisión simple, emplea un total de 32 bits. Con este tipo de datos es
     * posible representar números en el rango de 1.4x10^-45 a 3.4028235x10^38.
     * double: sigue un esquema de almacenamiento similar al anterior, pero
     * usando 64 bits en lugar de 32. Esto le permite representar valores en el
     * rango de 4.9x10-^324 a 1.7976931348623157x10^308.
     */
    private float f = 3.141598784545f;
    private double d = 3.1415986564546484546256549875465;

    /**
     * Aparte de los 6 tipos de datos que acabamos de ver, destinados a trabajar
     * con números en distintos rangos, Java define otros dos tipos primitivos
     * más. boolean: tiene la finalidad de facilitar el trabajo con valores
     * "verdadero/falso" (booleanos), resultantes por regla general de evaluar
     * expresiones. Los dos valores posibles de este tipo son true y false.
     * char: se utiliza para almacenar caracteres individuales (letras, para
     * entendernos). En realidad está considerado también un tipo numérico, si
     * bien su representación habitual es la del carácter cuyo código almacena.
     * Utiliza 16 bits y se usa la codificación UTF-16 de Unicode.
     */
    private boolean t = true;
    private char c = 'a';

    /**
     * TIPOS DE DATOS ESTRUCTURADOS. Los tipos de datos primitivos que acabamos
     * de ver se caracterizan por poder almacenar un único valor. Salvo este
     * reducido conjunto de tipos de datos primitivos, que facilitan el trabajo
     * con números, caracteres y valores booleanos, todos los demás tipos de
     * Java son objetos, también llamados tipos estructurados o "Clases". Los
     * tipos de datos estructurados se denominan así porque en su mayor parte
     * están destinados a contener múltiples valores de tipos más simples,
     * primitivos. También se les llama muchas veces "tipos objeto" porque se
     * usan para representar objetos. Puede que te suene más ese nombre.
     */
    // Cadenas de caracteres
    private String nombre = "Juan";
    // vectores
    private short[] punteos = new short[10];
    // matrices
    private int[][] temperaturas = new int[5][5];
    private short[] punteos2 = {50, 60, 70, 80, 90};
    private int[][] temperaturas2 = {{1, 2, 3}, {4, 5, 6}};
    // Colecciones
    List<String> municipios = new ArrayList<>();

    /**
     * TIPOS ENVOLTORIO O WRAPPER. Java cuenta con tipos de datos estructurados
     * equivalentes a cada uno de los tipos primitivos que hemos visto.     
     * Así, por ejemplo, para representar un entero de 32 bits (int) de los que
     * hemos visto al principio, Java define una clase llamada Integer que
     * representa y "envuelve" al mismo dato pero le añade ciertos métodos y
     * propiedades útiles por encima.
     */
    
    private Byte eb = 127;
    private Short es = 32767;
    private Integer ei = 2147483647;
    private Long el = 922337203700000000l;
    private Boolean et = true;
    private Character ec = 'a';
    
    
    
    public Tipos() {

    }
}
