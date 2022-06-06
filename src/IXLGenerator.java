import java.io.IOException;
import java.util.Scanner;
public class IXLGenerator {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        ChoiceGenerator cg = new ChoiceGenerator();

        System.out.println("Welcome! please type your username below:");
        String userName = scan.nextLine();
        UserDataCollector ud = new UserDataCollector(userName);
        ud.getUserInfo();
        ud.createNewUserData();
        cg.getQuestions();
        cg.repeatQuestions();
        System.out.println("Great! Hope to see you back!");

    }

}
