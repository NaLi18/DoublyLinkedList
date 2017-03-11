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
    return this.prev;
  }
  public String getValue(){
    return this.str;
  }
  public void setValue(String x){
    this.str = x;
  }
  public void print(){
    System.out.println(this.str + " ");
  }
}