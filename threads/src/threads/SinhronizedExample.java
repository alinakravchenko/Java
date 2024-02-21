package threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SinhronizedExample {
private static int sharedVariable =0;

/*public static synchronized void incrementVariable() {
	sharedVariable++;
}*/
public static synchronized int rFactorial(int n) {
	if(n==0) {
		return 1;
	}
	else {
		return n * rFactorial(n-1);
	}
}
public static synchronized int lFactorial(int n) {
	int result =1;
	for(int i=1; i<=n; i++) {
		result*=i;
	}
	return result;
}
public static synchronized int throwDice() {
	int low =1;
	int high = 7;
	Random random = new Random();
	return (random.nextInt(high - low)) + low;
}
	public static void main(String[] args) {
		Thread thread1 = new Thread(()->{
			/*for(int i =0; i<1000; i++) {	
				incrementVariable();
			}*/
			
			System.out.println(rFactorial(10)+ " recursion");
		});
       
		Thread thread2 = new Thread(()->{
			/*for(int i =0; i<1000; i++) {	
				incrementVariable();
			}*/
			
			System.out.println(lFactorial(10)+ " loops");
		});
		Thread thread3 = new Thread(() -> {
            int numRolls = 2;
            int total = 0;

            for (int i = 0; i < numRolls; i++) {
                total += throwDice();
            }

            System.out.println("Result: " + total);
        });

        thread3.start();
		//thread1.start();
        //thread2.start();
		try {
			thread1.join();
            thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("the value of the variable after increasing: "+sharedVariable);
		
		/*ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0; i<1000;i++) {
			executor.execute(()->{
				synchronized(SinhronizedExample.class) {
					sharedVariable++;
					System.out.println("the value of the variable: "+ Thread.currentThread().getName());
				}
			
			});
			
		}
		executor.shutdown();
		System.out.println("the value of the variable: "+ sharedVariable);
		Thread.sleep(5000);*/
		
	}

}
