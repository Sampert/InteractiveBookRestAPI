/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcs.conte.interactivebook.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thiag
 */
public class ConnectionFactory {

    private static EntityManagerFactory factory;
    
    /*
    * Bloco estatico, só é executado uma unica vez durante toda a duração da aplicação
    */
    static {
        factory = Persistence.createEntityManagerFactory("InteractiveBookPU");
    }
    
    public static EntityManager openConnection() {
        return factory.createEntityManager();
    }
}
