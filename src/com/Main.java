package com;

import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame jFrame = getFrame();


    public static void main(String[] args) {
      /*  JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("Two"));
        jPanel.add(new JButton("Three"));*/
    /*    jFrame.add(new JButton("one"),BorderLayout.NORTH);
        jFrame.add(new JButton("two"),BorderLayout.WEST);
        jFrame.add(new JButton("three"),BorderLayout.SOUTH);
        jFrame.add(new JButton("four"),BorderLayout.EAST);
        jFrame.add(new JButton("five"),BorderLayout.CENTER);*/
        JPanel jPanel=new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));

    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
