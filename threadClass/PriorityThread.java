package threadClass;

public class PriorityThread {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Runnable t1 = new ThreadClass("Thread 1");
 
        Runnable t2 = new ThreadClass("Thread 2");
        
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.setPriority(10);
        th2.setPriority(1);
        
        
        th1.start();
        th2.start();
        
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
        Thread.sleep(200);}
        catch(Exception e) {}
    }
 
}
 
class ThreadClass implements Runnable {
    String s;
    public ThreadClass(String s) {
        this.s = s;
    }
    public void run() {
        for(;;) {
            System.out.println("This is thread " + this.s  );
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                
            }
        }
        
    }
}