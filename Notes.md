**Java is platform independent language:
**

	- Source code is written with extension .java 
	- We compile source code using #javac command.(Compiler)
	- If there are no compilation error, compiler generate .class file.
	- .class file contains intermediate code which is called as "ByteCode"
	- ByteCode is Platform Independent.
	- We pass bytecode to JVM which converts bytecode into m/c code.
	- JVM is platform dependent.

	Source Code -> javac -> ByteCode(.class) -> JVM -> m/c code -> o/p
	
	Is Java compiled/interpreted language?
	- It's both.
	
	Wouldn't this coversion from source code to bytecode and then byte code to m/c code slows
	down the execution?
	No. JIT helps to optimize the execution.
	
	JIT : Just in time compiler. It runs along with JVM and it has optimization techniques,
	it avoids repeatation of converting same code into m/c code. (It uses cache).

	What all types of application we can built using Java?
		- Desktop application
		- Web application
		- Mobile application
		- Application runs on T.V (Android TV)
		- Java can run on embedded device as well.
		
	Cross compilation:
	Program compiled on one m/c can run on other m/c. Java is cross-compiled.
	
	Java version compability:
	Program compiled with version "x" can run on any OS having Java version "x" or greater than x.
	
	e.g. Java program compiled with version 10, can run on 10 and 10+. It won't run on Java 8.
	
	
**File Naming Rule:
**
	Java file name MUST be same as class name ONLY when class is declared as "public".
	In one java file we can have at most one public class.
	

	main() function:
		- It's mandatory to write main() function inside a class which you want to run using JVM(#java command).
		- main() is entry point function from where execution starts.
		
	In Java, syntax of main() is -> 
			
			public static void main(String[] args) {} 

**Encapsulation		
**	
	- Encapsulation is OOP principle.
	- Encapsulation means "Keeping Related Things Together". (e.g. Tablet/Capsule with differnt types
	of component keep together to cure some disease)
	- Class is an example of encapsulation.
	
**
Class**
 
 - Class is an encapsulation which keeps related things(properties and behaviour) together.
 - Class is just a template which defines what should be property and functions.
 - Creating object of a class gives real meaning to a class.
 - For any entity(Real world/logical) having properties(state) and functions(behaviours) we can create a class.
 - "class" is a keyword used to declare a class.
 	e.g.
			class Person {
				String name;
				String phNo;
				String emailId;
				Date birthDate;
				char gender;
				Address address;
				
				void run(){}
				void walk(){}
				int getAge(){}
			}

	One class can be related with other class in following ways.
	1) IS-A Relationship  => Inheritance (Reusability)
	2) HAS-A Relationship => Composition/Aggregation (Association)

	ex. of IS-A relationship:
	Student IS-A Person
	Doctor IS-A Person

	ex. of HAS-A relationship:
	Car HAS-A Engine (Strong relationship) -> Composition
	Student HAS-A Address(Unidirectional, one can exists without other.
			No strong depdendency)-Aggregation

	
What is Object?
	- Object is an instance of a class.
	- We create object using "new" keyword.
	
		Student s = new Studnet();
		Employee e1 = new Employee();

What all things a class consist of?
	- Properties (instance/static). instance-object properties, static-class properties
	- Functions
		instance function
		static function
	- instance block - ON instance creation
	- static block - Called on class loading
	- inner class

Reference variable:
	- It's a pointer which points to an object.
	- Reference variable are stored on "stack".
	- Actual object created using "new" gets stored in "Heap" memory.
	
Emp e1 = new Emp();



	main() {
		int a;
		f1();
	}
	
	f1() {
		int b;
		f2();
	}
	f2() {
		int c;   
	}
	
**Reference v/s Object:
**

		- Reference is a pointer which point to an object.
		- Reference is stored on "stack", object is stored on "heap" memory.
		
		
		Student s = new Student();
		s.id = 1;
		s.name = "Fred";
		

What is function?
	
	- Function contains lines of code which used to perform specific task.
	- It takes input, process that input and generate output.
	- Function is also referred as method/routine in other languages.
	
	Syntax of funciton in Java:
	
		[<access-specific>] [static] <return-type> functionName([para1, para2..]) {
		
		}
	

How to call static function?
	- Using class name.
	
How to call instance function?
	- Using instance/object
	
class A {
	static void f1() {}
	void f2();
}

	A.f1();// call to static fun
	A.f2();//ERROR
	A obj = new A();
	obj.f2();//call to instance fun
	
Which "Pass By mechanism" java uses in function call?
- Java uses "Pass By Value" mechanism for parameter passing.

What get passed when we pass "reference" to other function?
	- Value of reference gets passed and that is nothing but "memory address".


