/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Generos;

/**
 *
 * @author User
 */
public class Funcionarios {
    private String nome;
    private String cpf;
    private Double salario;
    private Double inss;
    private Generos genero;
    
    public Funcionarios(String nome,
                        String cpf,
                        Double salario,
                        Generos genero){
        
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.inss = salario  * 0.11;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getInss() {
        return inss;
    }
    
    public Generos getGenero() {
        return genero;
    }
    
    public Object[] retornarAtributos() {
        return new Object[]{this.nome, this.cpf, this.salario, this.genero,this.inss};
    }
    
    
}
