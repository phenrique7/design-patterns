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

    public void studentEnrollsSubject(){
        state = state.studentEnrollsSubject(totalStudents, maxNumberVacancies);
        if(state instanceof Closed){
            System.out.println("There are no vacancies in the subject.");
        }
        else if(state instanceof Canceled){
            System.out.println("Subject is not offered.");
        }
        else {
            totalStudents++;
        }
    }

    public void studentLeavesSubject(){
        state = state.studentLeavesSubject(totalStudents);
        if(state instanceof Offered) {
            System.out.println("There are no students in the subject.");
        }
        else if(state instanceof Canceled){
            System.out.println("The subject is canceled.");
        }
        else {
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
        if(state instanceof Offered) {
            System.out.println("Subject is already being offered or is already open.");
        }
        else {
            System.out.println("Subject can not be offered.");
        }
    }

    public int getTotalStudents(){
        return totalStudents;
    }
}
