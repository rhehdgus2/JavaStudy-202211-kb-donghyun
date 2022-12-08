package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {
	public static void main(String[] args) {
		Function<String, String> replacePhoneToken = phoneNumber ->
		phoneNumber.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");	// .쓸때는 [] 안에 넣어줘야함
		
		String phone1 = "010-6784/6033";
		String phone2 = "010.6784/6033";
		String phone3 = "010 6784/6033";
		String phone4 = "010-6784 6033";
		
//		phone1.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone2.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone3.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
//		phone4.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		
		System.out.println(replacePhoneToken.apply(phone1));
		System.out.println(replacePhoneToken.apply(phone2));
		System.out.println(replacePhoneToken.apply(phone3));
		System.out.println(replacePhoneToken.apply(phone4));
	
	}

}
