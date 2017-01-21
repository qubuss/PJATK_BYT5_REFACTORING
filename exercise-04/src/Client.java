package src;


import java.io.IOException;
import java.io.Writer;

public class Client {
//TODO DONE
    public static void printPerson(Writer out, Person person) throws IOException {
        out.write(person.getFirst());
        out.write(" ");
        if (person.getMiddle() != null) {
            out.write(person.getMiddle());
            out.write(" ");
        }
        out.write(person.getLast());
    }

    public static String formatPerson(Person person) {
        String result = person.getLast() + ", " + person.getFirst();
        if (person.getMiddle() != null)
            result += " " + person.getMiddle();
        return result;
    }

    public static void display(Writer out, Person person) throws IOException {
        out.write(person.getLast());
        out.write(", ");
        out.write(person.getFirst());
        if (person.getMiddle() != null) {
            out.write(" ");
            out.write(person.getMiddle());
        }
    }

    public static String toString(Person person) {
        return person.getLast() + ", " + person.getFirst()
                + ((person.getMiddle() == null) ? "" : " " + person.getMiddle());
    }
}
