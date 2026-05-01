package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する

		ConsoleReader consoleReader = new ConsoleReader();
		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> memberList = new ArrayList<>();
		memberList.add(member1);
		memberList.add(member2);

		System.out.println("===会員情報を表示します=== ");
		MemberManager.showAllMembers(memberList);
		try {
			System.out.print("input target id>> ");
			int inputId = consoleReader.inputNumber();

			System.out.print("input new password>> ");
			String newPassword = consoleReader.inputString();

			MemberManager.updatePassword(memberList, inputId, newPassword);

		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW DATA--- ");
		MemberManager.showAllMembers(memberList);
	}
}
