package Test11;

//to print characters individually from a string using multi threading concept
class PrintChars extends Thread {

	String string1 = "Now, I am developing multithreaded program";

	@Override
	public void run() {
		try {
			System.out.println("Thread is :");
			for (int i = 0; i < string1.length(); i++) {
				System.out.print(string1.charAt(i)+" ");

				Thread.sleep(30);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

public class MultiThreadingEg2 {

	static String string1 = "Hi Akshaya";

	public static void main(String[] args) {

		try {

			PrintChars thread = new PrintChars();
			thread.start();
			for (int i = 0; i < string1.length(); i++) {
				System.out.print(string1.charAt(i)+" ");
				Thread.sleep(30);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