**Constructor:
**

	- A special function whose name is same as a class name.
	- Name of constructor MUST be same as class name.
	- It does NOT have a return type.
	- We can have more than one constructor in a class(Constructor overloading)
	- It is used to set data in an object which is being created.
	- There are 2 types of constructor.
		a) Default constructor (Without parameter)
		b) Parameterised constructor (With parameter)
	- It's not mandatory to have constructor in a class
	- If we don't provide constructor, then JVM adds default constructor in a class.
	- We can call constructor of our own class using "this" keyword (provided that we are already
		in a constructor) 
	- To call constructor of parent class we use "super" keyword.
	
**"this" keyword:
**

	- "this" keyword is available in all instance functions.
	- It can NOT be used in static function
	- "this" is a reference variable which points to an object on which instance function is called.
	- It is used to differentiate between local variable and instance variable having same name.
	- We can use "this" keyword in following ways.
		a) To access instance variable - this.salary
		b) To call another instance function from one instance function  - this.fun();
		c) To call another cosntructor from a constructor - this() call to default constructor OR
			 this(para1,para2) - call to parametrised constructor

**Data Types
**


There are 8 primitive/in-built data types:

	boolean 1 bit 	(true/false) - Boolean
	char	2 bytes - Because Java supports UTF(unicode) and multi-byte characters (e.g. chinese,japnese) - Character
	
	byte	1 byte		Byte
	short	2 bytes		Short
	int		4 bytes		Integer
	long	8 bytes		Long
	
	float	4 bytes		Float	
	double	8 bytes		Double


How range is calculated?
	e.g.
	For short (2 bytes) -> 16 bits
	1 bit - Reserved for sign
	We can utilise 15 bits.
	
	Range for short -> - 2 ^ 15 to 2 ^ 15 - 1 (-2^n-1 to 2^n-1 - 1)



Rules for Identifier:

What is Identifier?
	- variable name, function name, class name are considered as "identifier"

Identifier can consist of alphabates (a-z, A-Z), digits(0-9), special symbol (underscore _ )
First letter of identifier must be alphabate OR underscore (It can not be number)	

Rule for variable and function name:
- Start identifier name with small letter followed by first capital letter for each word.
e.g. 
int age = 20;
getDetails() {}

float empSalary; // variable name
getEmpSalary(){}	 // function name
	
Rule for class name:
- Class name should be starting with "capital" letter.
	// class naming convention
	class EmployeeDetails {}
	class PersonAgeInformation {}

Typecasting:

There are 2 types
	a) implicit type casting - When we assign small type to big type. It's allowed.
	b) explicit type casting - Assigning big type data to small type is not directly possible and hence explict type casting
		option is available.

Example of implicit type-casting.
	byte b = 20;
	int x = b; // implicit type-casting 
	
Example of explicit type-casting	
	long a = 10;
	int b = (int)a; // long to int - Explict type-casting

A-Z [65-90]
a-z [97-122]
0-9 [48-57]

	
	float -> double (promotion is allowed)
	double -> float (demotion is NOT direclty allowed)

int -> Integer 	(Auto boxing)
Integer -> int 	(Auto unboxing)


Integer important methods/propeties:
Integer.MAX_VALUE
Integer.MIN_VALUE

Integer.toBinaryString(num)
Integer.toHexString(num)
Integer.toOctalString(num)
Integer.reverse(num)

Character wrapper class methods.
    Character.isDigit(char ch)
    Character.isLetter(char ch)
    Character.isLowerCase(char ch)
    Character.isUpperCase(char ch)
	Character.toLowerCase(char ch)
	Character.toUpperCase(char ch)
    Character.getNumericValue(char ch)


**Arrays:
**

	- Array is a collection of same type of elements.
	- It is used when we have to store similar types of elements collectively.
	- e.g.
			String[] cities = {"Pune", "Mumbai", "Banglore", "Hyderabad"};
			String[] bloodGroups = {"A+", "A-", "O+", "O-"};
	- Array declartion syntax:
			int[] arr = new int[5];
			String s[] = new String[]; // Array symbol after variable is also allowed(NOT recommended)
			String[] seasons = {"Summer", "Winter", "Rainy"};
			
	- Once array is created it's size can not be modified. (It is static size)
	- To get length of an array, property "length" is used (e.g. arr.length)
	- Array elements are accessed using "index"
	- If we try to access array elements with invalid index then "ArrayIndexOutOfBoundsException" is thrown.
	
How to traverse an array?
	
	1) Normal for-loop
	
	   int[] arr = {10,20,30,40,50};
	   
	   for (int i=0; i<arr.length; i++) {
	   	System.out.println(arr[i]);
	   }

	2) Using for-each loop
	   
	   String[] arr = {"Pune", "Mumbai", "Banglore", "Hyderabad"};
	   
	   for (String city : arr) {
	   	System.out.println(city);
	   }
	 
	   int[] data = {1,2,3,4,5};
	   for(int d:data) {
	   	System.out.println(d);
	   }

