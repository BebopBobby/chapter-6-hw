package interfaces;

import java.awt.event.MouseEvent;

/*
programmers who implement this interface only need to override the
listeners for the events they actually care about.
 */

public interface MouseListener
{
    default void mouseClicked(MouseEvent event) {}
    default void mousePressed(MouseEvent event) {}
    default void mouseReleased(MouseEvent event) {}
    default void mouseEntered(MouseEvent event) {}
    default void mouseExited(MouseEvent event) {}
}

