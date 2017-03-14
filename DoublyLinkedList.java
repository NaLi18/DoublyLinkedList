public class DoublyLinkedList{
  private Node root;
  private Node endNode;
  private int size;
  public DoublyLinkedList(){
    root = null;
    endNode = null;
    size = 0;
  }
  public void setRoot(Node first){
    this.root = first;
    this.size = 1;
  }
  public Node getRoot(){
    return this.root;
  }
  public void add(int index, String str){
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
  public Node getEnd(){
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
  public void remove(Node node){
     Node temp1 = node.getNext();
    Node temp2 = node.getPrev();
    temp1.setPrev(temp2);
    temp2.setNext(temp1);
    size--;
  }
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
      root.setPrev(null);
      root = temp2;
    }
  }
  public void forward(){
    Node temp = root;
    while(temp.getNext()!= null){
      temp.print();
      temp = temp.getNext();
    }
    temp.print();
  }
  public void backward(){
    Node temp = endNode;
    while(temp.getPrev()!= null){
      temp.print();
      temp = temp.getPrev();
    }
    temp.print();
  }
  public int size(){
    return this.size;
  }
  private boolean isEmpty(){
    return this.root==null;
  }  
}