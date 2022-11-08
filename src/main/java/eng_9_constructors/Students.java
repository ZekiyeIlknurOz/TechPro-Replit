package eng_9_constructors;

public class Students {
    String name;
    String surname;

    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void changeName(String name){
        this.name = name;
    }

    public void reName(){
        System.out.println(name + " " + surname);
    }

    public void changesurname(String surname){
        this.surname = surname;
    }
}
