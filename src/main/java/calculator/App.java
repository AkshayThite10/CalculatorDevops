import java.util.*; 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option,flag,num2;
		flag = 0;
		double num1,exponent;
		System.out.println("............Calculator Program............");
		while(flag!=1)
		{
			System.out.println("Operation choices : \n");
			System.out.println("1. Square root");
			System.out.println("2. Factorial");
			System.out.println("3. Natural log");
			System.out.println("4. Power\n");
			System.out.println("Enter your choice : ");
			option = sc.nextInt();
			switch(option)
			{
			    case 1:
			    	System.out.println("Square root\n");
			    	System.out.println("Enter a number : ");
			    	num1 = sc.nextDouble();
			    	if(num1<0)
			    	{
			    		System.out.println("Enter valid input\n");
			    	}
			    	else
			    	{
			    		sqroot(num1);
			    	}
			    break;

			    case 2:
			    	System.out.println("Factorial\n");
			    	System.out.println("Enter a number");
			    	num2 = sc.nextInt();
			    	if(num2<0)
			    	{
			    		System.out.println("Enter valid input\n");
			    	}
			    	else
			    	{
			    		fact(num2);
			    	}
			    break;

			    case 3:
			    	System.out.println("Natural log\n");
			    	System.out.println("Enter a number : ");
			    	num1 = sc.nextDouble();
			    	if(num1)
			    	{
			    		System.out.println("Enter valid input\n");
			    	}
			    	else
			    	{
			    		natlog(num1);
			    	}  	
			    break;

			    case 4:
			    	System.out.println("Power\n");
			    	System.out.println("Enter a number : ");
			    	num1 = sc.nextDouble();
			    	System.out.println("Enter exponent : ");
			    	exponent = sc.nextDouble();
			    	powerfxn(num1,exponent);
			    break;

			    case 5:
			    	flag = 1;
			    break;

			    default:
			    	System.out.println("Enter a valid option");
			}
		}
	}

	public static double sqroot(double num) {
		double res;
		res = Math.sqrt(num);
		System.out.print("\n");
		System.out.println("Square root = "+res);
		System.out.print("\n");
		logger.info("Square root computed");
		return res;
	}
	public static int fact(int num){
	    int res=num,i;
	    if(num==0)
	    {
	    	res=1;
	    }
		for(i=num-1;i>=1;i--)
		{
		    res=res*i;
		}
		System.out.print("\n");
		System.out.println("Factorial = "+res);
		System.out.print("\n");
		logger.info("Factorial computed");
		return res;
	}
	public static double natlog(double num){
		double res = Math.log(num);	
		System.out.print("\n");
		System.out.println("Natural log = "+ res);
		System.out.print("\n");
		logger.info("Natural log computed");
		return res;
	}
	public static double powerfxn(double num, double exponent){
		double res = Math.pow(num,exponent);
		System.out.print("\n");
		System.out.println("Power = "+ res);
		System.out.print("\n");
		logger.info("Power computed");
		return res;
	}
}