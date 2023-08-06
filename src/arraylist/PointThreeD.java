package arraylist;

public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		xPoint = 0.0;
		yPoint = 0.0;
		zPoint = 0.0;
	}//end empty-argument constructor
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor

		
	public double getxPoint() {
		return xPoint;
	}//end getxPoint

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}//end setxPoint

	public double getyPoint() {
		return yPoint;
	}//end getyPoint

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}//end setyPoint

	public double getzPoint() {
		return zPoint;
	}//end getzPoint

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}//end setzPoint

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
	
	
}//end class
