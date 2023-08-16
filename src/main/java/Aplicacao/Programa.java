package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
	 
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
<<<<<<< HEAD
	     Pessoa p=em.find(Pessoa.class, 2);
	     
	     System.out.println(p);
		
		System.out.println("Pronto");
		em.close();
		emf.close();
=======
	
		em.getTransaction().commit();
		System.out.println("Pronto!!");
		
>>>>>>> b68f7ceda91d9c302335a94bd9f8881dee3a6415
	}

}
