class Student {
    // 1. Variables are PRIVATE  (Data Hiding)
    private int age;
    private String name;

    // 2. Public Getter (Read data)
    public int getAge() {
        return age;
    }

    // 3. Public Setter (Write data)
    public void setAge(int age) {
        if(age > 0) {      // validation — control the data
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(20);        // using setter
        s.setName("Dhiraj");

        System.out.println(s.getAge());   // using getter
        System.out.println(s.getName());
    }
}
