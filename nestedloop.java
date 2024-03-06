/**
 * 
 */
public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		
		while(a <= 100)
		{
			b=a;
			c=0;
			while(b>=0)
			{
				c=c+b;
				b--;
			}
			System.out.println(a + " --> " +c);
			a++;
		}
		

	}

}
