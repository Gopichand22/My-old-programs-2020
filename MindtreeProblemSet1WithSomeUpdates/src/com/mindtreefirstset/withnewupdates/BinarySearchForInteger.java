package com.mindtreefirstset.withnewupdates;

public class BinarySearchForInteger {
	public boolean findElement(int[] arr, int key) {
		int n = arr.length;
		int left = 0, right = n - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid]) {
				return true;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;

	}
}