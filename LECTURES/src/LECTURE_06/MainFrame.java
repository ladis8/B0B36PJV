package LECTURE_06;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ladislav on 31/03/17.
 */
public class MainFrame extends JFrame {

    private int counter = 0;
    private JLabel label = new JLabel("0");

    public MainFrame(){
        super("my first window");
    }



    public int getCounter() {
        return counter;
    }

    private void updateLabel(){
        label.setText(Integer.toString(this.counter));
    }

    public void setCounter(int counter) {
       this.counter = counter;
       updateLabel();
    }
    public void incrementounter(){
            counter++;
            updateLabel();
    }
    public void decrementcounter(){
            counter--;
            updateLabel();
    }




    public void showframe(){

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(200,200,200,200);
            LayoutManager mgr = new FlowLayout();
            LayoutManager mgr2 = new GridLayout(4, 5, 40, 40);
            LayoutManager mgr3 = new BorderLayout();

            this.getContentPane().setLayout(mgr3);


            JButton plus = new JButton("+");
            JButton minus = new JButton("-");
            JButton reset = new JButton("RESET");
            JButton end= new JButton("END");



            add(plus, BorderLayout.NORTH);
            plus.addActionListener(new PlusListener(this));
            add(minus, BorderLayout.SOUTH);
            minus.addActionListener(new MinusListener(this));
            add(reset, BorderLayout.WEST);
            reset.addActionListener(new ResetListener(this));
            add(end, BorderLayout.EAST);


            end.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            add(label, BorderLayout.CENTER);


            GridBagConstraints c= new GridBagConstraints();
                c.gridx= 2;
                c.gridy =2;


            setVisible(true);


        }



}
