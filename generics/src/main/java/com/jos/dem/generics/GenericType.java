public class GenericType<T> {

  private T type;

  public T get(){
    return this.type;
  }

  public void set(T type){
    this.type = type;
  }

  public static void main(String[] args){
    GenericType<String> type = new GenericType<String>();
    type.set("josdem");
  }

}