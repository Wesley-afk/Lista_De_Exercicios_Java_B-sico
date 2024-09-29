/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_1;

/**
 *
 * @author wpass
 */
import java.util.Scanner;

public class Lista_Questao_1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um  numero");
        int num_Um = ler.nextInt();
        
        System.out.println("Digite mais um numero");
        int num_Dois = ler.nextInt();
        
        System.out.println("Soma de " + num_Um + " com " + num_Dois + " = " + (num_Um + num_Dois));
        }
}