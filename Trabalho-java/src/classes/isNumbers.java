/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author User
 */
public class isNumbers {
    public static boolean isDouble(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
        }
    }
    
    public static boolean isLong(String str) {
    try {
        /*Utilizado Long pois ao tentar converte 12341234123 para int é gerado um erro por tamanho do número*/
        Long.parseLong(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
        }
    }
    
    
}
