package com.BridgeLabz.Day16_17;

	public class BinarySearchString {
	
		static String[] arr = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
		static int min = 0;
		static int max = arr.length - 1;
		static int mid;
		static String key = "EEE";
	
		public static void main(String[] args) {
			BinarySearch<String> bs = new BinarySearch<String>();
			int result = bs.binarySearch(arr, key);
			if (result == -1)
			System.out.println("Element is not present");
			else
			System.out.println("Element found at " + "index " + result);
			//System.out.println("Key Found at : " + stringBinarySearch() + " position");
		}
	
	}
