import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
    Scanner scanner = new Scanner(System.in);
   
   bicycle1.printData();
   System.out.println("-----------------");
   System.out.print("走る距離を入力してください：");
   int i = scanner.nextInt();
   bicycle1.run(i);
   Car car1 = new Car("フェラーリ","赤");
   car1.printData();
   System.out.println("-----------------");
   System.out.print("走る距離を入力してください：");
   int n = scanner.nextInt();
   car1.run(n);
  }
}