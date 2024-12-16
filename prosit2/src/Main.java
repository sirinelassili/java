//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[] args) {

/*
Animal lion=new Animal(); //// sans constructeur////
lion.family="lions";
lion.name="jjj"
lion.age=6;
lion.isMammal=true;
  Zoo myZoo=new Zoo();

*/
    // avec constructeur parametré
    Animal lion=new Animal("lions","aaa",6,true);
    Zoo zzz =new Zoo("mmm","ariana",20);
    zzz.displayZoo();
    lion.displayAnimal();


}
}