package pw.wyklad.test;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Random;
import java.awt.Color;

import javax.print.attribute.standard.Media;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class MainWindow extends JFrame {
	public MainWindow() {
		String path = "C:\\Users\\mrocz\\Documents\\Java\\nyan.mp3";
		//How to Play MP3 Files in Java Eclipse
		getContentPane().setBackground(SystemColor.activeCaption);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JButton btnCloseMe = new JButton("Close me");
		springLayout.putConstraint(SpringLayout.WEST, btnCloseMe, 308, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnCloseMe, -123, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnCloseMe, -122, SpringLayout.EAST, getContentPane());
		btnCloseMe.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				MainWindow k = new MainWindow();
				Random rnd = new Random();
				MainWindow j = new MainWindow();
				k.setSize(700, 500);
				j.setSize(700, 500);
				k.setVisible(true);
				j.setVisible(true);
				k.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				j.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				j.setLocation(rnd.nextInt(600), rnd.nextInt(600));
				k.setLocation(rnd.nextInt(600), rnd.nextInt(600));
			}
		});
		btnCloseMe.setFont(new Font("Tahoma", Font.PLAIN, 27));
		getContentPane().add(btnCloseMe);
		
		JLabel lblToCloseThis = new JLabel("To close this window, click this button:");
		springLayout.putConstraint(SpringLayout.NORTH, btnCloseMe, 33, SpringLayout.SOUTH, lblToCloseThis);
		lblToCloseThis.setFont(new Font("Tahoma", Font.PLAIN, 27));
		springLayout.putConstraint(SpringLayout.NORTH, lblToCloseThis, 113, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblToCloseThis, 51, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblToCloseThis);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(0, 204, 204));
		springLayout.putConstraint(SpringLayout.SOUTH, canvas, -3, SpringLayout.NORTH, lblToCloseThis);
		springLayout.putConstraint(SpringLayout.EAST, canvas, -245, SpringLayout.EAST, getContentPane());
		getContentPane().add(canvas);
		
		JLabel lblImage = new JLabel("Image");
		springLayout.putConstraint(SpringLayout.NORTH, lblImage, 33, SpringLayout.SOUTH, lblToCloseThis);
		springLayout.putConstraint(SpringLayout.WEST, lblImage, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblImage, 150, SpringLayout.SOUTH, lblToCloseThis);
		springLayout.putConstraint(SpringLayout.EAST, lblImage, 248, SpringLayout.WEST, getContentPane());
		lblImage.setIcon(new ImageIcon("C:\\Users\\mrocz\\Documents\\Java\\nyannyan.gif"));
		getContentPane().add(lblImage);
		
		JRadioButton rdbtnNowyRadio = new JRadioButton("Nowy radio");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNowyRadio, 89, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnNowyRadio, -25, SpringLayout.NORTH, lblToCloseThis);
		getContentPane().add(rdbtnNowyRadio);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new MainWindow();
		f.setSize(700, 500);
		f.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
}
