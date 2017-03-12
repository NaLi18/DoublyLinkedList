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
  private void add(Node e){
  }
  private Node getEnd(){
    return endNode;
  }
  public boolean found(String name){
    return false;
  }
  private void remove(String name, Node p){
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