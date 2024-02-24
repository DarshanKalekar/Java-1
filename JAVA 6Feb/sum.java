void sum() {

}

System.out.println("i+j+k: " + (i+j+k));

}

class SimpleInheritance {

public static void main(String args[]) {

A superOb = new A();

B subob = new B();

// The superclass may be used by itself.

superOb. i = 10;

superob.j = 20;

System.out.println("Contents of superOb: ");

superob.showij ();

System.out.println();

/* The subclass has access to all public members of its superclass. */

subob.i = 7;

subob.j = 8;

subob.k = 9;

System.out.println("Contents of subob: ");

subob.showij ();

subob.showk();

System.out.println();

System.out.println("Sum of i, j and k in subob: ");

}

subob.sum();

}