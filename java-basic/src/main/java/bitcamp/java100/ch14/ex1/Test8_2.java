package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.sql.Date;

public class Test8_2 {

	static void printStar(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	

	public static void main(String[] args) throws Exception {
		printStar(5);
		printStar(4);
		printStar(3);
		printStar(2);
		printStar(1);
	}
}
