/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec7.ProdCons;

/**
 *
 * @author cuhellub
 */
public class Consument extends Thread {

    Buffer buf;

    public Consument(Buffer buf) {
        this.buf = buf;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(buf.getD());
        }
    }
}
