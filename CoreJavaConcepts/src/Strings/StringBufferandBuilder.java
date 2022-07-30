package Strings;

public class StringBufferandBuilder {

	public static void main(String[] args) {
       StringBuffer sb=new StringBuffer();
       System.out.println("Buffer Capacity: "+sb.capacity());//initial capacity -16
       sb.append("All the power is with in you.");
       sb.append("All the power is with in you.");
       System.out.println(sb);
       System.out.println("Buffer Capacity: "+sb.capacity());
       System.out.println(sb.charAt(10));
       StringBuffer s = new StringBuffer("asdfgh");
       System.out.println(s.reverse());
       
       StringBuilder builder=new StringBuilder("Hi");
       builder.append("Java 8");
       System.out.println("StringBuilderExample" +builder);
       
       StringBuffer buffer=new StringBuffer("Hi");
       buffer.append("Java 8");
       System.out.println("StringBufferExample" +buffer);
	}

}
