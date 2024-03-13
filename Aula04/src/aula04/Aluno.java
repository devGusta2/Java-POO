/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author teste
 */
public class Aluno {
    private String nome;
    private String cpf;
    private String data_nasc;
    private String sexo;
    private int ra;
    
    
    Aluno(String nome, String cpf, String data_nasc, String sexo, int ra){
        this.nome=nome;
        this.cpf=cpf;
        this.data_nasc=data_nasc;
        this.sexo=sexo;
        this.ra=ra;
    }
    Aluno(){}
    
    
    public void setName(String in){
        this.nome= in;
    }
    public void setRa(int entrada){
        this.ra=entrada;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    
    public int getRA(){
        return this.ra;
    }
}
    