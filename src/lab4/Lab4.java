/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;

public class Lab4 {

    public static void main(String[] args) throws IOException {
        String opt = "";

        while (!opt.equals("Quit")){
            List<String> optionList = new ArrayList<String>();
            optionList.add("Quit");
            optionList.add("Create Link");
            optionList.add("Create Table");
            optionList.add("Create Image");

            Object[] options = optionList.toArray();
            int value = JOptionPane.showOptionDialog(
                    null,
                    "Select what you would like to create",
                    "HTML builder",
                    JOptionPane.YES_NO_OPTION,
                    -1,
                    null,
                    options,
                    optionList.get(0));
            opt = optionList.get(value);
            if (opt.equals("Create Link")){
                String linkInput = JOptionPane.showInputDialog("Enter the link");
                String descInput = JOptionPane.showInputDialog("Enter the link description (This is the text that will be displayed)");
                Link myLink = new Link();
                myLink.setLink(linkInput);
                myLink.setDesc(descInput);
                showMessageDialog(null, "HTML Output \n " + myLink.getHTML());
            }

            if (opt.equals("Create Table")){
                int rowsInput = parseInt(JOptionPane.showInputDialog("Enter amount rows"));
                int columnsInput = parseInt(JOptionPane.showInputDialog("Enter amount of columns"));
                Table myTable = new Table();
                myTable.setRows(rowsInput);
                myTable.setColumns(columnsInput);
                JTextArea textArea = new JTextArea(myTable.getHTML(), 20, 20);
                JScrollPane sp = new JScrollPane(textArea);
                sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                JOptionPane.showMessageDialog(null, sp);

            }

            if (opt.equals("Create Image")){
                String imageInput = JOptionPane.showInputDialog("Enter image link");
                String altInput = JOptionPane.showInputDialog("Enter the alt text (This is a description of your image that web crawlers and screen readers will see) ");
                Image myImage = new Image();
                myImage.setImg(imageInput);
                myImage.setAlt(altInput);
                showMessageDialog(null, "HTML Output \n " + myImage.getHTML());

            }

        }
    }

}
