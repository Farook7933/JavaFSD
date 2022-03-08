package PracticeProjects;
import java.io.*;
public class FileHandlingWrite {
 public static void main(String[] args){
 //Writing in the file
 
 try
 {
FileWriter f = new FileWriter("C:\\Users\\Hp\\Desktop\\simplilearn.txt");
 try
 {
 f.write("farook is the employee of software.....!!");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written..!! ");
 }
 catch(IOException i)
 {
 System.out.println(i);
 }
 }
}