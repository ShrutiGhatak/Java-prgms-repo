package POJOTOPIC;
public class Employee1 {
		private int id;
		 private String Name;
		  private double salary;
		
		public Employee1(int id, String name, double salary) {
			this.id = id;
			Name = name;
			this.salary = salary;
		}
		
		@Override
	public String toString() {
			return "Employee1 [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
}
