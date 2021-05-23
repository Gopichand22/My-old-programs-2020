package sevenquestions;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ArraySubtract {

	public static void main(String[] args) {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		// give array size
		int size = AllValidationChecks.positiveIntegerCheck();
		System.out.println("Enter values of array1:");
		// assign values to array1
		int[] array1 = assignValues(size);
		// assign values to array2
		System.out.println("Enter values of array2:");
		int[] array2 = assignValues(size);
		// substract array1 from array2
		// Logic part->to subtract one array from another array
		int[] afterSubtract = afterSubtract(array1, array2);
		System.out.println("After subtraction");
		display(afterSubtract);
		// filter negative values present after subtract
		int[] negativeValues = extractNegativeValues(afterSubtract);
		System.out.println("Negative values after subtracting");
		display(negativeValues);
	}

//display the values in an array
	private static void display(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}

//extract negative values from the resultant array
	private static int[] extractNegativeValues(int[] afterSubtract) {
		// find no of negative values in this array
		int count = findNoOfNegativesInTheArray(afterSubtract);
		int[] allNegativesInArray = getNegativesFromArray(afterSubtract, count);
		return allNegativesInArray;
	}

//store negative values into a new array
	private static int[] getNegativesFromArray(int[] afterSubtract, int size) {
		int[] array = new int[size];
		int j = 0;
		for (int i = 0; i < afterSubtract.length; i++) {
			if (afterSubtract[i] <= -1) {
				array[j] = afterSubtract[i];
				j++;
			}
		}
		return array;
	}

//to assign the sign of new array finding no of negatives
	private static int findNoOfNegativesInTheArray(int[] afterSubtract) {
		int count = 0;
		for (int i = 0; i < afterSubtract.length; i++) {
			if (afterSubtract[i] <= -1) {
				count++;
			}
		}
		return count;
	}

//for subtracting array from another array
	private static int[] afterSubtract(int[] array1, int[] array2) {
		int[] array = new int[array1.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = array2[i] - array1[i];
		}
		return array;
	}

//for assigning values to array
	private static int[] assignValues(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		return array;
	}

}
