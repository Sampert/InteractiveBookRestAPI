/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcs.conte.interactivebook.dao;

import javax.persistence.EntityManager;

/**
 *
 * @author Alunos
 */
public class PaginaDao extends BaseDaoAdsImpl {

    public PaginaDao(EntityManager em) {
        super(em);
    }

    @Override
    public Object pesquisarPorNome(String nome) {
        return null;
    }
}
