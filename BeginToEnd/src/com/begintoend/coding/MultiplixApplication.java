package com.begintoend.coding;

import java.util.Arrays;
import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MultiplixApplication {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arrayCount = 0, listOfMovies;
		System.out.println("Enter number of movies");
		listOfMovies = AllValidationChecks.positiveIntegerCheck();
		Movie[] movieObject = new Movie[listOfMovies];
		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				arrayCount = createMovieList(movieObject, arrayCount, listOfMovies);
				break;
			case 2:
				highNoOfActorsInAMovie(movieObject, arrayCount);
				break;
			case 3:
				displayAllActorsFromAllMovies(movieObject, arrayCount);
				break;
			case 4:
				System.out.println("Exiting... bye");
				isValid = false;
				break;
			default:
				System.out.println("please choose correct option btw 1-4:");
				break;
			}
		} while (isValid);
	}

	// Case 1 creating list of movies
	private static int createMovieList(Movie[] movieObject, int arrayCount, int listOfMovies) {
		if (arrayCount < listOfMovies) {
			System.out.println("Enter Id:");
			int id = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter name of the movie:");
			String name = AllValidationChecks.stringCheck();
			System.out.println("Enter movie genre(si-fi,humor,paranormal,fantasy,myth):");
			String genre = validateGenre();
			System.out.println("Enter total number of actors in the movie:");
			// array of actors
			String[] actorsList = oneDArray();
			movieObject[arrayCount] = new Movie(id, name, genre, actorsList);
			// just for reference toString() is used here
			System.out.println(Arrays.toString(movieObject));
			// just for reference toString() is used here
			arrayCount++;
		} else {
			System.out.println("There is no space in the database");
		}
		return arrayCount;
	}

	// Case 2 Print movie in which highest number of actors are present
	private static void highNoOfActorsInAMovie(Movie[] movieObject, int arrayCount) {
		if (arrayCount > 0) {
			int max = 0, k = 0;
			if (arrayCount > 0) {
				for (int i = 0; i < arrayCount; i++) {
					int len = movieObject[i].getActorsList().length;
					if (max < len) {
						max = len;
						k = i;
					}
				}
				System.out.println(movieObject[k].getName());

			} else {
				System.out.println("No data exists in the database");

			}
		} else {
			System.out.println("Sorry There is no data in the database");
		}
	}

	// Case 3 Print All actors from all the movies with out duplication
	private static void displayAllActorsFromAllMovies(Movie[] movieObject, int arrayCount) {
		// traverse through all the movies
		// traverse all the actors in each movie
		// print all actors
//********************************************************************
		// movies list
		for (int i = 0; i < arrayCount; i++) {
			// actors in that particular movie
			for (int j = 0; j < movieObject[i].getActorsList().length; j++) {
				// print those actors here
				System.out.println(movieObject[i].getActorsList()[j]);// (i want this a,b,c), but this will print the
																		// reference
			}
		}
	}

	/*
	 * if (arrayCount > 0) { String[] temp = null; int num = 0, k = 0; for (int i =
	 * 0; i < arrayCount; i++) { num += movieObject[i].getActorsList().length; }
	 * String[] allActors = new String[num];
	 * 
	 * for (int i = 0; i < arrayCount; i++) { temp = movieObject[i].getActorsList();
	 * for (int j = 0; j < movieObject[i].getActorsList().length; j++) {
	 * allActors[k] = temp[j]; k++; } }
	 * System.out.println("All actors from all movies"); for (int i = 0; i <
	 * allActors.length; i++) { System.out.println("*" + allActors[i]); } } else {
	 * System.out.println("Sorry There is no data in the database"); } }
	 */

//creating 1D String[] array to store actors
	private static String[] oneDArray() {
		int size = AllValidationChecks.positiveIntegerCheck();
		String[] actors = new String[size];
		for (int i = 0; i < size; i++) {
			actors[i] = sc.nextLine();
		}
		return actors;
	}

//validating genre
	private static String validateGenre() {
		String str = converToLowerCase(sc.nextLine());
		if (str.equals("sifi") || str.equals("humor") || str.equals("paranormal") || str.equals("fantasy")
				|| str.equals("sentiment") || str.equals("myth")) {
			return str;
		} else {
			System.out.println("Enter a valid genre");
			return validateGenre();
		}
	}

//main menu
	private static int chooseOption() {
		System.out.println("1.Create movie list");
		System.out.println("2.Display movie which has highest number of actors");
		System.out.println("3.Display all actors from all movies without repeating same name");
		System.out.println("4.Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

//converting to lower
	private static String converToLowerCase(String genre) {
		String lower = "";
		for (int j = 0; j < genre.length(); j++) {
			if (genre.charAt(j) >= 65 && genre.charAt(j) <= 90) {
				lower += (char) (genre.charAt(j) + 32);
			} else if (genre.charAt(j) >= 97 && genre.charAt(j) <= 122) {
				lower += (genre.charAt(j));
			}
		}
		return lower;
	}
}
