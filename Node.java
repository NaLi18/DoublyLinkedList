/*
 *The Node method
 * Name: Na Li
 * Lab: 2:45pm - 3:40pm
 */
public class Node{
  //Declare appropriate variables. 
  String str;
  Node next;
  Node prev;
  //The constructor
  public Node(String name){
    this.next = null;
    this.prev = null;
    this.str = name;
  }
  //The Non-parameter constructor(Default constructor)
  public Node(){
    this.str = null;
    this.prev = null;
    this.next = null;
  }
  //The setNext method that set the value of next
  public void setNext(Node node){ 
    this.next = node;
  }
  //The setPrev method that set the value of prev
  public void setPrev(Node node){
    this.prev = node;
  }
  //The getNext method that get the value of next
  public Node getNext(){
    return this.next;
  }
  //The getPrev method that get the value of prev
  public Node getPrev(){
    return this.prev;
  }
  //The getValue method that get the value of node
  public String getValue(){
    return this.str;
  }
   //The setValue method that set the value of node
  public void setValue(String x){
    this.str = x;
  }
  //The print method that print the value of the node
  public void print(){
    System.out.println(this.str + " ");
  }
}