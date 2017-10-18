package StatePattern;

public class Canceled implements SubjectState{

    @Override
    public SubjectState studentEnrollsSubject(int totalStudents, int maxNumberVacancies) {
        return new Canceled();
    }

    @Override
    public SubjectState studentLeavesSubject(int totalStudents) {
        return null;
    }

    @Override
    public SubjectState cancelsSubject(int totalStudents) {
        return null;
    }

    @Override
    public SubjectState offerSubject() {
        return new Offered();
    }

}
