package java100.app.teach3;

import java.util.Arrays;
import java.util.Scanner;

public class Member {

	static Scanner keyScan = new Scanner(System.in);
	protected String name;
	protected String email;
	protected int pwd;


	public Member() {
		pwd = 0;
	}

	public Member(String name, String email, int pwd) {
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pwd;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd != other.pwd)
			return false;
		return true;
	}

	public void print() {
		System.out.printf("이름   : %s\n", this.name);
		System.out.printf("이메일 : %s\n", this.email);
		System.out.println("------------------------");
	}
	public void printDetail() {
		System.out.printf("이름   : %s\n", this.name);
		System.out.printf("이메일 : %s\n", this.email);
		System.out.printf("암호   : %d\n", this.pwd);
		System.out.println("------------------------");
	}

	public void input() {
		keyScan = new Scanner(System.in);

		System.out.print("이름? ");
		this.name = keyScan.nextLine();

		System.out.print("이메일? ");
		this.email = keyScan.nextLine();

		System.out.print("암호? ");
		this.pwd = keyScan.nextInt();
	}

	public void update() {
		keyScan = new Scanner(System.in);

		System.out.printf("이름? (%s) ",this.name);
		String name = keyScan.nextLine();
		if(name.isEmpty()) {
			name = this.name;
		}
		System.out.printf("암호? (%d) ",this.pwd);
		int pwd = keyScan.nextInt();
		if(pwd == 0) {
			pwd = this.pwd;
		}

		if(Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
			this.name = name;
			this.pwd = pwd;
			System.out.println("변경하였습니다.");
		}else {
			System.out.println("변경을 취소하였습니다.");
		}
	}
}