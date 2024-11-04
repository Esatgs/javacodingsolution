package JavaProject;

public class ArraySum02 {
    public static void main(String[] args) {

        int[] values={45,50,60,35,20,90,80,15};
        int sum=0;

        for (int val:values){

            sum=sum+val;
        }

        System.out.println(sum);

    }
}
