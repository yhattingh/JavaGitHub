package j.basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String nameVariable = "John";
//		int myNum = 15;
//		char myChar = 'a';
//		float myFloat = 19;
//		double myDouble = 19.99;
//		boolean blue, red;
		
//		System.out.println(nameVariable);
//		System.out.println(myNum);
//		System.out.println(myChar);
//		System.out.println(myFloat);
//		System.out.println(myDouble);
		
		//operators
		
		//modus
		int x = 5;
		int y = 2;
		System.out.println("modus of x/y" + " = " + x % y); // modus = what remains = 4 goes into 5 once and 1 remains
		System.out.println("x = " + x);

		
		//increments and decrements
		int a = 5;
		int b = 5;
		++a; //increment by 1 -> can be a++ or ++a
		--b; //decrement by 1 -> can be b-- or ++b
		System.out.println("a incremented" + " " + " = " + a);
		System.out.println("b decremented" + " " + " = " + b);
		
		//assignment operators
		int d = 5;
		d = d + 3;
		System.out.println("d + 3" + " = " + d);
		d += 3; //same as d = d + 3
		System.out.println("same as d + 3" + " = " + d);
		
		//other assignment operators
//		 =-
//		 \/*
//		  %=
		
		
		//Java Comparison Operators
		// == (Equal to
		int e = 10;
		int f = 10;
		System.out.println(e == f);
		
		// != not equal to
		int g = 10;
		int h = 11;
		System.out.println(g != h);
		
		// > greater than
		int i = 10;
		int j = 11;
		System.out.println(i > j);
		
		// < smaller than
		int k = 10;
		int l = 11;
		System.out.println(k < l);
		
		// >= greater than or equal to
		int m = 9;
		int n = 10;
		System.out.println(m >= n);
		
		// <= smaller than or equal to
		int o = 9;
		int p = 9;
		System.out.println(o <= p);
		
		//logical operators - compare two expressions with a logical operator
		int q = 5;
		System.out.println(q > 3 && q < 10); //AND
		System.out.println(q > 3 || q < 2); // OR
		System.out.println(!(q > 3 && q < 10)); //NOT
		
		//String is an object and non primitive
		String txt = "ABCDEFGHIJKLMNOP";
		System.out.println("The length of the txt string is " + txt.length());
		
		// other string methods
		
		String txt1 = "hEllo wOrld";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
		
		String txt2 = "Please locate where the 8th char is";
		System.out.println(txt2.indexOf("8")); //index starts at 0
		System.out.println(txt2.indexOf("P"));
		System.out.println(txt2.indexOf("e"));
		System.out.println(txt2.indexOf("x")); //if is does not exist result = -1
		
		//concatenation
		String firstName = "John";
		String lastName = "Doe";
		int r = 5;
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName)); 
		System.out.println(firstName + " " + r); // converts int to string when concatenated
		
		//Escape characters
		//String txt3 = "We are the so-called "Vikings" from the North;"
		String txt3 = "We are the so-called \"Vikings\" from the North"; //need to use the escape character - turns it to string\
		System.out.println(txt3);
		
		String txt4 = "We are the so-called 'Vikings' from the North"; //does not need escape character for single quotes
		System.out.println(txt4);
		
		String txt5 = "We are the so-called \\Vikings\\ from the North"; //need escape character for back slashes
		System.out.println(txt5);
		
		String txt6 = "We are the so-called \n from the North"; // \n  = next line
		System.out.println(txt6);
		
		String txt7 = "We are the so-called \t from the North"; // \n  = tab
		System.out.println(txt7);
		
		// using + for int it is added, but for strings it is concatenated
		int s = 10;
		int t = 10;
		int u = s + t;
		System.out.println(u); // = 20
		
		String ss = "10";
		String tt = "20";
		String uu = ss + tt;
		System.out.println(uu); // = 1020
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum1 = 100 + 50;
//		int sum2 = sum1 + 250;
//		int sum3 = sum1 + sum2;
//		int sum4 = sum2 - sum1;
//		int sum5 = sum1 * sum2;
//		int sum6 = sum2 / sum1;
//		int c = 5;
//		c = c + 3;
//		System.out.println(c);
//		
//		System.out.println("value of x" + " = " + x);
//		System.out.println(sum1 + " and " + sum2);
//		System.out.println("sum1" + " + " + "sum2" + " = " + sum3);
//		System.out.println("sum4" + " = " + sum4);
//		System.out.println("sum5" + " = " + sum5);
//		System.out.println("sum6" + " = " + sum6);
		
		
		
//		blue = true;
//		if (blue)
//			System.out.println("value 1" + " = " + blue);
//		red = false;
//		if (red)
//			System.out.println("value 2" + " = " + red);
		
		
	}

}
