package JavaTest;
import java.util.HashMap;

public class LogicOne 
{
	
	

		public static void main(String[] args) 
		{
			String string ="naveenkumar";
			int count;
			char ch;
			HashMap<Character, Integer> hashMap =new HashMap<Character, Integer>();
			for(int i=0;i<string.length();i++)	
			{
				ch=string.charAt(i);
			if(hashMap.containsKey(ch))
			{
				count =hashMap.get(ch);
				count++;
				hashMap.replace(ch, count);
			}
			else 
			{
				hashMap.put(ch,1);
			}
		    }
		for(Character key:hashMap.keySet())
		{
			System.out.println(key+" ="+hashMap.get(key));
		}
			
			
		}
	}
