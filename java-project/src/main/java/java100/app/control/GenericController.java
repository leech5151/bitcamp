package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GenericController<T> {
	protected ArrayList<T> list = new ArrayList<>();
	static Scanner keyScan = new Scanner(System.in);
	
	public abstract void execute() {}
}
