package JavaProject;

public class ArrayTempratures01 {
    public static void main(String[] args) {
        int[]temperatures={57,65,43,85,90,75,69};

        int max=temperatures[0];
        int min=temperatures[0];

        for (int tem:temperatures){
            if (tem>max){
                max=tem;
            }

            if (tem<min){
                min=tem;
            }

        }
        System.out.println("Maximum temperatures "+max);
        System.out.println("Minimum temperatures "+min);
    }
}