Is it possible to have an array where we can store any type of information?
Yes. Using Object[]

	e.g. Object[] arr = {1, "Abc", 90.3f};
	
How to create array for user-defined type?

class Emp {
 int id;
 String name;
 float salary;
}

	Emp[] arr = new Emp[5];
	
	Emp e1 = new Emp(11, "John", 10000);
	arr[0] = e1; 


https://github.com/PriteshGajjarJava/coreJava24


	JVM/JRE 
	ByteCode
	Platform independent
	main() function
	class, object, encapsulation
	IS-A relationship
	HAS-A relationship
	static function
	instance function
	constructor
	stack v/s heap
	reference, object
	Data types
	Arrays
	
	Array, String, Inheritance, Polymorphis, Exception Handling,
		Multi-Threading,Collection
	
**String:
**	   

- String is not a data type.
- It is a class from "java.lang" package
- String is used to represent multiple characters
e.g.
	String name = "Raj";
	String city = "Pune";
	
- There are 2 ways of creating String.
	1) Direct assignment
			String city = "Pune"; // String Literal
	2) Using constructor
			String city = new String("Delhi");
			
String Literal Pool:
- Strings created by assigning literals directly goes in special memory in heap area called as "String Literal Pool".

	e.g.
			String city1 = "Pune";
			String city2 = "Pune";
			
		city1, city2 will point to same literal entry in literal pool. 
	
			String name1 = new String("Nitin");
			String name2 = new String("Nitin");
		
		name1 and name2 will have dedicated memory allocation.

String objects are "immutable":

	- Using string literal pool, literals can be shared.
	- String content can NOT be modified directly.
	- Any changes to string content would lead to creation of new string and this is called as "String immutability".
	
e.g.
		String s1 = "Pune";
		String s2 = "Pune";
		
		s1 = s1.toUpperCase(); // New literal will be created for "PUNE"
		
		
String Functions:


Function name			String	content			How to use? 			Answer
length						"Java"			 	s.length()					4

toUpperCase()			    "Java"				s.toUpperCase()			JAVA
toLowerCase()				"JAvA"				s.toLowerCase()			java

charAt(index)				"Program"			s.charAt(3)				?

indexOf(char)			"Programming"			s.indexOf('r')			?
lastIndexOf(char)		"Programming"			s.lastIndexOf('m')		?
indexOf(String)			"Programming"			s.indexOf("ram")		?

contains(String)		"Programming"			s.contains("ram")		true
startsWith(String)	 "Java version 8"			s.startsWith("Java")	true
endsWith(String)	 "Good Luck."				s.endsWith("ck.")		true

substring(start)	 "Good morning"				s.substring(5)			morning
substring(start,end) "Good morning"				s.substring(5,9)		morn

replace(char1,char2) "Good morning"				s.replace('o','#')		G##d m#rning

toCharArray()		 "Hello"					char[] arr=s.toCharArray()	['H','e','l','l','o']

trim()				 "   Hi! Hello    "			s.trim()				"Hi! Hello"	



int i = 10;
String s = String.valueOf(i); // "10"


String s = "1890";
int i = Integer.valueOf(s);		


String str = "We are learning Java";
String[] arr = str.split(" "); //["We", "are", "learning", "Java"]


- StringBuffer and StringBuider are used when we have a string which changes frequently.
- StringBuffer/StringBuilder are mutable. We can change content of string. (New object is not created here)
- StringBuffer is synchronized, StringBuilder is not synchronized.
	
	e.g. StringBuffer str = new StringBuffer("Java");
		 StringBuffer s = "test"; // ERROR - Direct literal can not be assigned to StringBuffer


Var-Arg (Varialble Argument) List:
	
	- It is special type of argument in function declaration which is written using ... (3 dots). - Ellipse operator
	- Var-arg List is used when we have to pass 0 to n values of same type as comma seperated values.
	- Interally var-arg parameter gets converted into an array.
	- We can traverse and access var-arg list parameters just like an array.

	Rules:
	- We can have at most one var-arg list
	- It must be last parameter in function declaration
	
Alternative syntax of main() using var-arg
	public static void main(String ...arg) {}


Command Line Arguments:
	
	- When we run Java program, we can pass input to program usign comman line arguments.
	- Generally enviornment related inforamtion like Port Number, OS, DB name can be passed using command line args.
	- These arguments are collected in main() function.
	- Type of command line args is always String[]
	- Whatever we pass as command line argument, gets converted into String.
	
Inheritance:

	- Inheritance is OOP concept using which we can achieve "Reusability".
	- It is a relationship between two classes (Parent and child)
	- "extends" keyword is used when one class inherit another class.
	- Using inheritance, a child class can access properties and functions of parent classes.
	- It represents "IS-A" relationship

	Ex. of Inheritance
	
	1) 
				Person
				
		Emp		Student		Doctor
		

	2) 
		
				Vehicle
				
	TwoWheeler	ThreeWheeler	FourWheeler
	
	3)
	
				OperatingSystem
				
				
		Linux		MacOSx		Windows


