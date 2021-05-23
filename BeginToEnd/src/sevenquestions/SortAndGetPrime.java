package sevenquestions;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SortAndGetPrime {

	public static void main(String[] args) {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		// give array size
		int size = AllValidationChecks.positiveIntegerCheck();
		System.out.println("Enter values of array1:");
		// assign values to array1
		int[] array = assignValues(size);
		// to get sorted data and to assign the sorted values
		int[] sortedArray = sortArrayUsingInsertionSort(array);
		System.out.println("Sorted values using insertion sort:");
		display(sortedArray);
		// method to get array size
		int newArraySize = getSizeForPrimeArray(sortedArray);
		int[] primeValues = getPrimeValuesFromSortedArray(sortedArray, newArraySize);
		System.out.println("Sorted Prime values:");
		// method to display prime values
		display(primeValues);
	}

	// final logic to get the primes values from the sorted array
	private static int[] getPrimeValuesFromSortedArray(int[] sortedArray, int size) {
		int[] primeArray = new int[size];
		int k = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			int count = 0;
			if (sortedArray[i] == 1 || sortedArray[i] == 0) {
				continue;
			}
			for (int j = 2; j < sortedArray[i] / 2; j++) {
				if (sortedArray[i] % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				primeArray[k] = sortedArray[i];
				k++;
			}
		}
		return primeArray;
	}

//get size of primenumebrs to assign the size for new array which holds prime values in the array
	private static int getSizeForPrimeArray(int[] sortedArray) {
		int size = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			int count = 0;
			if (sortedArray[i] == 1 || sortedArray[i] == 0) {
				continue;
			}
			for (int j = 2; j < sortedArray[i] / 2; j++) {
				if (sortedArray[i] % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				size++;
			}
		}
		return size;
	}

//sort array by using inserion sort
	private static int[] sortArrayUsingInsertionSort(int[] array) {
		int[] sortedArray = array;
		for (int i = 1; i < sortedArray.length; i++) {
			int j = i - 1;
			int key = sortedArray[i];
			while (j >= 0 && sortedArray[j] > key) {
				sortedArray[j + 1] = sortedArray[j];
				j--;
			}
			sortedArray[j + 1] = key;
		}

		return sortedArray;
	}

//method for displaying values
	private static void display(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}

//method for assigning values
	private static int[] assignValues(int size) {
		int[] tempArray = new int[size];
		for (int i = 0; i < size; i++) {
			tempArray[i] = AllValidationChecks.integerCheck();
		}
		return tempArray;
	}

}
