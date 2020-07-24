import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("何人分の情報を受け取りますか");
    int n = scanner.nextInt();
    for(int i = 1;i <= n;i++){
      System.out.println(i + "人目");
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();
      Person.printData(firstName,lastName,age,height,weight);
    }
    
  }
  
  
}