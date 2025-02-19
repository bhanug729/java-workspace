package $00_Coding_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LeetCodeExercise {

	public static void main(String[] args) {
		System.out.println(mergeAlternately("Bhanu", "Pratap"));
//		System.out.println(gcdOfStrings("ABABAB", "ABAB"));
//		System.out.println(gcdOfStrings("ABCABC", "ABC"));

		System.out.println(kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));
		System.out.println(kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));

		System.out.println(containsDuplicate(new int[] { 4, 2, 1, 1, 2 }));
		System.out.println(containsDuplicate(new int[] { 2, 3, 5, 1 }));
		System.out.println();

		System.out.println("IceCreAm  " + reverseVowels("IceCreAm"));
		System.out.println("leetcode  " + reverseVowels("leetcode"));
		System.out.println();

		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 18)));
		System.out.println();

		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToInt("LVIII"));
		System.out.println();

		System.out.println(romanToInt2("MCMXCIV"));
		System.out.println();

		System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		System.out.println();
	}
	public boolean isValid(String s) {
		return true;
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder res = new StringBuilder();
		
		if(strs.length<=1) return strs[0];

		for (int i = 0; i < strs[0].length(); i++) {
			char finding = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || finding != strs[j].charAt(i)) {
					return res.toString();
				}
			}
			res.append(finding);
		}
		throw new IllegalArgumentException("Invalid Input");
	}

	public static int romanToInt2(String s) {
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		s = s + "0";
		int result = 0, curr, next;
		for (int i = 0; i < s.length() - 1; i++) {
			curr = map.get(s.charAt(i) + "");
			next = map.getOrDefault(s.charAt(i + 1) + "", 0);

			if (curr < next) {
				result = result + next - curr;
				i++;
				continue;
			}
			result += curr;

		}
		return result;
	}

	public static int romanToInt(String s) {
		Map<String, Integer> map = new Hashtable<>();
		map.put("I", 1);

		map.put("IV", 4);
		map.put("V", 5);

		map.put("IX", 9);
		map.put("X", 10);

		map.put("XL", 40);
		map.put("L", 50);

		map.put("XC", 90);
		map.put("C", 100);

		map.put("CD", 400);
		map.put("D", 500);

		map.put("CM", 900);
		map.put("M", 1000);

		s = s + "0";
		int result = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (map.containsKey(s.subSequence(i, i + 2))) {
				result += map.get(s.subSequence(i, i + 2));
				i++;
				continue;
			}
			result += map.getOrDefault(s.charAt(i) + "", 0);
		}

		return result;
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			int index = map.getOrDefault(diff, -1);

			if (index != -1 && i != index) {
				return new int[] { i, index };
			}
		}
		throw new IllegalArgumentException("Invalid Enput");

//        for (int i=0; i < nums.length; i++) {
//            for (int j=i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j] == target) return new int[] {i,j};
//            }
//        }
//        throw new IllegalArgumentException("Invalid Enput");
	}

	public static String reverseVowels(String s) {
		char[] arr = s.toCharArray();
		int start = 0, end = s.length() - 1;

		String vowels = "AEIOUaeiou";

		while (start <= end) {
			if (!vowels.contains(arr[start] + "")) {
				start++;
				continue;
			}
			if (!vowels.contains(arr[end] + "")) {
				end--;
				continue;
			}
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		String answer = new String(arr);
		return answer;
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int prev = flowerbed[0];
		int count = 0;

		if (flowerbed.length == 0 && prev == 0)
			return true;

		for (int i = 1; i < flowerbed.length - 1; i++) {
			int curr = flowerbed[i];
			int next = flowerbed[i + 1];
			if (prev == 0 && curr == 0 && next == 0) {
				prev = curr;
				count++;
			}
		}

		return count == n;
	}

	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			}
			map.put(nums[i], 1);
		}
		return false;
	}

	public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		ArrayList<Boolean> arr = new ArrayList<>();
		int max = max(candies);

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				arr.add(true);
			} else {
				arr.add(false);
			}
		}
		return arr;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int a : arr) {
			if (max < a) {
				max = a;
			}
		}
		return max;
	}

//	public static String gcdOfStrings(String str1, String str2) {
//        String myStr = str1.length() < str2.length() ? str1:str2;
//        
//        for (int i=myStr.length(); i>0; i--) {
//        	
//        }
//        
//        return myStr.toString();
//    }

	public static String mergeAlternately(String word1, String word2) {
		StringBuilder myStr = new StringBuilder();

		int min = word1.length() < word2.length() ? word1.length() : word2.length();

		for (int i = 0; i < min; i++) {
			myStr.append(word1.charAt(i)).append(word2.charAt(i));
		}

		myStr.append(word1.substring(min)).append(word2.substring(min));
		return myStr.toString();
	}
}