import java.util.*;
class TreeMapMIS1146{
public static void main(String args[]){
    TreeMap<Integer, String> map = new TreeMap<Integer, String>();   
    map.put(100,"ab");
    map.put(102,"cdi");                             
    map.put(101,"xy");
    map.put(103,"lm");
    for(Map.Entry m:map.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
    }
}}