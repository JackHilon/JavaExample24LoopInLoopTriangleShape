
package javaexample24loopinlooptriangleshape;

import java.util.Scanner;


public class JavaExample24LoopInLoopTriangleShape {

    
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int heighT=0;
        int j=1;
        
        System.out.print("Enter triangle heigh: ");
        heighT=GetInteger(in);
        System.out.println();
        
        while(j<=heighT)
        {
            PrintOneLine(j);
            j++;
        }// end outer-while
        
        in.close();
        
    }// end main()
    
    private static void PrintOneLine(int number)
    {
        int a=1;
        while(a<=number)
        {
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
    }
    
    private static int GetInteger(Scanner input)
    {
        int res=0;
        try{
            res=input.nextInt();
            if(res<=0)
                throw new IllegalArgumentException("Zero or negative number!");
            return res;
        }catch(Exception e)
        {
            input.nextLine();
            System.out.println(e.toString());
            return GetInteger(input);
        }
    }
    
}
