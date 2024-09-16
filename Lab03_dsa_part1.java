/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Lab03_dsa_part1 {
    private Node head=null;
    //insert at start
    public class Node{
        int data;
        Node next;
   Node (int data){
       this.data=data;
       this.next=null;
   }
   }
    
     public void insertAtStart(int data){
       Node newNode=new Node(data);
       newNode.next=head;
        head = newNode;
}
     //insert at end
public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head!=null){
            head.next=newNode;
        }
     } 
   // display method
public void display(){
    Node current = head;
    while(current != null){
        System.out.println("Element "+ current.data);
        current=current.next;
        
    }
}
    //insert at position 
   


     
    public static void main(String []args){
        Lab03_dsa_part1 obj=new Lab03_dsa_part1();
       obj.insertAtStart(45);
       obj.insertAtStart(20);
       obj.insertAtStart(33);
       obj.insertAtEnd(50);
       obj.display();

    }
}
