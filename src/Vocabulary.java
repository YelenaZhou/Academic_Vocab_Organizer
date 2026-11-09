public class Vocabulary {
    private String word;
    private String definition;
    private String course;

    public Vocabulary(String word, String definition, String course) {
        this.word = word;
        this.definition = definition;
        this.course = course;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    public String getCourse() {
        return course;
    }
}
