import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
    System.out.println("【自転車の情報】");
    bicycle1.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int n = scanner.nextInt();
    bicycle1.run(n);
    System.out.println("=================");
    Car car1 = new Car("フェラーリ","赤");
    System.out.println("【車の情報】");
    car1.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int carRun = scanner.nextInt();
    car1.run(carRun);
  }
}