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
    /*
    //test the default constructor and the setRoot, getRoot and size methods
    System.out.println(linkedList);
    System.out.println(linkedList.getRoot());
    System.out.println(linkedList.size());
    linkedList.setRoot(new Node("Frank"));
    System.out.println(linkedList.getRoot());
    System.out.println(linkedList.size());
    */
    /*
     //test the isEmpty is work
     linkedList.setRoot(new Node("Carol"));
     linkedList.forward();
    */
    
    // test add method of the DoublyLinkedList class
    linkedList.add(0,"Alex");
    linkedList.add(0,"Frank");
    linkedList.add(0,"Peter");
    linkedList.add(0,"Carol");
    linkedList.add(3,"Cat");
    linkedList.add(5, "Micheal");
    linkedList.add(6, "Bobby");
    /*
     //test the forward and backward method
    linkedList.forward();
    linkedList.backward();
    */
    /*
     //test the insert method
    linkedList.insert("Lina");
    linkedList.forward();
    linkedList.insert("Tina");
    linkedList.forward();
    */
    /**
     //test the remove method
    Node newNode1 = linkedList.found("Cat");
    if(newNode1 != null)
    linkedList.remove(newNode1);
    linkedList.forward();
    Node newNode2 = linkedList.found("Tina");
    if(newNode2 != null)
    linkedList.remove(newNode2);
    linkedList.forward();
    */
    //test the destory method
    System.out.println(linkedList.size());
    linkedList.destory();
    linkedList.forward();
    linkedList.backward();
    System.out.println(linkedList.size());
  }
}