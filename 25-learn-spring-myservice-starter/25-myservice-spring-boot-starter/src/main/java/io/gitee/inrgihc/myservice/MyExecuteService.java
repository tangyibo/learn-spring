package io.gitee.inrgihc.myservice;

public class MyExecuteService {

	private String nameOfService;

	private int elipseOfSeconds;

	public String getNameOfService() {
		return nameOfService;
	}

	public void setNameOfService(String nameOfService) {
		this.nameOfService = nameOfService;
	}

	public int getElipseOfSeconds() {
		return elipseOfSeconds;
	}

	public void setElipseOfSeconds(int elipseOfSeconds) {
		this.elipseOfSeconds = elipseOfSeconds;
	}

	public void executeRun() {
		System.out.println("name=" + this.nameOfService + ", elipse=" + this.elipseOfSeconds);
	}
}
