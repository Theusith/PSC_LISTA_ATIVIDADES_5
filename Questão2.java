/*Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canal, espectadores;

        ArrayList<Integer> canal4 = new ArrayList<>();
        ArrayList<Integer> canal5 = new ArrayList<>();
        ArrayList<Integer> canal7 = new ArrayList<>();
        ArrayList<Integer> canal12 = new ArrayList<>();

        int totalCanal4 = 0;
        int totalCanal5 = 0;
        int totalCanal7 = 0;
        int totalCanal12 = 0;

        do {
            System.out.println("Digite o numero do canal: ");
            canal = sc.nextInt();
            if(canal == 4){
                System.out.println("Digite o numero do espectadores: ");
                espectadores = sc.nextInt();
                canal4.add(espectadores);
                totalCanal4 += espectadores;
            } else if(canal == 5){
                System.out.println("Digite o numero do espectadores: ");
                espectadores = sc.nextInt();
                canal5.add(espectadores);
                totalCanal5 += espectadores;
            } else if(canal == 7){
                System.out.println("Digite o numero do espectadores: ");
                espectadores = sc.nextInt();
                canal7.add(espectadores);
                totalCanal7 += espectadores;
            } else if(canal == 12){
                System.out.println("Digite o numero do espectadores: ");
                espectadores = sc.nextInt();
                canal12.add(espectadores);
                totalCanal12 += espectadores;
            }else
                System.out.println("Canal inexistente");



        }while(canal != 0);
        int totalEspectadores = totalCanal4 + totalCanal5 + totalCanal7 + totalCanal12;
        double percentualEspectadoresCanal4 = (totalCanal4 * 100)/(double)totalEspectadores;
        double percentualEspectadoresCanal5 = (totalCanal5 * 100)/(double)totalEspectadores;
        double percentualEspectadoresCanal7 = (totalCanal7 * 100)/(double)totalEspectadores;
        double percentualEspectadoresCanal12 = (totalCanal12 * 100)/(double)totalEspectadores;

        System.out.println("Total de espectadores do canal 4: " + totalCanal4);
        System.out.println("Total de espectadores do canal 5: " + totalCanal5);
        System.out.println("Total de espectadores do canal 7: " + totalCanal7);
        System.out.println("Total de espectadores do canal 12: " + totalCanal12);

        System.out.printf("\nA porcentagem de espectadores do canal 4 é: %.2f %%\n",percentualEspectadoresCanal4);
        System.out.printf("A porcentagem de espectadores do canal 5 é: %.2f %%\n", percentualEspectadoresCanal5);
        System.out.printf("A porcentagem de espectadores do canal 7 é:  %.2f %%\n", percentualEspectadoresCanal7);
        System.out.printf("A porcentagem de espectadores do canal 12 é:  %.2f %%\n",percentualEspectadoresCanal12);
        
        sc.close();
    }
}
