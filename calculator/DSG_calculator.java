package calculator;

import java.awt.*;
public class DSG_calculator {
	static Frame frm = new Frame("DSG Calculator");
	static Panel numbers = new Panel(new GridLayout(3,3));
	static Button[] btns = new Button[11];
	static Panel op = new Panel(new GridLayout(4,1));
	static Button[] btns_op = new Button[4];
	static Label ans = new Label("0", Label.RIGHT);
	static Label mark = new Label("DGS Calculator", Label.CENTER);
	static Button equal = new Button("=");
	static Button clear = new Button("Clear");
	public static void main(String args[]) {
		frm.setLayout(null);
		frm.setSize(550,360);
		frm.setLocation(250,250);
		frm.setBackground(Color.lightGray);
		ans.setBackground(Color.pink);
		ans.setBounds(50,50,320,60);
		ans.setFont(new Font("serif", Font.BOLD,30));
		mark.setBounds(380,50,150,60);
		mark.setFont(new Font("dialog", Font.BOLD+Font.ITALIC,16));
		
		numbers.setBounds(50,120,220,150);
		numbers.setFont(new Font("serif", Font.BOLD,25));
		for(int i = 1; i<10 ;i++) {
			btns[i] = new Button(Integer.toString(i));
			numbers.add(btns[i]);
		}
		btns[0] = new Button("0");
		btns[0].setBounds(50, 270, 146, 50);
		btns[0].setFont(new Font("serif", Font.BOLD,25));
		btns[10] = new Button(".");
		btns[10].setBounds(196, 270, 73, 50);
		btns[10].setFont(new Font("serif", Font.BOLD,25));
		
		op.setBounds(300,120, 73, 200);
		op.setFont(new Font("dialog", Font.BOLD,30));
		op.setForeground(Color.blue);
		btns_op[0] = new Button("+");
		btns_op[1] = new Button("-");
		btns_op[2] = new Button("x");
		btns_op[3] = new Button("/");
		for(int i = 0;i<4;i++) {op.add(btns_op[i]);}
		
		equal.setBounds(400,120,100,95);
		equal.setFont(new Font("dialog", Font.BOLD,40));
		equal.setForeground(Color.red);
		
		clear.setBounds(400,225,100,95);
		clear.setFont(new Font("dialog", Font.BOLD,25));
		clear.setForeground(Color.red);
		
		frm.add(clear);
		frm.add(equal);
		frm.add(op);
		frm.add(btns[0]);
		frm.add(btns[10]);
		frm.add(numbers);
		frm.add(mark);
		frm.add(ans);
		frm.setVisible(true); 
	}
}