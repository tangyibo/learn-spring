package io.gitee.inrgihc.objenesis;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;

class Person {

	{
		System.out.println("In Person instance function");
	}

	public Person() {
		System.out.println("In Person constructor function");
		throw new RuntimeException("constructor can not used!");
	}

	public void show() {
		System.out.println("Person show() function called!" + this.hashCode());
	}
}

public class Application {

	public static void main(String[] args) {
		Objenesis objenesis = new ObjenesisStd();
		ObjectInstantiator<Person> instantiator = objenesis.getInstantiatorOf(Person.class);
		Person p1 = instantiator.newInstance();
		p1.show();
		Person p2 = instantiator.newInstance();
		p2.show();
	}

}
