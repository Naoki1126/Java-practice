package extend.human;

public class Employee extends Human {
	private String deparment;

	public Employee(String name, int age, String deparment) {
		super(name,age);
		this.deparment = deparment;
	}

	public String getEmployeeProfile() {
		String profile = "年齢は、" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.deparment + "です。";
		return profile;
	}
}