Types of inheritance:

1) Single Level Inheritance

		A
		|
		B

2) Multi-Level inheritance

		A
		|
		B
		|
		C
3) Hierarchical Inheritance


			A
	
	    B 		C
    
	D      E

4) Multiple Inheritance

	- Multiple inheritance means a child inheriting more than one parent.
	- In Java, multiple inheritance is NOT possible with classes, however it is possible with "interfaces".
	
			A       B
			    
			   C
			   
			 class A{}
			 class B{}
			 class C extends A, B {} // ERROR

			 
		interface A {}
		interface B {}
		class C implements A, B {}  // VALID


"extends" v/s "implements"


								----> Parent
							class			interface
							
		class			extends				implements	
		
		interface		NA					extends


**"super" keyword:**

"super" keyword is used to access following:
	- A property of parent class
	- A function of parent class
	- A constructor of parent class
	
"super" always refers to parent class. *(super means uper)*

To access self properties/functions we use "this" keyword.
To access properties/functions of parent we use "super" keyword

Example
	
		class A{
			int x = 10;
			void fun() {}
		}
		class B extends A {
			int x = 20;
			void fun() {}
			
			// To access self properties/functions
			Sop(this.x);
			this.fun();
			
			// To access parent properties/functions
			Sop(super.x);
			super.fun();
		}

Constructor calling using "super" keyword:

	- A parent class constructor can be called using "super" keyword.
	- super() -> Call to default constructor of parent class
	  super(para1, para2) -> Call to "parameterised constructor" of parent class.
	- Rules of calling parent class constructor:
		1) You must be in child class constructor
		2) Call to parent constructor can be given only from 1st line of child constructor
	- First line of any constructor is always reserved.
		If we dont' write super()/super(para) then JVM would add "super()" (call to default constructor of parent class)




		class A{
			A() {
				super();
				SOP("A");
			}
		}
		class B extends A {
			B() {
				super();
				SOP("B");
			}
		}


**Polymorphism:
**

	- Polymorphism means "One name -> Many forms".
	- It is one of the OOP concept.

	e.g.
	
		int a = 2 + 10; // "+" is doing addtion of numbers
		String s = "Good" + "Morning"; // "GoodMorning" -> String concat
		
	In above example "+" operator is used for two differnt purposes. 
	This is good example of polymorphism concept. It is called as "Operator overloadig" (Which does NOT exists in java)

	Java has 2 types of Polymorphism:
	
		1) Compile Time Polymorphism (Static Binding) 
			Method Overloading is example of compile-time polymorphism.
			Decision of which overloaded method to be called is taken as compile time.
			
		2) Run-Time Polymorphism (Dynamic Binding)
			Method Overriding is example of run-time polymorphism.
			Decision of which overloaded method to be called is taken as run time.


**Method Overloading:
**
	
	- It is compile-time polymorphism.
	- Method overloading means - Writing multiple functions with same name, but with change in function parameters. Change in function 
	  parameters can be in type/sequence/count.
	  
	 e.g.
	 		class Calculator {
				int add (int a, int b) {}
				int add (int a, int b, int c) {}
				float add(float a, float b) {}
				String add(String a, String b){}
				String add(int a, String b) {}
				String add(String a, int b) {}
			}
			
	In above example, add() method is overloaded.
	
	- Method overloading depends only on function arguments, it does NOT depends on return type.
		e.g.
				int   add(int a, int b) {}
				float add(int x, int y) {} // ERROR: both function has int,int as arguments.
				
	- We can overload all types of methods (instance method, static methods, constructor)
			
