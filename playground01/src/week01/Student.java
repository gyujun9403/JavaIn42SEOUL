package week01;
import java.util.Scanner;

public class Student {
	private int age;
	private String name;
	Student()
	{
		this.age = 0;
		this.name = null;
	}
	public void setProfile()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("what is his/her name? : ");
		name = sc.next();
		System.out.print("how old are " + name + "? : ");
		age = sc.nextInt();
		System.out.print("done.\n");
		sc.close();
	}
	public void introduse()
	{
		System.out.println("My name is " + name + ", ");
		System.out.println("I'm " + age + " years old.");
	}
}
