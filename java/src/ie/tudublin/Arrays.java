package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//float[] rainfall = new float[12];
	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"an", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Oct", "Nov", "Dec"};
	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i=0;i<rainfall.length;i++)
		{
			println(rainfall[i] + "/t" + rainfall[i]);
		}

		for(float f:rainfall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
	}
}
