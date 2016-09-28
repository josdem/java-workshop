public class Calculator {

  private Integer doMySum(Integer params1, Integer params2){
    return params1 + params2;
  }

  public static void main(String[] args){
    Integer x = 5;
    Integer y = 6;

    Calculator calculator = new Calculator();
    System.out.println("suma es:" + calculator.doMySum(x, y));
  }
}

