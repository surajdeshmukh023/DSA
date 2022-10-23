

//https://leetcode.com/problems/group-anagrams
// space complexity o(nlogn)
//CTCI

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = groupAnagrams(str);

		for (List<String> list : groupAnagrams) {
			System.out.println(list.get(0));
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> grouppedAnagrams = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < strs.length; i++) {
			char[] arr = strs[i].toCharArray();
			Arrays.sort(arr);
			String sorted = new String(arr);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(strs[i]);
		}

		grouppedAnagrams.addAll(map.values());
		return grouppedAnagrams;
	}
}
