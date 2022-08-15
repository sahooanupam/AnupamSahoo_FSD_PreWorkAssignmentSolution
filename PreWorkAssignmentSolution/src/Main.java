import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	//function to checkPalindrome

	public void checkPalindrome()  {
		System.out.println("Enter any number to check whether it is palindrome or not");
		int number=sc.nextInt();
		int n=number;
		int noOfdigits=1;
		int rem=0;
		int reverse=0;
		int iteration=0;
		do {
			n=n/10;
			if(n>0) {
				noOfdigits=noOfdigits+1; 
			}
		}while(n>1);
		
		n=number;
		do {
			iteration=iteration+1;
			rem=n%10;
			n=n/10;
			reverse=(int) (reverse+rem*Math.pow(10, (noOfdigits-iteration)));
		}while(n>0);
		System.out.println("reverse of the number "+number+" is "+reverse);
		if(number==reverse) {
			System.out.println(number+" is a palindrom number");
		}else {
			System.out.println(number+" is not a palindrom number");
		}
	}



	//function to printPattern

	public void printPattern() {
		System.out.println("Enter any integer no to print star pattern");
		int n=sc.nextInt();
		do {
			int i=1;
			while(i<=n) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			n--;
		}while(n>=1);


	}



	//function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("Eneter a number to check whether it is a prime number or not");
		int n=sc.nextInt();
		int i=2;
		boolean isPrime=true;
		do {
			if(n%i==0) {
				isPrime=false;
				System.out.println(n+" is not a prime number");
				break;
			}
			i++;
		}while(i<=n/2);
		if(isPrime) {
			System.out.println(n+" is a prime number");
		}
	}



	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		//initialize the first and second value as 0,1 respectively.
		System.out.println("Enter a no to print fibonacci series");
		int n=sc.nextInt();
		int i=3;
		int first = 0, second = 1;
		int sum=0;
		System.out.print(first+","+second);
		do {
			sum=first+second;
			first=second;
			second=sum;
			System.out.print(","+sum);
			i++;
		}while(i<=n);
		System.out.println();
	}



	//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();



			choice = sc.nextInt();

			switch (choice) {



			case 0:

				choice = 0;

				break;



			case 1: {

				obj.checkPalindrome();

			}

			break;



			case 2: {



				obj.printPattern();

			}

			break;



			case 3: {

				obj.checkPrimeNumber();

			}

			break;



			case 4: {



				obj.printFibonacciSeries();

			}

			break;



			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}



		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}



}

