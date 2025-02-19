package $13_Multithreading_and_Executor_Service.multithreading.synchronize;

public class Counter {

	private int count = 0;

	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}
