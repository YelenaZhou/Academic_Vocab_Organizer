import java.io.*;
import java.util.ArrayList;

public class VocabFunctions {
    private ArrayList<Vocabulary> vocabList = new ArrayList<>();

    public void addVocabulary() {
        String word = IO.readln("Enter a word:\n");
        String definition = IO.readln("Enter the definition:\n");
        String course = IO.readln("Enter the course:\n");

        if (word.contains("|") || definition.contains("|") || course.contains("|")) {
            IO.println("Cannot use | character. Please try again.\n");
            return;
        }

        Vocabulary vocab  = new Vocabulary(word, definition, course);
        vocabList.add(vocab);

        save();

        IO.println("Successfully added a new vocabulary!\n");
    }

    public void save() {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("vocab.txt"))) {
            for (int i = 0; i < vocabList.size(); i++) {
                Vocabulary vocab = vocabList.get(i);
                pw.println(vocab.getWord() + "|" + vocab.getDefinition() + "|" + vocab.getCourse());
            }
            IO.println("Successfully saved!\n");
        } catch (IOException e) {
            IO.println("Error saving vocabulary!\n");
        }
    }

    public void load() {
        vocabList.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("vocab.txt"))) {
            String line = br.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    Vocabulary vocab = new Vocabulary(parts[0], parts[1], parts[2]);
                    vocabList.add(vocab);
                }
                line = br.readLine();
            }
            IO.println("Successfully loaded vocabulary!\n");
        } catch (FileNotFoundException e) {
            IO.println("No such file found.\n");
        } catch (IOException e) {
            IO.println("Error loading vocabulary!\n");
        }
    }
}
