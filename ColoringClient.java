/**
 * 
 */
package coloringPoint;

/**
 * @author Patrick Copeland
 * @version 09/29/2020
 */
public class ColoringClient 
{
	public static void main(String[] args) 
	{
		ColoringPoint CP_blue = new ColoringPoint(1, 3, "blue");
		ColoringPoint CP_green = new ColoringPoint(1, 2, "green");
		
		System.out.println(CP_blue.toString());
		System.out.println(CP_green.toString());
		
		System.out.println(CP_blue.equals(CP_green));
	}

}
