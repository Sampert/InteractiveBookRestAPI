/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcs.conte.interactivebook.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Livro implements Serializable{
    
    private String nome;
    private String autor;
    private List<Pagina> paginas;

    public Livro() {
    }

    public Livro(String nome, String autor, List<Pagina> paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.paginas = paginas;
    }
    
    
    
}
