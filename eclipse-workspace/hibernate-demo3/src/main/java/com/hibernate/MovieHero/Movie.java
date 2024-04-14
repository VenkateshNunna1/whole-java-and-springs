package com.hibernate.MovieHero;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String movie;
   private long collections;
   @ManyToMany
   @Cascade(CascadeType.ALL)
   @JoinColumn
   private List<Hero> heros;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMovie() {
			return movie;
		}
		public void setMovie(String movie) {
			this.movie = movie;
		}
		public long getCollections() {
			return collections;
		}
		public void setCollections(long collections) {
			this.collections = collections;
		}
		public List<Hero> getHeros() {
			return heros;
		}
		public void setHeros(List<Hero> heros) {
			this.heros = heros;
		}
		   
			
   
}
