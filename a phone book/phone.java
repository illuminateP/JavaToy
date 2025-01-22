package phonebook;
import java.util.*;

import com.sun.net.httpserver.Authenticator.Result;

import java.io.*;

public class phonebook
{

	public static void main(String[] args)
	{
		HashMap<String,String> PhoneBook = new HashMap<String,String>();
		int human = 0 ; // 사람 숫자
		Scanner input = new Scanner(System.in);

		InputStreamReader in = null;
		InputStreamReader in1 = null; // b에 물려줄 inputstream
		FileInputStream FR = null;



		try
		{
			FR = new FileInputStream("Phone.txt");
			try
			{
				in = new InputStreamReader(FR, "MS949");


				int c=0; // read 처리에 사용되는 변수

				try
				{
					while (c != -1)
					{
						char[] temp1 = new char[3]; // 이름을 저장할 3칸짜리 배열 생성
						char[] temp2 = new char[14]; // 전화번호를 저장할 13칸짜리 배열 생성
						String name = "";
						String tel = "";

						for(int i = 0 ; i <3; i++)
						{
							c=in.read();
							temp1[i]=(char)c;
						}
						name = String.valueOf(temp1);

						c= in.read();
						/*이름과 번호 사이 한 칸 띄어쓴 부분은 temp에 기록하지 않고 그냥 지나친다,이는 Phone.txt가
						 * 박영준 010-2523-2512
						 * 잘생김 010-2523-2512
						 * 의 식으로 줄바꿈으로 사람과 번호를 구분해 놓았기 때문이다.
						 */

						for(int j = 0 ; j <14; j++)
						{
							c=in.read();
							temp2[j]=(char)c;
						}

						tel = String.valueOf(temp2);
						PhoneBook.put(name, tel);
						c= in.read();
						human++;
					}

				}

				catch (IOException e) // I/O 입력 중 발생한 오류 처리
				{
					System.out.println("I/O Error,please call 컴사랑119");
					// TODO Auto-generated catch block
				}
			}
			catch (UnsupportedEncodingException e) //파일 인코딩중 발생한 오류 처리
			{
				System.out.println("Wrong Encoding Error! please try using different encoding");
				// TODO Auto-generated catch block
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("Error! file could not be found there.");
			// TODO Auto-generated catch block
		}


		System.out.println("총 "+human+"개의 전화번호를 읽었습니다.");

		String keyboardinput= "";
		while(!(keyboardinput.equals("그만")))
		{
			keyboardinput = "";
			String SearchResult="";
			System.out.print("이름 >> ");
			keyboardinput = input.next();
			SearchResult =(String)PhoneBook.get(keyboardinput);


			boolean keyexists  = PhoneBook.containsKey(keyboardinput); // 키보드로 입력한 값이 해시맵에 포함되었는지 여부를 체크

			if(keyboardinput.equals("그만")) // 키보드로 입력한 값이 해쉬맵에 존재하는지 찾기 전에,그 값이 "그만"인지 먼저 체크.
			{
				break;
			}

			else if(keyexists == false)
			{
				System.out.println("찾는 이름이 없습니다.");
			}
			else
			{
				System.out.println(SearchResult);
			}


		}

		// TODO Auto-generated method stub
	}

}
