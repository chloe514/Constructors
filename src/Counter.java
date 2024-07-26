public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this.value = 0;
    }

    // Method to return the current value of the counter
    public int value() {
        return value;
    }

    // Method to increase the value by 1
    public void increase() {
        value++;
    }

    // Overloaded method to increase the value by increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Method to decrease the value by 1
    public void decrease() {
        value--;
    }

    // Overloaded method to decrease the value by decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}

