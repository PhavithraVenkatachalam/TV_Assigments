import java.util.ArrayList;

public class index {
	
	 String name;
	int number;
	

	public static void main(String args[])
	{
		
		
		index i1=new index();
		i1.name="p1";
		i1.number=11;
		
		//list.add(i1);
		
		index i2=new index();
		i2.name="p2";
		i2.number=22;
		
		//list.add(i2);
		
//		for(int i=0;i< list.size();i++)
//		{
//			String name=list.get(i).name;
//			int number=list.get(i).number;
//			
//			System.out.println(name + " " + number);
//		}
		
		addtoList(i1,i2);
		
	}
	
	public static void addtoList(index...args)
	{
		ArrayList<index> list=new ArrayList<>();
		for(index i :args)
		{
			list.add(i);
			System.out.println("added");
		}
		
		for(int i=0;i< list.size();i++)
		{
			String name=list.get(i).name;
			int number=list.get(i).number;
			
			System.out.println(name + " " + number);
		}
		
	}
}
