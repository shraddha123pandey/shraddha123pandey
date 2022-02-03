package javaProject;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author SHRADDHA PANDEY
 * 
 * Question- 3:
 * 
 * 
 * Write an application with following method to
 *resolve two player game of Rock-Paper-Scissors.
 *rockPaperScissorsmethodtakes  two  parameters:  a  string  
 *representing  a  first  player's move  in  a  game  of  
 *Rock-Paper-Scissors  and  a  string  representing  a  second  player's move.
 *Depending on each player's move, the function should output to the 
 *console the winner of the round if there was a winner, a tie if both 
 *players had the same move, or whether a player gave an invalid move. When 
 *comparing moves, letter-casing does not matter ("rock" should be considered the 
 *same move as "rOcK").The two-player game of Rock-Paper-Scissors works as following
 *:Each player chooses one of three moves: "rock", "paper", or "scissors"A move of "rock" wins over
 * another player's move of "scissors"A move of "scissors" wins over another player's move of 
 *"paper"A move of "paper" wins over another player's move of "rock"If two players use the same move, 
 *the result is a tieFor  example,  a  call  of  rockPaperScissors("rock",  "scissors")  
 *would  result  in  console output  of  "Player  1  wins!".  A  call  of 
 *rockPaperScissors("ROCK",  "Paper")  would result in console output of "Player 2 wins!". 
 *A call of rockPaperScissors("SCISSORS", "Scissors") would result in console output of "TIE!". 
 *If one player gives a move other than  "rock",  "paper",  or  "scissors",  the  console  output  
 *should  be  "Invalid  move  of [player's  invalid  move]!",  where  you  should  replace  
 *[player's  invalid  move]  with  the exact  value  passed  by  that  player.  If  both  players  pass
 * invalid  moves,  the  console output  should  be  
 * "Invalid  moves  of  [player  1's  invalid  move]  and  [player  2's  invalid move]!".
 *
 */

public class RockPaperScissorGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Rock Paper and Scissors Game !");
		System.out.println();
		System.out.println("Enter the move :\nROCK) for Rock\nPAPER) for Paper\nSCISSORS)for Scissors");
		
		Scanner strInput= new Scanner(System.in);
		Random rand= new Random();
		String player1Move= " ";
		String player2Move= " ";
		
		/**
		 * Ask Player1 to Enter the move
		 * all character will conver into uppercase it doesn't matter
		 * player1 will enter lower case or upper case or mixcharacter.
		 * 
    	 */
		
		System.out.print("Please Enter the move of Player1 ->");
		player1Move= strInput.next().toUpperCase();
		
		
		/**
		 * Take the three random number 1,2,3 .
		 */
		
		int num= rand.nextInt(3);
		/**
		 * Set the randomly Player2 .
		 */
		if(num==0) {
			player2Move= "ROCK";
		}
		else if(num==1) {
			player2Move= "PAPER";
		}
		else if(num==2) {
			player2Move= "SCISSORS";
		}
		
		
		/**
		 * Call the method rockPaperScissorsMethod in the main method.
		 */
		
		rockPaperScissorsMethod(player1Move,player2Move);
		/**
		 * Close the Scanner Object
		 */
		strInput.close();

	}

	private static void rockPaperScissorsMethod(String player1Move,String player2Move) {
		
		/**
		 * Set the Player2 choice
		 */
		if(player2Move.equals("ROCK")) {
			System.out.println();
			System.out.println("Player2 move is ROCK");
		}
		else if(player2Move.equals("PAPER")) {
			System.out.println();
			System.out.println("Player2 move is PAPER");
		}
		else if(player2Move.equals("SCISSORS")) {
			System.out.println();
		
			System.out.println("Player2 move is SCISSORS");
		}
		
		/**
		 * Declare the Winner
		 */
		if(player2Move.equals(player1Move)) {
			System.out.println("********************************");
			System.out.println("There is Tie!");
		}
		else if(player2Move.equals("ROCK")&&player1Move.equals("SCISSORS")||
				player2Move.equals("SCISSORS")&&player1Move.equals("PAPER")||
				player2Move.equals("PAPER")&&player1Move.equals("ROCK")) {
			System.out.println("********************************");
			System.out.println("Player2 is Winner");
		}
		else if(player2Move.equals("SCISSORS")&&player1Move.equals("ROCK")||
				player2Move.equals("PAPER")&&player1Move.equals("SCISSORS")||
				player2Move.equals("ROCK")&&player1Move.equals("PAPER")){
			System.out.println("********************************");
			System.out.println("Player1 is winner");
		}else {
			System.out.println("Player's  invalid  move");
		}
			
	}
	
}
// Name-Shraddha Pandey (20MEI10029)