package Extera;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Inheritance {
	@BeforeSuite
	public void show() {
		System.out.println("inheritance method");
	}
}

	 class A extends Inheritance{
		@Test
		public void execute() {
			System.out.println("main execution");
		}
	}
