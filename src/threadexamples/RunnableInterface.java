package threadexamples;

/**
 * Created by Sathvik on 11/02/16.
 */
public class RunnableInterface {

    public static void main(String[] args){
        MyThreadRunnable myThread = new MyThreadRunnable();
        myThread.run();
    }

}

class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyThread Run ");
    }
}
