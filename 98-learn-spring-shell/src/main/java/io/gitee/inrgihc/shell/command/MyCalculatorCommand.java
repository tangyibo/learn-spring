package io.gitee.inrgihc.shell.command;

import javax.validation.constraints.Size;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyCalculatorCommand {
	
	@ShellMethod("Echo command help")
	public void myhelp(@ShellOption({"-C", "--command"}) String cmd) {
	    System.out.println(cmd);
	}
	
	@ShellMethod("Say hello")
	public void hello(@ShellOption(defaultValue = "World") String name) {
	    System.out.println("hello, " + name + "!");
	}
	
	@ShellMethod("Echo.")
	public void echo(String what) {
	    System.out.println(what);
	}
	
	@ShellMethod(value = "Add numbers.", key = {"sum", "addition"})
    public int add(int a, int b) {
        return a + b;
    }
	
	@ShellMethod("Change password")
	public void changePwd(@Size(min = 6, max = 30) String pwd) {
	    System.out.println(pwd);
	}
}
