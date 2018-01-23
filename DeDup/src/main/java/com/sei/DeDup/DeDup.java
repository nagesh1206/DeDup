package com.sei.DeDup;

import java.util.Arrays;
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
	 * @param randomIntegers
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
	 * Since the ask is for new array without duplicates using Arrays.copy.
	 * If not, same array with index can be used  without creating new array.
	 * 
	 * @param randomIntegers
	 * @return int[]
	 */
	public int[] uniqueNumbersAfterSorting(int[] randomIntegers) {
		int[] uniqueNumbers = null;
		if (randomIntegers != null && randomIntegers.length > 0) {
			int arrLength = randomIntegers.length;
			if (arrLength <= 1) {
				uniqueNumbers = randomIntegers;
			} else {
				Arrays.sort(randomIntegers);
				int j = 0;
				for (int i = 0; i < arrLength - 1; i++) {
					if (randomIntegers[i] != randomIntegers[i + 1]) {
						randomIntegers[j++] = randomIntegers[i];
					}
				}
				randomIntegers[j++] = randomIntegers[arrLength - 1];
				uniqueNumbers = Arrays.copyOf(randomIntegers, j);
			}
		}
		return uniqueNumbers;
	}
	
	
	/**
	 * This solution is without any use of collections
	 * 
	 *  @param randomIntegers
	 * @return int[]
	 */
	public int[] uniqueNumbersWithoutCollection(int[] randomIntegers) {

		int[] uniqueNumbers = null;
		if(randomIntegers != null && randomIntegers.length > 0) {
			
			int totalUniqueNumbers = randomIntegers.length;

			for (int i = 0; i < totalUniqueNumbers; i++) {
				for (int j = i + 1; j < totalUniqueNumbers; j++) {
					if (randomIntegers[i] == randomIntegers[j]) {
						randomIntegers[j] = randomIntegers[totalUniqueNumbers - 1];
						totalUniqueNumbers--;
						j--;
					}
				}
			}
			uniqueNumbers = Arrays.copyOf(randomIntegers, totalUniqueNumbers);
		}
		return uniqueNumbers;
	}
	
	/**
	 * Uses linked hash set collection which doesn't allow duplicates and maintains order of insertion
	 * 
	 * This is slower in performance than HashSet but its used when the insertion order needs to be maintained 
	 * 
	 * @param randomIntegers
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
	 * @param randomIntegers
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