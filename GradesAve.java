//Description: A program that will use a Multi-Dimensional Array that will compute an average grade of 3 subjects
import java.util.Scanner;
public class GradesAve {
    public static void main(String[] args){
        String [][] names = new String[10][1];
        double [][] grades = new double[10][3];
        double [][] average = new double[10][1];
        Scanner s = new Scanner(System.in);
        for (int i= 0; i<10; i++){
           nPrint("\nEnter name: \t");
           names[i][0] = s.next();
           nPrint("English Grade: \t");
           grades[i][0] = s.nextDouble();
           nPrint("Math Grade: \t");
           grades[i][1] = s.nextDouble();
           nPrint("Science Grade: \t");
           grades[i][2] = s.nextDouble();
           average[i][0] = (grades[i][0] + grades[i][1] +grades[i][2])/3; 
        }
        nPrint("\n\n");
        nPrint("Name\t   English Grade     Math Grade     Science Grade      Average\n");
        for (int i=0; i<10; i++){
            nPrint(names[i][0] + "\t\t");
            nPrint(grades[i][0] + "\t\t");
            nPrint(grades[i][1] +"\t\t");
            nPrint(grades[i][2]+ "\t\t");
            nPrint(average[i][0] + "\t\n");
        }
    }
    public static void nPrint(String str){
        System.out.print(str);
    }
}
