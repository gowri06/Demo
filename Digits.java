package del;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class Del {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner br=new Scanner(System.in);System.out.println("Enter No.");
        int n=br.nextInt();System.out.println("Enter del digit");
        int k=br.nextInt();
        int length=0;
        int g[]=new int[100];
        int i=0;
        while(n>0){
            g[i]=n%10;
            n=n/10;
            length++;
            i++;
        }
        int ar1[]=new int[length];
        for(i=0;i<length;i++)
			ar1[i]=g[i];
        Arrays.sort(ar1);
        String num="";
        for(i=0;i<length-k;i++)
            num=num+ar1[i];
        System.out.println(num);
           }
    
}

        
