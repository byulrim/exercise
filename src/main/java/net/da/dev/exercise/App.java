package net.da.dev.exercise;

import net.da.dev.exercise_lib.Lib;

public class App {

	public static void main(String[] args) {
		String name = "hcshin";
		String msg = "hcshin is wonderful!";

		Lib lib = new Lib(name, msg);

		System.out.println(lib.getMessage());		
	}

}
