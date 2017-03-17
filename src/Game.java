import java.util.Arrays;
import java.util.Scanner;


public class Game {
	
	Scanner scan = new Scanner(System.in);
	boolean player1 = true, // Player 1 is X's, player 2 is O's
	player2 = false,
	winner = false;
	
	String[][] positions = new String[3][3];
	String[] posNames = {"r1c1", "r1c2", "r1c3", "r2c1", "r2c2", "r2c3", "r3c1", "r3c2", "r3c3"};

	public Game()
	{
		/*for(int i = 0; i <= 2; i++) Add values to an array
		{
			for(int j = 0; j <= 2; j++)
			{
				positions[i][j] = "";
			}
		}*/
		
		/*for(int i = 0; i <= 2; i++) Displays the multidimensional array values
		{
			for(int j = 0; j <= 2; j++)
			{
				System.out.print("\t" + positions[i][j] + "\t"); // Row values
			}
			System.out.println();
		}*/
		
	}
	
	public void displayGrid()
	{
		System.out.println();
		
		for(int i = 0; i <= 2; i++)
		{
			System.out.println("\t|\t|"); // Column lines
			
			for(int j = 0; j <= 6; j++)
			{
				if(i == 2) // Removes the very bottom row
					break;
				
				System.out.print("- "); // Row lines
			}
			
			System.out.println();
		}
	}
	
	public void displayPosNames()
	{
		// Remove one of the position choices from the Array if there is already an X or an O there
		System.out.println(Arrays.toString(posNames));
	}
	
	public void changeTurn()
	{
		if(player1) // If it is player1's move
		{
			player1 = false;
			player2 = true;
			System.out.println("It is player 2's turn!");
		}else // If it is player2's move
		{
			player2 = false;
			player1 = true;
			System.out.println("It is player 1's turn!");
		}
	}
	
	public boolean isP1Turn()
	{
		return player1;
	}
	
	public boolean isP2Turn()
	{
		return player2;
	}
	
	public boolean isMoveValid(String choice)
	{
		boolean move = false;
		
		for(int i = 0; i < posNames.length; i++)
			if(choice.equalsIgnoreCase(posNames[i]))
			{
				// Use switch statement to check what choice is
				move = true;
			}
		
		return move;
	}
	
	public void tryAgain()
	{
		String choice;
				
		do
		{
			System.out.println("That is not a valid move! Try again!");
			choice = scan.nextLine();
			
		}while(!isMoveValid(choice));
		
		if(player1)
			applyP1Move(choice);
		else
			applyP2Move(choice);
	}
	
	public void applyP1Move(String choice)
	{
		
	}
	
	public void applyP2Move(String choice)
	{
		
	}
	
	public boolean checkWinner()
	{
		
		return winner;
	}
}