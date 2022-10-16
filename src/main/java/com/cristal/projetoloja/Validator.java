/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja;

import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author robso
 */
public class Validator {

    public void validaMonetarioTxtBox(java.awt.event.KeyEvent evt, String campo) {
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && ((c != ','))) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Campo " + campo + " permite somente números!");
        }
        //FAZER COM QUE O CAMPO ACEITE SOMENTE NUMEROS E VIRGULA
    }
    
//    public boolean validaCPF(String cpf){
//        char dig10, dig11;
//        int sm, i, r, num, peso;
//
//        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
//        try {
//        // Calculo do 1o. Digito Verificador
//            sm = 0;
//            peso = 10;
//            for (i=0; i<9; i++) {
//        // converte o i-esimo caractere do CPF em um numero:
//        // por exemplo, transforma o caractere '0' no inteiro 0
//        // (48 eh a posicao de '0' na tabela ASCII)
//            num = (int)(cpf.charAt(i) - 48);
//            sm = sm + (num * peso);
//            peso = peso - 1;
//            }
//
//            r = 11 - (sm % 11);
//            if ((r == 10) || (r == 11))
//                dig10 = '0';
//            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
//
//        // Calculo do 2o. Digito Verificador
//            sm = 0;
//            peso = 11;
//            for(i=0; i<10; i++) {
//            num = (int)(cpf.charAt(i) - 48);
//            sm = sm + (num * peso);
//            peso = peso - 1;
//            }
//
//            r = 11 - (sm % 11);
//            if ((r == 10) || (r == 11))
//                 dig11 = '0';
//            else dig11 = (char)(r + 48);
//
//        // Verifica se os digitos calculados conferem com os digitos informados.
//            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
//                return(true);
//            } else{
//                return(false);
// 
//                } 
//            catch (Exception ex) {
//                return(false);
//            }
//        }
//    }

}
