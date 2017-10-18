package StatePattern;

public class Offered implements SubjectState{

    @Override
    public SubjectState studentEnrollsSubject(int totalStudents, int maxNumberVacancies) {
        return new Open();
    }

    @Override
    public SubjectState studentLeavesSubject(int totalStudents){
        return null;
    }

    @Override
    public SubjectState cancelsSubject(int totalStudents){
        if(totalStudents == 0) {
            return new Canceled();
        }
        return null;
    }

    @Override
    public SubjectState offerSubject(){
        return null;
    }

}
