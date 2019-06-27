package company;

public class Manager extends Employee{
	private double incentive;

	public Manager() {
	}

	public Manager(String id, String name, double salary, String dept, double incentive) {
		//super(id, name, salary, dept); //super:상위 Employee의 컨스트럭터를 쓰겠다, getter/setter도 모두 상속
		this.id = id; // 코딩상으로 안됨, private가 강력해서 상속으로도 알려주지않음, protected 가능
		//setId(id); //이건 가능
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.incentive = incentive;
	}
	// 재정의 Override
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", incentive="
				+ incentive + "]";
	}

	@Override
	public double salaryM() {
		double money = 0;
		money = super.salaryM() + this.incentive;
		return money;
	}
	
//	public double annSalary() {
//		double money = 0;
//		money = this.salaryM() * 12;
//		return money;
//	}
	
}
