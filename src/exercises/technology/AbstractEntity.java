package exercises.technology;

public class AbstractEntity {
    public int id;
    public static int nextId = 1;

    public void setId() {
        this.id = this.nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

}
