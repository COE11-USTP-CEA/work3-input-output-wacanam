import java.util.Scanner;

class project3ioBonus{
    public static void main(String[] args){
		System.out.print("Enter the height of the pyramid: ");
		Scanner h = new Scanner(System.in);
		int height = h.nextInt()*2;
		for(int i=1;i<height;i+=2){				
			for(int x=0;x<(((height/2)-1)-i/2);x++)
				System.out.print(" ");
			for(int w=0;w<i;w++)
				System.out.print("*");
			System.out.println(" ");
		}
	}
}