**Method Overriding:
**

	- It is Run-Time polymorphism.
	- Method overriding means a child class has an option of redefining parent class method in it's own way.
	- In some cases, parent class method implementation may not be suitable for child class. In such cases, child class can 
	  write same method name with different definition this is called as Method overriding.
	  
	ex.
			class Electronics {
				void start() {
				  // Turn switch ON
				}
			}
			class Fan extends Electronics {
				void start() {
				  super.start();
				  // Use Regulator
				}
			}

			class Vehicle {
				reverse(){ }
				accelerate() {}
				applyBreak() {}
			}
			
			class FourWheeler extends Vehicle {
				reverse () {
				  ...
				}
				accelerate() {
				  ...
				}
			}
	- It's NOT always mandatory for child class to override parent class method.
	- If parent want to enforce child class to override it's method then parent will declare that method as "abstract" method.
	- It's mandatory for child class to override abstract methods.
	- Child class always has 3 choices:
		- Do NOT override (Child is OK with parent class method logic)
		- Use parent logic + own logic : Child can override in following way.
				fun() {
				  super.fun();
				  ... // own logic
				}
		- Write complete new logic in child class.
		
	- Following are methods which can NOT be overridden.
		1) final methods
		2) static methods
		3) private methods
		4) constructor
		
	- Method is properly overridden if following two points are true.
		1) Method signature in parent and child is same
		2) Run-time polymorphism MUST exists between those methods.
		
	- While overrideing child class can increase the scope of function.
		Order of access specififer is : private(Least friendly), default, protected, public(Most friendly)
	
	
		if Parent class method is with "default" scope then child class has 3 options default/protected/public.
		If parent class method is "public". Child class MUST override with "public" scope.
		
	- When we have "throws" in method signture, while overriding child class has 3 options.
		// In parent class
		public void f() throws ArrayIndexOutOfBoundsException {}
		
		// In child class
		public void f() // Ignore throws
		public void f() throws ArrayIndexOutOfBoundsException {} // keep as is
		public void f() throws Exception // You can change exception class to parent class
		
**
Runtime Polymorphism:**

	- In case of method overriding, decision of which method (parent/child) to be called is taken at Runtime.
	- Compiler compiles program by looking at left side of type(reference).
	- At run-time right side object is considered.

	e.g.
		class A {}
		class B extends A {}
		
		A obj = new A(); // For Compiler type is A, For Runtime type is A 
		B obj = new B(); // For Compiler type is B, For Runtime type is B
		A obj = new B(); // For Compiler type is A, For Runtime type is B - Ex of Upcasting

	In Java, we can assign object of child class to parent reference. This concept is called as "Upcasting".
	
	Downcasting is not allowed.
		B obj = new A(); // Error

	
"final" keyword:
	
	- final variable - Whose value can NOT be changed (constant)
	- final method   - A method which can NOT be overridden
	- final class    - A class which can NOT be inherited

**Abstract class
**


- Abstract method: It is a method which is declared using "abstract" keyword.
- Abstract method does NOT have deifinition and it ends with semicolon.
- Its mandatory for child class to override abstract method. So using "abstract method" a parent class can force child class to override particular method.

Abstract class:

- We can declare abstract class using "abstract" keywrod.
  e.g.
  		abstract class A {}

- Abstract class can consist of abstract methods. It's not mandatory to have abstract methods in that class.

- Abstract class can NOT be instantiated(We can NOT create object of abstract class)

- When a child class inherits an abstract class, child class MUST override all abstract methods from parent class.

- If child class fails to override any of abstract methods from parent, then that child class also can be declared as abstract class.

- Even if we can not create object of abstract class, still it can have constrcutor. Constructor of abstract class will be called when we create object of child class.

- Abstract class can also have it's own properties(instance/static) which can be accessed using a child class.


Interface:

	- It's a type in Java declared using "interface" keyword.
		e.g.
		interface A {}
		
	- All variables of interface are by default "public static final"
	
	- All methods of interface are by defaute "public abstract"
	
	- As all methods of interface are abstract we don't have to use abstract keyword (it's optional)
	
	- Main purpose of an interface is to define a CONTRACT, which child class can implement.
	
	- A child class can inherite an interface usign "implements" keyword.
	
	- Multiple inheritance is possible with interfaces. Onc class can inherit more than one interfaces.
		
	  e.g.
	  	interface A {}
		interface B {}
		class C implements A, B {}
		
	- Interface can NOT be instantiated. (we can not create object of interface)
	- Interface does NOT have instance properties(only static properties are allowed)
	- We can NOT have constructor in interface.
 
**Package:
**


- Package helps to achieve "Modularity" OOP principal.
- Using package we can orgnaise classes in better way. (logical/functional gropuing)
- "package" is keyword used to declare package of a class.
- This has to be 1st line in file.
- Package declaration can consiste of single word(e.g. pkg1) or more words(e.g. com.pga.ui)
- Using package we define boundry for class.

ex.

package com.pga.ui;
class Calculator {

}

- Java also provide it's in-built classes in form of packages.
	java.lang 	: Default package. All regular classes used frequently are in this package.(e.g. String, System, wrapper classes)
	java.io 	: IO related classes
	java.util	: Utility related classes
	java.sql	: JDBC related classes (Database handling using Java)
	java.net	: Networking related classes (e.g. Socket)
	java.awt	: AWT UI
	javax.swing	: Swing UI


**Access Specifiers:
**

There are 4 access specifiers(scope) in Java.

1) private   : Strict scope. Only accessed in same class
2) default   : This is "package" level scope. This can be accessed in all classes from same package.
3) protected : Protected things are accessed in same package. It can also be accessed outside package ONLY in case of Inheritance.
4) public 	 : Accessed everywhere

Question?

