/* Sam Dosi
 * Dr. Steinberg
 * COP3330 Spring 2022
 * Programming Assignment 4
 */
public class Worker {
    protected String name;
    protected int hours;
    public Worker(String name, int hours)
    {
        System.out.println("Worker(String name, int hours) has been invoked...");
        this.name = name;
        this.hours = hours;
    }
    public final void whoAreYou(){
        System.out.println("My name is "+ name + " and I work " + hours + " hours a week.");

    }
    public void work(){
        System.out.println("I am " + name  + " and I am doing my duty as the general worker for "+ hours + " hours a week.");
    }
    public final void updateHours(int hours){
        System.out.println("Updating hours.");
        this.hours = hours;
        System.out.println("Updating hours is now complete.");
    }
}
class Teacher extends Worker{
    private int numstudents;
    public Teacher(String name, int hours, int numstudents){
        super(name, hours);
        System.out.println("Teacher(String name, int hours, int numstudents) has been invoked...");
        this.numstudents = numstudents;
    }
    public void work(){
        System.out.println("I am " + name + " and I am doing my duty as the teacher.");
        System.out.println("I have " + numstudents + " students and work " + hours + " hours a week.");
    }
    public void grade(){
        System.out.println("Grading papers. The class did very well.");
    }
}
class Doctor extends Worker{
    private String type;
    public Doctor(String name, int hours, String type){
        super(name, hours);
        System.out.println("Doctor(String name, int hours, String type) has been invoked...");
        this.type = type;
    }
    public void work(){
        System.out.println("I am " + name + " and I am doing my duty as the doctor.");
        System.out.println("I am a "+ type + " and work " + hours + " hours a week.");
    }
    public void checkUp(){
        System.out.println("Checking on patient.");
    }
}
class CampCounselor extends Worker{
    private double rate;
    public CampCounselor(String name, int hours, double rate){
        super(name, hours);
        System.out.println("CampCounselor(String name, int hours, double rate) has been invoked...");
        this.rate = rate;
    }
    public void work(){
        System.out.println("I am " + name + " and I am doing my duty as the camp counselor.");
        System.out.println("I am a camp counselor and work " + hours + " hours a week for " + rate + " per hour.");
    }
    public void activity(){
        System.out.println("Let's race across the pool!");
    }
}

