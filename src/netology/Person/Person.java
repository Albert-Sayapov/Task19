package netology.Person;

public class Person {
    protected String name;
    protected String surname;
    protected int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public boolean delTicket() {
        if (this.ticket != 0) {
            this.ticket -= 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " прокатился на аттракционе";
    }
}


