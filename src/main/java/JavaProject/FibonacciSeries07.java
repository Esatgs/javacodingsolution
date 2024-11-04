package JavaProject;

public class FibonacciSeries07 {
    public static void main(String[] args) {

        int count=10;
        int first=5;
        int second=6;

        System.out.println("First " + count + " numbers of the Fibonacci series:");

        for (int i = 0; i < count; i++){
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }


}
