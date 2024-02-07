
// foreach loop in Java with Array ( exclusively use to loop through elements in array )
	// public class Demo{
	// 	public static void main(String[] args) {
	// 		String [] cars = {"Ford","BMW","Mercedes"};
	// 		for (String i: cars) {
	// 			cars[2] = "Farari";
	// 			System.out.println(i);
	// 		}
	// 		System.out.println("Total no of brand is " + cars.length);
	// 	}
	// }

// Multidimensional array
	// 	public class Demo {
	//     public static void main(String[] args) {
	//         int[][] cars = {{1, 2, 3, 4}, {6, 7, 8}};

	//         for (int i = 0; i < cars.length; i++) {
	//             for (int j = 0; j < cars[i].length; j++) {
	//                 System.out.println(cars[i][j]);
	//             }
	//         }
	//     }
	// }

// Methods
	// public class Demo{
	// 	static void myMethod(int age){
	// 		if (age<18) {
	// 			System.out.println("You're not accessible.");
	// 		}
	// 		else {
	// 			System.out.println("You're accessible.");
	// 		}
	// 	}
	// 	public static void main(String[] args) {
	// 		myMethod(13);
	// 	}
	// }
// Methods overloading ( A class have multiple methods with same name but different parameter. )
	// class Demo{
	// 	public int plusMethod(int x, int y){
	// 		return x+y;
	// 	}
	// 	public String plusMethod(String fname, String lname){
	// 		return fname + " " + lname;
	// 	}
	// 	public static void main(String[] args) {
	// 		Demo obj1 = new Demo();
	// 		int z = obj1.plusMethod(5,5);
	// 		String name = obj1.plusMethod("kapil","thakuri");

	// 		System.out.println("Full name - " +name);
	// 		System.out.println("Roll no. - "+ z);
	// 	}
	// }

// Java Recursion (technique the functions call itself. )
	// public class Demo{
	// 	static int sum( int x){
	// 		if (x> 0) 
	// 		{
	// 			return x+ sum(x-1);
	// 		}
	// 		else
	// 		{
	// 			return 0;
	// 		}
	// 	}
	// 	public static void main(String[] args) {
	// 		int SumNumber = sum(5);
	// 		System.out.println(SumNumber);
	// 	}
	// }

// Java Multiple class & object Concept 
	// class Main{
	// 	int x = 10;
	// }
	// public  class Demo{
	// 	public static void main(String[] args) {
	// 		Main obj1 = new Main();
	// 		// obj1.x = 999; // OverRiding the value of x
	// 		System.out.println(obj1.x);
	// 	}
	// }

// Java constuctor Concept with Parameter
	// public  class Demo {
	// 	int x ;

	// 	public  Demo( int y ){
	// 		x = y;
	// 	}
	// 	public static void main(String[] args) {
	// 		Demo obj = new Demo( 8 );
	// 		System.out.println(obj.x);
	// 	}
	// }
// Package in Java ( Collections of related class, methods , interface and sub-packages. ) & Modifier
	// import App.Fox;
	// public class Demo{
	// 	public static void main(String[] args) {
	// 		Fox obj1 = new Fox();
	// 		// System.out.println(obj1.x); //x is private attribute only accessible within class
	// 		// System.out.println(obj1.y); //y is protected attribute only accessible within package and outside package only through inheritance.
	// 		System.out.println(obj1.z); //z is public attribute which can accessible anywhere
	// 		// System.out.println(obj1.a); //a is default attribute which can accessible only with in package.
	// 	}
	// }

// Abstract class & methods concept ( abstract method doesn't have body ( it provided by inherting another subclass.))

	// // abstract class
	// abstract class Main {
	//   public String fname = "John";
	//   public int age = 24;
	//   public abstract void study(); // abstract method
	// }

	// // Subclass (inherit from Main)
	// class Student extends Main {
	//   public int graduationYear = 2018;
	//   public void study() { // the body of the abstract method is provided here
	//     System.out.println("Studying all day long");
	//   }
	// }
	// // End code from filename: Main.java

	// // Code from filename: Demo.java
	// class Demo {
	//   public static void main(String[] args) {
	//     // create an object of the Student class (which inherits attributes and methods from Main)
	//     Student myObj = new Student();

	//     System.out.println("Name: " + myObj.fname);
	//     System.out.println("Age: " + myObj.age);
	//     System.out.println("Graduation Year: " + myObj.graduationYear);
	//     myObj.study(); // call abstract method
	//   }
	// }

