public class Demo{
  public static void main(String[] args){
    /*
    //test the default constructor of Node class.
    Node myNode = new Node();
    System.out.println(myNode.getValue());
    System.out.println(myNode.getNext());
    */
    //test the constructor and print method 
    Node myOtherNode = new Node("Frank");
    System.out.println(myOtherNode.getValue());
    System.out.println(myOtherNode.getNext());
    myOtherNode.print();
  }
}