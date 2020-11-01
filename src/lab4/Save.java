package lab4;

import javax.swing.*;
import java.io.*;

public class Save {
    public static void save(String html) throws IOException {
        if (JOptionPane.showConfirmDialog(null, "Would you like to save this to an html file?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String fileName = JOptionPane.showInputDialog(null,"What file would you like to save to? .html is automatically added at the end");
                fileName = fileName + ".html";
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
                bw.write(html);
                bw.close();
        }

    }
}
