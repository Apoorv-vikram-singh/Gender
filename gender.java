import java.util.Scanner;
public class gender {
    public String f,m;
    public int age;
    void getvalue()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("press female for female and press male for male gender");
        f=sc.next();
        m=sc.next();
        age=sc.nextInt();
        if(f=="female" || age<=58)

        {
            System.out.println("interest is 8.2%");


        }
         if(f=="female"|| age>=59&&age<=100)
        {
            System.out.println("interest is 9.2" );
        }
        if(m=="male" ||age<=58)
        {
            System.out.println("interest is 8.4");
        }

            
        if(m=="nmale" ||  age>=59&&age<=100)
        {
            System.out.println("interest is 10.5" );
        }

    }

    public static void main(String[]args){
        gender ob =new gender();
    ob.getvalue();
  
    }

    
}