package Test;

public class Bit {
    protected String name;
    protected int number;
    protected String major;

    public Bit() {}
    
    public Bit(String name, int number, String major) {
        this.name = name;
        this.number = number;
        this.major = major;
    }
    
    public Bit(String csv) {
        String[] rec = csv.split(",");
        
        this.name = rec[0];
        this.number = Integer.parseInt(rec[1]);
        this.major = rec[2];
    }

    @Override
    public String toString() {
        return "Bit [name=" + name + ", number=" + number + ", major=" + major + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
}

