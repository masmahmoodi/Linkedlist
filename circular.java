


public class Main {

    public static void main(String[] args) {

      // run code here 

       
    }

}






public class CirclarLinkedlist {

    private Node head;
    private Node tail;
    private int size;
 
   // inner class for creating nodes

    class Node {
        int value;
        Node next;
        Node prev;
        // constructor for class Node
        Node(int value) {
            this.value = value;
        }
    }

   
     // constructor for class circular linked list
    CirclarLinkedlist(int value) {
      Node myNode = new Node(value);
      head = myNode;
      tail = myNode;
      tail.next = head;
      size = 1;
    }




    // method of print element
  public void printList(){
    Node temp = head;
    for(int i = 0; i<size; i++){
      System.out.println(temp.value);
      temp = temp.next;
    }
  }





    // method of get head
  public int getHead() {
    return (head != null) ? head.value : 0;
  }






    // method of get tail
  public int getTail() {
    return (tail != null) ? tail.value : 0;
  }


   // method of get length
 public int getSize(){
    return size;
  }



    // method of append
 public void append(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    tail.next = head;
    size++;
  }



  // method of remove last
public Node removeLast() {
    Node temp = head, pre = head;
    while (temp.next != null){
      pre = temp;
      temp = temp.next;
    }
    tail = pre;
    tail.next = null;
    size--;
    if(size == 0){
      head = tail = null;
    }
    return temp;
  }




   //mthod of prepend
  public void prepend(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    size++;
  }


  
    // method of remove first
public Node removeFirst() {
    if(size == 0) return null;
      Node temp = head;
      head = null;
      head = temp.next;
      size--;
    if(size == 0) tail = null;
      return temp;
  }
   
    // method of get 
public Node getNode(int index) {
    if(index < 0  index >= size){
       return null;
    }
    Node temp = head;
    for(int i = 0; i<index; i++){
       temp = temp.next;
    }
    return temp;
  }

   // method of set
 public boolean setNode(int index, int value) {
    if(index < 0 || index >= size){
       System.out.println("Incorrect index!!!");
       return false;
    }
    Node temp = head;
    
    for(int i = 0; i!=index; i++){
       temp = temp.next;
    }
    temp.value = value;
    return true;
  }
       // method of insert
  public boolean insert(int index, int value) {
         if(index < 0  index >= size){
             System.out.println("Incorrect index!!!");
             return false;
          }
          Node newNode = new Node(value);
          Node temp = head;
          int i = 0;
          while(i!=index){
              temp = temp.next;
              i++;
           }
          newNode.next = temp.next;
          temp.next = newNode;
          return true;
    }




   
}

