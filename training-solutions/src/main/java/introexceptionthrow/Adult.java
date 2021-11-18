package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Adult(String name, int age) {
        this.name = name;
        this.age = age;
        if(age < 18){
            throw new IllegalArgumentException(name + " younger than 18 year");
        }
    }
    @Override
    public String toString() {
        return name + " is adult";
    }
}
