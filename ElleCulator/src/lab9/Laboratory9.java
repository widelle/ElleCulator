package lab9;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Laboratory9 extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
		JFrame frame;
		JPanel panel;
		JTextField display;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
		JButton b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
		
		private double num1, num2;
		private String operation;
		private boolean buttonClick = false;
		Calculator calcu = new Calculator();
		
		public Laboratory9(){
			//frame
			frame = new JFrame("ElleCulator🎀");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon elle = new ImageIcon("cat.jpg");
			frame.setIconImage(elle.getImage());
			frame.getContentPane().setBackground(new Color(255, 198, 198));
			
			//panel & buttons
			panel = new JPanel();
			panel.setBackground(new Color(255, 242, 242));
			panel.setBounds(15, 22, 472, 189);
			panel.setLayout(null);
			frame.add(panel);
			
			display = new JTextField();
			display.setBounds(0, 0, 472, 189);
			display.setBackground(new Color(255, 242, 242));
			display.setFont(new Font("Roboto", Font.BOLD,30));
			display.setBorder(null);
			display.setEditable(false);
			display.setHorizontalAlignment(JTextField.RIGHT);
			panel.add(display);
			
			b1 = new JButton("AC");	//AC button
			b1.setBackground(new Color(209, 234, 245));
			b1.setBounds(18, 230, 102, 72);
			b1.setBorder(null);
			b1.setFocusable(false);
			b1.setFont(new Font("Roboto", Font.BOLD,30));
			b1.addActionListener(this);
			frame.add(b1);
			
			b2 = new JButton("⌫"); //backspace button
			b2.setBackground(new Color(209, 234, 245));
			b2.setBounds(142, 230, 102, 72);
			b2.setBorder(null); 
			b2.setFocusable(false);
			b2.setFont(new Font("Roboto", Font.BOLD,30));
			b2.addActionListener(this);
			frame.add(b2);
			 
			b3 = new JButton("+/-"); //add/sub button
			b3.setBackground(new Color(209, 234, 245));
			b3.setBounds(263, 229, 102, 72);
			b3.setBorder(null);
			b3.setFocusable(false);
			b3.setFont(new Font("Roboto", Font.BOLD,30));
			b3.addActionListener(this);
			frame.add(b3);
			 
			b4 = new JButton("÷"); //divide button
			b4.setBackground(new Color(209, 234, 245));
			b4.setBounds(388, 229, 102, 72); 
			b4.setBorder(null);
			b4.setFocusable(false);
			b4.setFont(new Font("Roboto", Font.BOLD,30));
			b4.addActionListener(this);
			frame.add(b4);
			
			b5 = new JButton("7"); //7 button
			b5.setBackground(new Color(251, 251, 251));
			b5.setBounds(18, 320, 102, 72);
			b5.setBorder(null);
			b5.setFocusable(false);
			b5.setFont(new Font("Roboto", Font.BOLD,30));
			b5.addActionListener(this);
			frame.add(b5);  
			
			b6 = new JButton("4"); //4 button
			b6.setBackground(new Color(251, 251, 251));
			b6.setBounds(18, 404, 102, 72);
			b6.setBorder(null);
			b6.setFocusable(false);
			b6.setFont(new Font("Roboto", Font.BOLD,30));
			b6.addActionListener(this);
			frame.add(b6);
			
			b7 = new JButton("1"); //1 button
			b7.setBackground(new Color(251, 251, 251));
			b7.setBounds(18, 494, 102, 72);
			b7.setBorder(null);
			b7.setFocusable(false);
			b7.setFont(new Font("Roboto", Font.BOLD,30));
			b7.addActionListener(this);
			frame.add(b7);
			
			b8 = new JButton("%"); //modulus button
			b8.setBackground(new Color(251, 251, 251));
			b8.setBounds(18, 583, 102, 72);
			b8.setBorder(null);
			b8.setFocusable(false);
			b8.setFont(new Font("Roboto", Font.BOLD,30));
			b8.addActionListener(this);
			frame.add(b8);
			
			b9 = new JButton("8"); //8 button
			b9.setBackground(new Color(251, 251, 251));
			b9.setBounds(142, 321, 102, 72);
			b9.setBorder(null);
			b9.setFocusable(false);
			b9.setFont(new Font("Roboto", Font.BOLD,30));
			b9.addActionListener(this);
			frame.add(b9); 
			
			b10 = new JButton("5"); //5 button
			b10.setBackground(new Color(251, 251, 251));
			b10.setBounds(142, 404, 102, 72);
			b10.setBorder(null);
			b10.setFocusable(false);
			b10.setFont(new Font("Roboto", Font.BOLD,30));
			b10.addActionListener(this);
			frame.add(b10); 
			
			b11 = new JButton("2");  //2 button
			b11.setBackground(new Color(251, 251, 251));
			b11.setBounds(142, 494, 102, 72);
			b11.setBorder(null);
			b11.setFocusable(false);
			b11.setFont(new Font("Roboto", Font.BOLD,30));
			b11.addActionListener(this);
			frame.add(b11); 
			
			b12 = new JButton("0"); //0 button
			b12.setBackground(new Color(251, 251, 251));
			b12.setBounds(142, 583, 102, 72);
			b12.setBorder(null);
			b12.setFocusable(false);
			b12.setFont(new Font("Roboto", Font.BOLD,30));
			b12.addActionListener(this);
			frame.add(b12); 
			
			b13 = new JButton("9"); //9 button
			b13.setBackground(new Color(251, 251, 251));
			b13.setBounds(263, 321, 102, 72);
			b13.setBorder(null);
			b13.setFocusable(false);
			b13.setFont(new Font("Roboto", Font.BOLD,30));
			b13.addActionListener(this);
			frame.add(b13); 
			
			b14 = new JButton("6"); //6 button
			b14.setBackground(new Color(251, 251, 251));
			b14.setBounds(263, 404, 102, 72);
			b14.setBorder(null);
			b14.setFocusable(false);
			b14.setFont(new Font("Roboto", Font.BOLD,30));
			b14.addActionListener(this);
			frame.add(b14); 
			 
			b15 = new JButton("3"); //3 button
			b15.setBackground(new Color(251, 251, 251));
			b15.setBounds(263, 494, 102, 72); 
			b15.setBorder(null);
			b15.setFocusable(false);
			b15.setFont(new Font("Roboto", Font.BOLD,30));
			b15.addActionListener(this);
			frame.add(b15);  
			
			b16 = new JButton("."); //decimal point button
			b16.setBackground(new Color(251, 251, 251));
			b16.setBounds(263, 583, 102, 72);
			b16.setBorder(null);
			b16.setFocusable(false);
			b16.setFont(new Font("Roboto", Font.BOLD,30));
			b16.addActionListener(this);
			frame.add(b16); 
			
			b17 = new JButton("x"); //multiply button
			b17.setBackground(new Color(209, 234, 245));
			b17.setBounds(388, 320, 102, 72); 
			b17.setBorder(null);
			b17.setFocusable(false);
			b17.setFont(new Font("Roboto", Font.BOLD,30));
			b17.addActionListener(this);
			frame.add(b17); 
			
			b18 = new JButton("-"); //subtraction button
			b18.setBackground(new Color(209, 234, 245));
			b18.setBounds(388, 403, 102, 72); 
			b18.setBorder(null);
			b18.setFocusable(false);
			b18.setFont(new Font("Roboto", Font.BOLD,30));
			b18.addActionListener(this);
			frame.add(b18); 
			
			b19 = new JButton("+"); //add button
			b19.setBackground(new Color(209, 234, 245));
			b19.setBounds(388, 493, 102, 72); 
			b19.setBorder(null);
			b19.setFocusable(false);
			b19.setFont(new Font("Roboto", Font.BOLD,30));
			b19.addActionListener(this);
			frame.add(b19); 
			
			b20 = new JButton("="); //equals button
			b20.setBackground(new Color(195, 214, 242));
			b20.setBounds(388, 582, 102, 72); 
			b20.setBorder(null);
			b20.setFocusable(false);
			b20.setFont(new Font("Roboto", Font.BOLD,30));
			b20.addActionListener(this);
			frame.add(b20); 
			
			//frame2
			frame.setSize(518  , 710);
			frame.setResizable(false);
			frame.setLayout(null);
			frame.setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		    JButton button = (JButton) e.getSource();
		    String buttonText = button.getText();
		    String displayText = display.getText();

		    if (buttonText.matches("[0-9.]")) {
		        if (buttonClick) {
		            display.setText("");
		            buttonClick = false;
		        }
		        display.setText(display.getText() + buttonText);
		    } else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("x") || buttonText.equals("÷") || buttonText.equals("%")) {
		        if (!displayText.isEmpty() && isNumeric(displayText)) {
		            num1 = Double.parseDouble(displayText);
		            operation = buttonText;
		            buttonClick = true;
		        }
		    } else if (buttonText.equals("=")) {
		        if (!displayText.isEmpty() && operation != null && isNumeric(displayText)) {
		            num2 = Double.parseDouble(displayText);
		            double result = 0;
		            switch (operation) {
		                case "+":
		                    result = calcu.add(num1, num2);
		                    break;
		                case "-":
		                    result = calcu.subtract(num1, num2);
		                    break;
		                case "x":
		                    result = calcu.multiply(num1, num2);
		                    break;
		                case "÷":
		                    if (num2 == 0) {
		                        display.setText("Error!");
		                        return;
		                    }
		                    result = calcu.divide(num1, num2);
		                    break;
		                case "%":
		                    result = num1 % num2;
		                    break;
		            }
		            if (result == (long) result) {
		                display.setText(String.valueOf((long) result));
		            } else {
		                display.setText(String.valueOf(result));
		            }
		            buttonClick = true;
		        }
		    } else if (buttonText.equals("AC")) {
		        display.setText("");
		        num1 = 0;
		        num2 = 0;
		        operation = null;
		        buttonClick = false;
		    } else if (buttonText.equals("⌫")) {
		        if (displayText.length() > 0) {
		            display.setText(displayText.substring(0, displayText.length() - 1));
		        }
		    } else if (buttonText.equals("+/-")) {
		        if (!displayText.isEmpty() && isNumeric(displayText)) {
		            double val = Double.parseDouble(displayText);
		            val = -val;
		            display.setText(String.valueOf(val));
		        }
		    }
		}


		private boolean isNumeric(String type) {
		    if (type == null || type.isEmpty()) {
		    	return false;
		    }
		    
		    boolean deci = false;
		    int one = 0;
		    
		    if(type.charAt(0) == '-' || type.charAt(0) == '+') {
		    	one = 1;
		    }

		    for (int i = one; i < type.length(); i++) {
		        char c = type.charAt(i);
		        if(Character.isDigit(c)) {
		        	continue;
		        }else if (c == '.') {
		            if (deci) {
		            	return false;
		            }
		            deci = true;
		        } else {
		            return false;
		        }
		    }
		    return true;
		}


	public static void main(String[] args) {
		new Laboratory9();
	}
}