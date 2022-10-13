Q1.	Java is a highlevel programming language, object oriented programming language and platform independent where software
	is developed.platform independent means java can be used in any platform like linux,windows,ubunto etc.
	for example in java class is platform independent.
	platform is a combination of processor and OS
	platform means write once run any where
	class file consists of byte code which is platform independent
	
Q2.	Datatypes are represented different values to be stored in a variable
	datatypes are of two types:primitive datatypes and non primitive datatypes
		primitive types are;should be used in lowercase
	byte
	long
	char
	short
	float
	double
	int
	boolean
		non primitive datatypes are;these are the datatypes that should be used in uppercase
	String
	classanme
	System
	referenceType
	
	
Q3. Class is a design or blueprint that repesents states and behavior
	where	states repesents variable and behavior repesents methods.
	class physically exits
	Object is a instance of class
	purpose of object is to create a multiple copy of class
	instace of variable can be accced with satic variable
	static variable will be loaded after classname
	instance variable will be loaded after object is created
	object is created using new keyword
	Syntax of object is :
	classname ref = new Classname();
	static member is class member
	instatnce member is object member
	building blocks of class are variables methods blocks and constructors.
	program:
	class BigBazar
	{
	// constructor
	BigBazar()
	{
	System.out.println("BigBazar constructor is called");
	}
	//states
	string address;
	string gstNo;
	//behaviour
	void shopping()
	{
	System.out.println("Lets shop");
	}
	}
	
	class BigBazarTester
	{
	public static void main(String a[])
	{
	BigBazar big = new BigBazar();//object creation
	big.address = "jpnagar";
	big.gstNo = 110AA33;
	System.out.println(big.address);
	}
	}
	
	
Q4.	class Marks
	{
	static int totalMarks;
	static int receivedMarks;
	public static void settotalMarks(int tMarks)
	{
	totalmarks = tMarks;
	}
	public static void gettotalMarks()
	{
	totalmarks = tMarks;
	return totalMarks;
	}
	
	
	public static void setreceived(int rMarks)
	{
	  receivedmarks = rMarks;
	}
	public static int getreceivedMarks()
	{
	return receivedMarks;
	}
	}

	class MarksTester
	{
	public static void main(String a[])
	{
	Marks.settotalMarks(250);
	System.out.println(Marks.getTotalmarks());
	Marks.setreceivedMarks(189);
	System.out.println(Marks.getReceivedmarks());
	}
	}
	
	
	
	
	
Q5.	int[] values ={34,78,90,53,34,11,53,15,78,91,8,4,67,11};
	duplicate values in an array means the values that are reapeated in an array for multiple times
	int[] values ={78,53.11}//duplicate values
	
	
Q6.	method is a colection of statements grouped together to perform functionality
		public static void main (String a[])
		this the main method used in the program ,in main method itself where values are initialized
		public static is accessmodifier
		void is return types
		main is a method
		(string a[]) is a parameter.
		java virtual machine will look after the main method.
		
Q7.  class Revese
	{
	
	public static void main(String a[])
	{	

	int num = 1234 , rev = 0;
	System.out.println("original number:"  + num);
	
	while(num != 0)
	{
	
	int digit = num % 10;
	rev = rev + 10 + digit;
	num = num/10;
	System.out.println("rev number :" =rev);
	}
	}
}	
	

Q8.class HoursToSecond
{
public static void main(String a[])
{
int hours = 1,seconds;
seconds = hours*60*60;
System.out.println(seconds);
}
}