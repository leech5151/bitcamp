package java100.app.teach;

import java.util.Scanner;

public class Member {

	protected String name;
	protected String email;
	protected String password;

	public Member() {}

	public Member(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public void update() {
		Scanner keyScan = new Scanner(System.in);

		System.out.printf("이름?(%s) ", this.name);
		String name = keyScan.nextLine();
		if (name.isEmpty()) {
			name = this.name;
		}

		System.out.printf("암호? ", this.password);
		String password = keyScan.nextLine();
		if (password.isEmpty()) {
			password = this.password;
		}

		if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
			this.name = name;
			this.password = password;
			System.out.println("변경하였습니다.");

		} else {
			System.out.println("변경을 취소하였습니다.");
		}
	}    
}









