package main;

import main.animals.Pig;
import main.service.FileService;

import java.util.Arrays;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		String[] pigNames = new String[4];

		// SORT the pigs by name...

		// 1. run a for loop on the pig array
		// 2. In the for loop create an array called pig names, get the names of the pigs using
		// the getName getter from the Pig class, save it into the pigNames string array
		// 3. Sort the pig names
		// 4. Print the sorted names to the console

		for(int i = 0; i < pigNames.length; i++){
			pigNames[i] = pigs[i].getName();
			System.out.println(pigNames[i]);
		}
		System.out.println("~~~~~~");
		Arrays.sort(pigNames);

		for(String pig : pigNames){
			System.out.println(pig);
		}



	}

}
