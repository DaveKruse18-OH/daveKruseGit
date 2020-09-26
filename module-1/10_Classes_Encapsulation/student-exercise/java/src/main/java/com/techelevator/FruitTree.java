package com.techelevator;

public class FruitTree {
	private String typeOfFruit = null;
	private int piecesOfFruitLeft = 0;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		boolean ret = false;
		
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			ret = true;
		}
		
		return ret;
	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
}
