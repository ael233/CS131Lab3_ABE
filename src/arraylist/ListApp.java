package arraylist;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<Square> squareList = new ArrayList<>();
		squareList.addItem(new Square(15.0));
		squareList.addItem(new Square(4.4));
		
		System.out.println("Square " + squareList.toString());
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.addItem(new String("itemA"));
		stringList.addItem(new String("itemB"));
		stringList.addItem(new String("itemC"));
		stringList.addItem(new String("itemD"));
		
		System.out.println("String " + stringList.toString());
		
		ArrayList<PointThreeD> pointList = new ArrayList<>();
		pointList.addItem(new PointThreeD(1.2, 3.4, 5.6));
		pointList.addItem(new PointThreeD(4.4, 7.7, 9.8));
		pointList.addItem(new PointThreeD(0.3, 5.5, 6.2));
		
		System.out.println("PointThreeD " + pointList.toString());
		

	}//end main

}//end class
