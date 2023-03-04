package digitalClock;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDigitalClock {
    public static void main(String[] args) {
            Date presentDate = new Date();
            String time = new SimpleDateFormat("hh:mm:ss a").format(presentDate);
            String date = new SimpleDateFormat("dd MMM, yyyy").format(presentDate);
            String message = "Time: " + time + "\nDate: " + date;
            JOptionPane.showMessageDialog(null, message, "Powered by 9KICKS", JOptionPane.INFORMATION_MESSAGE);
    }
}