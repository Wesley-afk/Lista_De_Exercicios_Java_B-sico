/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_16;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Lista_Questao_16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n = 0;
        ArrayList<Integer> array = new ArrayList<>();
        int salario = 0;
        int media = 0;
        int soma = 0;
        int acima_media = 0;
        
        System.out.println("Quantos funcionarios a empresa possui?");
        n = ler.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o salario do funcionario.");
            salario = ler.nextInt();
            array.add(salario);
            soma += salario;
        }
         media = (soma / array.size());
         
         for (int i = 0; i < array.size(); i++) {
             if(array.get(i) > media){
                 acima_media = acima_media + 1;
             }
        }
         System.out.println(acima_media + " Funcionarios ganham acima da media.");
    }
}
