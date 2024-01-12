import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
class Student{
    String regno, name;
    Double internals;

    Student(String a, String b,Double c){
        regno = a;
        name = b;
        internals = c;
    }

    void display(){
        System.out.println("Internals of "+regno+" - "+name+" is "+internals);
    }
}
class MarkReading {
    public static void main(String[] args) throws Exception{
        ArrayList<Student> al = new ArrayList<>();
        String line;
        double internal = 0;
        FileReader file = new FileReader("marks.txt");
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null){
            String words[] = line.split(" ");         
            internal = Float.parseFloat(words[2])+Float.parseFloat(words[3])+Float.parseFloat(words[4])+Float.parseFloat(words[5])*0.3+Float.parseFloat(words[6])*0.3;
            Student st = new Student(words[0], words[1], internal);
            al.add(st);
        }
        for(Student s: al)
        {
            s.display();
        }
        br.close();
    }
}