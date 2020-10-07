package net.da.dev.exercise;

public class App {
	public static void main(String[] args) {
		new App().printMessage("byulrim");
	}

	public String getMessage(String name) {
		return "Hi, " + name + ". Welcome to Maven World!";
	}

	public void printMessage(String name) {
		System.out.println("\n***** App class *****\n");
		System.out.println(this.getMessage(name));
		System.out.println("\n***** App class *****\n");
	}
}
