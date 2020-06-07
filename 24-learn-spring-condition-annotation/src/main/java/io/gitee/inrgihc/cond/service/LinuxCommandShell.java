package io.gitee.inrgihc.cond.service;

public class LinuxCommandShell implements CommandShell {

	@Override
	public String command() {
		return "ls";
	}

}
