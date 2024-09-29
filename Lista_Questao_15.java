/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_15;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Lista_Questao_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano_atual = 0;
        int ano_de_nascimento = 0;
        
        System.out.println("Digite o ano atual.");
        ano_atual = ler.nextInt();
        
        System.out.println("Digite o ano de nasimento do usuario.");
        ano_de_nascimento = ler.nextInt();
        
        System.out.println("Neste ano o usuario fara: " + (ano_atual - ano_de_nascimento) + " anos.");
    }
}
