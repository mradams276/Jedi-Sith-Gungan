package jsg.controller;

import java.util.Scanner;


public class JSGController 
{
Scanner s = new Scanner(System.in);


public void start()
{
System.out.println("Welcome to Jedi, Sith, Gungan.  This game is toooooootally not a rip off of rock "
		+ "paper scissors!  The Jedi will always beat the Sith, the Sith beats Gungan, and Gungan beats "
		+ "Jedi(because they are sooooo incredibly annoying.)  Enter one of these three choices below to play!");
String jsgResponse=s.next();
}

public void randomResponse();
{
	String[] randomArray;
	randomArray = new String[3];
	randomArray[0] = "Jedi";
	randomArray[1] = "Sith";
	randomArray[2] = "Gungan";
}

public void compareResponse();
{
	public static int getRandom(string[] randomArray)
	{
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}
}
}
