package diceRollPackage;

import java.util.Random;

public  class Dice {

	public  static void main(String[] args) {
		Random x =new Random();
		int i = x.nextInt(6)+1;//+1 is added here because x.nextInt(6) will return value from 0-5, by adding 1 we can make it 1-6
		System.out.println(" You Rolled a : "+i );
	}

}
