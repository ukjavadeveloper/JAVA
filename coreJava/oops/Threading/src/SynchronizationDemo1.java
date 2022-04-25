
public class SynchronizationDemo1 {

	public static void main(String[] args) {
	Printer print = new Printer();
	PrintTableTh table =new PrintTableTh(print);
	PrintNames name =new PrintNames(print);
	table.start();
	name.start();
	}

}
class PrintTableTh extends Thread{
	Printer print;
	PrintTableTh(Printer print){
		this.print = print;
	}
	public void run() {
		synchronized(print) {
			for(int i = 1; i <=10 ; i++) {
				print.print("5 * " + i + " = " + (5*i));
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				if(i==5) {
					try {
					print.wait();
					}catch(InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}
	
}
class PrintNames extends Thread{
	String names[] = {"A","B","C","D","E","F","G","H","I"};
	Printer print;
	PrintNames(Printer print){
		this.print = print;
	}
	public void run() {
		
		synchronized(print) {
			for(String nm : names) {
				print.print("Employee : "+nm);
			}
			print.notifyAll();
		}
	}
}
class Printer{
	//public synchronized void print(String val) {
	public void print(String val) {
		System.out.println(val);
	}
}