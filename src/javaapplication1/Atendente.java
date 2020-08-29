/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Atendente {
    
    private String info1;
    private String info2;
    private String info3;
    
    public void lerInformacao(){
        String infoAux1;
        String infoAux2;
        String infoAux3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Olá, tudo bem? Eu sou Shirley, sua atentendente rápida.");
        System.out.println("Digite o seu nome?");
        infoAux1 = scan.nextLine();
        System.out.println("Quantos anos você tem?");
        infoAux2 = scan.nextLine();
        System.out.println("Solteiro(a) ou casado(a)?");
        infoAux3 = scan.nextLine();
        System.out.println("Entendi, muito obrigado.");
        aplicarTexto(infoAux1, infoAux2, infoAux3);
    }
    
    public void aplicarTexto(String info1, String info2, String info3){
        this.info1 = info1;
        this.info2 = info2;
        this.info3 = info3;
    }
    
    public void mostrarInformacao(){
        System.out.println("Suas informações:\nNome: " + info1 + "\nIdade: " + info2 + "\nStatus Civil: " + info3);
        System.out.println("Viu como sou rápida? rsrs");
    }
}
