/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Aluno1 {
    
    private String nome1;
    private String nome2;
    private String nome3;
    
    public void salvarNome(){
        String nomeAux1;
        String nomeAux2;
        String nomeAux3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um nome:");
        nomeAux1 = scan.nextLine();
        System.out.print("Digite outro nome:");
        nomeAux2 = scan.nextLine();
        System.out.print("Digite o ultimo nome:");
        nomeAux3 = scan.nextLine();
        
        aplicarTexto(nomeAux1, nomeAux2, nomeAux3);
    }
    
    public void aplicarTexto(String nome1, String nome2, String nome3){
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.nome3 = nome3;
    }
    
    public void mostrarNomes(){
        System.out.println("Pessoa 1: " + nome1 + "/// Pessoa 2: " + nome2 + "/// Pessoa 3:" + nome3);
    }
}
