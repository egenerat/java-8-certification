package ocp.chap3GenericsAndCollections.collections;

import java.util.*;

public class QueueExample {
	public static void main(String... args) {
		Queue<Integer> linkedList = new LinkedList<>();

		// The queue retrieval operations — poll, remove, peek, and element — 
		// access the element at the head of the queue. 
		// The head of the queue is the least element with respect to the specified ordering. 
		// If multiple elements are tied for least value, the head is one of those elements; 
		// ties are broken arbitrarily.
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println(linkedList);
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.remove());

		// TODO difference between remove and poll

		// Deque double-ended queue
		Queue dqueue = new ArrayDeque();
	}
}
