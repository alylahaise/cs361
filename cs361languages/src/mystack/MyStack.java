/**
 * 
 */
package mystack;

/**
 * @author Alyssa Lahaise
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T temp;
		if (theStack == null)
			return null;
		else {
			temp = theStack.val;
			theStack = theStack.next;
			return temp;
		}
		
		
	}

	public void push(T v) {
		// TODO To complete
		if (theStack == null)
			theStack = new MyNode<>(v, null);
		else {
			MyNode<T> temp = theStack;
			MyNode<T> newNode = new MyNode<>(v, null);
			theStack = newNode;
			newNode.next = temp;
		}
	}

	public String toString() {
		String s = "";
		if (theStack == null) {
		s += "null";
		}
		else {
			MyNode<T> current = theStack;
			while (current != null) {
				s += current.val;
				s += " ";
				current = current.next;
			}
		}
		return s;
	}	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> s = new MyStack<>();
		System.out.println(s);
		// Push 1 and 2
		s.push(1);
		s.push(2);
		//System.out.println(s);
		// Pop
		s.pop();
		//System.out.println(s);
		// Push 5
		s.push(5);
		//System.out.println(s);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> p = new MyStack<>();
		// Push a person p1 with your name
		Person p1 = new Person("Alyssa", "Lahaise");
		p.push(p1);
		//System.out.println(p);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		p.push(p2);
		//System.out.println(p);
	}

}
