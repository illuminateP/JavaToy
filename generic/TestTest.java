package generic;
// "클래스 안에서 하나의 메소드만 제네릭으로 만들어보자"


class Test<T>
{
	public Test(){};
	public void a(T par)
	{
		System.out.println("매개변수의 클래스 이름은 "+ par.getClass().getName()+", 값은 "+par+"\n"+"\n");
	}
}

class ClassEx
{
	public ClassEx(){};
};

public class TestTest
{

	public static void main(String[] args)
	{
		Test k=new Test();

		System.out.println("int i = 10;");
		int i = 10;
		k.a(i);

		System.out.println("float f = 3.244F;");
		float f = 3.244F;
		k.a(f);

		System.out.println("double d = 2.1726261;");
		double d = 2.1726261;
		k.a(d);

		System.out.println("boolean b = true;");
		boolean b = true;
		k.a(b);

		System.out.println("ClassEx c = new ClassEx();");
		ClassEx c = new ClassEx();
		k.a(c);

		System.out.println("String s =\"String\";");
		String s ="String";
		k.a(s);



		// TODO Auto-generated method stub

	}

}

