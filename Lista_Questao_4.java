/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_4;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Lista_Questao_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        float lado1 = 0;
        float lado2 = 0;
        float lado3 = 0;
        
        System.out.println("Digite o primeiro lado");
        lado1 =  ler.nextFloat();
        
        System.out.println("Digite o segundo lado");
        lado2 = ler.nextFloat();
        
        System.out.println("Digite a terceiro lado");
        lado3 = ler.nextFloat();
        
        if((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado3 + lado1 > lado2)){
            System.out.println("Os lados formam um triangulo");
        }
        else{
            System.out.println("Nao forma um triangulo.");
        }
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("O triangulo e equilatero");
        }
        else if((lado2 == lado3) && (lado1 == lado2) && (lado1 == lado3)){
            System.out.println("O triangulo e isoceles");     
       }
        else{
            System.out.println("O triangulo e escaleno");
        }
    }
}
