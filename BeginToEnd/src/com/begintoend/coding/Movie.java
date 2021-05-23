package com.begintoend.coding;

import java.util.Arrays;

public class Movie {

	private String genre;
	private String name;
	private int id;
	private String[] actorsList;

	public Movie() {

	}

	public Movie(int id, String name, String genre, String[] actorsList) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.actorsList = actorsList;

	}

	public String[] getActorsList() {
		return actorsList;
	}

	public void setActorsList(String[] actorsList) {
		this.actorsList = actorsList;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + name + genre + Arrays.toString(actorsList);

	}

}
