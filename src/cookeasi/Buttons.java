package FridgeOperator2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import FridgeOperator.Operator;
import javax.swing.JButton;
import javax.swing.JFrame;
import Fridgex.fridge;

public class Buttons extends JFrame implements ActionListener {
	JButton button;
fridge x;

public static void main(String[] args) throws IOException {
System.out.println("I am a bag operator");
}

Buttons() {

x = new fridge(100);
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}

public void actionPerformed(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(1);
System.out.println("Food 1 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed2(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(2);
System.out.println("Food 2 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed3(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(3);
System.out.println("Food 3 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed4(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(4);
System.out.println("Food 4 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed5(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(5);
System.out.println("Food 5 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed6(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(6);
System.out.println("Food 6 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed7(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(7);
System.out.println("Food 7 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed8(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(8);
System.out.println("Food 8 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed9(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(9);
System.out.println("Food 9 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed10(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(10);
System.out.println("Food 10 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed11(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(11);
System.out.println("Food 11 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed12(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(12);
System.out.println("Food 12 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);
this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed13(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(13);
System.out.println("Food 13 has been added to the fridge.");

button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed14(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(14);
System.out.println("Food 14 has been added to the fridge.");

button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);this.setLayout(null);
this.setSize(500, 500);
this.setVisible(true);
this.add(button);
}
}

public void actionPerformed15(ActionEvent e) {
if(e.getSource()==button) {
x.addFood(15);
System.out.println("Food 15 has been added to the fridge.");
button = new JButton();
button.setBounds(200, 100, 100, 50);
button.addActionListener(this);
}
}
}