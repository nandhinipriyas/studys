
public class pyraMID  {
public static void main(String args[])
{
	
		String space;
		for(int i = 1; i <= 5; i++){
		space = "";
		for(int j = 1; j <=i; j++)space+=j;
		for(int k = i-1; k>0;k--)space+=k;
		System.out.println(space);
}

}
}
