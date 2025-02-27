import java.util.Scanner;

public class Main
{
    static int notas[] = new int[5];
    
	public static void main(String[] args) {
	    float media = 0;
	    int maior = 0;
	    int menor = 9999;
	    int acima_da_media = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
		for(int i = 0; i < notas.length; i++) {
		    System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
		    notas[i] = scanner.nextInt();    
		    
		    media += notas[i];
		}
		
		media = media / notas.length;
		
		for(int i = 0; i < notas.length; i++) {
		    if(notas[i] > media) acima_da_media++;
		    
		    if(notas[i] > maior) maior = notas[i];
		    
		    if(notas[i] < menor) menor = notas[i];
		}
		
		System.out.println("A media das notas e: " + media);
		System.out.println("A maior nota e: " + maior);
		System.out.println("A menor nota e: " + menor);
		System.out.println("Qtd. de alunos com nota acima da media: " + acima_da_media);
	}
}
