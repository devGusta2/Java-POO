/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

import java.util.HashSet;
import java.util.Set;
 import java.util.Scanner;
/**
 *
 * @author teste
 */
public class Aula04 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Aluno larissa = new Aluno("Larissa", "54546", "02/05/2000", "Feminino", 292048);
        Scanner in = new Scanner(System.in);
        
        Aluno a = new Aluno();
        
        
        a.setName("Gusta");
        
        
        larissa.setName(in.next());
                
        System.out.println(larissa.getRA());
        
        
        
    }
    
}
