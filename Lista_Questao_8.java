/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_8;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Lista_Questao_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int min = 0;
        int max = 0;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> intervalo = new ArrayList <>();
        boolean verificador = false;
        int soma = 0;
        int num = 0;
        
        System.out.println("Digite o valor minimo, e em seguida o valor maximo");
        min = ler.nextInt();
        max = ler.nextInt();
        
        if(min > max){
            System.out.println("O valor minimo digitado e maior que o maximo.");
            max = min;
            min = max;
            System.out.println("\nCorrigido. Minimo = " + min + "Max" + max);
        }
         
        for (int i = min; i < max; i++) {
            intervalo.add(i);
        }
        
        while(verificador == false){
            System.out.println("DIgite um valor para x.");
            num = ler.nextInt();
            
            if(num == 0){
              verificador = true;
            }
          if(num > max){
              System.out.println("Valor fora do intervalo e sera ingnorado na totalizacao.");
              num = 0;
          }
          else if(num < min){
              System.out.println("Valor fora do intervalo e sera ingnorado na totalizacao.");
              num = 0;
          }
           x.add(num);
           soma += num;
        }
        
        System.out.println("Total = " + soma); //soma dos valores
        System.out.println("Quantidade de valores fornecidos: " + x.size()); //quantidade de valores fornecidos
        
    }
}
