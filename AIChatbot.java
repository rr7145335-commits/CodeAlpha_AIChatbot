import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ARTIFICIAL INTELLIGENCE CHATBOT =====");
        System.out.println("Bot: Hello! I am your AI Chatbot.");
        System.out.println("Bot: You can ask me about Java, OOP, internship, project, or college.");
        System.out.println("Bot: Type 'bye' to exit.");
        System.out.println("Bot: You can ask:");
        System.out.println("- What is Java?");
        System.out.println("- What is OOP?");
        System.out.println("- What is AI?");
        System.out.println("- What is NLP?");
        System.out.println("- What is Machine Learning?");
        System.out.println("- What is Data Science?");

        while (true) {
            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine. Thank you!");
            }
            else if (input.contains("your name")) {
                System.out.println("Bot: My name is CodeAlpha AI Chatbot.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language used to build applications.");
            }
            else if (input.contains("oop")) {
                System.out.println("Bot: OOP means Object-Oriented Programming. It uses classes and objects.");
            }
            else if (input.contains("internship")) {
                System.out.println("Bot: Internship helps students gain practical project experience.");
            }
            else if (input.contains("project")) {
                System.out.println("Bot: This project is an AI chatbot using rule-based NLP keyword matching.");
            }
            else if (input.contains("college")) {
                System.out.println("Bot: College helps students learn technical and communication skills.");
            }
            else if (input.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }
            else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else if (input.contains("python")) {
                System.out.println("Bot: Python is a popular programming language used in AI and Data Science.");
            }
            else if (input.contains("ai")) {
                System.out.println("Bot: Artificial Intelligence enables machines to perform tasks that normally require human intelligence.");
            }
            else if (input.contains("machine learning")) {
                System.out.println("Bot: Machine Learning is a branch of AI that learns patterns from data.");
            }
            else if (input.contains("data science")) {
                System.out.println("Bot: Data Science involves collecting, analyzing, and interpreting data.");
            }
            else if (input.contains("nlp")) {
                System.out.println("Bot: NLP stands for Natural Language Processing.");
            }
            else if (input.contains("chatbot")) {
                System.out.println("Bot: A chatbot is a software application that interacts with users through text or voice.");
            }
            else if (input.contains("sentiment analysis")) {
                System.out.println("Bot: Sentiment Analysis identifies whether a text is positive, negative, or neutral.");
            }
            else if (input.contains("machine translation")) {
                System.out.println("Bot: Machine Translation automatically translates text from one language to another.");
            }
            else if (input.contains("what is nlp")) {
                System.out.println("Bot: NLP stands for Natural Language Processing.");
            }
            else if (input.contains("where is nlp used")) {
                System.out.println("Bot: NLP is used in chatbots, machine translation, sentiment analysis, speech recognition, and search engines.");
            }
            else if (input.contains("what is chatbot")) {
                System.out.println("Bot: A chatbot is a program that communicates with users using text or voice.");
            }
            else if (input.contains("what is data science")) {
                System.out.println("Bot: Data Science is the study of data to extract useful information and insights.");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand. Please ask another question.");
            }
        }

        sc.close();
    }
}
