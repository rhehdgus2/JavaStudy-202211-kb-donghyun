package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import j01_출력.SystemOut;

public class MapMethod {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("age", 29);
		map.put("gender", true);

		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로 1285");

		map.put("address", address);

		Map<Integer, String> subject = new TreeMap<>();
		subject.put(100, "java");
		subject.put(200, "C#");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");

		map.put("subject", subject);

		System.out.println(map);

		System.out.println(((Map<Integer, String>) map.get("subject")).get(403));

		List<String> hobby = new ArrayList<>();

		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");

		map.put("hobby", hobby);

		System.out.println(((List<String>) map.get("hobby")).get(2));

		System.out.println();

		Set<Entry<String, Object>> userEntry = map.entrySet();

		System.out.println(map);
		System.out.println(userEntry);

		Set<String> names = new HashSet<>();
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");

		System.out.println(names);

		for(String name : names) {
			System.out.println(name);
		}

		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
		/*=====================================*/

		Set<String> keys = map.keySet();


		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}

		System.out.println("-------------------------------");
		System.out.println(map.values());

		for(Object obj : map.values()) {
			System.out.println(obj);
		}


	}

}