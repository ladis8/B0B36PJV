package LECTURE_10.ImageDisplay;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ladislav on 5.5.17.
 */
public class ImageDisplay extends JFrame {

    public static void main(String[] args) throws MalformedURLException {

        String a = "https://cdn.theatlantic.com/assets/media/img/mt/2017/05/GettyImages_82587617/lead_960.jpg?1493676312";
        URL url = new URL(a);

        JFrame frame = new ImageDisplay();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon(url);
        int h = image.getIconHeight();
        int w = image.getIconWidth();

        frame.setSize(w,h);
        label.setIcon(image);




        frame.add(label);
        frame.setVisible(true);



    }
}
