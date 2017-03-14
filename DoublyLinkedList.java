public class DoublyLinkedList{
  private Node root;
  private Node endNode;
  private int size;
  public DoublyLinkedList(){
    root = null;
    endNode = null;
    size = 0;
  }
  private void setRoot(Node first){
    this.root = first;
    this.size = 1;
  }
  private Node getRoot(){
    return this.root;
  }
  private void add(int index, String str){
    Node newNode = new Node(str);
    
    if(index > this.size)
      System.out.println("Index" + index + "doesn't exist");
    else {
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
      size++;
  }
  }
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
  private Node getEnd(){
    Node temp = root;
    while(temp.getNext()!= null)
      temp = temp .getNext();
    endNode = temp;
    return endNode;
  }
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
  private void remove(Node node){
    Node temp1 = node.getNext();
    Node temp2 = node.getPrev();
    temp1.setNext(temp2);
    temp2.setPrev(temp1);
    size--;
  }
  public void destory(){
    Node temp1 = root.getNext();
    Node temp2 = endNode.getPrev();
    for(int i = 0; i<this.size -1;i++){
      temp2.setNext(null);
      temp2 = temp2.getPrev();
      temp1.setPrev(null);
      temp1 = temp1.getNext();
    }
  }
  private void forward(){
    Node temp = root;
    while(temp.getNext()!= null){
      temp.print();
      temp = temp.getNext();
    }
    temp.print();
  }
  private void backward(){
    Node temp = endNode;
    while(temp.getPrev()!= null){
      temp.print();
      temp = temp.getPrev();
    }
  }
  private int size(){
    return size;
  }
  private boolean isEmpty(){
    return this.root==null;
  }  
}