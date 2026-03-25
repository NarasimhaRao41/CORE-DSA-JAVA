import java.util.*;

public class VowelConsonantCount {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for(char ch : str.toCharArray()){

            if(Character.isLetter(ch)){

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}

Output :

Enter String: narasimharao
Vowels = 6
Consonants = 6
