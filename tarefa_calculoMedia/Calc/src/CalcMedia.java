import java.util.*;
public class CalcMedia {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Scanner sc = new Scanner(System.in);
		
				System.out.print("Insira a primeira nota: ");
			
			int Media1 = sc.nextInt();
			
				System.out.print("Insira a segunda nota: ");
			
			int Media2 = sc.nextInt();
			
				System.out.print("Insira a terceira nota: ");
			
			int Media3 = sc.nextInt();
				
				System.out.print("Insira a quarta nota: ");
				
			int Media4 = sc.nextInt();
			
				float calculoMedia = ((Media1 + Media2 + Media3 + Media4)/4) ;
				
			System.out.println("A media das quatro notas é: " + calculoMedia);
			
				
		
		sc.close();

	}

}
