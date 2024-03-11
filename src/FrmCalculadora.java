import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;

import java.awt.Button;

public class FrmCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txfDato;

	private JButton btnNumero9, btnNumero8, btnNumero7, btnNumero6, btnNumeroNotacion;
	private JButton btnNumero5, btnNumero4, btnNumero3, btnNumero2;
	private JButton btnNumero1, btnNumero0, btnNumeroMas, btnNumeroMenos;
	private JButton btnNumeroMulti, btnNumeroEntre, btnNumeroDel;
	private JButton btnNumeroAc, btnNumeroIgual, btnNumeroPunto, btnNumeroAns;
	JPanel panel;
	JLabel lblResult;
		
	
	double num, ans;
	int calculando;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalculadora frame = new FrmCalculadora();
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
	public FrmCalculadora() {
		setResizable(false);
		
		
		
		setTitle("Calculadora UACM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmCalculadora.class.getResource("/imagen/chi--3-white.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txfDato = new JTextField();
		txfDato.setHorizontalAlignment(SwingConstants.RIGHT);
		txfDato.setText("0");
		txfDato.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txfDato.setBounds(20, 111, 300, 29);
		contentPane.add(txfDato);
		txfDato.setColumns(10);
		Object window = null;
		
		
		crearBotones();
	}//fin del metodo
		
	
	
	public void crearBotones() {
		
		panel = new JPanel();
		panel.setBounds(20, 180, 300, 250);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 5));
		
		btnNumero7 = new JButton("7");
		btnNumero7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("7");
		        } else {
		            txfDato.setText(txfDato.getText() + "7");
		        }
			}
		});
		btnNumero7.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero7);
		
		btnNumero8 = new JButton("8");
		btnNumero8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("8");
		        } else {
		            txfDato.setText(txfDato.getText() + "8");
		        }
			}
		});
		btnNumero8.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero8);
		
		btnNumero9 = new JButton("9");
		btnNumero9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("9");
		        } else {
		            txfDato.setText(txfDato.getText() + "9");
		        }
			}
		});
		btnNumero9.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero9);
		
		btnNumeroDel = new JButton("");
		btnNumeroDel.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/editclear_104146.png")));
		btnNumeroDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = txfDato.getText().length();
				int number = txfDato.getText().length() - 1;
				String store;
				
				if(length > 0) {
					StringBuilder back = new StringBuilder(txfDato.getText());
					back.deleteCharAt(number);
					store = back.toString();
					txfDato.setText(store);
				}
			}
		});
		btnNumeroDel.setFont(new Font("Lucida Fax", Font.BOLD, 12));
		panel.add(btnNumeroDel);
		
		
		btnNumeroAc = new JButton("AC");
		btnNumeroAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText("");
				txfDato.setText("0");
				txfDato.requestFocusInWindow();
			}
		});
		btnNumeroAc.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroAc);
		
		btnNumero4 = new JButton("4");
		btnNumero4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("4");
		        } else {
		            txfDato.setText(txfDato.getText() + "4");
		        }
			}
		});
		btnNumero4.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero4);
		
		btnNumero5 = new JButton("5");
		btnNumero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("5");
		        } else {
		            txfDato.setText(txfDato.getText() + "5");
		        }
			}
		});
		btnNumero5.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero5);
		
		btnNumero6 = new JButton("6");
		btnNumero6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("6");
		        } else {
		            txfDato.setText(txfDato.getText() + "6");
		        }
			}
		});
		btnNumero6.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero6);
		
		btnNumeroMulti = new JButton("");
		btnNumeroMulti.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/multiplication_icon_135381.png")));
		btnNumeroMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txfDato.getText());
				calculando = 3;
				txfDato.setText("");
				lblResult.setText(num + "*");
			}
		});
		btnNumeroMulti.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroMulti);
		
		btnNumeroEntre = new JButton("");
		btnNumeroEntre.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/division_icon_138673.png")));
		btnNumeroEntre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txfDato.getText());
				calculando = 4;
				txfDato.setText("");
				lblResult.setText(num + "/");
			}
		});
		btnNumeroEntre.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroEntre);
		
		btnNumero1 = new JButton("1");
		btnNumero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("1");
		        } else {
		            txfDato.setText(txfDato.getText() + "1");
		        }
			}
		});
		btnNumero1.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero1);
		
		btnNumero2 = new JButton("2");
		btnNumero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("2");
		        } else {
		            txfDato.setText(txfDato.getText() + "2");
		        }
			}
		});
		btnNumero2.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero2);
		
		btnNumero3 = new JButton("3");
		btnNumero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            txfDato.setText("3");
		        } else {
		            txfDato.setText(txfDato.getText() + "3");
		        }
			}
		});
		btnNumero3.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero3);
				
		btnNumeroMas = new JButton("");
		btnNumeroMas.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/addition__3154.png")));
		btnNumeroMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txfDato.getText());
				calculando = 1;
				txfDato.setText("");
				lblResult.setText(num + "+");
				
			}
		});
		btnNumeroMas.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroMas);
		
		btnNumeroMenos = new JButton("");
		btnNumeroMenos.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/subtractsign_80955.png")));
		btnNumeroMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(txfDato.getText());
				calculando = 2;
				txfDato.setText("");
				lblResult.setText(num + "-");
			}
		});
		btnNumeroMenos.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroMenos);
		
		btnNumero0 = new JButton("0");
		btnNumero0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txfDato.getText().equals("0")) {
		            
		        } else {
		            txfDato.setText(txfDato.getText() + "0");
		        }
			}
		});
		btnNumero0.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumero0);
		
		btnNumeroPunto = new JButton(".");
		btnNumeroPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfDato.setText(txfDato.getText() + ".");
			}
		});
		btnNumeroPunto.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroPunto);
		
		btnNumeroAns = new JButton("");
		btnNumeroAns.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/square_root_variable_icon_198751.png")));
		btnNumeroAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(txfDato.getText());
				
				calculando = 6;
				txfDato.setText("");
				lblResult.setText(num + "?");
			}
		});
		
		btnNumeroNotacion = new JButton("x ^2");
		btnNumeroNotacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(txfDato.getText());
				
				calculando = 5;
				txfDato.setText("");
				lblResult.setText(num + "^");
			}
		});
		btnNumeroNotacion.setFont(new Font("Lucida Fax", Font.BOLD, 12));
		panel.add(btnNumeroNotacion);
		btnNumeroAns.setFont(new Font("Lucida Fax", Font.BOLD, 12));
		panel.add(btnNumeroAns);
		
		btnNumeroIgual = new JButton("");
		btnNumeroIgual.setIcon(new ImageIcon(FrmCalculadora.class.getResource("/imagen/equals_icon_175217.png")));
		btnNumeroIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//operacionesAritmeticas();
				//lblResult.setText("");
				
				try {
			        operacionesAritmeticas();
			        lblResult.setText("");
			    } catch (NumberFormatException ex) {
			        
			    	lblResult.setText("¡Error!");
			    }
				
			}
		});
		btnNumeroIgual.setFont(new Font("Lucida Fax", Font.BOLD, 16));
		panel.add(btnNumeroIgual);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResult.setForeground(new Color(255, 0, 0));
		lblResult.setBounds(20, 73, 300, 27);
		contentPane.add(lblResult);
		
		
	}//Fin del metodo
	
	public void operacionesAritmeticas() {
		
		switch(calculando) {
		case 1:
			ans = num + Double.parseDouble(txfDato.getText());
			txfDato.setText(Double.toString(ans));
			break;
		
		case 2:
			ans = num - Double.parseDouble(txfDato.getText());
			txfDato.setText(Double.toString(ans));
			break;
			
		case 3:
			ans = num * Double.parseDouble(txfDato.getText());
			txfDato.setText(Double.toString(ans));
			break;
		
		case 4:
			ans = num / Double.parseDouble(txfDato.getText());
			txfDato.setText(Double.toString(ans));
			break;
		
		case 5:
			ans = Math.pow(Integer.parseInt(txfDato.getText()), 2);
		    txfDato.setText(Integer.toString((int) ans));				
			
			break;
		
		case 6:
			ans = Math.sqrt(Double.parseDouble(txfDato.getText()));
		    txfDato.setText(Double.toString(ans));
		    break;
		
		}
				
		
	
	}//fin del metodo
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
