/**
 * 
 */
package coloringPoint;

/**
 * @author Patrick Copeland
 * @version 09/29/2020
 */
public class ColoringPoint extends Point implements Coloring
{
	private String color;
	
	public ColoringPoint()
	{
		
	}
	
	public ColoringPoint(int x, int y, String color)
	{
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	@Override
	public String getColor()
	{
		return color;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o instanceof ColoringPoint)
		{
			ColoringPoint other = (ColoringPoint) o;
			return color == other.color && color == other.color; //TRUE if they are the same
		} 
		else 
		{  
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " color is " + color;
	}


}
