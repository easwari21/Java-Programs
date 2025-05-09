public class MultiThread extends Thread {
    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();
        multiThread.start();

        //2nd
        MultiThread multiThread2 = new MultiThread();
        multiThread2.start();
         //3rd
        MultiThread multiThread3 = new MultiThread();
        multiThread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    
}
