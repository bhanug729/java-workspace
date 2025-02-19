package Challenge070_076;

class $70_StudentToString {
	String name;
	int age;
	String rollNumber;
	String house;

	public $70_StudentToString(String name, int age, String rollNumber, String house) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.house = house;
	}

	@Override
	public String toString() {
		return "Student Details:{name:" + name + ", age:" + age + ", roll number:" + rollNumber + ", house:" + house
				+ " }";
	}

	public static void main(String[] args) {
		$70_StudentToString stu = new $70_StudentToString("Prashant", 30, "001", "Shivaji");
		System.out.println(stu);
	}
}
