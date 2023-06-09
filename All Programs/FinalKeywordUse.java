final class FinalKeywordUse {//i made this class final line 12
  final int MAX=5;// I MADE THIS VARIABLE FINAL line 8
//final method is on line 17
  public  static void main(String[] args) {
    System.out.println("Hello world!");
  }
  void change(int newMax){
    MAX=newMax;//we can't assign new value to MAX because its final.
  }
}

class Otherclass extends FinalKeywordUse{
//it's going to give an error because we can't extend fnal class.
  
}
class Finalmethod{
  final public  void sayHello(){//made this method final line 23
  System.out.println("hello");
}
  
}
class Changemethod extends Finalmethod{
  public  void sayHello(){//tried overriding it but can't
    System.out.println("hi");
  }
}