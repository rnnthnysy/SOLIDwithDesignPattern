package SOLIDwithDesignPattern;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowResource(Resource resource){
        resource.borrow(this);
    }
}
