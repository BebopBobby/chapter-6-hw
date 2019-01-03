package examplesofinterfaces;

import java.awt.event.ActionEvent;

/*
The timer requires that
you specify an object of a class that implements the ActionListener interface of the
java.awt.event package.
 */

public interface ActionListener
{
    void actionPerformed(ActionEvent event);
}
