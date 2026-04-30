package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

import q02_advanced.question01.Coupon;

public class Member {
	private String name;
	private int age;
	private int rank;
	private int id;
	private String password;
	private List<Coupon> coupons;

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * @param coupons
	 */

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", rank=" + rank + ", id=" + id + ", password=" + password
				+ ", coupons=" + coupons + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passward) {
		this.password = passward;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Member() {
	}

	public Member(int id, String passward, String name, int age, int rank) {

		this.id = id;
		this.password = passward;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<>();
		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");
		coupons.add(coupon1);
		coupons.add(coupon2);

	}

	public void showMember() {

		System.out.println(this.toString());
	}

	public void getInstance() {
		Member member = new Member(id, password, name, age, rank);
	}

}
