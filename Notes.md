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










	
	
	
	
	
	
	