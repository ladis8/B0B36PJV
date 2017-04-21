package LECTURE_06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ladislav on 31/03/17.
 */
public class MinusListener implements ActionListener {

    private MainFrame frame;

    public MinusListener(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.decrementcounter();
    }
}
