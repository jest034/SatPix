import java.io.*;
import java.util.Scanner;

public class SatPix {

	public static void main(String[] args) throws IOException
	{
		boolean[][] booleanArr = fileToBoolArray("satpix.in");
		int sizeOfLargestPasture;
		
		/* YOUR CODE GOES HERE */
		sizeOfLargestPasture=SatPix.recursivelyMeasureAndMarkPasture(0, 0, booleanArr);
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("satpix.out")));
		out.println(sizeOfLargestPasture);
		out.close();
		}
	
	private static boolean[][] fileToBoolArray(String fileName) throws FileNotFoundException, IOException
	{
		//This helper method converts the input file into a 2D array of booleans
		Scanner s = new Scanner (new File(fileName));
		int col = s.nextInt();
		int row = s.nextInt();
		boolean [][] farm = new boolean [row][col];
		for (int r=0;r<row;r++)
		{
			String line = s.next();
			for (int c = 0; c<col;c++)
			{
				if (line.charAt(c)==('.'))
				{
					farm [r][c]=false;
				}
				else
					farm[r][c]=true;
			}
		}
		return farm;
		
		
	}

	private static int recursivelyMeasureAndMarkPasture(int row, int col, boolean[][] arr)
	{
		//This recursive method employs the flood-fill algorithm to
		//count the size of a single pasture and "mark" it so it is not double-counted
		if (row+1<arr.length||row-1!=arr.length||)
		{
			arr[row][col]=false;
			if(arr[row+1][col]==true)
			{
				
				return 1+recursivelyMeasureAndMarkPasture(row+1,col,arr);
			}
			else if ()
		}
			
		return 0;
	}
	
}
