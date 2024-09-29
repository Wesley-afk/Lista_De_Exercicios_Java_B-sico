/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_7;

/**
 *
 * @author wpass
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList; //normalmente usado quando fazemos algo com vetor sem usar for e quando não sabemos o tamanho do vetor usando x.add()
public class Lista_Questao_7 {

    public static void main(String[] args) {
   Scanner ler = new Scanner (System.in);
        boolean verificador = false;
        ArrayList<Integer> x = new ArrayList<>();
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int numero = 0;
        
        while(verificador == false){
            try{
            System.out.println("Digite um numero inteiro.");
            numero = ler.nextInt(); 
            x.add(numero);
            
            if (numero == 0){
                verificador = true;
            }
            else if(numero < 0){
                verificador = true;
            }
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = menor;
            }
            soma += numero;
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida, digite um numero inteiro.");
                ler.next(); //serve para evitar meu loop infinito
            }
        }
         System.out.println("Maior valor = " + maior);
         System.out.println("Menor valor = " + menor);
         System.out.println("Quantidade de valores = " + x.size());
         System.out.println("Media dos valores = " + soma / x.size());
    }
}
