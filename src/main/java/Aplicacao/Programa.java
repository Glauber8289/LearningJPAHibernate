package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1= new Pessoa (null," Carlos jose","Carlosjose@gmail.com");
		Pessoa p2= new Pessoa(null, "Joaquim torres", "JoaquimTorres@hotmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "Ana@gmail.com");

	 
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p11);
		em.persist(p2);
		em.persist(p3);
		
	
		em.getTransaction().commit();
		System.out.println("Pronto");
		
	}

}
