public class Student {
    
    String name;
    int rollNo;

    
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        
        String college = "ABC Engineering College";
        
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student s = new Student("Raj", 101);
        s.display();
    }
}