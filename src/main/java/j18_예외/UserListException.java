package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User {
	private String username;
	private String password;
}

public class UserListException {
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		
		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);
		
		int length = userList.size();
		
		try {
			for(int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			for(int i = 0; i < length; i++) {
				System.out.println("username: " + userList.get(i).getUsername());
				System.out.println("password: " + userList.get(i).getPassword());
			}
		}catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			length -= 1;
			System.out.println(indexOutOfBoundsException.getMessage());
			try {
				for(int i = 0; i < length; i++) {
				System.out.println("username: " + userList.get(i).getUsername());
				System.out.println("password: " + userList.get(i).getPassword());
				}
			} catch (NullPointerException nullPointerException) {
				System.out.println(nullPointerException.getMessage());
			}
		}
		catch (NullPointerException nullPointerException) {
			System.out.println(nullPointerException.getMessage());
		}
		catch (Exception e) {	//예상한 예외들이 처리 안됐을때 여기서 처리함, 로그 기록 남김
			e.printStackTrace();
		}
		finally {
			// 예외 처리가 발생했든말든 무조건 마지막에 항상 실행되는 부분
			System.out.println("무조건 실행");
		}
		System.out.println("무조건 실행");
		System.out.println("프로그램 정상 종료");
	}

}
