import java.util.*;
public class robot {

    static int robo(int r,int c,int  i, int j){
        if(i>=r || j>= c)
        return 0;

        if(i== r-1 && j== c-1)
        return 1;

        return(robo(r,c,i,j+1)+robo(r,c,i+1,j));
    }
    
    public static void main(String args[]){

        System.out.println(robo(3,3,0,0));
    }
}