// Encapsulations in Java (process of hiding some "sensitive data" from user.)
	// class Main {
	// 	private String name = "John Doe";
	// // Setting get and set methods
	// 	public String getName(){
	// 		return name;
	// 	}
	// 	public String setName(String newName){
	// 		return this.name = newName;
	// 	}
	// }
	// public class Demo {
	// 	public static void main(String[] args) {
	// 		Main obj = new Main();
	// 		System.out.println(obj.name);
	// 	}
	// }

//Ploymorphism in Java ( it means some object or reference that behave diff in different situations.)

	// class Animal {
	// 	public void animalSound(){
	// 		System.out.println("every animal make sounds.");
	// 	}
	// }
	// class Dog extends Animal{
	// 	public void animalSound(){
	// 		System.out.println("dog says bow boww");
	// 	}
	// }
	// class Cat extends Animal{
	// 	public  void animalSound(){
	// 		System.out.println("cat say maeu meau");
	// 	}
	// }
	// public  class Demo{
	// 	public static void main(String[] args) {
	// 		Animal anm = new Animal();
	// 		Animal dog = new Dog();
	// 		Animal cat = new Cat();
	// 		anm.animalSound();
	// 		dog.animalSound();
	// 		cat.animalSound();
	// 	}
	// }


// Abstractions in java (abstractions is the process of hiding some details and showing only essential details to the user/clients or member. )
	// abstract class Animal{
	// 	public abstract void animalSound();
	// 	public  void Sleep(){
	// 		System.out.println("Zzzz");
	// 	}
	// }
	// class Dog extends Animal{
	// 	public  void animalSound(){
	// 		System.out.println("Dog says Boow , boow ");
	// 	}
	// }
	// public  class Demo{
	// 	public static void main(String[] args) {
	// 		Dog dogsound = new Dog();
	// 		dogsound.animalSound();
	// 		dogsound.Sleep();
	// 	}
	// }

// Interface in Java ( is the another way of achieving abstractions in our program. )

	// interface Animal{
	// 	public void animalSound();
	// }
	// interface Computer{
	// 	public  void computerOS();
	// }
	// class Cat implements Animal, Computer{
	// 	public void animalSound(){
	// 		System.out.println("Cat says meow meow");
	// 	}
	// 	public void computerOS(){
	// 		System.out.println("Popular os is Windows,linux,mac");
	// 	}
	// }
	// public  class Demo{
	// 	public static void main(String[] args) {
	// 		Cat catSound = new Cat();
	// 		catSound.computerOS();
	// 		catSound.animalSound();
	// 	}
	// }

// Java Date and Time 

	// import java.time.LocalDateTime;

	// public class Demo {
	// public static void main(String[] args) {
	//     LocalDateTime date = LocalDateTime.now();
	//     System.out.println(date);
	// 	}
	// }

// Java exceptions 
	// public  class Demo{
	// 		public static void main(String[] args) {
	// 		try{
	// 			int [] x = {1,2,3,4};
	// 			System.out.println(x[5]);
	// 		}
	// 		catch(Exception e){
	// 			System.out.println(e);
	// 		}
	// 		finally{
	// 			System.out.println("this is from finally methods");
	// 		}

	// 	}
	// }

	// public  class Demo{
	// 	public void checkAge(int age){
	// 		try{
	// 			if(age>=18){
	// 				System.out.println("You're not accessible.");
	// 			}
	// 			else {
	// 				System.out.println("You're accessible.");
	// 			}
	// 		}
	// 		catch(Exception e){
	// 			System.out.println(e);
	// 		}
	// 		finally{
	// 			System.out.println("Finally method is run after try..catch method is executed.");
	// 		}
	// 	}
	// 	public static void main(String[] args) {
	// 		Demo obj = new Demo();
	// 		obj.checkAge(18);
	// 	}
	// }

// Java Threads

// First way by extending Thread Class
	// public  class Demo extends Thread{
	// 	public static void main(String[] args) {
	// 		Demo obj = new Demo();
	// 		obj.start();
	// 		System.out.println("This is running outside the Thread. ");
	// 	}
	// 	public  void run(){
	// 		System.out.println("This is running inside the Thread. ");
	// 	}
	// }
// Another way by implementing Runnable methods
	// public  class Demo implements Runnable{
	// 	public static void main(String[] args) {
	// 		Demo obj = new Demo();
	// 		Thread thread = new Thread(obj);
	// 		thread.start();
	// 		System.out.println("This is running outside the Thread. ");
	// 	}
	// 	public  void run(){
	// 		System.out.println("This is running inside the Thread. ");
	// 	}
	// }
