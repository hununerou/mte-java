package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DentakuFrame extends JFrame {
		JPanel panel = new JPanel();
		BorderLayout border = new BorderLayout();
		JTextField text = new JTextField("",20);
		double stackedvalue = 0.0;
		boolean isStacked = false;
		boolean aftercalc = false;
		String currentop = "";
		
		//frame build
		public DentakuFrame(){
			panel.setLayout(border);
			this.setSize(new Dimension(250,300));
			this.setTitle("Calculater");
			this.setContentPane(panel);
			
			panel.add(text,BorderLayout.NORTH); //演算結果の表示
			//格子パネルの準備
			JPanel enable = new JPanel();
			enable.setLayout(new GridLayout(4,4));
			panel.add(enable, BorderLayout.CENTER);
			
			//以下整数ボタン
			enable.add(new NumberButton("7"),0);
			enable.add(new NumberButton("8"),1);
			enable.add(new NumberButton("9"),2);
			enable.add(new CalcButton("/"),3);
			enable.add(new NumberButton("4"),4);
			enable.add(new NumberButton("5"),5);
			enable.add(new NumberButton("6"),6);
			enable.add(new CalcButton("*"),7);
			enable.add(new NumberButton("1"),8);
			enable.add(new NumberButton("2"),9);
			enable.add(new NumberButton("3"),10);
			enable.add(new CalcButton("-"),11);
			enable.add(new NumberButton("0"),12);
			enable.add(new NumberButton("."),13);
			enable.add(new CalcButton("+"),14);
			enable.add(new CalcButton("="),15);
			
			panel.add(new ClearButton(), BorderLayout.SOUTH);	//clearボタンセット
			this.setVisible(true);
		}
		//数字の引数を後ろにつなげていく(見慣れた10進数をつくる)
		public void appendResult(String c){
			if(!aftercalc)
			text.setText(text.getText()+c);
			else{
				text.setText(c);
				aftercalc = false;
			}
		}
		//数字ボタンの同期
		public class NumberButton extends JButton implements ActionListener{
			public NumberButton(String keyTop){
				super(keyTop);
				this.addActionListener(this);
			}
			public void actionPerformed(ActionEvent event){
				String keynum = getText();
				appendResult(keynum);
			}	
		}
		//演算子ボタンの定義
		public class CalcButton extends JButton implements ActionListener{
			public CalcButton(String o){
				super(o);
				this.addActionListener(this);
			}
			public void actionPerformed(ActionEvent e){
				if(isStacked){    //演算子ボタンが押されていない場合
					double resultValue = (Double.valueOf(text.getText()))
										.doubleValue();
						if(currentop == "+")      //演算子に応じて
							stackedvalue += resultValue;
						else if(currentop == "-")
							stackedvalue -= resultValue;
						else if(currentop.equals("*"))
						    stackedvalue *= resultValue;
						else if(currentop.equals("/"))
							stackedvalue /= resultValue;
					text.setText(String.valueOf(stackedvalue));
				}
				currentop = this.getText();
				stackedvalue = (Double.valueOf(text.getText()));
				aftercalc = true;
				if(currentop.equals("="))
				  isStacked = false;
				  else
					  isStacked = true;
			}
		}
		//クリアボタンの定義
			public class ClearButton extends JButton implements ActionListener{
				
				public ClearButton(){
					super("C");
					this.addActionListener(this);
				}
				public void actionPerformed(ActionEvent event){
				   stackedvalue = 0.0;
				   aftercalc = false;
				   isStacked = false;
				   text.setText("");
				}
			}
}
