/**
 * 
 */
package reflection;

/**
 * @author Alyssa Lahaise
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import circle.ColoredCircle;
import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Class<?> c = o.getClass(); 
		System.out.print(c);
		Class<?> sclass = c.getSuperclass(); 
		while (sclass != null) {
			System.out.print(" inherits from " + sclass);
			sclass = sclass.getSuperclass();
		}
		System.out.println();
		
		
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String s = "I am a String.";
		r.correspondingClass(s);
		r.inheritanceChain(s);
		r.listMethods(s);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete
		ColoredCircle cc = new ColoredCircle();
		r.correspondingClass(cc);
		r.inheritanceChain(cc);
		r.listMethods(cc);

	}

}
