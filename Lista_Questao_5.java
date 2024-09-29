/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_questao_5;

/**
 *
 * @author wpass
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter; //escrever no arquivo
import java.io.FileWriter; //guardar o arquivo

public class Lista_Questao_5 {

    public static void main(String[] args) throws IOException {
        DataInputStream ler = new DataInputStream(System.in);
        Scanner lerr = new Scanner (System.in);
        String categoria = "";
        
            System.out.println("Digite o nome do lutador");
            String nome = lerr.nextLine();
                    
            System.out.println("Digite o peso do lutador");
            float peso = Float.parseFloat(ler.readLine());
            
            if(peso < 65){
               categoria = "Categoria Pena";
            }
            else if((peso >= 65) && (peso < 72)){
               categoria = "Categoria Leve";
        }
            else if((peso >= 72) && (peso < 79)){
                 categoria = "Categoria Ligeiro";
        }
            else if((peso >= 79) && (peso < 86)){
                categoria = "Categoria Meio medio";         
       }
            else if((peso >= 86) && (peso < 93)){
                categoria = "Categoria medio";  
       }
            else if((peso >= 93) && (peso < 100)){
               categoria = "Categoria Meio pesado";
       }
            else if(peso >= 100){
                categoria = "Categoria pesado";
            }
                System.out.println("Nome fornecido " + nome + " \nPeso fornecido " + peso);
                
          try (PrintWriter escrever = new PrintWriter(new FileWriter("lutador.txt"))) { //primeiro inicializando o print e dps guardando usando  o fileWriter
                  escrever.println("O lutador " + nome + " pesa " + peso + " e se enquadra na " + categoria);
        }
          catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar no arquivo: " + e.getMessage());
        } finally {
         }
     }
}
