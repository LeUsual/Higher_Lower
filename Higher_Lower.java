import java.util.Scanner;

class Higher_Lower {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = (int)((Math.random() * 1000) + 1);
		int guess = -1;
		while (guess != num){
			System.out.println("Enter a number!");
			guess = input.nextInt();
			if (guess > num){
				System.out.println("Lower!");
			}else if (guess < num){
				System.out.println("Higher!");
			}
		}
		System.out.println("Winner!");
		input.close();
	}
}