package alura.com.cursojava.projectlamp;

public class Testlight {

  public static void main(String[] args) {

    //Light light1 = new Light("White", "Desk", "Plastic");//Construtor
    Light light1 = new Light();
    light1.setMaterial("Plastic");
    light1.setColor("red");
    light1.setType("Desk");

    System.out.println(light1.getType());
    System.out.println(light1.getColor());
    System.out.println(light1.getMaterial());

    light1.lighton();
    light1.status();
    light1.lightoff();
    light1.status();

  }
  }
