package JavaProject;

public class DuplicateElements09 {
    public static void main(String[] args) {
        String[] states = {"California", "Texas", "Florida", "New York", "Texas", "Florida", "Illinois", "California"};

        System.out.println("Duplicate states:");

        // Check for duplicates using nested loops
        for (int i = 0; i < states.length; i++) {
            for (int j = i + 1; j < states.length; j++) {
                if (states[i].equals(states[j])) {
                    System.out.println(states[i]);
                    break;
                }
            }
        }


    }
}
