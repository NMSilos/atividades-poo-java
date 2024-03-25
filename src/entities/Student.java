package entities;

public class Student {

    public String name;

    public double g1;
    public double g2;
    public double g3;

    public double finalGrade(){
        return g1 + g2 + g3;
    }

    public void situation(){
        if(finalGrade() < 60){
            System.out.println("FAILED\nMISSING " + (60 - finalGrade()) + " POINTS");
        } else {
            System.out.println("PASS");
        }
    }

    @Override
        public String toString() {
        return "FINAL GRADE: " + finalGrade();
    }
}
