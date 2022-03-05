/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author tarsi
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet();
        Set<Integer> b = new HashSet();
        Set<Integer> c = new HashSet();

        System.out.println("How many students of course A");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println("How many students of course B");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        System.out.println("How many students of course C");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);
        
        System.out.println("Total students: " + total.size());
    }

}