// Multithreading (sleep() method)
	// public class Demo implements Runnable{
	// 	public void run(){
	// 		for (int i = 0; i<=5 ; i++ ) {
	// 			try{
	// 				Thread.sleep(1000);
	// 			}catch(InterruptedException e){
	// 				System.out.println(e);
	// 			}
	// 		System.out.println("This Thread1");
	// 		}
	// 	}
	// 	public static void main(String[] args) {
	// 		Demo dm = new Demo();
	// 		Thread thread1= new Thread(dm);
	// 		// Thread thread2 = new Thread(dm);
	// 		thread1.start();
	// 		// thread2.start();
	// 	}
	// }
// Java Swing ( GUI widget Toolkit - That provide a UI interface.)
	// import javax.swing.*;
	// import java.awt.FlowLayout;

	// public  class Demo {
	// 	JLabel lb1; JLabel lb2;  JTextField tf1; JPasswordField pf; JFrame f;
	// 	Demo(){
	// 		f = new JFrame("Swing Demo");
	// 		f.setSize(300,500);
	// 		f.setVisible(true);
	// 		f.setLayout(new FlowLayout());

	// 		lb1 = new JLabel("Username :");
	// 		f.add(lb1);

	// 		tf1 = new JTextField();
	// 		f.add(tf1);

	// 		lb2 = new JLabel("Password :");
	// 		f.add(lb2);

	// 		pf = new JPasswordField();
	// 		f.add(pf);

	// 		JButton b = new JButton("Login");
	// 		f.add(b);
	// 	}
	// 	public static void main(String[] args) {
	// 		new Demo();
	// 	}
	// }

// Java AWT( is an API to develop GUI of window based Applications in java.)

// first way by Extending the Frame class ( Inheritance ).

	// import java.awt.*;

	// public class Demo extends Frame {
	//     Button b;
	//     Label lb1;
	//     TextField tf;
	//     Label lb2;
	//     TextField pf;

	//     // Initializing the Demo class using Constructor
	//     Demo() {
	//         setSize(500, 400);
	//         setLayout(null);

	//         lb1 = new Label("Username: ");
	//         lb1.setBounds(50, 50, 100, 40);
	//         add(lb1);

	//         tf = new TextField();
	//         tf.setBounds(160, 50, 100, 40);
	//         add(tf);

	//         lb2 = new Label("Password: ");
	//         lb2.setBounds(50, 100, 100, 40);
	//         add(lb2);

	//         pf = new TextField();
	//         pf.setBounds(160, 100, 100, 40);
	//         add(pf);

	//         b = new Button("login");
	//         b.setBounds(30, 150, 80, 30);
	//         add(b);

	//         // Set the frame visible after adding all components
	//         setVisible(true);
	//     }

	//     public static void main(String[] args) {
	//         // Creating an instance of the Demo class
	//         Demo obj = new Demo();
	//     }
	// }

// Anther way By creating object of another class (Associations) 

	// // importing Java AWT class  
	// import java.awt.*;    
	  
	// // class Demo directly creates instance of Frame class  
	// class Demo {    
	  
	//    // initializing using constructor  
	// 	   Demo() {  
		  
	// 	      // creating a Frame  
	// 	      Frame f = new Frame();  
		  
	// 	      // creating a Label  
	// 	      Label l = new Label("Employee id:");   
		  
	// 	      // creating a Button  
	// 	      Button b = new Button("Submit");  
		  
	// 	      // creating a TextField  
	// 	      TextField t = new TextField();  
		  
	// 	      // setting position of above components in the frame  
	// 	      l.setBounds(20, 80, 80, 30);  
	// 	      t.setBounds(20, 100, 80, 30);  
	// 	      b.setBounds(100, 100, 80, 30);  
		  
	// 	      // adding components into frame    
	// 	      f.add(b);  
	// 	      f.add(l);  
	// 	      f.add(t);  
		  
	// 	      // frame size 300 width and 300 height    
	// 	      f.setSize(400,300);  
		  
	// 	      // setting the title of frame  
	// 	      f.setTitle("Employee info");   
		          
	// 	      // no layout  
	// 	      f.setLayout(null);   
		  
	// 	      // setting visibility of frame  
	// 	      f.setVisible(true);  
	// 	}
	  
	// 	// main method  
	// 	public static void main(String args[]) {   
		  
	// 	// creating instance of Frame class   
	// 	Demo awt_obj = new Demo();      
	// 	}  
	// }