- If i want to declare function which is useful only in current pacakge which scope i should give?
  default
  
- I want to allow access to my class to all classes(inside/outside package) which scope i should give?
  public
  
- What if i want to have a method which i am going to using in my class only, which scope i should give?
  private

Exception Handling:

There are 2 types of errors.

1) Compilation errors
   e.g. Syntax error (semicolon missing, bracket missing, wrong function name etc)
   
2) Runtime errors
   These errors occurs at runtime due to some programming mistake or user input.
   
Exception:
	- Exception is runtime error which cause program to terminate abnormally.
	- If exception occurs at runtime and if it's not handled then program is terminated.

If there are 10 lines and exception occurs at 3rd line (and if it's not handled), program will be terminated and lines from 4-10 are not executed.

How to handle Exceptions?

Java provides try-catch-finally blocks to do exception handling.

1) "try" block
Syntax:

	try {
		// lines of code where there is possiblity of an exception
	}
	
In try block we write lines where there is chance of an exception.
Ideally we should keep minimal code in "try" block.

2) "catch" block

Syntax:
	catch(<Exception-class> obj) {
	 // Exception handling logic
	}
	
"catch" block is an exception handler block which gets executed ONLY when exception occurs.
We can write multiple catch blocks with try. If exception occurs, JVM would fine best matching catch block based on exception and only one catch block will be executed.

Order of multiple catch block must be child and then later parent. (Parent at bottom)

3) "finally" block
Syntax:
	 finally {
	 	// Code which you want to execute in both scenarion success/failure.
	 }
With try-catch pair we can add at most one "finally" block.(It's optional)
"finally" block gets executed in both failure/success scenarios.
Generally logic of cleanup is written in "finally" block. e.g Closing DB connection, Closing File, Closing socket etc.

Two conditions where "finally" will NOT be executed:
1) If try block is not hit
2) If it encounters System.exit(0) before reaching finally block.

Possible combinations of try-catch-finally:

1) try-catch
2) try-multiple catch blocks
3) try-catch-finally
4) try-multiple catch - finally
5) try-finally

Types of Exception:

- Checked Exception
- Unchecked exception

Checked Exception:
 - More critical
 - Mandatory to handle. Compiler enforces.
 - Parent class is "Exception"
 - ex.
 	SQLException, FileNotFoundException, IOException, ServletException etc.
	
UnChecked Exceptions:
  - Less Critical
  - Not mandatory to handle. Compiler doesn't enforce.
  - Parent is "RuntimeException"
  - ex. 
  		ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException
		
//Option 2 of handling chekced exception => Ignoring Checked Exception by writing "throws" in signature
// Don't use try-catch instead write main() as below
// public static void main(String[] args) throws IOException

"throws" keyword:

	- "throws" keyword is used with method signature.
	- Syntax: throws <Exception1>, <Exception2>...
	e.g.
			public void readLine() throws IOException
			public void fun() throws SQLException, IOException {}
	- Exception used with "throws" should be Checked exception
	- Using "throws" keyword in method signature, we are telling outside world that there is a possiblity of critical exception
	coming from my function.
		e.g.
				void fun() throws SQLException {}
		With this we are telling caller of fun() that there is possiblity of SQLException. 
	- Caller who callse function with 'throws' has 2 options:
		1) Handle critical exception using try-catch
		2) Ignore that critical exception by declaring "throws" in caller function.
	- Generally in library function which are going to be used by others, we should use "throws" keyword.
		e.g
				boolean validateAge() throws AgeInvalidException {}
				boolean validateATMPin() throws PINInvalidException {}

"throw" keyword:

	- "throw" keyword is used to throw an exception.
	- Syntax
		throw new <Exception-class>();
		e.g.
			throw new AgeInvalidException();//explicitly throwing an exception
	- Generally used with user-defined exceptions
	
	
	
	e.g.
	
	boolean validateAge(int age) throws AgeInvalidException {
		if (age < 1 || age >  100) {
			throw new AgeInvalidException();
		}
		return true;
	}

Exception classes hierarchy 
User DefinedException
 
**Multi-Threading:
**

- Program: It's an application which is stored on secondary device (e.g. HDD).
- Program consist of set of instructions.
- Process - When we execute program OS creates process for it.
- Process gets loaded in RAM(Primary memory)
- CPU executes process instruction from RAM one by one.
- Execution speed of CPU is very fast (e.g. thousands of instructions in 1sec)
- As CPU execution speed is high, we feel that mulitple processes are running in parellel.


Threading:

- By default every process has one thread called as "main" thread.
- If you have tasks inside process which needs to be executed sequentially then one thread is enough.
- If we have process which has mutilpe tasks which can run simultenously(in parellel) then threading is useful.

Thread:

- It's a lightweight process.
- It is created from process.
- It shares memory(other resources) from parent process
- Every thread we create has dedicated task to perform. Once given task is finished, thread is dead.

