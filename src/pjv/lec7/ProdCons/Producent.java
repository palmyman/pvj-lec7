/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec7.ProdCons;

/**
 *
 * @author cuhellub
 */
public class Producent extends Thread {

    Buffer buf;

    public Producent(Buffer buf) {
        this.buf = buf;
    }

    @Override
    public void run() {
        for (;;) {
            buf.setD(Math.random());
            //yield();
            try {
                sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
}
