package com.sei.DeDup;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {

	}
	
	/**
	 * Uses hash set collection which doesn't allow duplicates
	 * 
	 * This is best suited for faster performance with no order and sorting
	 *  
	 * @return int[]
	 */
	public int[] uniqueNumbers(int[] randomIntegers) {
		Set<Integer> numbersSet = new HashSet<Integer>();
		for(int randomInteger: randomIntegers) {
			numbersSet.add(randomInteger);
		}
		return numbersSet.stream().mapToInt(Integer::intValue).toArray();
	}
	
	
	/**
	 * Uses linked hash set collection which doesn't allow duplicates and maintains order of insertion
	 * 
	 * This is slower in performance than HashSet but its used when the insertion order needs to be maintained 
	 * 
	 * @return int[]
	 */
	public int[] uniqueNumbersWithInsertionOrder(int[] randomIntegers) {
		Set<Integer> numbersSet = new LinkedHashSet<Integer>();
		for(int randomInteger: randomIntegers) {
			numbersSet.add(randomInteger);
		}
		return numbersSet.stream().mapToInt(Integer::intValue).toArray();
	}
	
	/**
	 * Uses Tree set collection which doesn't allow duplicates and does sorting
	 * 
	 * This is slower in performance than HashSet but its used when the data needs to be sorted
	 * 
	 * @return int[]
	 */
	public int[] uniqueNumbersWithSortOrder(int[] randomIntegers) {
		Set<Integer> numbersSet = new TreeSet<Integer>();
		for(int randomInteger: randomIntegers) {
			numbersSet.add(randomInteger);
		}
		return numbersSet.stream().mapToInt(Integer::intValue).toArray();
	}
}