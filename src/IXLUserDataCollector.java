import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class IXLUserDataCollector {
    private String userName;
    private List<String> userNames;
    private static String filePath;

    public IXLUserDataCollector(String userName) {
        this.userName = userName;
        userNames = new ArrayList<String>();
        filePath = "C://IntelliJ Folder//IXLProject_Redo//src//userdata.txt";
        //filePath = "C://Users//BT_1E10_30//relyganesh//src//userdata.data";
    }


    public void createNewUserData() {
if (isNewUserData()) {
    try {
        File f = new File(filePath);
        f.createNewFile();
        FileWriter fw = new FileWriter(f, true);
        fw.write(userName + "\n");
        fw.close();
    } catch (IOException e) {
        System.out.println("Unable to create file");
        e.printStackTrace();
    }
}
        }

    public boolean isNewUserData(){
        if (userNames.contains(userName)){
            System.out.println("Welcome back " + userName);
            return false;
        }
        else {
            System.out.println("Welcome to IXL " + userName);
            return true;
        }

    }

    public void getUserInfo() throws IOException {
        userNames = Files.readAllLines(Paths.get(filePath));
    }

    public List<String> getUserNames() {
        return userNames;
    }
}
