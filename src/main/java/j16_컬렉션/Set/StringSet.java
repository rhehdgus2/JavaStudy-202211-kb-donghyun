package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("고동현");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");

		System.out.println(nameSet);

		for (String s : nameSet) {
			if (s.equals("고동현")) {
				System.out.println(s);
				break;
			}
		}
		
		List<String> nameList = Arrays.asList(new String[] {"고동현", "권용범"});
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList);
		
		System.out.println(listToSet);
		
		nameSet.remove("고동현");
		
		System.out.println(nameSet);
	}
}