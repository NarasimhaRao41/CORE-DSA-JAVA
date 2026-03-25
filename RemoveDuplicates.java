import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
            set.add(num);

        System.out.println("Array after removing duplicates:");

        for(int num : set)
            System.out.print(num + " ");
    }
}

Output :

Enter array size: 5
Enter elements:
1 2 2 6 5
Array after removing duplicates:
1 2 5 6 
