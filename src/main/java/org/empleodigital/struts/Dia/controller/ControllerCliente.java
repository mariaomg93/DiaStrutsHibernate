package org.empleodigital.struts.Dia.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.empleodigital.struts.Dia.jpa.Cliente;

public class ControllerCliente {

	 private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
	            .createEntityManagerFactory("Dia");

	 public static void create(String nombre, String user, String pass) {
	        // Create an EntityManager
	        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction transaction = null;

	        try {
	            // Get a transaction
	            transaction = manager.getTransaction();
	            // Begin the transaction
	            transaction.begin();

	            // Create a new Student object
	            Cliente clie= new Cliente();
	            clie.setNombre(nombre);
	            clie.setUser(user);
	            clie.setPassword(pass);
	            
	            // Save the student object
	            manager.persist(clie);

	            // Commit the transaction
	            transaction.commit();
	        } catch (Exception ex) {
	            // If there are any exceptions, roll back the changes
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            // Print the Exception
	            ex.printStackTrace();
	        } finally {
	            // Close the EntityManager
	            manager.close();
	        }
	    }

	    /**
	     * Read all the Students.
	     * 
	     * @return a List of Students
	     */
	    public static Cliente testUser(String user,String pass) {

	        Cliente cl = null;

	        // Create an EntityManager
	        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction transaction = null;

	        try {
	            // Get a transaction
	            transaction = manager.getTransaction();
	            // Begin the transaction
	            transaction.begin();

	            // Get a List of Students
	            cl = (Cliente) manager.createQuery("SELECT c FROM Cliente c where user='"+user+"' and password='"+pass+"' ").getSingleResult();

	            // Commit the transaction
	            transaction.commit();
	        } catch (Exception ex) {
	            // If there are any exceptions, roll back the changes
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            // Print the Exception
	            ex.printStackTrace();
	        } finally {
	            // Close the EntityManager
	            manager.close();
	        }
	        return cl;
	    }
}
