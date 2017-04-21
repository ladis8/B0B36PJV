package LECTURE_06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ladislav on 31/03/17.
 */
public class PlusListener implements ActionListener{

    private MainFrame frame;
    public PlusListener(MainFrame frame) {
        this.frame=frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            this.frame.incrementounter();
    }
}
