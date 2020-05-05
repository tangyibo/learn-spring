package io.gitee.inrgihc.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


class Person{
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class Application {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()"); 
		String message = exp.getValue(String.class);
		System.out.println(message);
		
		Expression exp1 = parser.parseExpression("'Hello World'.bytes.length"); 
		int length = (Integer) exp1.getValue();
		System.out.println(length);
		
		Person p=new Person("join",12);
		Expression exp2 = parser.parseExpression("name"); // Parse name as an expression
		String name = (String) exp2.getValue(p);
		System.out.println(name);
		
		boolean falseValue = parser.parseExpression(
		        "'xyz' instanceof T(String)").getValue(Boolean.class);
		System.out.println(falseValue);
		
		String falseString = parser.parseExpression(
		        "false ? 'trueExp' : 'falseExp'").getValue(String.class);
		System.out.println(falseString);
	}

}
