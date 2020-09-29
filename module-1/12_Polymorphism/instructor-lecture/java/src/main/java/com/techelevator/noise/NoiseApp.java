package com.techelevator.noise;

import java.util.ArrayList;
import java.util.List;

public class NoiseApp {

	public static void main(String[] args) {
	
		
		INoise kazoo = new Kazoo();
		
		INoise cat = new Cat();
		
		INoise dog = new Dog();
		
		List<INoise> myList = new ArrayList<INoise>();
		myList.add(kazoo);
		myList.add(cat);
		myList.add(dog);
		
		for (INoise sound : myList) {
			System.out.println(sound.makeNoise());
		}
		
		Dog tempDog = (Dog) dog;
		System.out.println(tempDog.makeNoise(true));
		
		Cat cat2 = (Cat) cat;
		
		
		System.out.println(((Dog)dog).makeNoise(true));

	}

}
