package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {

		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader consoleReader = new ConsoleReader();
		MemberStorage memberStorage = new MemberStorage();
		LoginService loginService = new LoginService(new MemberStorage());
		Member member = null;
		while (!isLogin) {

			try {
				System.out.print("input id>>");
				int id = consoleReader.inputNumber();
				System.out.print("input password>>");
				String password = consoleReader.inputString();
				member = loginService.doLogin(id, password);
				if (member == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
					continue;
				}
				System.out.println("ログインに成功しました");
				isLogin = true;
			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				System.out.println("不正な入力です。再度入力してください");
				e.printStackTrace();
				continue;
			}
			System.out.println("ログインユーザ情報を表示します。 ");
			System.out.println(member);
			//
		}

	}

}
