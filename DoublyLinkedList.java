/*
 * The DoublyLinkedList class
 * Name: Na Li
 * Lab: 2:45pm - 3:40pm, Monday
 */
public class DoublyLinkedList{
  
//Declare appropriate variables.
  private Node root;
  private Node endNode;
  private int size;
  
// The default constructor
  public DoublyLinkedList(){
    root = null;
    endNode = null;
    size = 0;
  }
  
//The setRoot method that set the first node of the list
  public void setRoot(Node first){
    this.root = first;
    this.size = 1;
  }
  
//The getRoot method that return the first node's value of the list.
  public Node getRoot(){
    return this.root;
  }
  
//The add method that add the new node to the list(fornt, middle, end)
  public void add(int index, String str){
    //Creat a new Node object that has the value of the str
    Node newNode = new Node(str);
    
    //Check the index is in the range of the list
    if(index > this.size)
      //print a error message
      System.out.println("Index" + index + "doesn't exist");
    
    else {
      //Check the list is empty or not
      if(this.isEmpty()){
        this.root = newNode;
        this.endNode = root;
      }
      
      //add to the fornt of node list
      else if (index == 0) {
        newNode.setNext(root);
        root.setPrev(newNode);
        this.root = newNode;
      }
      
      //add to the end of node list
      else if(index == this.size){
        Node currentNode = this.getEnd();
        currentNode.setNext(newNode);
        newNode.setPrev(currentNode);
        endNode = newNode;
      }
      
      //add to the middle of node list
      else{
        Node temp = this.root;
        for(int i = 0; i < index - 1; i++) {
          temp = temp.getNext();
        }
        Node temp2 = temp.getNext();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(temp2);
        temp2.setPrev(newNode); 
      }
      //increment the size 
      size++;
  }
  }
  
  //The insert method that insert a node in the list in alphabetical order 
  public void insert(String str){
    Node newNode = new Node(str);
    Node temp = root;
    if(this.isEmpty()){
        this.root = newNode;
        this.endNode = root;
      }
    else
    {
      while(temp.getValue().compareTo(str)<0 && temp.getNext() != null)
          temp = temp.getNext();
      size++;
      if(temp.getNext()==null){
        temp.setNext(newNode);
        newNode.setPrev(temp);
        endNode= newNode;
      }
      else{
        newNode.setNext(temp);
        temp.getPrev().setNext(newNode);
        newNode.setPrev(temp.getPrev());
        temp.setPrev(newNode);
      }
  }
  }
  
  //The getEnd method that return the last node of the list
  public Node getEnd(){
    Node temp = root;
    while(temp.getNext()!= null)
      temp = temp .getNext();
    endNode = temp;
    return endNode;
  }
  
  //The found method that find a node that matches a String
  public Node found(String str){
     Node temp = null;
    if(isEmpty()){
      System.out.println("The list is empty");
      return null;
    }
    else if(endNode.getValue().equals(str)){
      temp = endNode;
      System.out.println("Found "+ str +" in the end of list");
    }
    else{
      temp = root;
      while(temp.getNext()!= null&& temp.getValue().compareTo(str) != 0){ 
        temp = temp.getNext();
      }
      if(temp.getNext() == null){
        System.out.println("the " +str+ " didn't exsit in the list");
        temp = null;
      }
      else
        System.out.println("Found "+ str +" in the list");
    }
    return temp;
    }
  
  //The remove method that delete a node from the list. 
  public void remove(Node node){
     Node temp1 = node.getNext();
    Node temp2 = node.getPrev();
    temp1.setPrev(temp2);
    temp2.setNext(temp1);
    size--;
  }
  
  // The destory method that delete/destroy the list
  public void destory(){
    Node temp1 = null;
    Node temp2 = null;
    for(int i = 0; i<this.size-1;i++){
      temp1 = root.getNext();
      root.setNext(null);
      root = temp1;
    }
    for(int i = 0; i<this.size-1;i++){
      temp2 = endNode.getPrev();
      endNode.setPrev(null);
      endNode = temp2;
    }
    size = 1;
  }
  
  //The forward method that traverse the list forwards and print
  public void forward(){
    Node temp = root;
    while(temp.getNext()!= null){
      temp.print();
      temp = temp.getNext();
    }
    temp.print();
  }
  
  //The backward method that traverse the list backwards and print
  public void backward(){
    Node temp = endNode;
    while(temp.getPrev()!= null){
      temp.print();
      temp = temp.getPrev();
    }
    temp.print();
  }
  
  // return the size of the list
  public int size(){
    return this.size;
  }
  
  //Flag the isEmpty or not
  private boolean isEmpty(){
    return this.root==null;
  }  
}