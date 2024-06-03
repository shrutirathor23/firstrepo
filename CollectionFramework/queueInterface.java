package CollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueInterface {
	public static void main(String[] args) {
		Queue a=new LinkedList();
		a.add("srw");
		a.add("12");
		a.offer("sa");
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a.element());
		System.out.println(a.remove());
		System.out.println("im happy");
		
		Queue b= new PriorityQueue();
		b.add("srwls");
		b.add("123");
		b.offer("sakf");
		System.out.println(b);
		System.out.println(b.peek());
		System.out.println(b.poll());
		System.out.println(b.element());
		System.out.println(b.remove());
		System.out.println("im so happy");
	
		
		
		
	}

}
