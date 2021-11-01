package classwork.Day6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BLRandom{
	 static Random random = new Random();
	 static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
		
		System.out.println("Enter the value: ");
		long seed = sc.nextLong();
		int min = sc.nextInt();
		int max = sc.nextInt();
		double sigma = sc.nextDouble();
		double mu = sc.nextDouble();
		double x = sc.nextDouble();
		setSeed(seed);
		setUniform();
		minMaxRandom(max, min);
		setBoolean();
		setGussaian();
		setGuusainMuSigma(sigma,mu,x);
		setShuffle();
	}

	private static void setShuffle() {
		int[] array = {1,2,3,4,5,6,7,8};
		for(int i=0;i<array.length;i++) {
			int randomindextoswap = random.nextInt(array.length);
			int temp = array[randomindextoswap];
			array[randomindextoswap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));

	}

	private static void setGuusainMuSigma(double sigma, double mu, double x) {
		double ans_gussian  = (1 / (sigma * Math.sqrt(2.0 * Math.PI))) * Math.exp(-0.5 * Math.pow(((x - mu) / sigma), 2));
		System.out.println("Rndom number with mu and sigma value: "+ans_gussian);
	}

	private static void setGussaian() {
		double ans_gussian = random.nextGaussian();
		System.out.println(" Random number using Gussian :"+ans_gussian);
	}

	private static void setBoolean() {
		boolean ans = random.nextBoolean();
		System.out.println("Random number using Boolean: "+ans);
	}

	private static void minMaxRandom(int min,int max) {
		long rand_minmax = ThreadLocalRandom.current().nextLong(); 
		System.out.println("Random value between range: "+ rand_minmax);
	}

	private static void setUniform() {
		int rand_int = random.nextInt(1000);
		System.out.println("Random value using uniform: "+rand_int );
	}

	private static void setSeed(long seed) {
		random.setSeed(seed);
		System.out.println("Random value using seed: "+random.nextInt());
	}
}