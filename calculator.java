
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener{

	Boolean isOparetoclicked=false;
	JFrame jf;
	JLabel l;
	JButton sevenbutton,eightbutton,ninebutton,
	        plusbutton,fourbutton,fivebutton,sixbutton,
	        minbutton,onebutton,twobutton,threebutton,mulbutton
	        , dotbutton,zerobutton,equelbutton,subbutton,clearbutton;
	
	double newValue, oldValue;
	int calculation;
	
	public Calculator(){
        jf=new JFrame("calculator");
        jf.setBounds(0, 0, 500, 550);
        jf.setLayout(null);
        jf.getContentPane().setBackground(Color.PINK);


        l=new JLabel();
        l.setBounds(20, 30, 440, 90);
        l.setOpaque(true);
        l.setHorizontalAlignment(SwingConstants.RIGHT);
    
        l.setFont(new Font("arial", Font.PLAIN ,30));
       l.setVisible(true);
        jf.add(l);

        sevenbutton=new JButton("7");
        sevenbutton.setBounds(20, 150, 70, 70);
        sevenbutton.setFont(new Font("arial", Font.PLAIN ,20));
        sevenbutton.addActionListener(this); 
        sevenbutton.setOpaque(true);
        jf.add(sevenbutton);
        

        eightbutton=new JButton("8");
        eightbutton.setBounds(110, 150, 70, 70);
        eightbutton.setFont(new Font("arial", Font.PLAIN ,20));
        eightbutton.addActionListener(this);
    
        eightbutton.setOpaque(true);
        jf.add(eightbutton);

        ninebutton=new JButton("9");
        ninebutton.setBounds(200, 150, 70, 70);
        ninebutton.setFont(new Font("arial", Font.PLAIN ,20));
        ninebutton.addActionListener(this);
 
        ninebutton.setOpaque(true);
        jf.add(ninebutton);

        plusbutton=new JButton("+");
        plusbutton.setBounds(290, 150, 75, 70);
        plusbutton.setFont(new Font("arial", Font.PLAIN ,30));
        plusbutton.addActionListener(this);
     
        plusbutton.setOpaque(true);
        jf.add(plusbutton);
        
        minbutton=new JButton("-");
        minbutton.setBounds(385, 150, 75, 70);
        minbutton.setFont(new Font("arial", Font.PLAIN ,35));
        minbutton.addActionListener(this);
   
        minbutton.setOpaque(true);
        jf.add(minbutton);

        fourbutton=new JButton("4");
        fourbutton.setBounds(20, 240, 70, 70);
        fourbutton.setFont(new Font("arial", Font.PLAIN ,20));
        fourbutton.addActionListener(this);
       
        fourbutton.setOpaque(true);
        jf.add(fourbutton);
        

        fivebutton=new JButton("5");
        fivebutton.setBounds(110, 240, 70, 70);
        fivebutton.setFont(new Font("arial", Font.PLAIN ,20));
        fivebutton.addActionListener(this);

        fivebutton.setOpaque(true);
        jf.add(fivebutton);

        sixbutton=new JButton("6");
        sixbutton.setBounds(200, 240, 70, 70);
        sixbutton.setFont(new Font("arial", Font.PLAIN ,20));
        sixbutton.addActionListener(this);
       
        sixbutton.setOpaque(true);
        jf.add(sixbutton);

        mulbutton=new JButton("x");
        mulbutton.setBounds(290, 240, 170, 70);
        mulbutton.setFont(new Font("arial", Font.PLAIN ,30));
        mulbutton.addActionListener(this);
        mulbutton.setOpaque(true);
        jf.add(mulbutton);
        

        onebutton=new JButton("1");
        onebutton.setBounds(20, 330, 70, 70);
        onebutton.setFont(new Font("arial", Font.PLAIN ,20));
        onebutton.addActionListener(this);
        onebutton.setOpaque(true);
        jf.add(onebutton);
        

        twobutton=new JButton("2");
        twobutton.setBounds(110, 330, 70, 70);
        twobutton.setFont(new Font("arial", Font.PLAIN ,20));
        twobutton.addActionListener(this);
        twobutton.setOpaque(true);
        jf.add(twobutton);

        threebutton=new JButton("3");
        threebutton.setBounds(200, 330, 70, 70);
        threebutton.setFont(new Font("arial", Font.PLAIN ,20));
        threebutton.addActionListener(this);
        threebutton.setOpaque(true);
        jf.add(threebutton);

        subbutton=new JButton("/");
        subbutton.setBounds(290, 330, 170, 70);
        subbutton.setFont(new Font("arial", Font.PLAIN ,30));
        subbutton.addActionListener(this);
        subbutton.setOpaque(true);
        jf.add(subbutton);

        dotbutton=new JButton(".");
        dotbutton.setBounds(20, 420, 70, 70);
        dotbutton.setFont(new Font("arial", Font.PLAIN ,50));
        dotbutton.addActionListener(this);
        
        dotbutton.setOpaque(true);
        jf.add(dotbutton);
        

        zerobutton=new JButton("0");
        zerobutton.setBounds(110, 420, 70, 70);
        zerobutton.setFont(new Font("arial", Font.PLAIN ,30));
        zerobutton.addActionListener(this);
       
        zerobutton.setOpaque(true);
        jf.add(zerobutton);

        equelbutton=new JButton("=");
        equelbutton.setBounds(200, 420, 70, 70);
        equelbutton.setFont(new Font("arial", Font.PLAIN ,30));
        equelbutton.addActionListener(this);
        
        equelbutton.setOpaque(true);
        jf.add(equelbutton);
        
        clearbutton=new JButton("Clear");
        clearbutton.setBounds(290, 420, 170, 70);
        clearbutton.setFont(new Font("sans-serif", Font.PLAIN ,25));
        clearbutton.addActionListener(this);
           clearbutton.setOpaque(true);
        jf.add(clearbutton);
        
        


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object Source =e.getSource();
		if(Source==sevenbutton) {
			if (isOparetoclicked==true) {
				l.setText("7");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"7");
			}			
		}else if(Source==eightbutton) {
			if (isOparetoclicked==true) {
				l.setText("8");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"8");
			}
		}else if(Source==ninebutton) {
			if (isOparetoclicked) {
				l.setText("9");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"9");
			}
		}else if(Source==fourbutton) {
			if (isOparetoclicked) {
				l.setText("4");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"4");
			}
		}else if(Source==fivebutton) {
			if (isOparetoclicked) {
				l.setText("5");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"5");
			}
		}else if(Source==sixbutton) {
			if (isOparetoclicked) {
				l.setText("6");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"6");
			}
		}else if(Source==onebutton) {
			if (isOparetoclicked) {
				l.setText("1");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"1");
			}
		}else if(Source==twobutton) {
			if (isOparetoclicked) {
				l.setText("2");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"2");
			}
		}else if(Source==threebutton) {
			if (isOparetoclicked) {
				l.setText("3");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"3");
			}
		}else if(Source==zerobutton) {
			if (isOparetoclicked) {
				l.setText("0");
				isOparetoclicked=false;
			}else {
				l.setText(l.getText()+"0");
			}
		}else if(Source==dotbutton) {
			l.setText(l.getText()+".");
		}else if(Source==plusbutton) {
			isOparetoclicked=true;
			oldValue=Double.parseDouble(l.getText());
			calculation= 1;
		}else if(Source==minbutton) {
			isOparetoclicked=true;
			oldValue=Double.parseDouble(l.getText());
			calculation=2;
		}else if(Source==mulbutton) {
			isOparetoclicked=true;
			oldValue=Double.parseDouble(l.getText());
			calculation=3;
		}else if(Source==subbutton) {
			isOparetoclicked=true;
			oldValue=Double.parseDouble(l.getText());
			calculation=4;
		}else if(Source==clearbutton) {
			l.setText("");
		}else if(Source==equelbutton) {
//			newValue=l.getText();
//			float newValueF=Float.parseFloat(newValue);
//			float oldValueF=Float.parseFloat(oldValue);
//			
//			float Result=newValueF-oldValueF;
//			
//			l.setText(Result+"");
			switch (calculation) {
			case 1: {
				newValue = oldValue + Double.parseDouble(l.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					l.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					l.setText(Double.toString(newValue));
				}
				break;
				
			}
			case 2: {
				newValue = oldValue - Double.parseDouble(l.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					l.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					l.setText(Double.toString(newValue));
				}
				break;
			}
			case 3: {
				newValue = oldValue * Double.parseDouble(l.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					l.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					l.setText(Double.toString(newValue));
				}
				break;
			}
			case 4: {
				newValue = oldValue / Double.parseDouble(l.getText());
				if (Double.toString(newValue).endsWith(".0")) {
					l.setText(Double.toString(newValue).replace(".0", ""));
				}else {
					l.setText(Double.toString(newValue));
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + calculation);
			}
			
		}
		
	}
}
