/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_6;

/**
 *
 * @author wpass
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lista_Questao_6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        boolean verificador = false;
        int x = 0;
        
        while(verificador == false){
            try{
            System.out.println("Digite um numero inteiro.");
            x = ler.nextInt();
            
            if (x == 0){
                verificador = true;
            }
            else if(x > 0){
                System.out.println("O numero e positivo");
            }
            else{
                System.out.println("O numero e negativo");
            }
            }catch(InputMismatchException e){
                System.out.println("Entrada invalida, digite um numero inteiro.");
                ler.next(); //serve para evitar meu loop infinito
            }
        }
    }
}
