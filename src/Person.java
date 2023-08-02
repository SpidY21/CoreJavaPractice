public class Person {

    private String name;
    private int age;
    private String gender;
    Person(){
        name="Yash Kumar Roy";
        age=22;
        gender="Male";
    }
    Person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
