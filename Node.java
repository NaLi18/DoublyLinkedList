public class Node{
  String str;
  Node next;
  Node prev;
  public Node(String name){
    this.next = null;
    this.prev = null;
    this.str = name;
  }
  public Node(){
    this.str = null;
    this.prev = null;
    this.next = null;
  }
  public void setNext(Node node){ 
    this.next = node;
  }
  public void setPrev(Node node){
    this.prev = node;
  }
  public Node getNext(){
    return this.next;
  }
  public Node getPrev(){
    return prev;
  }
  public String valueOf(){
    return " ";
  }
}
