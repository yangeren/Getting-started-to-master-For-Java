package ch9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlermClock {
    private int delay;
    private boolean flag;

    public AlermClock(int delay, boolean flag) {
        this.delay = delay;
        this.flag = flag;
    }

    public void start() {
        class Printer implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat format = new SimpleDateFormat("k:m:s");
                String result = format.format(new Date());
                System.out.println("当前的时间是：" + result);
                if (flag) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

//        new Timer(delay, new Printer()).start();
        new javax.swing.Timer(delay, new Printer()).start();
    }

    public static void main(String[] args) {
        AlermClock alermClock = new AlermClock(10, true);
        alermClock.start();


    }
}
