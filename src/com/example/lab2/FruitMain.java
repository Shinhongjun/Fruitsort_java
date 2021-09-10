package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.lab2.Fruit.FruitComparator;
import com.example.lab2.Fruit.FruitComparatorDesc;
public class FruitMain {
	public static void main(String[] args) {
		List<Fruit> fl =new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by the name)");
		Fruit s1 = new Fruit(101,"Apple",1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102,"Orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Kiwi",2000));
		fl.add(new Fruit(104,"Watermelon",12000));
		fl.add(new Fruit(105,"Mango",2200));
		fl.add(new Fruit(106,"Peach",2400));
		fl.add(new Fruit(107,"Banana",1400));
		fl.add(new Fruit(108,"Dragon Fruit",20000));
		fl.add(new Fruit(109,"Grape",6600));
		fl.add(new Fruit(110,"Pear",4500));
		fl.add(new Fruit(111,"Strawberry",10000));
		fl.add(new Fruit(112,"Pineapple",15000));
		
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reversed ordered by name)");
		
		Collections.sort(fl,new FruitComparatorDesc());
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
