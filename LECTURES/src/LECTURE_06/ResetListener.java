package LECTURE_06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ladislav on 31/03/17.
 */
public class ResetListener implements ActionListener {
    private MainFrame frame;

    public ResetListener(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        frame.setCounter(0);
        ((JButton) event.getSource()).setEnabled(false);
    }
}
