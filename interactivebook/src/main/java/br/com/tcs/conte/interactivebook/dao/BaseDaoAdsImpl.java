/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcs.conte.interactivebook.dao;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author thiag
 */
public abstract class BaseDaoAdsImpl implements BaseDao{

    protected EntityManager em;

    public BaseDaoAdsImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void salvar(Object object) {

        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void alterar(Object object) {

        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
    }

    @Override
    public void excluir(Object object) {

        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
    }

    @Override
    public Object pesquisarPorId(Integer id) {

        em.getTransaction().begin();
        Object funcionario = em.find(Object.class, id);
        em.getTransaction().commit();

        return funcionario;
    }
}
