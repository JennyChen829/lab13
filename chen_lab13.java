public class chen_lab13
{
	//private static String arg0;
	private java.util.ArrayList<Integer> inputLines = new java.util.ArrayList<>();
	public static void main(String[] args)
	{
		//args0 = args[0];
//		chen_lab13 lab1 = new chen_lab13();
//		lab1.readData(args[0]);
//		lab1.getTotalCount();
//		lab1.getOddCount();
//		lab1.getEvenCount();
//		lab1.getDistinctGreaterThanFiveCount();
//		lab1.getResult1();
//		lab1.getResult2();
//		lab1.getResult3();
		//System.out.println("list.stream().filter(x -> x % 3 == 0).count() = ");
	}

	public void readData(String filename)
	{
		try
		{
			java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
			String inn;
			while( (inn = input.readLine()) != null )
			{
				inputLines.add(Integer.parseInt(inn));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.exit(0);
		}
	}

	public long getTotalCount()
	{
		System.out.println("Total Count =  " + inputLines.stream().count());
		return inputLines.stream().count();
	}

	public long getOddCount()
	{
		System.out.println("Odd Count = " + inputLines.stream().filter(x -> x % 2 != 0).count());
		return inputLines.stream().filter(x -> x % 2 != 0).count();
	}

	public long getEvenCount()
	{
		//System.out.println("list.stream().filter(x -> x % 3 == 0).count() = " + inputLines.stream().filter(x -> x % 3 == 0).count());
		System.out.println("Even Count = " + inputLines.stream().filter(x -> x % 2 == 0).count());
		return inputLines.stream().filter(x -> x % 2 == 0).count();
	}

	public long getDistinctGreaterThanFiveCount()
	{
		System.out.println("Distinct Greater Than Five Count = " + inputLines.stream().distinct().filter(x -> x > 5).count());
		return inputLines.stream().distinct().filter(x -> x > 5).count();
	}

	public Integer[] getResult1()
	{
		Integer[] list1 = inputLines.stream().sorted().filter(x -> x % 2 == 0).filter(x -> x < 50).filter(x -> x > 5).toArray(Integer[]::new);
		// for( int i = 0; i < list1.length; i++ )
		// {
		// 	System.out.println(list1[i]);
		// }
		return list1;
	}

	public Integer[] getResult2()
	{
		Integer[] list2 = inputLines.stream().limit(50).map(x -> x*x).map(x -> x*3).toArray(Integer[]::new);
		// for( int i = 0; i < list2.length; i++ )
		// {
		// 	System.out.println(list2[i]);
		// }
		return list2;
	}

	public Integer[] getResult3()
	{
		Integer[] list3 = inputLines.stream().filter(x -> x % 2 != 0).map(x -> x*2).sorted().skip(20).distinct().toArray(Integer[]::new);
		// for( int i = 0; i < list3.length; i++ )
		// {
		// 	System.out.println(list3[i]);
		//
		// }
		return list3;
	}
}



