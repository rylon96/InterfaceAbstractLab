package lab1;



public class IntroToProgrammingCourse extends Course {
    
    @Override
    public void getCourseName() {
        System.out.println("Course Name:    Introduction to Programming");
    }

    @Override
    public void getCourseNumber() {
        System.out.println("Course Number:  " + 20124);
    }

    @Override
    public void getCredits() {
        System.out.println("Credits:    "+2);
    }

    @Override
    public void getPrerequisites() {
        System.out.println("Prerequisites:  None");
    }

    
}
