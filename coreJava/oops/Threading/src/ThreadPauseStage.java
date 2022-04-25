
public class ThreadPauseStage {

	public static void main(String[] args) {
		PrintNumber printnumber = new PrintNumber();// new Stage of thread
		PrintTable printtable =new PrintTable();// born stage of thread
		
		printnumber.start();//runnable stage
		printtable.start();//runnable
	}

}

class PrintNumber extends Thread {
	public void run() { //running stage
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println("i : " + i);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class PrintTable extends Thread{
	public void run() {//running stage
		for(int i = 1; i <= 10; i++) {
			System.out.println("5 *" + i + "="+ (5*i));
		}
	}
}