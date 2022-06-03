import java.io.*;
import java.util.Scanner;
public class UserData {

    private String userName;
    private static String filePath;

    public UserData(String userName) {
        this.userName = userName;
        filePath = "C://Users//BT_1E10_30//relyganesh//src//userdata.txt";
    }


    public void createNewUserData() {
        if (isNewUserData()) {
            try {
                File f = new File(filePath);
                f.createNewFile();
                FileWriter fw = new FileWriter(f,true);
                fw.write(userName+ "\n");
                fw.close();
            } catch (IOException e) {
                System.out.println("Unable to create file");
                e.printStackTrace();
            }
        }
    }

    public boolean isNewUserData(){

        Scanner read = new Scanner(filePath);
        while (read.hasNext()) {
            String line = read.nextLine();
            System.out.println(line);
            if (line.indexOf(userName) != -1) {
                System.out.println("This is a returning user");
                return false;
            }
            else {
                System.out.println("This is a new user");
                return true;
            }
        }

//        File file = new File(filePath);
//
//        try (FileReader fr = new FileReader(file))
//        {
//            int content;
//            while ((content = fr.read()) != -1) {
//                char name = (char) content;
//                System.out.println(name);
//                if (name == userName){
//                    return false;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return true;
        return true;
    }

    public String getUserInfo() {
        String name = userName;
        if (isNewUserData()) {
            Scanner read = new Scanner(filePath);
            while (read.hasNext()) {
                if (read.nextLine().indexOf(userName) != -1) {
                    return "Welcome back " + name;
                }
            }
            if (!read.hasNext()){
                return "New user: Welcome!" + name;
            }
        }
        return "";
    }
        public static void fileReader() {
//            File file = new File(filePath);
//
//            try (FileReader fr = new FileReader(file))
//            {
//                int content;
//                while ((content = fr.read()) != -1) {
//                    System.out.print((String)content);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            Scanner read = new Scanner(filePath);
        while (read.hasNext()) {
                System.out.println(read.nextLine());
            }
        }
    public static void main(String[] args) {
        UserData use = new UserData("rely");
        System.out.println(use.isNewUserData());
        UserData use2 = new UserData("rel2");
        System.out.println(use2.isNewUserData());
    }
}
