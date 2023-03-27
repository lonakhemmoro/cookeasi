package cookeasi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SpringLayout;

public class Test7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test7 frame = new Test7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 818);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(16, 15, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		Button button = new Button("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button, 151, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, button, 194, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button, -199, SpringLayout.EAST, contentPane);
		contentPane.add(button);
		
		Button button_1 = new Button("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_1, 148, SpringLayout.SOUTH, button);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_1, 0, SpringLayout.WEST, button);
		contentPane.add(button_1);
		
		Button button_2 = new Button("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_2, 146, SpringLayout.SOUTH, button_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_2, 0, SpringLayout.WEST, button);
		contentPane.add(button_2);
	}
}
