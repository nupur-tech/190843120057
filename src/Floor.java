


import java.util.Scanner;

public class Floor extends Tile_38
{
	static double r_len;
	static double width;
	double area;
	double totalTiles;
	double tiles;
	

	public Floor(double r_len, double width) 
	{
		super();
		Floor.r_len = r_len;
		Floor.width = width;
	}
	
	public void  totalTiles(Tile_38 t)
	{
		Scanner s = new Scanner(System.in);
		area=r_len*width;
		tiles=length*length;
		totalTiles=area/tiles;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length and width for rectangle");
		r_len=s.nextDouble();
		width=s.nextDouble();
		
		Floor f = new Floor();
		 f.totalTiles(2);
	}

}
