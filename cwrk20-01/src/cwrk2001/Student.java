
package cwrk2001;


public class Student {
    protected String name;
    protected int age;
    protected double gpa;

    public Student(){
        age = 0;
        gpa = 0.0;
        name = "No Name";
    }

    public Student(String name, int age, double gpa) {
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > -1){
            this.age = age;
        }else{
            throw new IllegalArgumentException("You entered a value that is negative");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }else{
            throw new IllegalArgumentException("You entered a value either less than 0 or greater than 4");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
