package xim49_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {

final static String SPLIT = "@@"; //string of separating chars

public static ArrayList<Entree> readEntrees (String fileName){

//all the file read methods are the same, only the first will be commented
ArrayList<Entree> entrees = new ArrayList<Entree>(); //create array list to hold data read
int arrayIndex=0; //tracks the array index and increments after each line of the file

try {
FileReader fr = new FileReader(fileName);
BufferedReader br = new BufferedReader(fr);
String line = null;
while ((line = br.readLine()) != null) {

int first = line.indexOf(SPLIT); //determine the two spots in the line that split the data
int second = line.indexOf(SPLIT, first + 1);

//add to the arraylist a new object of each menu type using the constructor and substrings of the file line
entrees.add(arrayIndex, //index of arraylist starts at 0 and goes up each line
new Entree(line.substring(0,first), //Name of item
line.substring(first+2,second), //Description
Integer.parseInt(line.substring(second+2)),0)); //calories

arrayIndex++; //increment the arraylist index for the next line
}
br.close();
fr.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
return entrees;
}

public static ArrayList<Side> readSides (String fileName){
ArrayList<Side> sides = new ArrayList<Side>();
int arrayIndex = 0 ;
try {
FileReader fr = new FileReader(fileName);
BufferedReader br = new BufferedReader(fr);
String line = null;
while ((line = br.readLine()) != null) {
int first = line.indexOf(SPLIT);
int second = line.indexOf(SPLIT, first + 1);
sides.add(arrayIndex, new Side(line.substring(0,first), line.substring(first+2,second), Integer.parseInt(line.substring(second+2)),0));
arrayIndex++;
}
br.close();
fr.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
return sides;
}

public static ArrayList<Salad> readSalads (String fileName){
ArrayList<Salad> salads = new ArrayList<Salad>();
int arrayIndex = 0 ;
try {
FileReader fr = new FileReader(fileName);
BufferedReader br = new BufferedReader(fr);
String line = null;
while ((line = br.readLine()) != null) {
int first = line.indexOf(SPLIT);
int second = line.indexOf(SPLIT, first + 1);
salads.add(arrayIndex, new Salad(line.substring(0,first), line.substring(first+2,second), Integer.parseInt(line.substring(second+2)),0));
arrayIndex++;
}
br.close();
fr.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
return salads;
}


public static ArrayList<Dessert> readDesserts (String fileName){
ArrayList<Dessert> desserts = new ArrayList<Dessert>();
int arrayIndex = 0 ;
try {
FileReader fr = new FileReader(fileName);
BufferedReader br = new BufferedReader(fr);
String line = null;
while ((line = br.readLine()) != null) {
int first = line.indexOf(SPLIT);
int second = line.indexOf(SPLIT, first + 1);
desserts.add(arrayIndex, new Dessert(line.substring(0,first), line.substring(first+2,second), Integer.parseInt(line.substring(second+2)),0 ));
arrayIndex++;
}
br.close();
fr.close();
} catch (Exception e) {
System.out.println(e.getMessage());
}
return desserts;
}

}