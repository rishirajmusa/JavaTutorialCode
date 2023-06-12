import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
static Scanner scan= new Scanner(System.in);
static char Symbol;
static List<Integer> PlayerPosition = new ArrayList<Integer>();
static List<Integer> CPUPosition = new ArrayList<Integer>();
static int Playerpos;
	public static void main(String[] args) {
		System.out.println("----------TicTacToe----------"+"\n");
		char[][] gameboard = 
			{
			{'|',' ','|',' ','|',' ','|'},
			{'|','-','+','-','+','-','|'},
			{'|',' ','|',' ','|',' ','|'},
			{'|','-','+','-','+','-','|'},
			{'|',' ','|',' ','|',' ','|'}
			};
		while(true) {
			
			
			boolean ValidInput = false;
			do {
				try {
				@SuppressWarnings("resource")
				Scanner scan2=new Scanner(System.in);
				printGameBoard(gameboard);
				System.out.println("\n"+"Enter Player Position (1-9) : ");
				Playerpos = scan2.nextInt();
				if(Playerpos>9 || Playerpos<=0) {
					ValidInput = false;
				}else
				{
					ValidInput = true;
				}
				while(PlayerPosition.contains(Playerpos) || CPUPosition.contains(Playerpos) || Playerpos>9 || Playerpos<=0  ){
					System.out.println("Position Invalid! Enter A new Position : ");
					Playerpos = scan2.nextInt();
					if(Playerpos>9 || Playerpos<=0) {
						ValidInput = false;}
					else{
						ValidInput = true;}
				}				
				}catch(Exception e) {
					System.out.println("Exception Occured! Enter A new Position : ");
				}
			}while(!ValidInput);
			
			
				Position(Playerpos,gameboard,"Player");
				System.out.println("\n"+"Player Entered : "+ Playerpos);
				System.out.println();
				PlayerPosition.add(Playerpos);
				String resultOfGame = checkWinner();
				if(resultOfGame.length() > 0) {
					System.out.println(resultOfGame);
					printGameBoard(gameboard);
					break;
				}
				Random rand =new Random();
				int CPUpos = rand.nextInt(9)+1;
				while(CPUPosition.contains(CPUpos) || PlayerPosition.contains(CPUpos) ) 
				{
					CPUpos = rand.nextInt(9)+1;
				}
				CPUPosition.add(CPUpos);
				Position(CPUpos,gameboard,"CPU");
				System.out.println("CPU Entered : "+CPUpos);
				System.out.println();
				resultOfGame=checkWinner();
				if(resultOfGame.length() > 0) {
					System.out.println(resultOfGame);
					printGameBoard(gameboard);
					break;
				}
			}scan.close();
			
}
	public static void printGameBoard(char [][] gameboard) {
		for(char[] row : gameboard){//here each gameboard row is being fed to char[] row
			//each row inside a gameboard
			for(char c:row) {//here each element of row is being fed to char c
				//each character inside of row
				System.out.print(c);
			}
		System.out.println();}
		}
	
	public static void Position(int pos, char[][] gameboard , String user) {
		if(user =="Player") {
			Symbol ='X';
		}else if(user =="CPU") {
			Symbol ='O';
		}
			
		switch(pos) {
		case 1:
			gameboard[0][1]=Symbol;
			break;
		case 2:
			gameboard[0][3]=Symbol;
			break;
		case 3:
			gameboard[0][5]=Symbol;
			break;
		case 4:
			gameboard[2][1]=Symbol;
			break;
		case 5:
			gameboard[2][3]=Symbol;
			break;
		case 6:
			gameboard[2][5]=Symbol;
			break;
		case 7:
			gameboard[4][1]=Symbol;
			break;
		case 8:
			gameboard[4][3]=Symbol;
			break;
		case 9:
			gameboard[4][5]=Symbol;
			break;
		default:
			break;
		}
	}

	public static String checkWinner() {
		List<Integer> TopRow =Arrays.asList(1,2,3);
		List<Integer> MidRow =Arrays.asList(4,5,6);
		List<Integer> BotRow =Arrays.asList(7,8,9);
		List<Integer> TopCol =Arrays.asList(1,4,7);
		List<Integer> MidCol =Arrays.asList(2,5,8);
		List<Integer> BotCol =Arrays.asList(3,6,9);
		List<Integer> Diag1 =Arrays.asList(1,5,9);
		List<Integer> Diag2 =Arrays.asList(3,5,7);
		List<List<Integer>> Winning = List.of(TopRow, MidRow, BotRow, TopCol, MidCol, BotCol, Diag1, Diag2);
		
		for(int i=0;i<8;i++){
			List<Integer> l = Winning.get(i);
			if( PlayerPosition.containsAll(l)){
				return "Player Won!!";
			}
		}	
			for(int i=0;i<8;i++){
			List<Integer> l = Winning.get(i);
			 if(CPUPosition.containsAll(l)){
				return "CPU Won!!";
			}
		}
			for(int i=0;i<8;i++){
			 if ( CPUPosition.size()+PlayerPosition.size()==9){
				return "No One Won, Game Tied!";
			}
			
		}
		return "";
		
}

}















