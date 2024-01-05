//Write a java program to read the words from the file and move them to the array list object
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
class arrayList{
    public static void main(String args[]) throws Exception{
        ArrayList<String> al = new ArrayList<>();
        String line;
        int count = 0;
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null){
            String words[] = line.split(" ");         
            count += words.length;
            for(int i=0;i<words.length;i++){
                al.add(words[i]);
            }
        }
        System.out.println(al);
        System.out.println("Total Number of words: "+count);

    }
}