import java.util.*;

/**
 * A tiny console "agent" for Android interview preparation.
 *
 * How it helps:
 * 1) asks your focus area
 * 2) gives 3 practice questions
 * 3) suggests a short daily plan
 */
public class AndroidInterviewPrepAgent {

    private static final Map<Integer, String> TOPICS = new LinkedHashMap<>();

    static {
        TOPICS.put(1, "Kotlin Fundamentals");
        TOPICS.put(2, "Android Components (Activity/Fragment/Service)");
        TOPICS.put(3, "Jetpack (ViewModel, LiveData, Room)");
        TOPICS.put(4, "Architecture (MVVM/Clean)");
        TOPICS.put(5, "System Design for Android Apps");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Android Interview Prep Agent ===");
        System.out.println("Choose one focus area:");
        for (Map.Entry<Integer, String> entry : TOPICS.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        System.out.print("Enter option (1-5): ");
        int choice = scanner.hasNextInt() ? scanner.nextInt() : -1;
        scanner.nextLine(); // consume newline

        String topic = TOPICS.getOrDefault(choice, "Kotlin Fundamentals");

        System.out.println("\nGreat choice: " + topic);
        System.out.println("\nTop 3 interview questions to practice:");
        List<String> questions = questionsFor(topic);
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ") " + questions.get(i));
        }

        System.out.println("\nMini daily plan (45 mins):");
        System.out.println("- 15 mins: Read concept notes for " + topic);
        System.out.println("- 20 mins: Answer 2 questions out loud");
        System.out.println("- 10 mins: Revise one real app example from your project");

        System.out.print("\nWant one mock follow-up question? (yes/no): ");
        String followUp = scanner.nextLine().trim().toLowerCase(Locale.ROOT);
        if (followUp.equals("yes") || followUp.equals("y")) {
            System.out.println("Mock follow-up: Explain one trade-off you made in your last Android project and why.");
        } else {
            System.out.println("No problem. Come back tomorrow and pick a new topic.");
        }

        System.out.println("\nTip: Run this daily and record your answers in a notes file.");
        scanner.close();
    }

    private static List<String> questionsFor(String topic) {
        if (topic.contains("Kotlin")) {
            return Arrays.asList(
                    "What are the differences between val and var?",
                    "How do nullable types and safe calls prevent crashes?",
                    "When would you use data class, object, and sealed class?"
            );
        }

        if (topic.contains("Components")) {
            return Arrays.asList(
                    "Explain Activity vs Fragment lifecycle differences.",
                    "How do you pass data safely between screens?",
                    "When should you use a foreground Service?"
            );
        }

        if (topic.contains("Jetpack")) {
            return Arrays.asList(
                    "Why is ViewModel better than storing UI data in Activity?",
                    "How does LiveData differ from StateFlow?",
                    "How do you design Room entities and DAOs for offline-first apps?"
            );
        }

        if (topic.contains("Architecture")) {
            return Arrays.asList(
                    "How does MVVM improve testability?",
                    "What belongs in Repository vs ViewModel?",
                    "How would you separate domain and data layers in Clean Architecture?"
            );
        }

        return Arrays.asList(
                "Design a scalable chat app for Android: key components?",
                "How would you handle caching, pagination, and retries?",
                "What metrics/logging would you add for production debugging?"
        );
    }
}
