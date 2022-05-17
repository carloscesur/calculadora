import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora {

	private JFrame frame;
	private JTextField caja;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	
	public float primerNumero;
	public float segundoNumero;
	public String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 265, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja = new JTextField();
		caja.setBounds(10, 10, 230, 40);
		frame.getContentPane().add(caja);
		caja.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText("");
			}
		});
		btnNewButton.setBounds(10, 60, 50, 50);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(caja.getText());
				operador = "/";
				caja.setText("");
			}
		});
		btnNewButton_1.setBounds(70, 60, 50, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(caja.getText());
				operador = "*";
				caja.setText("");
			}
		});
		btnNewButton_2.setBounds(130, 60, 50, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(caja.getText());
				operador = "-";
				caja.setText("");
			}
		});
		btnNewButton_3.setBounds(190, 60, 50, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "7");
			}
		});
		btnNewButton_4.setBounds(10, 120, 50, 50);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "8");
			}
		});
		btnNewButton_5.setBounds(70, 120, 50, 50);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "9");
			}
		});
		btnNewButton_6.setBounds(130, 120, 50, 50);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("4");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "4");
			}
		});
		btnNewButton_7.setBounds(10, 180, 50, 50);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNumero = Float.parseFloat(caja.getText());
				operador = "+";
				caja.setText("");
			}
		});
		btnNewButton_8.setBounds(190, 120, 50, 110);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("=");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundoNumero = Float.parseFloat(caja.getText());
				
				switch(operador) {
					case "+" : caja.setText(Float.toString(primerNumero + segundoNumero));
					break;
					case "-" : caja.setText(Float.toString(primerNumero - segundoNumero));
					break;
					case "*" : caja.setText(Float.toString(primerNumero * segundoNumero));
					break;
					case "/" : caja.setText(Float.toString(primerNumero / segundoNumero));
					break;
				}
			}
		});
		btnNewButton_9.setBounds(190, 240, 50, 110);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "5");
			}
		});
		btnNewButton_10.setBounds(70, 180, 50, 50);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("6");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "6");
			}
		});
		btnNewButton_11.setBounds(130, 180, 50, 50);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "1");
			}
		});
		btnNewButton_12.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "0");
			}
		});
		btnNewButton_13.setBounds(10, 300, 110, 50);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("2");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "2");
			}
		});
		btnNewButton_14.setBounds(70, 240, 50, 50);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "3");
			}
		});
		btnNewButton_15.setBounds(130, 240, 50, 50);
		frame.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton(".");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(caja.getText().contains("."))) {
					caja.setText(caja.getText()+".");
				}
			}
		});
		btnNewButton_16.setBounds(130, 300, 50, 50);
		frame.getContentPane().add(btnNewButton_16);
	}
}
