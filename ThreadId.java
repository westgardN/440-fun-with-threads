package pkg440classexercises;
import java.util.concurrent.atomic.AtomicInteger;


/*
* Practice exercises from Lynda.com
* 
*/
public class ThreadId {
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };
    public static int get() {
        return threadId.get();
    }
    public static void main(String[] arguments)
    {
       
        System.out.println(nextId);
      
                
            };
        }
