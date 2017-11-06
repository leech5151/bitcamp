package java100.app.Me3;

import java.util.Arrays;
import java.util.Scanner;

public class Member {
	  
		static Scanner keyScan = new Scanner(System.in);
	    protected String name;
	    protected String email;
	    protected int pwd;


		public Member() {}
	    
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
	        System.out.printf("%-4s, %4s, %4d\n",  
	                this.name, 
	                this.email);
	    }
		public void printDatail() {
	        System.out.printf("%-4s, %4s, %4d\n",  
	                this.name, 
	                this.email, 
	                this.pwd);
	    }
	    
	    public void input() {
	    	keyScan = new Scanner(System.in);
	        
	        System.out.print("�̸�? ");
	        this.name = keyScan.nextLine();
	        
	        System.out.print("�̸���? ");
	        this.email = keyScan.nextLine();
	        
	        System.out.print("��ȣ? ");
	        this.pwd = keyScan.nextInt();
	    }
	    
	 /*   public void update() {
	    	keyScan = new Scanner(System.in);
	        
	        System.out.printf("����? (%d) ",subjects[0]);
	        int kor = this.subjects[0];
	        try {
	        	kor = Integer.parseInt(keyScan.nextLine());
	        }catch(Exception e) {}
	        
	        System.out.printf("����? (%d) ",subjects[1]);
	        int eng = this.subjects[0];
	        try {
	        	eng = Integer.parseInt(keyScan.nextLine());
	        }catch(Exception e) {}
	        
	        System.out.printf("����? (%d) ",subjects[2]);
	        int math = this.subjects[0];
	        try {
	        	math = Integer.parseInt(keyScan.nextLine());
	        }catch(Exception e) {}
	        
	        if(confirm2("�����Ͻðڽ��ϱ�?(y/N) ")) {
	        	this.subjects[0] = kor;
	        	this.subjects[1] = eng;
	        	this.subjects[2] = math;
	        	this.compute();
	        	System.out.println("�����Ͽ����ϴ�.");
	        }else {
	        	System.out.println("������ ����Ͽ����ϴ�.");
	        }
	    }*/
	    
	    static boolean confirm2(String message) {
	    	keyScan = new Scanner(System.in);
			System.out.print(message);
			String response = keyScan.nextLine().toLowerCase();

			if (response.equals("n") || response.equals("no") || response.equals("")) {
				return false;
			}
			return true;
		}
	
}
