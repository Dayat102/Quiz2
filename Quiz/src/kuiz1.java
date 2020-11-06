import java.util.Scanner;
public class kuiz1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				int height,height1,height2,height4;
				int wman,sum,x,y,wgirl,plus,i=50,p=40;
				System.out.println("Please enter your height in feet for male for the first digit:");
				height=sc.nextInt();
				System.out.println("Please enter your height in feet for male for second digit:");
				height2=sc.nextInt();
				if (height>5) {
					x=(height+(height2+11))-5;
					wman=(x*6)+i;
					System.out.println("Weight for the male is " + wman + " kg");
				}
				else {
					wman=(height2*6)+i;
					System.out.println("Weight for the male is " + wman + " kg");
				}
				System.out.println("Please enter your height in feet for girl:");
				System.out.println("Please enter your height in feet for girl for first digit:");
				height1=sc.nextInt();
				System.out.println("Please enter your height in feet for girl for second digit:");
				height4=sc.nextInt();
				if (height1>5) {
					x=(height+(height4+10))-5;
					wgirl=(x*5)+p;
					System.out.println("Weight for the female is " + wgirl + " kg");
				}
				else {
					wgirl=(height4*5)+p;
					System.out.println("Weight for the female is " + wgirl + " kg");
				}
	}
}

