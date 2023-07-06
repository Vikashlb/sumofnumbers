import java.util.*;
public class program {
    public static void main(String[] args)
    {
        int n, temp =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int j =0;j<n;j++)
        {
            temp = temp+arr[j];
        }
        System.out.println(temp);
    }
}
