package Collections;

public class ListEmployee {

	private Integer id;
	private String name;
	private Double salary;

	public ListEmployee() {
	}

	public ListEmployee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void IncreaseSalary(double porcentage) {
		// salary = salary + expressão
		salary += salary * porcentage / 100.0;
	}

	public String toString() {
		return id + " - " + name + "	R$" + String.format("%.2f", salary);
	}

}
