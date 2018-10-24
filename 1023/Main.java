import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main{
private static final String LINE_SEPARATOR = System.lineSeparator();

    public static void main(String[] args){
final String fileName = "Text.txt";
final String contnt = "abc";
if (writeToFile(fileName,readFromFile("Main.java"))){
System.out.println(String.format(
 "ファイルの書き込みに成功しました: %s",fileName));
}else{
System.err.println(String.format(
 "ファイルの書き込みに失敗しました: %s",fileName));
}
}

private static boolean writeToFile(String fileName,String context){
File file = new File(fileName);
try(
FileWriter fw = new FileWriter(file);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter pw = new PrintWriter(bw);
){
pw.println(context);
return true;
}catch (IOException e){
return false;
}
}

public static String readFromFile(String FileName){
File file = new File(FileName);
StringBuilder sb = new StringBuilder();

FileReader fr = null;
BufferedReader br = null;
try{
fr = new FileReader(file);
br = new BufferedReader(fr);
String line;

while ((line = br.readLine()) != null){
sb.append(line).append(LINE_SEPARATOR);
}
return sb.toString();
}catch(FileNotFoundException e){
return null;
}catch(IOException e){
return null;
}finally{
closeSilentry(br);
closeSilentry(fr);
}
}

private static void closeSilentry(AutoCloseable target){
if(target != null){
try{
target.close();
}catch (Exception e){}
}
}
}

