package StatePattern;

public class EnrollmentContext{
    private SubjectState state;
    private int totalStudents;
    private int maxNumberVacancies;
    private String subject;

    public EnrollmentContext(String subject, int maxNumberVacancies){
        state = new Offered();
        totalStudents = 0;
        this.maxNumberVacancies = maxNumberVacancies;
        this.subject = subject;
    }

    public void studentEnrolls(){
        state = state.studentEnrollsSubject(totalStudents, maxNumberVacancies);
        if(state != null) {
            totalStudents++;
        }
    }

    public void studentLeavesSubject(){
        state = state.studentLeavesSubject(totalStudents);
        if(state != null) {
            totalStudents--;
        }
    }

    public void cancelsSubject(){
        state = state.cancelsSubject(totalStudents);
        if(!(state instanceof Canceled)) {
            System.out.println("Subject can not be canceled.");
        }
    }

    public void offerSubject(){
        state = state.offerSubject();
        if(!(state instanceof Offered)) {
            System.out.println("Subject can not be offered.");
        }
    }

    public int getTotalStudents(){
        return totalStudents;
    }
}