// AWT Toolkit Example
	// import java.awt.*;
	// public class Demo {
	//   public static void main(String[] args) {
	//       Toolkit t = Toolkit.getDefaultToolkit();
	//       System.out.println("Screen resolution = " + t.getScreenResolution());
	//       Dimension d = t.getScreenSize();
	//       System.out.println("Screen width = " + d.width);
	//       System.out.println("Screen height = " + d.height);
	//   }
	// }

// Action Listener (Adding Two Numbers)
	// import javax.swing.*;
	// import java.awt.*;
	// import java.awt.event.*;
	// public class Demo extends JFrame implements ActionListener{
	// 	JTextField tf1, tf2;
	// 	JLabel lb3;
	// 	Demo(){
	// 		setSize(400,500);
	// 		setLayout(new FlowLayout());

	// 		JLabel lb1 = new JLabel("Enter first number: ");
	// 		lb1.setBounds(30,150,180,40);
	// 		add(lb1);
	// 		tf1 = new JTextField();
	// 		tf1.setBounds(30,90,100,40);
	// 		add(tf1);
	// 		JLabel lb2 = new JLabel("Enter second number: ");
	// 		lb2.setBounds(30,150,180,40);
	// 		add(lb2);
	// 		tf2 = new JTextField();
	// 		tf2.setBounds(30,90,100,40);
	// 		add(tf2);
	// 		lb3 = new JLabel();
	// 		lb3.setBounds(30,150,180,40);
	// 		add(lb3);


	// 		JButton b = new JButton("Sum");
	// 		b.setBounds(30,90,100,40);
	// 		add(b);
	// 		b.addActionListener(this);
	// 		setVisible(true);
	// 	}
	// 	public void actionPerformed(ActionEvent e){
	// 		String str1 = tf1.getText();
	// 		int x = Integer.parseInt(str1);
	// 		String str2 = tf2.getText();
	// 		int y = Integer.parseInt(str2);
	// 		int z = x+y;
	// 		System.out.println(z);
	// 		String result = String.valueOf(z);
	// 		lb3.setText(result);
	// 	}
	// 	public static void main(String[] args) {
	// 		new Demo();
	// 	}
	// }

// Java Event Handling ( actionListener )

	// import java.awt.*;
	// import javax.swing.*;
	// import java.awt.FlowLayout;
	// import java.awt.event.ActionEvent;
	// import java.awt.event.ActionListener;

	// public class Demo extends Frame implements ActionListener {
	//     JFrame f;
	//     JLabel lb1;
	//     JLabel lb2;
	//     JTextField tf1;
	//     JTextField tf2;
	//     JButton b;
	//     JLabel result;

	//     Demo() {
	//         f = new JFrame("Adding Two Numbers");
	//         f.setSize(400, 500);
	//         f.setLayout(new FlowLayout());

	//         lb1 = new JLabel("Enter first digit:");
	// 		lb1.setBounds(20, 80, 80, 30);

	//         f.add(lb1);

	//         tf1 = new JTextField();
	// 		tf1.setBounds(20, 100, 80, 30);
	//         f.add(tf1);

	//         lb2 = new JLabel("Enter second digit:");
	// 		lb2.setBounds(20, 80, 80, 30);
	//         f.add(lb2);

	//         tf2 = new JTextField();
	// 		tf2.setBounds(20, 100, 80, 30);

	//         f.add(tf2);

	//         b = new JButton("Sum");
	// 		b.setBounds(100, 100, 80, 30);
	//         f.add(b);

	//         result = new JLabel();
	//         f.add(result);

	//         b.addActionListener(this);
	//         f.setVisible(true);

	//     }

	//     public void actionPerformed(ActionEvent e) {
	//         String x = tf1.getText();
	//         int num1 = Integer.parseInt(x);

	//         String y = tf2.getText();
	//         int num2 = Integer.parseInt(y);

	//         int z = num1 + num2;

	//         result.setText(String.valueOf(z));
	//     }

	//     public static void main(String[] args) {
	//         new Demo();
	//     }
	// }

