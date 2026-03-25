import java.util.*;
public class MatrixTranspose{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        
        int matrix[][] = new int[r][c];
        System.out.println("Enter matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
               System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
        }
    }
}

output :
Enter rows: 3
Enter columns: 3
Enter matrix:
1 2 3
4 5 6
7 8 9
Transpose:
1 4 7 
2 5 8 
3 6 9 
