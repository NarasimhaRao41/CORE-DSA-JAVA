import java.util.*;

public class MergeSortedArrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int a[] = new int[n1];

        System.out.println("Enter elements:");

        for(int i=0;i<n1;i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int b[] = new int[n2];

        System.out.println("Enter elements:");

        for(int i=0;i<n2;i++)
            b[i] = sc.nextInt();

        int c[] = new int[n1+n2];

        for(int i=0;i<n1;i++)
            c[i] = a[i];

        for(int i=0;i<n2;i++)
            c[n1+i] = b[i];

        Arrays.sort(c);

        System.out.println("Merged Sorted Array:");

        for(int num : c)
            System.out.print(num + " ");
    }
}
