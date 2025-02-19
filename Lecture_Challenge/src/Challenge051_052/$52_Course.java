package Challenge051_052;

class $52_Course {
	static int maxCapacity = 100;
	String courseName;
	int enrollments;
	String[] enrolledStudents;

	$52_Course(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrolledStudents = new String[maxCapacity];
	}

	void setMaxCapacity(int capacity) {
		if (enrollments < capacity) {
			String[] temp = enrolledStudents;
			enrolledStudents = new String[capacity];
			int i = 0;
			while (i < temp.length) {
				enrolledStudents[i] = temp[i];
				i++;
			}
			System.out.println("Your new max capcity is updated by " + enrolledStudents.length);
			
		} else {
			System.out.println("Can't do this, you'll miss your data");
		}
	}

	void enrollStudent(String studentName) {
		enrolledStudents[enrollments] = studentName;
		enrollments++;
	}

	void unenrollStudent(String studentName) {
		boolean removed = false;
		int i = 0;
		while (i < enrollments) {
			if (!removed && (enrolledStudents[i].equals(studentName))) {
				System.out.println(studentName + " Student removed from " + courseName);
				enrolledStudents[i] = null;
				removed = true;
				enrollments--;
				i++;
				continue;
			}
			if (removed) {
				enrolledStudents[i - 1] = enrolledStudents[i];
			}
			i++;
		}
		if (!removed) {
			System.out.println(studentName + " didn't enroll.");
		}
	}

	void viewenrolledStudent() {
		for (int i = 0; i < enrollments; i++) {
			System.out.print(enrolledStudents[i] + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		$52_Course c = new $52_Course("GK Coding");
		c.enrollStudent("Happy");
		c.enrollStudent("Sonu");
		c.enrollStudent("Pawel");

		System.out.print("Total " + c.enrollments + " Enrolled Students in " + c.courseName + "\n");
		c.viewenrolledStudent();

		$52_Course course = new $52_Course("KG Coding");
		course.enrollStudent("Bhanu");
		course.enrollStudent("Pratap");
		course.enrollStudent("Gupta");
		course.enrollStudent("Ajay");
		course.enrollStudent("Ram");
		course.enrollStudent("Sita");

		System.out.print("\nTotal " + course.enrollments + " Enrolled Students in " + course.courseName + "\n");
		course.viewenrolledStudent();

		String delStudent = "Pratap2";
		System.out.println("\nDeleting 1 student from " + course.courseName + ": " + delStudent);
		course.unenrollStudent(delStudent);

		System.out.println("\nCurrent Available Enrolled Students " + course.courseName + " : ");
		course.viewenrolledStudent();

		System.out.println("Capacity is " + course.enrolledStudents.length);
		course.setMaxCapacity(3);
		System.out.println("Capacity is " + course.enrolledStudents.length);
		course.setMaxCapacity(200);
		System.out.println("Capacity is " + course.enrolledStudents.length);

	}
}
