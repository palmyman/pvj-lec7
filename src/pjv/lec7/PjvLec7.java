/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec7;

/**
 *
 * @author cuhellub
 */
public class PjvLec7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread.dumpStack();
        System.out.println(Thread.currentThread().getPriority());
        new MyThread("hello1").start();
        new MyThread("hello2").start();
        new MyThread("hello3").start();
        new MyThread("hello4").start();
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Other thread");
            }
        });
        t.start();
        // TODO code application logic here
    }
}
