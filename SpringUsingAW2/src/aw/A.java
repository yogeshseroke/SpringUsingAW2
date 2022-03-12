package aw;

public class A {
B b;
A(B b)
{
	this.b=b;
	System.out.println("A");
}
public B getB()
{
	return b;
}
public void setB()
{
	this.b=b;
}
void displayA()
{
	b.displayB();
	System.out.println("Display A");
}
}
