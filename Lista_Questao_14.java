/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_14;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Lista_Questao_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = ""; 
        float Salario;  
        float novoSalario = 0;
        float soma = 0;
        float soma_reajuste = 0;
        
        while(!nome.equals("FIM")){
            
            System.out.println("Digite o nome do funcionario e em seguida seu salario.");
            System.out.println("Digite FIM para encerrar o programa.");
            nome = ler.nextLine();
            
            if(nome.equals("FIM")) {
                break; 
            }
            
            Salario = ler.nextFloat();
            soma += Salario;
            
            if(Salario <= 150){
                novoSalario = (float)(Salario + (Salario * 0.25));
                soma_reajuste += novoSalario;
            }
            else if(Salario <= 300){
                novoSalario = (float)(Salario + (Salario * 0.20));
                soma_reajuste += novoSalario;
            }
            else if(Salario <= 600){
                novoSalario = (float)(Salario + (Salario * 0.15));
                soma_reajuste += novoSalario;
            }
            else {
                novoSalario = (float)(Salario + (Salario * 0.10));
                soma_reajuste += novoSalario;
            }
            
            System.out.println("Nome do funcionario: " + nome);
            System.out.println("Salario atual do funcionario: " +  Salario);
            System.out.println("Salario novo: " + novoSalario);
        }        
        
        System.out.println("Soma total dos salarios sem reajuste: " + soma);
        System.out.println("Soma total dos salarios com reajuste: " + soma_reajuste);
    }
}
