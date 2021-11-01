package classwork.Day6;

import java.util.Scanner;


public class Stopwatch{
	public long startTime =0;
	public long stopTime =0;
	public boolean running =false;
	
	public void start()
   {
		startTime=System.currentTimeMillis();
		System.out.println("Start Time is : "+ startTime);
   }
	
	public void stop ()
	{
		stopTime=System.currentTimeMillis();
		System.out.println("Stop time is "+ stopTime);
	}
	public long getElapsed()
	{
		 long elapsed =stopTime-startTime;
		return elapsed;
	}
	public static void main(String[] args)throws Exception {
		Stopwatch sw=new Stopwatch();
	     int u ,m;
	     Scanner sc=new Scanner (System.in);
	     System.out.println("Press '1' to Start Time: ");
		 
	     u = sc.nextInt();
		 while(u!=1) {
			 u = sc.nextInt();
		 }
		 sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		m= sc.nextInt();
		while(m!=2) {
			 m = sc.nextInt();
		 }
		sw.stop();

		long l=sw.getElapsed();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		sc.close();
	
	}
}