// Mouse Listener (addMouseListener)

	// import java.awt.*;  
	// import java.awt.event.*;  
	// public class Demo extends Frame implements MouseListener{  
	//     Label l;  
	//     Demo(){  
	//         addMouseListener(this);  
	          
	//         l=new Label();  
	//         l.setBounds(20,50,100,20);  
	//         add(l);  
	//         setSize(300,300);  
	//         setLayout(null);  
	//         setVisible(true);  
	//     }  
	//     public void mouseClicked(MouseEvent e) {  
	//         l.setText("Mouse Clicked");  
	//     }  
	//     public void mouseEntered(MouseEvent e) {  
	//         l.setText("Mouse Entered");  
	//     }  
	//     public void mouseExited(MouseEvent e) {  
	//         l.setText("Mouse Exited");  
	//     }  
	//     public void mousePressed(MouseEvent e) {  
	//         l.setText("Mouse Pressed");  
	//     }  
	//     public void mouseReleased(MouseEvent e) {  
	//         l.setText("Mouse Released");  
	//     }  
	// public static void main(String[] args) {  
	//     new Demo();  
	// }  
	// }  
// MouseMotionsListener - mouseMoved & mouseDragged
	// import java.awt.*;
	// import java.awt.event.*;
	// public class Demo extends Frame implements MouseMotionListener{
	// 	Demo(){
	// 		setSize(600,600);
	// 		setLayout(null);
	// 		addMouseMotionListener(this);
	// 		setVisible(true);
	// 	}
	// 	public  void mouseDragged(MouseEvent e){
	// 		Graphics g=getGraphics();
	// 	    g.setColor(Color.BLUE);
	// 	    g.fillOval(e.getX(),e.getY(),20,20);
	// 	}
	// 	public void mouseMoved(MouseEvent e){
	// 	}
	// 	public static void main(String[] args) {
	// 		new Demo();
	// 	}
	// }
// KeyListener (notify when ever you change the state of key)
	// import java.awt.event.*;
	// import java.awt.*;
	// import javax.swing.*;
	// public  class Demo extends JFrame implements KeyListener{
	// 	JLabel l; JTextArea ta;
	// 	Demo(){
	// 		setSize(600,600);
	// 		setLayout(null);
	// 		l = new JLabel();
	// 		l.setBounds (20, 50, 100, 20);
	// 		add(l);
	// 		ta = new JTextArea();
	// 		// ta.setSize(200,300);
	// 		ta.setBounds (20, 80, 300, 300);
	// 		add(ta);
	// 		setVisible(true);
	// 		ta.addKeyListener(this);
	// 	}
	// 	public void keyPressed(KeyEvent e){
	// 		l.setText("Key Pressed...");
	// 	}
	// 	public void keyTyped(KeyEvent e){
	// 		l.setText("Key Typed...");
	// 	}
	// 	public void keyReleased(KeyEvent e){
	// 		l.setText("Key Released...");
	// 	}
	// 	public static void main(String[] args) {
	// 		new Demo();
	// 	}
	// }

// File Handling ( File Creating )
	// import java.io.File;
	// import java.io.IOException;

	// class Demo{
	// 	public static void main(String[] args) {
	// 		try {
	//             File obj = new File("myFile.html");
	//             boolean fileCreated = obj.createNewFile();

	//             if (fileCreated) {
	//                 System.out.println("File created successfully.");
	//             } else {
	//                 System.out.println("File already exists.");
	//             }
	//         } catch (IOException e) {
	//             System.err.println("An error occurred while creating the file: ");
	//             e.printStackTrace();
	//         }
	//     }
	// }

// File Writer
	// import java.io.FileWriter;
	// import java.io.IOException;

	// class Demo{
	// 	public static void main(String[] args) {
	// 		try {
	//            	FileWriter obj = new FileWriter("myFile.html");
	//            	obj.write("<html><body><h1> I am Written by Java File Handling. </h1></body></html>");
	//            	obj.close();
	//         } catch (IOException e) {
	//             System.err.println("An error occurred while creating the file: ");
	//             e.printStackTrace();
	//         }
	//     }
	// }

// File Reader 
	// import java.util.Scanner;
	// import java.io.File;
	// import java.io.IOException;

	// class Demo{
	// 	public static void main(String[] args) {
	// 		try {
	//            	File obj = new File("myFile.html");
	//            	Scanner reader = new Scanner(obj);
	//            	while(reader.hasNextLine()){
	//            		System.out.println(reader.nextLine());
	//            	}
	//         } catch (IOException e) {
	//             System.out.println("An error occurred while creating the file. ");
	//             e.printStackTrace();
	//         }
	//     }
	// }

// File Delete
	// import java.io.*;
	// import java.io.IOException;

	// public  class Demo{
	// 	public static void main(String[] args) {
			
	// 		File obj = new File("myFile.html");
	// 		obj.delete();
	// 	}
	// }





















































































































































































































































































