public class ThreadDemo1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    int j = 20;
    @Override
    public void run() {
        for (int i = 0;i < 20;i++){
            System.out.println(Thread.currentThread().getName()+", j="+this.j--);
        }
    }
}