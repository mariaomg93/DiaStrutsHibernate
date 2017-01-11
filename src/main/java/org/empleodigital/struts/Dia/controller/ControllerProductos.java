package org.empleodigital.struts.Dia.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.empleodigital.struts.Dia.jpa.Cliente;
import org.empleodigital.struts.Dia.jpa.Producto;

public class ControllerProductos {	 
	 private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
	            .createEntityManagerFactory("Dia");

	 public static List<Producto> ListprodSlider() {

	        List<Producto> prod=null;

	        // Create an EntityManager
	        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction transaction = null;

	        try {
	            // Get a transaction
	            transaction = manager.getTransaction();
	            // Begin the transaction
	            transaction.begin();

	            // Get a List of Students
	            prod = manager.createQuery("SELECT p FROM Producto p",Producto.class).setFirstResult(0).setMaxResults(3).getResultList();

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
	        return prod;
	    }
	 public static List<Producto> Listprod() {

	        List<Producto> prod=null;

	        // Create an EntityManager
	        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction transaction = null;

	        try {
	            // Get a transaction
	            transaction = manager.getTransaction();
	            // Begin the transaction
	            transaction.begin();

	            // Get a List of Students
	            prod = manager.createQuery("SELECT p FROM Producto p",Producto.class).getResultList();

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
	        return prod;
	    }
	
	
	
	
 }



