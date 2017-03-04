package hoseihp;
import javax.swing.JOptionPane;

public class Calculator{
	public static void main(String args[]){
		new Calculator().start();
	}
	void start(){
		
	}
	int calculate(String expression){
		StringBuilder buf = new StringBuilder();
		for(char c:expression.toCharArray()){
			if(Character.isWhitespace(c) == false){
				buf.append(c);
			}
		}
		buf.append("$");
		int result = additive(buf);
		if(consumeJust(buf,'$') == '$'){
			return result;
		}
		throw new IllegalArgumentException(buf.toString());
	}
	
	int additive(StringBuilder buffer){
		int left = multiplicative(buffer);
		while(true){
			char op = consumeEither(buffer,'+','-');
			if(op == 0){
				break;
			}
			int right = multiplicative(buffer);
			if(op == '+'){
				left = left + right;
			}
			else{
				left = left - right;
			}
		}
		return left;
	}
	int multiplicative(StringBuilder buffer){
		int left = term(buffer);
		while(true){
			char op = consumeEither(buffer,'*','/');
			if(op == 0){
				break;
			}
			int right = term(buffer);
			if(op == '*'){
				left = left * right;
			}
			else{
				left = left / right;
			}
		}
		return left;
	}
			int term(StringBuilder buffer){
				if(consumeJust(buffer,'(') == '('){
					int expr = additive(buffer);
					if(consumeJust(buffer,')') == ')'){
						return expr;
					}
				}
				else if(consumeJust(buffer,'-') == '-'){
					return -term(buffer);
				}
				else if(buffer.length() >= 1){
					return number(buffer);
				}
				throw new IllegalArgumentException(buffer.toString());
			}
			
			int number(StringBuilder buffer){
				int numbers = 0;
			for(int i = 0,n = buffer.length();i < n;i++){
				char c = buffer.charAt(i);
				if(c < '0' || '9' < c){
					numbers = i;
					break;
				}
			}
			if(numbers == 0){
				throw new IllegalArgumentException(buffer.toString());
			}
			int result = Integer.parseInt(buffer.substring(0,numbers));
			buffer.delete(0, numbers);
			return result;
			}
			char consumeJust(StringBuilder buffer, char op){
				if(buffer.length() == 0){
					throw new IllegalArgumentException(buffer.toString());
				}
				if(buffer.charAt(0) == op){
					buffer.deleteCharAt(0);
					return op;
				}
				return 0;
			}
			char consumeEither(StringBuilder buffer, char op1, char op2){
				if(consumeJust(buffer,op1) == op1){
					return op1;
				}
				return consumeJust(buffer,op2);
			}
}