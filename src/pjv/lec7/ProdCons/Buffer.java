/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjv.lec7.ProdCons;

/**
 *
 * @author cuhellub
 */
public class Buffer {

    double d;
    private boolean valid;

    public synchronized double getD() {
        while (!valid) {
            try {
                wait();
            } catch (InterruptedException ex) {
                
            }
        }
        valid = false;
        notify();
        return d;
    }

    public synchronized void setD(double d) {
        while (valid) {
            try {
                wait();
            } catch (InterruptedException ex) {
                
            }
        }
        this.d = d;
        valid = true;
        notifyAll();
    }

    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Producent(b).start();
        new Consument(b).start();
    }
}
