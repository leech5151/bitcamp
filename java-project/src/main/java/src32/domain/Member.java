package src32.domain;

import src32.control.CSVFomatException;

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
    public Member(String csv) throws CSVFomatException {
    	String[] rec = csv.split(",");
		if(rec.length != 3)
			throw new CSVFomatException("CSV 데이터 항목이 올바르지 않습니다.");


		this.name = rec[0];
		this.email = rec[1];
		this.password = rec[2];
    }
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", password=" + password + "]";
    }
    public String toCSVString() {
    	return String.format("%s,%s,%s\n",
				this.getName(),
				this.getEmail(),
				this.getPassword());
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
    
}









