/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec7;

/**
 *
 * @author cuhellub
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d.%s\n", i, getName());
        }
    }
    
}
