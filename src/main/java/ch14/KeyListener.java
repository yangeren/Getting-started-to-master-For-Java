package ch14;

import java.awt.event.KeyEvent;
import java.util.EventListener;

public interface KeyListener extends EventListener {
    public void keyTyped(KeyEvent event);
    public void keyPressed(KeyEvent event);
    public void keyReleased(KeyEvent event);
}
