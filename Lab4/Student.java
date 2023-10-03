package Lab4;

public class Student {
    public static int _instanceCount = 0;
    
    private String Nume;

    public Student(String Nume){
        this.Nume = Nume;
        _instanceCount++;
    }

    public String getNume(){
        return this.Nume;
    }

    public void setNume(String Nume){
        this.Nume = Nume;
    }

    public static void main(String[] args){
        Student s1 = new Student("Popescu");
        Student s2 = new Student("Ionescu");
        Student s3 = new Student("Georgescu");

        System.out.println(s1.getNume());
        System.out.println(s2.getNume());
        System.out.println(s3.getNume());

        System.out.println(Student._instanceCount);
    }
}

