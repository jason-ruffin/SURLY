import java.util.*;
import java.lang.*;
import java.io.*;

public class Tuple implements java.io.Serializable{

	private LinkedList<Attribute> tuple = new LinkedList<Attribute>();

	//constructor for player object
	public Tuple(LinkedList<Attribute> tuple){
		this.tuple = tuple;
	}

	public void print(){
		for (Attribute a : tuple){
			a.print();
		}
		System.out.println();
	}

	public LinkedList<Attribute> getTuple(){
		return tuple;
	}
	
	public void setTuple(LinkedList<Attribute> t){
		tuple = t;
	}
}
