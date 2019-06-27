package company;

public class Manager extends Employee{
	private double incentive;

	public Manager() {
	}

	public Manager(String id, String name, double salary, String dept, double incentive) {
		//super(id, name, salary, dept); //super:���� Employee�� ����Ʈ���͸� ���ڴ�, getter/setter�� ��� ���
		this.id = id; // �ڵ������� �ȵ�, private�� �����ؼ� ������ε� �˷���������, protected ����
		//setId(id); //�̰� ����
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.incentive = incentive;
	}
	// ������ Override
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
