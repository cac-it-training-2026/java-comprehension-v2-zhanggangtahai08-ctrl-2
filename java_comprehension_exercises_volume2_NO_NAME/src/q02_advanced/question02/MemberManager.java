package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {
	}

	// 15. 会員一覧表示メソッド
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {

			member.showMember();
			System.out.println("******************");
		}
	}

	// 16. パスワード更新メソッド
	public static void updatePassword(List<Member> members, int id, String password) {
		boolean isFound = false;

		for (Member member : members) {
			if (member.getId() == id) {
				member.setPassword(password);
				System.out.println("===パスワードを変更します=== ");
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
