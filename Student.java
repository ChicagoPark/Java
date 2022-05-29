public class Student {
    // Declare attributes
    String name;
    int age;
    String address;

    // initializer (should have the same name with class)
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }
    @Override
    public String toString() {
        return ("Student name is " + this.getName() +
                ", age is: " + this.getAge()+ " and address is: "+
                this.getAddress());
    }

    public static void main(String[] args) {
        // Create instance of the class
        Student john = new Student("john", 25, "23 East, California");
        System.out.println(john.toString());

        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }
}
