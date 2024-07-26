public class CounterMain {
    public static void main(String[] args) {
        // Create Counter objects using different constructors
        Counter counter1 = new Counter(10);  // Start value is 10
        Counter counter2 = new Counter();    // Start value is 0

        // Display initial values
        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        // Use increase method
        counter1.increase();
        System.out.println("Value of counter1 after increase: " + counter1.value());

        // Use overloaded increase method
        counter1.increase(5);
        System.out.println("Value of counter1 after increasing by 5: " + counter1.value());

        // Use decrease method
        counter2.decrease();
        System.out.println("Value of counter2 after decrease: " + counter2.value());

        // Use overloaded decrease method
        counter2.decrease(3);
        System.out.println("Value of counter2 after decreasing by 3: " + counter2.value());

        // Use overloaded methods with negative values
        counter1.increase(-10);  // Should not change the value
        counter2.decrease(-5);   // Should not change the value
        System.out.println("Value of counter1 after attempting to increase by -10: " + counter1.value());
        System.out.println("Value of counter2 after attempting to decrease by -5: " + counter2.value());
    }
}


