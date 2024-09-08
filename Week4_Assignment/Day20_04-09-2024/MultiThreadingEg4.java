package Test11;

class PrintCharss extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is :");
            for (int i = MultiThreadingEg4.getIndex(); i < MultiThreadingEg4.getString1().length(); i = MultiThreadingEg4.incrIndex()) {
                System.out.print(MultiThreadingEg4.getString1().charAt(i) + " ");
                Thread.sleep(20);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadingEg4 {
    private static String string1 = "This is to print individual characters";
    private static int index = 0;

    public static String getString1() {
        return string1;
    }

    public static int getIndex() {
        return index;
    }

    public static int incrIndex() {
        return index++;
    }

    public static void setIndex(int index) {
        MultiThreadingEg4.index = index;
    }

    public static void main(String[] args) {
        try {
            PrintCharss thread1 = new PrintCharss();
            thread1.start();
           
            for (; MultiThreadingEg4.getIndex() < MultiThreadingEg4.getString1().length(); MultiThreadingEg4.setIndex(MultiThreadingEg4.getIndex() + 1)) {
                System.out.print(MultiThreadingEg4.getString1().charAt(MultiThreadingEg4.getIndex()) + " ");
                Thread.sleep(25);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}