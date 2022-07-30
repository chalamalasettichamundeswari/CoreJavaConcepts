
public class GarbageCollectionExample {
	int objId;
	GarbageCollectionExample(int objId){
		this.objId =objId;
		System.out.println(this+" Created");
	}

	public static void main(String[] args) {
      for(int i=1;i<=5;i++) {
    	 // new GarbageCollectionExample(i);
    	  System.gc();
      }
	}
	@Override
	protected void finalize(){
		System.out.println(this+" Finalized");
	}

}

//GarbageCollector runs only when is no memory,not enough memory space
//finalize runs only when is no memory,not enough memory space
// System.gc() ->Requesting the jvm to be garbage collected 