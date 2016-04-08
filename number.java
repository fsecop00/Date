import java.util.*;
public class number {
	public number(int a){
		isPrime(a);
		
	}
	static boolean isPrime(int a){
		int cont=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				cont++;
			}
		}
		if(cont==a-2)
		return true;
		else
			return false;
	}

}
