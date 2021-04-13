public class IntList{
  public int first;
  public IntList rest;

  public IntList(int f, IntList r){
    first = f;
    rest = r;
  }

  /**Return the size of the list using ...recursion*/
  public int size(){
    if(rest == null){
      return 1;
    }
    return 1 + this.rest.size();
  }

  /**Return the size of the list using no recursion*/
  public int iterativeSize(){
    IntList p = this;
    int totalSize = 0;
    while(p!=null){
      totalSize +=1;
      p = p.rest;
    }
    return totalSize;
  }

  /**Returns the ith item of this IntList*/
  public int get(int i){
    if(i==0){
      return first;
    }
    return rest.get(i-1);
  }
  /**Exercise 2.2.1: Write an addFirst method to the IntList class.
  * You'll find that the resulting method is tricky as well as inefficient.*/
  public IntList addFirst(int x ){
     return new IntList(x,this);
  }

  public static void main(String[] args) {
    IntList L = new IntList(15, null);
    L = new IntList(10,L);
    L = new IntList(5,L);
    System.out.println(L.size());
    System.out.println(L.iterativeSize());
    System.out.println(L.get(2));
    L = L.addFirst(8);
    System.out.println(L.get(2));

    /**
    IntList l = new IntList();
    l.first = 5;
    l.rest = null;

    l.rest = new IntList();
    l.rest.first = 10;

    l.rest.rest = new IntList();
    l.rest.rest.first = 15;
    */
  }
}
