package com.java.swing;

import javax.swing.JFrame;

class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Windows");
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}