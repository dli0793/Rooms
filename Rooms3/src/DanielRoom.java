
public class DanielRoom extends Room
{
	public DanielRoom(int x, int y) 
	{
		super(x, y);
	}
	
	public void enterRoom(Person x) 
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("It is I Tack. You have to get through me first. Beat me in a game of Tic Tac Toe.");
		System.out.println("This will be how the play board will look like. I will be X and you will be O. Enter where you want to place your letter in the form row,column. If you win I shall let you pass. If I win you shall go back to the beginning with one less life.");
		printBoard();
		
		Runner.gameOff();
		
	}
		

	public void printBoard()
	{
	    char board[][];
	    board= new char[3][3]; 
	    System.out.println("-------------");

	    for (int i = 0; i < 3; i++) 
	    {
	       System.out.print("| ");
           for (int j = 0; j < 3; j++) 
           {
        	   System.out.print(board[i][j] + " | ");
	       }
	       System.out.println();
	       System.out.println("-------------");

	        
	    }
	}
	
	
	private boolean checkWin()
	{
		
	}
	
	
	
}
