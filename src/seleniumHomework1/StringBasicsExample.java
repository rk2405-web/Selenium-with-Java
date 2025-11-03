package seleniumHomework1;
public class StringBasicsExample {
    public static void main(String[] args) {

        // Declare and initialize strings
        String firstName = "Rama";
        String lastName = "Krishna";

        // 1️⃣ Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // 2️⃣ Find length
        int length = fullName.length();
        System.out.println("Length of full name: " + length);

        // 3️⃣ Access individual characters
        char firstChar = fullName.charAt(0);
        char lastChar = fullName.charAt(fullName.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // 4️⃣ Combine using concat() method
        String greeting = "Hello, ".concat(fullName);
        System.out.println("Greeting Message: " + greeting);

        // 5️⃣ Convert to upper and lower case
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());
    }
}

