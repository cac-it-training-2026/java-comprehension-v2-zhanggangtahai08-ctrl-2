package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member member1 = new Member(2, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		member1.showMember();
		System.out.println("******************");
		member2.showMember();
		System.out.println("******************");
	}

}
