package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */

	private MemberStorage memberStorage;

	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {
		List<Member> members = memberStorage.getMembers();

		for (Member member : members) {

			if (member.getId() == id && member.getPassword().equals(password)) {
				return member;
			}
		}
		return null;
	}
}
