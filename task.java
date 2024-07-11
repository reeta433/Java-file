class college
{
static void show1()
{
System.out.println("college");
}
}
class teacher extends college
{
void show2()
{
System.out.println("teacher");
show1();
}
}
class student extends teacher
{
void show3()
{
System.out.println("student");
teacher t =new teacher();
t.show2();
}
}
class task extends student
{
	 static public void result()   //interface function redefined here
{
System.out.println("result");
}
static public void mstnumber()
{
System.out.println("mstnumber");
}
public static void main(String args[])
{
student s= new student();
s.show3();
result();
mstnumber();
}
}
interface demo
{
void result();
void mstnumber();
}