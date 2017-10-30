import java.util.*;
import java.lang.*;
import java.io.*;

public class Relation implements java.io.Serializable{

	private String name;
	private LinkedList<Tuple> relation = new LinkedList<Tuple>();

	//constructor
	public Relation(String name, LinkedList<Tuple> Relation) {
		this.name = name;
		this.relation = Relation;
	}

	public void print(){
		for (int i=0; i<name.length()+1; i++){
			System.out.print("_");
		}
		System.out.println();

		System.out.println(name+":");

		for (Attribute a : relation.getFirst().getTuple()){
			System.out.printf("%-"+a.getColumnWidth()+"s", a.getName());
		}
		System.out.println();

		if (relation.size() > 1){
			for (int i=1; i < relation.size(); i++){
				relation.get(i).print();
			}
		}
		System.out.println();
	}

	//gets/sets
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public LinkedList<Tuple> getRelation(){
		return relation;
	}
}
