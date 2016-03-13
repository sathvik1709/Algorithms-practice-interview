package threadexamples;

/**
 * Created by Sathvik on 11/02/16.
 */
public class ThreadClassExample {

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }

}

class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread Run " + this.getId());
    }
}
