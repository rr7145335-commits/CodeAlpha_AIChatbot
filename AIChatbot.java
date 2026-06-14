import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ChatbotBrain {

    String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }
        else if (input.contains("how are you")) {
            return "I am fine. Thank you!";
        }
        else if (input.contains("your name")) {
            return "My name is CodeAlpha AI Chatbot.";
        }
        else if (input.contains("java")) {
            return "Java is an object-oriented programming language used to build applications.";
        }
        else if (input.contains("oop")) {
            return "OOP means Object-Oriented Programming. It uses classes and objects.";
        }
        else if (input.contains("ai")) {
            return "Artificial Intelligence enables machines to perform tasks that normally need human intelligence.";
        }
        else if (input.contains("nlp")) {
            return "NLP stands for Natural Language Processing. It helps computers understand human language.";
        }
        else if (input.contains("machine learning")) {
            return "Machine Learning is a branch of AI that learns patterns from data.";
        }
        else if (input.contains("data science")) {
            return "Data Science is used to collect, analyze, and understand data.";
        }
        else if (input.contains("internship")) {
            return "Internship helps students gain practical project experience.";
        }
        else if (input.contains("project")) {
            return "This project is a Java AI Chatbot using rule-based NLP.";
        }
        else if (input.contains("where is nlp used")) {
            return "NLP is used in chatbots, Google Translate, voice assistants, sentiment analysis, and search engines.";
        }
        else if (input.contains("nlp")) {
            return "NLP stands for Natural Language Processing. It helps computers understand human language.";
        }
        else if (input.contains("thank")) {
            return "You're welcome!";
        }
        else if (input.contains("bye")) {
            return "Goodbye! Have a nice day.";
        }
        else if (input.contains("java")) {
            return "Java is an object-oriented programming language used to develop applications.";
        }

        else if (input.contains("object oriented programming") || input.contains("oop")) {
            return "OOP is a programming style that uses classes and objects.";
        }

        else if (input.contains("class")) {
            return "A class is a blueprint used to create objects.";
        }

        else if (input.contains("object")) {
            return "An object is an instance of a class.";
        }

        else if (input.contains("inheritance")) {
            return "Inheritance allows one class to acquire properties from another class.";
        }

        else if (input.contains("encapsulation")) {
            return "Encapsulation means hiding data and controlling access through methods.";
        }

        else if (input.contains("polymorphism")) {
            return "Polymorphism allows the same method to perform different tasks.";
        }

        else if (input.contains("artificial intelligence") || input.contains("ai")) {
            return "Artificial Intelligence enables computers to perform tasks that normally require human intelligence.";
        }

        else if (input.contains("machine learning")) {
            return "Machine Learning is a branch of AI that learns patterns from data.";
        }

        else if (input.contains("data science")) {
            return "Data Science involves collecting, analyzing, and interpreting data.";
        }

        else if (input.contains("nlp")) {
            return "Natural Language Processing helps computers understand and process human language.";
        }

        else if (input.contains("internship")) {
            return "An internship provides practical work experience and skill development.";
        }

        else if (input.contains("project")) {
            return "A project is a practical application of knowledge to solve a real-world problem.";
        }
        else {
            return "Sorry, I don't know the answer. Please ask about Java, OOP, AI, NLP, Machine Learning, Data Science, Internship, or Project.";
        }
    }
}

public class AIChatbot extends JFrame implements ActionListener {

    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;
    ChatbotBrain bot;

    AIChatbot() {
        bot = new ChatbotBrain();

        setTitle("AI Chatbot");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setText("Bot: Hello! I am your AI Chatbot.\n");
        chatArea.append("Bot: Ask me about Java, OOP, AI, NLP, ML, Data Science, Internship, or Project.\n");

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();
        sendButton = new JButton("Send");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(this);
        inputField.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String userInput = inputField.getText();

        if (userInput.trim().isEmpty()) {
            return;
        }

        chatArea.append("\nYou: " + userInput);

        String response = bot.getResponse(userInput);
        chatArea.append("\nBot: " + response + "\n");

        inputField.setText("");

        if (userInput.toLowerCase().contains("bye")) {
            inputField.setEnabled(false);
            sendButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new AIChatbot();
    }
}
