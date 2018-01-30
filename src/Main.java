import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(new File("input.txt"));
        PrintWriter writer=new PrintWriter(new File("output.txt"));
        int n,maxSum=0, minSum=0;
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> p=new ArrayList<Integer>();
        List<Integer> o=new ArrayList<Integer>();
        n=scanner.nextInt();
       while (scanner.hasNextInt()){
           list.add(scanner.nextInt());
       }
        scanner.close();

        for (int i = 0; i <n ; i++) {
            if(list.get(i)>0){
                p.add(list.get(i));
                maxSum+=list.get(i);
            }if(list.get(i)<0) {
                o.add(list.get(i));
                minSum+=Math.abs(list.get(i));
            }
        }

        if(maxSum>minSum){
            int f=1;
            int index=0;
            writer.println(p.size());
            for (int i = 0; i <p.size() ; i++) {
                index=list.indexOf(p.get(i));
                writer.print(index+f);
                writer.print(" ");
                list.remove(index);
                f++;
            }

        }else {
            int f=1;
            int index=0;
            writer.println(o.size());
            for (int i = 0; i <o.size() ; i++) {
                index=list.indexOf(o.get(i));
                writer.print(index+f);
                writer.write(" ");
                list.remove(index);
                f++;

            }
        }
        writer.close();


    }
}
