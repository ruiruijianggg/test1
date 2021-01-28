import java.util.ArrayList;
import java.util.Arrays;

public class hello {
    public static void main(String[] args) {
        String s=new String("hello world!");
        System.out.println(s);
        String aa="ABC";
        System.out.println("aa = " + aa);
        ArrayList a=new ArrayList();
        hello hh=new hello();
        String[] arr={"s1","s2","s3"};
        for (String ss : arr) {
            System.out.println(ss);
        }
    }

    public void print(){
        System.out.println("a");
    }
}
