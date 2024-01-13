/*Records in Java automatically generate common methods (constructor, accessors, equals, hashCode, toString)
for data storage, promoting code conciseness and immutability.
Regular classes offer more flexibility with manual method implementations.
A record in Java is like a special kind of class designed for holding data.
It automatically generates common methods, making code shorter and clearer.
Records are often used for immutable data.*/

package Record;

record Person(String name, int age) {
    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25);

        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());


        System.out.println("Person details: " + person);
        System.out.println("Details: " + person.getDetails());
    }
}

