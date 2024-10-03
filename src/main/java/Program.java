import entities.Post;
import entities.User;
import entities.UserPremium;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User
        System.out.println("=== Criar Usuário Comum ===");
        System.out.print("Digite o nome: ");
        String userName = scanner.nextLine();

        System.out.print("Digite o email: ");
        String userEmail = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        User user = new User(userName, userEmail, userAge);
        System.out.println("Usuário comum criado: " + user);

        //Post User
        System.out.println("\n=== Criar Post do Usuário Comum ===");
        System.out.print("Digite o conteúdo do post: ");
        String postContent = scanner.nextLine();

        Post post = new Post(postContent, new Date(), user);
        System.out.println("Post criado: " + post);

        //User Premium
        System.out.println("\n=== Criar Usuário Premium ===");
        System.out.print("Digite o nome: ");
        String premiumName = scanner.nextLine();

        System.out.print("Digite o email: ");
        String premiumEmail = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int premiumAge = scanner.nextInt();
        scanner.nextLine();

        UserPremium userPremium = new UserPremium(premiumName, premiumEmail, premiumAge, true);
        System.out.println("Usuário premium criado: " + userPremium);

        // Post Premium
        System.out.println("\n=== Criar Post do Usuário Premium ===");
        System.out.print("Digite o conteúdo do post: ");
        String premiumPostContent = scanner.nextLine();

        Post premiumPost = new Post(premiumPostContent, new Date(), userPremium);
        System.out.println("Post premium criado: " + premiumPost);

        scanner.close();
    }
}
