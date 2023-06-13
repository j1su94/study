package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
	public static void main(String[] args) throws IOException {
		Map<String, List<Map<String, String>>> map = new HashMap<>();
		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> tmp = new HashMap<>();
		tmp.put("a", "01");
		tmp.put("b", "라");
		tmp.put("c", null);
		list.add(tmp);
		tmp = new HashMap<>();
		tmp.put("a", "02");
		tmp.put("b", "나");
		tmp.put("c", null);
		list.add(tmp);
		//System.out.println(list);
		map.put("V1", list);

		list = new ArrayList<>();
		tmp = new HashMap<>();
		tmp.put("a", "03");
		tmp.put("b", "하");
		tmp.put("c", null);
		list.add(tmp);
		tmp = new HashMap<>();
		tmp.put("a", "04");
		tmp.put("b", "다");
		tmp.put("c", null);
		list.add(tmp);
		tmp = new HashMap<>();
		map.put("V2", list);
		System.out.println(map);
		//System.out.println();

		List<Map<String, String>> arr;
		for(String key : map.keySet()) {
			arr = map.get(key);
			Collections.sort(arr, new Comparator<Map<String, String>>() {
				@Override
				public int compare(Map<String, String> o1, Map<String, String> o2) {
					return o1.get("b").compareTo(o2.get("b"));		// 사전순
				}
			});
		}

		System.out.println(map);
	}
}