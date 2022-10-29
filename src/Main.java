import netology.Person.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {

    protected static Person person1 = new Person("Алексей", "Орлов", 4);
    protected static Person person2 = new Person("Роман", "Горлов", 7);
    protected static Person person3 = new Person("Андрей", "Алтухов", 2);
    protected static Person person4 = new Person("Альберт", "Саяпов", 9);
    protected static Person person5 = new Person("Денис", "Анциборов", 5);

    static List<Person> generateClients() {
        List<Person> persons = new LinkedList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        return persons;
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            person.delTicket();
            System.out.println(person);
            if (person.getTicket() > 0) {
                queue.offer(person);
            }
        }
    }
}
