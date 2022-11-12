package data_types;

public class Analyst extends Person{

    String TYPE = "Analyst";

    public Analyst(int id, String name, int age, double salary, String type) {
        super(id, name, age, salary, type);
        this.TYPE = TYPE;
    }


}
