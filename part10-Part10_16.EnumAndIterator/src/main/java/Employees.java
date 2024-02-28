
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Employees {

    ArrayList<Person> emplyeesList;

    public Employees() {
        this.emplyeesList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        emplyeesList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(p -> {
                    if (!emplyeesList.contains(p)) {
                        emplyeesList.add(p);
                    }
                });
    }

    public void print() {
        Iterator<Person> iterator = emplyeesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = emplyeesList.iterator();
        
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(education)){
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = emplyeesList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
