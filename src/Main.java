public class Main {
    public static void main(String[] args) {
        Thread a = new Thread(new MyRunnable('0'));
        Thread b = new Thread(new MyRunnable('1'));
         a.start();
         b.start();
    }
}
class MyRunnable implements Runnable{
    char c;

    public MyRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i = 0; i<50; i++){
            System.out.println(c);
        }

    }
}