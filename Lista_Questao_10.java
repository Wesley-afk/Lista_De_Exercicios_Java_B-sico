/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_10;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Lista_Questao_10 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        int n = 0;
        boolean validador = false;
        ArrayList<Float> neg = new ArrayList<>();
        ArrayList<Float> pos = new ArrayList<>();
        
        while(validador == false){
        System.out.println("DIgite um numero entre 1 e 50.");
        n = ler.nextInt();
        
        if(n > 50 || n < 1){
            System.out.println("Valor inválido.");    
        }
        else{
            validador = true;
        }
      }
        float []a; a = new float[n];
        
        for(int i = 0; i < n; i++){
        System.out.println("Digite numeros reais");
        a[i] = ler.nextFloat();
        
        if(a[i] < 0){
            neg.add(a[i]);
        }
        else if(a[i] >= 0){
            pos.add(a[i]);
        }
        }
        
        System.out.println("Valores Negativos:");
        for (int i = 0; i < neg.size(); i++) {
            System.out.println(neg.get(i));
        }
        System.out.println("Quantidade de valores contidos: " + neg.size());
        
        System.out.println("Valores Positivos");
        for (int i = 0; i < pos.size(); i++) {
            System.out.println(pos.get(i));
        }
        System.out.println("Quantidade de valores contidos: " + pos.size());
    }
}
