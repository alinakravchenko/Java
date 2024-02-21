package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable {
    public void run() {
    	System.out.println("Other thread in another");
    }
	public static void main(String[] args) {
		/*MyRunnable myRunnable = new MyRunnable();
		Thread thread =  new Thread(myRunnable);
        thread.start();*/
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i<10; i++) {
			Runnable task = ()->System.out.println("completing a task in a thread: " + Thread.currentThread().getName());
			executor.execute(task);
		}
		executor.shutdown();
	}

}
