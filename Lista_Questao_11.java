/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_11;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Lista_Questao_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random sorteio = new Random();
        int n = 0;
        boolean validador = false;
        ArrayList<Integer> v = new ArrayList <>();
        int X = 0;
        int loop = 0;
        int o = -1;
        
        while(validador == false){
        System.out.println("Digite um numero entre 1 e 50.");
        n = ler.nextInt();
        
        for (int i = 0; i < n; i++) {
            v.add(i, sorteio.nextInt(20));
            validador = true;
        }
     }  
        
        System.out.println("DIgite 1000 para sair do Loop.");
        
        while(validador == true){
            System.out.println("Digite um valor para X");
            X = ler.nextInt();
            
            for (int i = 0; i < n; i++) {
                if(X == v.get(i)){
                    o = i;
                }
            }
            if(o > -1){
                    System.out.println("X esta no vetor na posicao " + o);
                    loop = loop + 1;
                }
            else if(loop == 0){
                     System.out.println("O valor de X nao esta no vetor.");
                 }
            if(X == 1000){
                validador = false;
            }
        }
    }
}
