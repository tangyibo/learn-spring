package io.gitee.inrgihc.cond.service;

public class WindowsCommandShell implements CommandShell {

	@Override
	public String command() {
		return "dir";
	}

}
