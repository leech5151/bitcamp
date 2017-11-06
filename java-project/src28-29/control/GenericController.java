package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GenericController<T> {
	protected Scanner keyScan = new Scanner(System.in);
	protected ArrayList<T> list = new ArrayList<>();
	
	public abstract void execute();
}
