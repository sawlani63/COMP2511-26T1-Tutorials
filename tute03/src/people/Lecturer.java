package people;

import java.util.Map;

public class Lecturer extends Person {

    private Integer salary;

    public Lecturer(String name, int age) {
        super(name, age);
    }

    public static final Map<String, Integer> PAY_RATES = Map.of(
        "LVL0", 0,
        "LVL1", 1000,
        "LVL2", 2000,
        "LVL3", 3000
    );

    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of a person given their pay rate
     * @param payRate New pay rate of the person
     * @precondition payRate > 0
     * @postcondition sets the new salary to the new payrate: salary = pay
     */
    public void setSalary(String payRate) {
        Integer pay = PAY_RATES.get(payRate);
        salary = pay;
    }
}
