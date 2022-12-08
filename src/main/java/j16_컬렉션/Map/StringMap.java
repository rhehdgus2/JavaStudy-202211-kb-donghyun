package j16_컬렉션.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringMap {
	
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();
		
		language.put("java", "자바2");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");	// 값은 중복으로 들어갈수 있지만 키 값은 중복으로 들어가면 안된다.
		language.put("python2", "파이썬");
		language.put("python", "파이썬?");
		
		System.out.println(language);
		
		String s = language.get("java");
		System.out.println(s);
		
		language.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
		System.out.println();

		for(Entry<String, String> entry : language.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
		System.out.println();

		Iterator<String> ir = language.keySet().iterator();

		while(ir.hasNext()) {
			String key = ir.next();
			System.out.println("key: " + key);
			System.out.println("value: " + language.get(key));
		}
	}
}