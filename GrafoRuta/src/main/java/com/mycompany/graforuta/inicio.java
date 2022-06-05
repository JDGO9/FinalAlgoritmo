/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import GrafosPkg.Grafo;
import java.util.Scanner;

/**
 *
 * @author Ruldin Ayala
 */
public class inicio {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("a = Atescatempa\n" +
        "b = Agua Blanca\n" +
        "c =Comapa\n" +
        "d = El Adelanto\n" +
        "e = Jerez\n" +
        "f = Conguaco\n" +
        "j = Jutiapa\n" +
        "m = Moyuta\n" +
        "p = Pasaco\n" +
        "q = Quesada\n" +
        "r = El Progreso\n" +
        "s = San José Acatempa\n" +
        "t = Jalpatagua\n" +
        "u = Asunción Mita\n" +
        "x = Santa Catarina Mita\n" +
        "y = Yupiltepeque\n" +
        "z = Zapotitlán");
        
        Grafo g = new Grafo("abcedgjmpqrstuxyz");
        g.agregarRuta('b','x', 16700);
        g.agregarRuta('b','u', 28000);
        g.agregarRuta('x','u', 17200);
        g.agregarRuta('x','r', 19500);
        g.agregarRuta('x','j', 37000);
        g.agregarRuta('u','a', 30000);
        g.agregarRuta('u','y', 20500);
        g.agregarRuta('u','j', 32500);
        g.agregarRuta('r','j', 14800);
        g.agregarRuta('j','y', 24300);
        g.agregarRuta('j','d', 31000);
        g.agregarRuta('j','c', 45000);
        g.agregarRuta('j','t', 40500);
        g.agregarRuta('j','q', 20400);
        g.agregarRuta('q','s', 20500);
        g.agregarRuta('q','t', 24800);
        g.agregarRuta('t','s', 35300);
        g.agregarRuta('t','m', 22400);
        g.agregarRuta('t','g', 20500);
        g.agregarRuta('t','c', 17200);
        g.agregarRuta('m','g', 7100);
        g.agregarRuta('m','p', 41600);
        g.agregarRuta('c','z', 73500);
        g.agregarRuta('c','d', 71100);
        g.agregarRuta('z','d', 4800);
        g.agregarRuta('z','e', 16000);
        g.agregarRuta('z','y', 10000);
        g.agregarRuta('y','d', 7600);
        g.agregarRuta('y','e', 16200);
        g.agregarRuta('y','a', 15000);
        g.agregarRuta('a','e', 12000);
        
        char inicio;
        char fin;
        System.out.println("Escriba el identificador del municipio de inicio:");
        inicio = scanner.next().charAt(0);
        System.out.println("Escriba el identificador del municipio Final:");
        fin = scanner.next().charAt(0);
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
}
