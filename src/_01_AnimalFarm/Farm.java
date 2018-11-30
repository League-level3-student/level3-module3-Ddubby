package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm{
	
	public static void main(String[] args) {
		Animal Pig = new Pig();
		Animal Pig2 = new Pig();
		Animal Cow = new Cow();
		Animal Chicken = new Chicken();
		Animal Sheep = new Sheep();
		Animal Sheep2 = new Sheep();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(Pig);
		animals.add(Pig2);
		animals.add(Cow);
		animals.add(Chicken);
		animals.add(Sheep);
		animals.add(Sheep2);
		for (int i = 0; i < animals.size(); i++) {
			String noise = animals.get(i).makeNoise();
			System.out.println(noise);
			String desc = animals.get(i).Description();
			System.out.println(desc);
		}
	}
}
