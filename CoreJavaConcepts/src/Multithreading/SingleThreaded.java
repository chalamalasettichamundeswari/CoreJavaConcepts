package Multithreading;

public class SingleThreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreaded obj = new SingleThreaded();
		obj.printNumbers();
		for(int j=0;j<80;j++) {
			System.out.print("j :"+j+"\t");
		}
	}
	void printNumbers() {
		for(int i=0;i<80;i++) {
			System.out.print("i :"+i+"\t");
		}
	}

}
