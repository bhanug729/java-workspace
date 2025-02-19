package $13_Multithreading_and_Executor_Service.multithreading.sleep;

public class TestingSleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Before Sleeping");
		Thread.sleep(5000);
		System.out.println("Woke up");
	}
}
