
public class ThreadIntro {

	public static void main(String[] args) {
		MyThread myThread =new MyThread();// new/born stage of thread
		myThread.setName("MyCustomThread");
		myThread.setPriority(10);
		myThread.start();//Runnable stage of Thread
		
		System.out.println(Thread.currentThread());
		System.out.println("End of main thread");
	}

}
class MyThread extends Thread{
	public void run() {
		System.out.println("This is the my First Thread...");
		System.out.println(Thread.currentThread());
	}
}