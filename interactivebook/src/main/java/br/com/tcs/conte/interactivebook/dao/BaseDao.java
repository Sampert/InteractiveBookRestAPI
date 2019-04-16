package br.com.tcs.conte.interactivebook.dao;

import java.util.List;

public interface BaseDao {

    void salvar(Object object);

    void alterar(Object object);

    void excluir(Object object);

    Object pesquisarPorId(Integer id);
    
    Object pesquisarPorNome(String nome);
}