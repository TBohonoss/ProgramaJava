import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Bem-vindo! Pressione S para continuar.");
        String string = scanner.nextLine();
        if(string.equals("s")) {
            System.out.println("Qual a capital do Brasil?");
            string = scanner.nextLine();
            if(string.equals("Brasília")) {
                pontos++;
                System.out.println("Você pontuou!");
                System.out.println("Você deseja continuar? (s) ou desistir? (d)");
                string = scanner.nextLine();
                if(string.equals("s")) {
                    //Próxima pergunta.
                    System.out.println("Em qual continente fica o Brasil?");
                    string = scanner.nextLine();
                    if(string.equals("América do Sul")) {
                        pontos++;
                        System.out.println("Você pontuou!");
                        System.out.println("Você deseja continuar? (s) ou desistir? (d)");
                        string = scanner.nextLine();
                        if(string.equals("s")) {
                            System.out.println("Qual a língua oficial do Brasil?");
                            string = scanner.nextLine();
                            if(string.equals("português")) {
                                pontos++;
                                System.out.println("Você ganhou!");
                                System.out.println("Sua pontuação final foi de: " + pontos);
                            }else {
                                System.out.println("Game over! Sua pontuação foi de: " + pontos);
                            }
                        }else {
                            System.out.println("Game over! Sua pontuação foi de: " + pontos);
                        }
                    }else {
                        System.out.println("Game over! Sua pontuação foi de: " + pontos);
                    }
                }else {
                    System.out.println("Game over! Sua pontuação foi de: " + pontos);
                }
            }else {
                System.out.println("Game over! Sua pontuação foi de: " + pontos);
            }
        }else {
            System.out.println("Acabou o jogo... Você pontuou 0");
        }
    }
}