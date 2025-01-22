package generic;
//* 제네릭을 사용해 똑같은 타입의 객체 두 개를 저장하는 pair 클래스를 작성하여 보자 "
import java.util.Scanner;

class Mypair<T>
{
  static Scanner input = new Scanner(System.in);
  private T val1;
  private T val2; // generic!
  
  public Mypair(T c1,T c2) // Constructor
  {  
    this.val1 = c1;
    this.val2 = c2;
  }
  
  public void setval()
  {
    System.out.println("input a value 1");
    this.val1=(T) input.next();
    
    System.out.println("input a value 2");
    this.val2=(T) input.next();
  }
  
 
  /* getval의 경우,parameter로 일반 자료형(*String,int,char 등)을 넘겨주면 call by value로 구현되어 메인함수에 값이 전달되지 않으므로,
  call by reference를 구현하기 위해서는 반드시 class형으로 넘겨주어야 한다,이를 위해 Mypair안에 Stringclass를 별도로 생성해 주었다
  */

    public void getval(StringClass v1,StringClass v2)
  {
     v1.str = (String) this.val1;
     v2.str = (String) this.val2;
  }
  
  public String toString() 
  {
     String returnval="";
     returnval = "Val1 = " +(String)this.val1 + " Val2 = " +(String)this.val2;           
     return returnval;
  }
}

//getval의 parameter가 class형이 되도록 하게 위한 클래스
class StringClass
{
   String str="";
   
   StringClass(String st) //StringClass�� ������
   {
      this.str=st;
   }   
}

public class MypairTest
{
    public static void main(String[] args)
    {
        Mypair<String> fruit = new Mypair<String>("사과","포도");
        System.out.println("fruit 생성 완료!");
        System.out.println("현재  fruit에 저장된 " + fruit.toString()+"\n");

        System.out.println("Setval 함수 실행!");
        fruit.setval();
        System.out.println("현재  fruit에 저장된  " + fruit.toString()+"\n");

        String empty = "empty";
        StringClass value1= new StringClass("empty");
        StringClass value2= new StringClass("empty");

        System.out.print("현재  value 1에 저장된 값은 "+ value1.str +"\n" + "현재  value 2에 저장된 값은 "+ value2.str+"\n");
        fruit.getval(value1,value2);
        System.out.println("getval 함수 실행!");
        System.out.println("현재  value 1에 저장된 값은 "+ value1.str +"\n"+ "현재  value 2에 저장된 값은 "+ value2.str+"\n");

        System.out.println("toString() 함수 실행!");
        System.out.println("fruit에 저장된 "+fruit.toString());
        System.out.println("toString 함수는 앞의 출력시에도 사용되었습니다");

    }