Ex. of multi-threading:
Browser is multi-threaded application where it can have multiple threads to perform independent tasks as below.

"main" thread - Default thread
"browsing" therad - It will manage all tasks related to browsing
"Printing" thread - It will manage all tasks realted to printing
"Streaming" thread - It will manage all tasks realted to streaming
"Downloading" therad - It will manage all tasks realted to downloading
so on....

OS gives chance to process to execute, however if processes has threads then one of the thread get chance.

If two tasks are dependent on each other there we do NOT need threading.
If two tasks can run independently in parellel then we should think of threading.

**How to create Thread in Java?
**

There are 2 ways to create threads in java.
1) By extending "Thread" class
2) By implementing "Runnable" interface

These options are given considering limitation of "multiple inheritance" in Java.

In both options we have to override "public void run()" method.
Logic of thread (what to execute) is written inside run() method.

To start thread we call "start()" method from "Thread" class.
start() method takes care of all low level tasks (memory allocation, stack creation etc).

run() method is called by start() method once thread is created.
We should NOT call run() by ourselves, because it won't create new thread.

Relation between "Thread" and "Runnable":

- Runnable is an interface
- Thread is a class which inherits Runnable interface
- run() method belongs to Runnable interface
- start() method belongs to Thread class

Hierarchy:
				
						Object			Runnable
						
					
					
					Thread				




					  PrintingThread			StreamingThread


**Inter-Thread communication:
**

In multi-threading we can have situation where communication between thread is needed. 
Communication between threads is called as "Inter-Thread communication".

There are 2 ways to achieve inter-thread communication:
a) join() method
b) wait(), notify()/notifyAll()


join() method:
 
- This is method from "Thread" class.
- With join() current thread waits for complete execution of thread on which join() is called. e.g. 
  If "a" is current thread and we call "b.join()" => a will wait for complete execution of thread b.
- Disadvantage of this option is -> Current thread hast to wait for COMPLETE execution of another thread.


wait()/notify()/notifyAll():

- These methods are from "Object" class.
- wait() - notify() methods are generally used in producer-consumer problem
- In this case, waiting thread doesn't require to wait for complete execution of another thread, instead waiting thread continues the execution immediately after other thread notifies.
- Waiting thread calls wait() method on an object,
  notifying thread calls notify() method on same object.
- If multiple threads are waiting on same object, then notifyAll() can be used.
These methods should be called in "synchronized" block.

	synchronized(obj) {
		try {
			obj.wait();
		}catch(InterruptedException e) {}
	}
	
	synchronized(obj) {
		obj.notify();
	}
Both methods need to be called on SAME object.

How to create Annonymous thread in Java?

     // new Thread(new Runnable(){}).start();

      new Thread(new Runnable() {
        public void run() {
          for (int i=1; i<=100;i++) {
            System.out.println("Printing " + i + "%");
          }
        }
      }).start();

**Synchronization:
**


- There are two types of operations - READ and WRITE
- In multi-threading it can happen that multiple threads are executing critical operation at the same time.
- Ex. In banking application, we can have multiple transaction threads performing critical operations like Withdrawl, Deposit on same/differnt types of account.
- To perfrom 5 operations at a time Banking app will create 5 transaction threads.
- If all 5 threads are working on different account then there is no problem in exeucting code simultenously.
- Problem comes when 2 threads doing critical operation on same object.

- We need thread-safety when multiple thread executes method from our class via same object.
- We use "synchronization" to achieve thread-safety.

- Synchornization is solution to achieve thread safety, with that Java will NOT allow multiple threads to execute critical operation on SAME object.

"synchronized":

- With "synchronized" keyword on method we can make entire method as thread-safe.
  e.g. synchronized void deposite() {}
  
- With "synchrnoized block" we can make particular block as thread-safe.
  e.g.
  		void criticalOperation() {
			....
			....
			
			syncrhonized(obj) {
			  // Actual critical task
			}
			...
			...
		}

- Generally we make Write operations as synchronized. There is no need to make read operaiton as synchronized, because no harm in calling read operation at a time.

**Object and class level locking:
**

- To enter into instance synchronized method JVM applies lock on object.
- To enter into static synchronized method JVM applied lock on a class.
- There is NO relation between object level lock and class level lock.
- Lock is applied only for synchrnoized methods.
- If lock is applied on an object (e.g. account1), then any other thread want to do critical operation on same account1 will be blocked. Another thread will go in waiting queue. Once current thread's critical operation is over, thread2 will get a chance. 


