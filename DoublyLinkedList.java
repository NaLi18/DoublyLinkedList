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
        this.root = newNode;
      }
      //add to the end of node list
      else if(index == this.size){
       Node currentNode = this.getEnd();
        currentNode.setNext(newNode);
      }
      //add to the middle of node list
      else{
        Node temp = this.root;
        for(int i = 0; i < index - 1; i++) {
          temp = temp.getNext();
        }
        newNode.setNext(temp.getNext());
        newNode.setPrev(temp.getPrev());
      }
      size++;
  }
  }
  private Node getEnd(){
    return endNode;
  }
  public Node found(String str){
   Node temp = null;
    if(isEmpty())
      return null;
    else{
      temp = root;
      while(temp.getNext()!= null){
        if(temp.getValue().compareTo(str) == 0)
          return temp;
        else{
          temp = temp.getNext();
        }
      }
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
  }
  private String print(){
    return " ";
  }
  private void forward(){
  }
  private void backward(){
  }
  private int size(){
    return size;
  }
  private boolean isEmpty(){
    return this.root==null;
  }  
}