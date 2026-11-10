import java.util.ArrayList;

public class VocabFunctions {
    private ArrayList<Vocabulary> vocabList = new ArrayList<>();

    public void addVocabulary() {
        String word = IO.readln("Enter a word:\n");
        String definition = IO.readln("Enter the definition:\n");
        String course = IO.readln("Enter the course:\n");

        Vocabulary vocab  = new Vocabulary(word, definition, course);
        vocabList.add(vocab);

        IO.println("Successfully added a new vocabulary!\n");
    }
}
