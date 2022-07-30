package Abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BMW obj; 
      BMW obj1; 
      obj= new ThreeSeries();
      obj1= new FiveSeries();
      obj.accelerate();
      obj.commonFunc();
      obj1.accelerate();
      obj1.commonFunc();
	}

}
