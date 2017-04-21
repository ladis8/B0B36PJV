package LECTURE_07.main.java.cz.cvut.fel.pjv.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicLoggingUsage {

    private static final Logger LOG = Logger.getLogger(BasicLoggingUsage.class.getName());

    public static void main(String[] args) {
        //logger - depends how important messages are we going to log
        //how messages will be displayed
        LOG.setLevel(Level.FINEST);
        LOG.finest("Finest message");
        LOG.severe("Severe message");
        LOG.info("Info message");

    }

}
