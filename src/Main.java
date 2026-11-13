public class Main {

    public static void main(String[] args) {

        VocabFunctions vocabFunctions = new VocabFunctions();
        vocabFunctions.load();

        while (true) {
            IO.println("Academic Vocabulary Organizer");
            IO.println("------------------------------");
            IO.println("1) Add an new vocabulary");
            IO.println("2) Search an existing vocabulary");
            IO.println("3) View all vocabulary");
            IO.println("4) Review vocabulary by course");
            IO.println("5) Exit");
            IO.println("------------------------------");
            String choice = IO.readln("Enter your choice:\n");

            switch (choice) {
                case "1" -> vocabFunctions.addVocabulary();
                case "2" -> IO.println("Searched an existing vocabulary\n");
                case "3" -> IO.println("Viewed all vocabulary\n");
                case "4" -> IO.println("Reviewed vocabulary by course\n");
                case "5" -> {
                    IO.println("Exit");
                    return;
                }
                default -> IO.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
