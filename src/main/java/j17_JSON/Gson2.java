package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {
	
	public static void main(String[] args) {
		
		User user = User.builder()
				.username("donghyun")
				.password("1234")
				.name("고동현")
//				.email("kdgkdg0217@naver.com")
				.build();
		
		System.out.println(user);
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()		// null 값 포함시켜줌
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		User userObj = null;
		
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
				
	}

}
