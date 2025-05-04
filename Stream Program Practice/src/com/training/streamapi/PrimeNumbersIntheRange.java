package com.training.streamapi;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbersIntheRange {
	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(3, 100).filter(i -> isPrime(i)).boxed().collect(Collectors.toList());
		System.out.println(list);
		int[] nums1 = null;
		int[] nums2 = null;
		//int[] mergedArray = IntStream
		//		.concat(Arrays.stream(nums1, 0, nums1.length), Arrays.stream(nums2, 0, nums2.length)).sorted()
			//	.toArray();

// Copy the merged array back into nums1
	//	System.arraycopy(mergedArray, 0, nums1, 0, mergedArray.length);

		//List<Integer> dupli = Arrays.stream(nums1).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
			//	.stream().filter(f -> f.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		
		isPalindrome("");
		

	}

	public boolean containsDuplicate(int[] nums) {
		//Arrays.stream(nums).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	        return true;
	    }

	public void rotate(int[] nums, int k) {
		List<Integer> list = Arrays.stream(nums).mapToObj(c -> (int) c).collect(Collectors.toList());
		Collections.rotate(list, k);
		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}

	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list1 = Arrays.stream(nums1).sorted().boxed().collect(Collectors.toList());
		List<Integer> result = Arrays.stream(nums2).sorted().boxed().filter(e -> list1.contains(e))
				.peek(e -> list1.remove(Integer.valueOf(e))).collect(Collectors.toList());
		return result.stream().mapToInt(e -> (Integer) e.intValue()).toArray();
	}

	public int[] intersect1(int[] nums1, int[] nums2) {
		List<Integer> list1 = Arrays.stream(nums1).sorted().boxed().collect(Collectors.toList());
		List<Integer> result = Arrays.stream(nums2).sorted().boxed().filter(list1::contains).peek(list1::remove)
				.collect(Collectors.toList());
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] plusOne(int[] digits) {
		StringBuilder st = new StringBuilder();
		for (int i : digits) {
			st.append(i);
		}
		BigInteger str = new BigInteger(st.toString());
		BigInteger next = str.add(BigInteger.ONE);
		String next1 = String.valueOf(next);
		int[] n = new int[next1.length()];

		for (int i = 0; i < next1.length(); i++) {
			n[i] = next1.charAt(i) - '0';

		}
		return n;

	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (i != j) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
				j++;
			}
		}
	}

	public void moveZeroes1(int[] nums) {
		long count = Arrays.stream(nums).filter(e -> e != 0).count();
		int[] nonZeroArray = Arrays.stream(nums).filter(n -> n != 0).toArray();

// Step 3: Fill the remaining part of the array with zeroes
		for (int i = 0; i < count; i++) {
			nums[i] = nonZeroArray[i];
		}
		
		int nonZeroCount=(int)count;

// Step 4: Fill the remaining elements with zeroes
		for (int i =  nonZeroCount; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
	
	 public int firstUniqChar(String s) {
			int i = IntStream.range(0, s.length()).filter(c -> s.indexOf(s.charAt(c)) == s.lastIndexOf(s.charAt(c))).findFirst().orElse(-1);
			return i;
	    }
	 public static boolean isPalindrome(String s) {
		 s="A man, a plan, a canal: Panama";
		    String st = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(st);
		 int j=st.length();
		 boolean flag= false;
	        for(int i=0;i<st.length()-1;i++) {
	        	if(st.charAt(i)==st.charAt(j)) {
	        		flag=true;
	        		
	        	}
	        	j++;
	        }
	        return flag;
	    }
	 
	 public boolean isAnagram(String s, String t) {
	        
		 String st=s.chars().mapToObj(String::valueOf).sorted().collect(Collectors.joining()).toString();
		 String st2=t.chars().mapToObj(String::valueOf).sorted().collect(Collectors.joining()).toString();
		 return st.equals(st2);

	    }
}