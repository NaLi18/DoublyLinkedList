public class Demo{
  public static void main(String[] args){
    /*
    //test the default constructor of Node class.
    Node myNode = new Node();
    System.out.println(myNode.getValue());
    System.out.println(myNode.getNext());
    */
    /*
    //test the constructor and print method 
    Node myOtherNode = new Node("Frank");
    System.out.println(myOtherNode.getValue());
    System.out.println(myOtherNode.getNext());
    myOtherNode.print();
    */
    DoublyLinkedList linkedList = new DoublyLinkedList();
    
    //test the default constructor and the setRoot, getRoot and size methods
    System.out.println(linkedList);
    System.out.println(linkedList.getRoot());
    System.out.println(linkedList.size());
    linkedList.setRoot(new Node("Frank"));
    System.out.println(linkedList.getRoot());
    System.out.println(linkedList.size());
    
  }
}