import jdk.swing.interop.SwingInterOpUtils;

public class Main {
 public static void main(String[]args){

     String[] commands = {"sit","lay"};
     Shelter shelter = new Shelter("Romashka", "Lenina1");
     Dog dog = new Dog("rex", "ovcharka", commands, shelter,ColorEnum.BROWN);
     System.out.println(dog.getInfo());
     dog.makeVoice();
     dog.makeVoice("giv giv");


     Shelter live = new Shelter("live", "sovet");
     Dog dog2 = new Dog("bil", "mops", live, ColorEnum.WHITE);
     System.out.println(dog2.getInfo());
     dog2.makeVoice();
     dog2.makeVoice("giv giv");

 }
}