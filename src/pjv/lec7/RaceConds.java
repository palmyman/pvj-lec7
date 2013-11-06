/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec7;

/**
 *
 * @author cuhellub
 */
public class RaceConds extends Thread {

    static int x, y;
    
    static Object lock = new Object();

    public static void main(String[] args) {
        new RaceConds("T1").start();
        new RaceConds("T2").start();
    }

    public RaceConds(String string) {
        super(string);
    }

    @Override
    public void run() {
        for (int i = 0;; i++) {
            //System.out.printf("%d %s\n", i, getName());
            synchronized (lock) {
                assert x + y == 0;
                int d = (int) (Math.random() * 10) - 5;
                x += d;
                y -= d;
            }
        }

    }
}
