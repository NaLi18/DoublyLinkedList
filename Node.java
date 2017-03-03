public class Node{
  String str;
  Node nodes;
  Node next;
  Node prev;
  public Node(String name){
    this.next = null;
    this.prev = null;
    this.nodes = null;
    this.str = name;
  }
  public Node(String name, Node node){
    this.nodes = node;
    this.str = name;
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
}
