package Java8Features;

public class StreamsExample {

	public static void main(String[] args) {
     
	}

}
//Easy way to process the data or objects inside a collection.
//Not like java.io.streams for reading and writing files.
//It is an interface in java.util.stream.Stream interface.
// stream() is a method 
//2 ways to process the collection-
//1.Configuration->2 ways 1.Filtering->we invoke the filter method pass it as predicate which will evaluate into boolean expression.
//Objects in the collection will be filtered out based on predicate and it will return the stream..
//public Stream filter(Predicate<T>p) 
//2nd way of Configuring is Map method
//public Stream map(Function f)->create a new collection or new object for very object in the collection.
//2.Processing->collect(),count(),sorted(),min(),max()

