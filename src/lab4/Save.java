package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;

public class Save {
    public static void save(String html) throws IOException {
        if (JOptionPane.showConfirmDialog(null, "Would you like to save this to an html file?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String fileName = JOptionPane.showInputDialog(null,"What file would you like to save to?");
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
                bw.write(html);
                bw.close();
        } else {
            // no option
        }
        StringSelection stringSelection = new StringSelection(html);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

    }
}
