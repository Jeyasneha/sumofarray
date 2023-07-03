import java.util.*;

public class sum{
    public static void main(String[] args)
    {
        int total=0;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
            total = total + arr[i];
            
        

        }
        System.out.println("Sum of the elements of an array:" +total);

        // edited by second person 
        System.out.println("Average of the elements of the array:"+total/size);

    }
}
