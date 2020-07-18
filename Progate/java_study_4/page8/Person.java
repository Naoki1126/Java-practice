class Person {
  public String name;

  // コンストラクタがString型の引数を受け取るようにしてください
  Person(String name){
      this.name = name;
    }
  Person() {
    System.out.println("インスタンスが生成されました");
    // インスタンスフィールドnameに値をセットしてください
  }

  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
