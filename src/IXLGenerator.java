import java.util.Scanner;
public class IXLGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChoiceGenerator cg = new ChoiceGenerator();

        System.out.println("Welcome! please type your username below:");
        String userName = scan.nextLine();
        UserData ud = new UserData(userName);
        ud.getUserInfo();
        cg.getQuestions();
        cg.repeatQuestions();
        System.out.println("Great! Hope to see you back!");

    }

}
