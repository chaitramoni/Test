															Test 2

Q1.	JVM:java virtual machine
	jvm provides environment to run code
	jvm takes the help of jre to run the code	
	Task of jvm is:
	loads the byte code
	verify the byte code
	excute the byte code
	
	JRE:java Runtime Environment
	jre provides run time environment which includes set of library
	jre helps the java to run the code
	
	JDK:java development kit
	jdk is known as fully featured development tool to develop a software
	jdk includes jre,set of library,and development tools
	tools like debugger docs etc
	jdk is to write,develop a software
	
Q2. 1.Class is a design or blueprint that repesents states and behavior
	where	states repesents variable and behavior repesents methods.
	class physically exits
	building blocks of class are variables ,methods blocks and constructors.
	2.Object is a instance of class
	purpose of object is to create a multiple copy of class
	instace of variable can be accced with satic variable
	static variable will be loaded after classname
	instance variable will be loaded after object is created
	object is created using new keyword
		Syntax of object is :
	classname ref = new Classname();
	static member is class member
	instatnce member is object member
	3.static is keyword
		static is loaded when class is loaded
		static are the variables declared outside the methods
	4.public is a keyword
		public is a access modifier
		if we use public keyword any user can see it
	5.private is a keyword and another access modifier
	private keyword is used for private access
	
Q3.1Array is a container which holdes multiple values of similar type
	syntax:datatype variableName[] = {value/data}
	types: two types
	implicit
	explicit
	Advantage: array is strongly typed
	
	2.public static void main(String a[])
	public is an access modifier
	static is access modifier
	void is return type
	main is a method
	(string a[])is argument line
	
	3.System.out.println()
	
	
	
	
Q5.Data types repesents different values to be stored in avariable
	types:two types 
	primitive data type
	non primitive data type
	In primitive data type eight are there int,byte,char,long,double,float,boolean short
	these datatype should be in lower case
	In non primitive data types like String,system,class these datatypes are in upper case
	
Q6. variables are a registered area located in a memory
	types : four
	static variable
	instance variable
	local variable
	parameter variable
	
Q9.Because java is a platform independent 

Q8.features of java are
java is simple
secured portable 
object oriented
platform independent
robust
high performance
dynamic multithreaded

Q13.class Factorial
{
public static void main(String a[])
{

int num = 8;
long factorial = i;
for(int z = i;z<=num;z++)
{
factorial =factorial * z 
}
System.out.printf("factorial of %d = %d", num,factorial);
}

}	
	
Q7.Constructor is a special type of method same as class name without a return a return type
syntax classname()
{
}
constructor is invoked when object is created
types: two 
parameterized
default

Q12.class ReverseNumber
{
	public static void main (String a[])
	
	{
	int num = 1234 , reversed = 0;
	
		for(; num != 0; num/= 10)ā
		{
		int digit = num % 10;
		reversed = reversed * 10+digit;
		}
	System.out.println("Reversed Number is :" + reversed);
	
	}


}	
															