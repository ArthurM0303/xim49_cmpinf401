package xim49_Lab6;

public class MyRectangle{
	private int startX;
	private int startY;
	private int width;
	private int height;
	// declare variables
	public MyRectangle(){
		this.startX = 0;
		this.startY = 0;
		this.width = 0;
		this.height = 0;
		// Default constructor -- initialize all instance variables to 0
	}

	public MyRectangle(int startX, int startY, int width, int height){
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
		// Initialize instance variables based on parameters shown.
		// Be careful to get the order correct!
	}

	public int area(){
		return width * height;
		// Return the area of this Rectangle
	}
	
	public String toString(){
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y){
		int a = startX + width;
		int b = startY + height;
		if(startX < x && x < a && startY < y && y < b) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setSize(int w, int h){
		this.width = w;
		this.height = h;
	}

	public void setPosition(int x, int y)
	{
		this.startX = x;
		this.startY = y;
	}

}