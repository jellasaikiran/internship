package Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipAddress =scanner.nextLine();
        try {
            Process process = Runtime.getRuntime().exec("ping "+ipAddress);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String string = "";
            while ((string = inputStream.readLine()) != null) {
                System.out.println(string);
                //break;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
