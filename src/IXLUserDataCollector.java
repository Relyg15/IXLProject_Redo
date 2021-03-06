import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class IXLUserDataCollector {
    private String userName;
    private List<String> userNames;
    private static String filePath;

    public IXLUserDataCollector(String userName) {
        this.userName = userName;
        userNames = new ArrayList<String>();
        filePath = "src/userdata.txt";
        
    }


    public void createNewUserData() {
    if (isNewUserData()) {
        try {
        File f = new File(filePath);
        f.createNewFile();
        FileWriter fw = new FileWriter(f, true);
        fw.write(userName + "\n");
        fw.close();
            }       
        catch (IOException e) {
        System.out.println("Unable to create file");
        e.printStackTrace();
                 }
            }
        }

    public boolean isNewUserData(){
      if (userNames.contains(userName))
        {
            System.out.println("Welcome back " + userName);
            return false;
         }
        
      else 
        {
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
