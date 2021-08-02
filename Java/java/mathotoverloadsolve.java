
class Parent { 
	void show() 
	{ 
		System.out.println("Parent's show()"); 
	} 
} 


class Child extends Parent { 



	void show() 
	{ 

		super.show();
     
     // super is the solution for overloading


		System.out.println("Child's show()"); 
	} 
} 

// Driver class 
class mathodoverload { 
	public static void main(String[] args) 
	{ 
	 
		Child obj2 = new Child(); 
		obj2.show(); 
	} 
} 
