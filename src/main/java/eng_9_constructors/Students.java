package eng_9_constructors;

public class Students {
    String name;
    String surname;

    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void changeName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.name = name;
    }

    public void changesurname(String surname) {
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        this.surname = surname;
    }

    public void reName() {
        System.out.println(name + " " + surname);
    }
}
