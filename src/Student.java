public class Student {
    private int id;
    private String name;
    private int age;
    private  int marks;
    private char gender;
    public Student( String name, int age,  char gender,int marks) {

        this.name=name;
        this.age=age;
        this.marks=marks;
        this.gender=gender;
    }

    public Student( int id,String name, int age,  char gender,int marks) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.gender=gender;
    }

    //GETTERS

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getMarks() {
        return marks;
    }
    public char getGender() {
        return gender;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
}