**Collection:
** 
- Collection is nothing but data structures.
- We can have following data structures in any programming languages.
	
	a) Array - static, size is fixed
	b) Linked List -> Dynamic. Used for frequent update/delete
	c) Queue -> FIFO -> When we have to give priority in FIFO(First in first out) order.
	d) Stack -> LIFO -> When we have to give priority in LIFO(Last in first out) order. Priority will be given to most recently added data.
	e) Set -> Does NOT allow duplicates. Only unique elements are allowed.
	f) Map : Key->Value pair. Whenever we have to store association we use map.
		e.g.
				RollNo -> Student details
				Alphabate -> Words

List:

	- Ordered collection (Data retrival order is same as data insertion order)
	- Index based collection. Data can be accessed using an index (like an array)
	- Used when sequence/order is important.
	
	3 options:
	1) Vector : Legacy(old) class. Synchrnoized (Thread safe)
	2) ArrayList  : Not synchronized. Faster.
	3) LinkedList : Used if frequent update/delete.

How to create List object in Java?

		List<Employee> list = new ArrayList<Employee>(); // list of emp objects
		List<Integer> list = new LinkedList<Integer>();  // list of numbers

	 List functions:
	 	add() -> To add element at the end.
		get(index) -> Fetch data using index
		contains(object) -> Check if data exists or not
		remove(index) -> remove data at particular index
		set(index, data) -> replace/udpate data at given index
	
Set:
	
	- UnOrdered collection
	- Does NOT allow duplicates. (Only unique elements)
	- 3 options:
		1) HashSet -> Unordered. Faster
		2) LinkedHashSet -> Ordered 
		3) TreeSet -> Sorted
		
	How to create Set?
		Set<Student> set = new HashSet<Student>();//Set of student
		Set<String> words = new TreeSet<String>();//sorted set of words

Map:
	
	- Key-value pair collection(Association)
	4 options:
		
		1) Hashtable - Legacy class. Synchronized, thread safe.
		2) HashMap 	 - Not synchrnonized. Faster.
		3) LinkedHashMap - Ordered
		4) TreeMap	 - Sorted based on key.

	How to create Map?
		
		Map<Integer, String> studentInfo = new HashMap<Integer, String>(); // Map of rollNo -> name mapping.
		Map<Integer, Emp> empInfo = new Hashtable<Integer, Emp>(); // Map of empId->Emp object

		Diff between Hashtable and HashMap
		
			Hashtable does NOT allow null as a key.
			HashMap allows null as a key

Stack:
	LIFO
    Stack<Integer> stack = new Stack<Integer>();
	stack.push(8);
	stack.pop();// remove top elements
	stack.peek();// returns top element but does NOT remove


Queue: 
	FIFO
    Queue<Integer> queue = new LinkedList<Integer>();
	
	Add: queue.add(<data>)
	Remove/poll: queue.remove() or queue.poll() removes first/head element
	peek : returns first element. Does NOT remove

Object equality using hashCode() and equals() methods:

Java derives  equality of 2 objects using following steps.
	- It derives hashCode of both objects.
	- If hashCode is different it returns false.
	- If hashCode is same, then java calls equals() method to compare values of 2 objects.
	- If equals() is true then objects are equal otherwise objects are different.
	
hashCode() and equals() both methods are from "Object" class.

Whenever we create collection with user-defined types(e.g. Student, Emp) make sure we override both methods(equals() and hashCode()).
 
How to override hashCode()?

hashCode() should consist of Hash function which returns integer value by doing some calculation on object's data.
Good hash function distributes data across buckets and avoid collision.

If hashCode() of two objects is same then those objects may or may not be equals. However
If equals() returns true for two objects then their hashCode() MUST be same.


For user defiend types we have to define sorting logic so that Collections.sort(), TreeSet, TreeMap() works as expected.
There are 2 options of defining sorting logic:

1) Using "Comparable" interface.

		class Emp implements Comparable<Emp> {
  		  	...
				public int compareTo(Emp o) {
    				// return this.name.compareTo(o.name);
    				return this.id > o.id ? 1 : -1;
  		  		}
			...
		}

Inherit "Comparable" interface in user defined class and override compareTo() method.
This has limitation of defining only one sorting logic.

2) Using "Comparator" interface.

	Using this option we can define multiple sorting logic as below.
	class IDComparator implements Comparator<Student> {
	  @Override
	  public int compare(Student s1, Student s2) {
	    return s1.id > s2.id ? 1 : -1;
	  }
	}

	class NameComparator implements Comparator<Student> {
	  @Override
	  public int compare(Student s1, Student s2) {
	    return s1.name.compareTo(s2.name);
	  }
	}

	class MarksComparator implements Comparator<Student> {
	  @Override
	  public int compare(Student s1, Student s2) {
	    return s1.marks > s2.marks ? -1 : 1;
	  }
	}
		
// Consumption side:

	  Collections.sort(list, new IDComparator());
      Collections.sort(list, new NameComparator());
      Collections.sort(list, new MarksComparator());























	
	
	
	
	
	








