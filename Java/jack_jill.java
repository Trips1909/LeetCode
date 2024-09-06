import java.util.*;
public class jack_jill {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int jack[]= new int [n];
    int jill[] = new int [n];
    int JackSum=0;
    int JillSum=0;

    for(int i=0;i<n;i++)
    {
        jack[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++)
    {
        jill[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
        if(jack[i]<jill[i]){
            JackSum+=jack[i];
        }

        else{
            JillSum+=jill[i];
        }
    }
    System.out.println(JackSum>JillSum?"Jack wins":"Jill wins");

}
    
}
