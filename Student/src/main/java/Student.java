public class Student implements Printable {
    private String name;
    private int transcriptID;
    private float averageScore;

    public int getTranscriptID() {
        return transcriptID;
    }

    public void setTranscriptID(int transcriptID) {
        this.transcriptID = transcriptID;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Студент: %s\n", getName());
        System.out.printf("Номер зач. книжки: %d\n", getTranscriptID());
        System.out.printf("Средний балл: %.2f", getAverageScore());
    }
}

