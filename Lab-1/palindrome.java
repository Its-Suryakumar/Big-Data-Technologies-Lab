import java.io.BufferedReader;
import java.io.FileReader;
public class palindrome
{
    public static void main(String[] args) throws Exception{
        String line;
        int count = 0;
        int palCount=0;
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null){
            //Splits each line into words
            String words[] = line.split(" ");
            count += words.length;
            for(int j=0;j<words.length;j++)
            {
                String str = words[j], reverseStr = "";
                
                int strLength = str.length();
                for (int i = (strLength - 1); i >=0; --i) {
                reverseStr = reverseStr + str.charAt(i);
                }
                if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                    palCount++;
                    System.out.println(str + " is a Palindrome String.");
                }
                else {
                    System.out.println(str + " is not a Palindrome String.");
                }
            }

        }
        System.out.println("\n\nNumber of words in the file is : "+count);
        System.out.println("Number of Palindrome words in the file is : "+palCount);
        br.close();
    }
}