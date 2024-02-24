class Number {
    private int value;

    // Default constructor
    public Number() {
        value = 5;
    }

    // Overloaded constructor
    public Number(int value) {
        this.value = value;
    }

    // Copy constructor
    public Number(Number number) {
        this.value = number.value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

 class CopyConstructor{
    public static void main(String[] args) {
        // Creating objects using different constructors
        Number number1 = new Number(); 
        Number number2 = new Number(20); 
        Number number3 = new Number(number2); 

        // Displaying the value of each number
        System.out.println("Number 1:");
        number1.display();
        System.out.println();

        System.out.println("Number 2:");
        number2.display();
        System.out.println();

        System.out.println("Number 3 (copy of Number 2):");
        number3.display();
    }
}