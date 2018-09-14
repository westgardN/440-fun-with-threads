/*
 * Practice Programs
 * 
 * 
 */
package pkg440classexercises;
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author nicolewestgard
 */
public class T1 extends Thread {
    private AtomicInteger shared = new AtomicInteger(0);
    public void run() {
        int v1 = shared.addAndGet(1);
        System.out.println(v1);
    }

    
    public static void main(String[] s) {
        T1 tInstance = new T1();
        Thread t1 = new Thread(tInstance);
        Thread t2 = new Thread(tInstance);
        t1.start();
        t2.start();
       
    }
    
}
