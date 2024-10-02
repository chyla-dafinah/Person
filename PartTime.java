package Person;

public class PartTime extends Teacher{
    private int hoursworked;

    public PartTime() {
        super();
        hoursworked = 0;
    }

    public PartTime(String name,int age,String subject, int hoursworked) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
    }

    public int getHouseworked() {
        return this.hoursworked;
    }

    public void setHouseworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int setSalary() {
        return hoursworked * 500000;
    }

    public void print() {
        super.print();
        System.out.println("Hours Worked :" + hoursworked);
        System.out.println("Salary : " + setSalary());
    }
}
