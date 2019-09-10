package com.java.te;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.java.so.Book;


public class bookTest extends JPAUnitTest {
	
	@Test
	public void entityManagerFactoryOK() {
		
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerOK() {
		
		assertNotNull(em);
	}
	@Test
	public void selectFirstBook() {
		

		
		Book book= em.find(Book.class, "Anna Karenina");
		assertEquals("Tolstoi",book.getAuthor());
		
	}
	
	
	/*@Test
	public void deleteInitialBook() {
		
		Book book= em.find(Book.class, "Anna Karenina");
		em.getTransaction().begin();
		em.remove(book);
		em.getTransaction().commit();
		Book noBook= em.find(Book.class, "Anna Karenina");
		assertNull(noBook);
		
	}*/
	
	
	@Test
	public void insertNewBook() {
		
		em.getTransaction().begin();
		Book newBook= new Book("Lighthouse","VWoolf",new Date());
		em.persist(newBook);
		em.getTransaction().commit();
		Book insertBook = em.find(Book.class,"Lighthouse");
		System.out.println(insertBook);
		
		
		em.getTransaction().begin();
		em.remove(insertBook);
		em.getTransaction().commit();
		Book noBook= em.find(Book.class, "Lighthouse");
		assertNull(noBook);
		
		
	}
	
	@Test
	public void insertNewBook2() {
		
		em.getTransaction().begin();
		Book newBook= new Book("Miserables","Hugo",new Date());
		em.persist(newBook);
		em.getTransaction().commit();
		Book insertBook = em.find(Book.class,"Miserables");
		System.out.println(insertBook);
		
		
	}
	
	@Test
	public void selectABook() {
		
	
		
		Book book= em.find(Book.class, "Lighthouse");
		//System.out.println(book.getAuthor());
		if (book == null) 
			System.out.println("nulo");
		else
			System.out.println(book);
		//assertEquals("VWoolf",book.getAuthor());
		
	}
	
	
		
}
