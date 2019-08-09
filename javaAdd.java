import java.util.Scanner;
    public class javaAdd{
    public static void main(String args[]){
    float a,b,res;
    char choice,ch;
    Scanner scan=new Scanner(System.in);
    do{
    System.out.print("1.Add two numbers\n");
    System.out.print("2.multiply two numbers\n");
    System.out.print("3.exit\n\n");
    System.out.print("enter your choice\n");
    choice=scan.next().charAt(0);
    switch(choice){
        case '1' :System.out.print("enter two numbers: ");
                  a=scan.nextFloat();
                  b=scan.nextFloat();
                  res=a+b;
                  System.out.print("Result = "+ res);
                  break;
        case '3' : System.exit(0);
                  break;
        default : System.out.print("invalid choice");
                  break;
    }
    System.out.print("\n...........");
    }
    while(choice!=2);
    }
    }
