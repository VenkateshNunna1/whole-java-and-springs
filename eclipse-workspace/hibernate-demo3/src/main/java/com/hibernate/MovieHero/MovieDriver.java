package com.hibernate.MovieHero;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MovieDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkatesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Movie movie1 = new Movie();
		//movie1.setId(1);
		movie1.setMovie("RRR");
		movie1.setCollections(1000);
		
		Movie movie2 = new Movie();
//		movie2.setId(2);
		movie2.setMovie("KGF");
		movie2.setCollections(1000);
		
		Movie movie3 = new Movie();
//		movie3.setId(3);
		movie3.setMovie("Pathan");
		movie3.setCollections(1000);
		
	    Hero hero1 = new Hero();
//	    hero1.setId(1);
	    hero1.setName("Ram Charan");
	    hero1.setAge(30);
	    
	    Hero hero2 = new Hero();
//	    hero2.setId(2);
	    hero2.setName("NTR");
	    hero2.setAge(35);
	    
	    Hero hero3 = new Hero();
//	    hero3.setId(3);
	    hero3.setName("Yash");
	    hero3.setAge(32);
	    
	    Hero hero4 = new Hero();
//	    hero4.setId(4);
	    hero4.setName("shahrukh khan");
	    hero4.setAge(56);
	    
	    Hero hero5 = new Hero();
//	    hero5.setId(5);
	    hero5.setName("salman khan");
	    hero5.setAge(59);
	    
	    List<Hero> heros = new ArrayList<Hero>();
	    heros.add(hero1);
	    heros.add(hero2);
	    heros.add(hero3);
	    heros.add(hero4);
	    heros.add(hero5);
	    
	    List<Movie> movies = new ArrayList<Movie>();
	    movies.add(movie1);
	    movies.add(movie2);
	    movies.add(movie3);
	    
	    movie1.setHeros(heros);
	    movie2.setHeros(heros);
	    movie3.setHeros(heros);
	    
	    hero1.setMovies(movies);
	    hero2.setMovies(movies);
	    hero3.setMovies(movies);
	    hero4.setMovies(movies);
	    hero5.setMovies(movies);
	    
	    et.begin();
	    em.persist(movie1);
	    em.persist(movie2);
	    em.persist(movie3);
	    et.commit();
	}

}
