import java.util.Scanner;


public class GameRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game gameObj = new Game();
		
		System.out.println("Player 1 is X's, and player 2 is O's!");
		System.out.println("Player 1 goes first!");
				
		do
		{
			gameObj.displayGrid();
			gameObj.displayPosNames();
			
			System.out.println("Pick a spot to choose: ");
			String choice = scan.nextLine();
			
			if(gameObj.isP1Turn()) // It is player 1's turn
			{
				if(gameObj.isMoveValid(choice))
					gameObj.applyP1Move(choice); // May need to add an argument to this method
				else
					gameObj.tryAgain();
			}else // It is player 2's move
			{
				if(gameObj.isMoveValid(choice))
					gameObj.applyP2Move(choice);
				else
					gameObj.tryAgain();
			}
		}while(gameObj.checkWinner() == false); // Remember to change the player turn
	}

}
