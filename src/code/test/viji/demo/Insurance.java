package code.test.viji.demo;

public class Insurance {

	private String Name = "";
	private int age = 0;
	private int BOD = 0;
	private String Add = "";
	private int Salary = 0;
	private String InsrPolicy = "";
	private int Years = 0;
	private int InsrPay = 0;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBOD() {
		return BOD;
	}
	public void setBOD(int bOD) {
		BOD = bOD;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getInsrPolicy() {
		return InsrPolicy;
	}
	public void setInsrPlicy(String insrPolicy) {
		InsrPolicy = insrPolicy;
	}
	public int getYears() {
		return Years;
	}
	public void setYears(int years) {
		Years = years;
	}
	public int getInsrPay() {
		return InsrPay;
	}
	public void setInsrPay(int insrPay) {
		InsrPay = insrPay;
	}
	@Override
	public String toString() {
		return "Inusrance [Name=" + Name + ", age=" + age + ", BOD=" + BOD + ", Add=" + Add + ", Salary=" + Salary
				+ ", InsrType=" + InsrPolicy + ", Years=" + Years + ", InsrPay=" + InsrPay + "]";
	}
	
	
	
		
		
		
	

}
