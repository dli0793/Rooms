
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
	
}
