package com.mindtree.firstsetofprograms;

public class BinarySearchForString {// main method in 14th program MenuBinary searching

	public boolean keySearch2(String[] str, String key2) {
		int n = str.length;

		int left = 0, right = n, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			int result = str[mid].compareTo(key2);
			if (result == 0) {
				return true;
			} else if (result < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return false;
	}

}
