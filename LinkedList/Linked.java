package LinkedList;

public class Linked {
    Node head;
 
    class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int key){
        if( head == null)return;

        if(head.data == key){
            head=head.next;
            return;
        }

        Node current=head;
        while (current.next!= null && current.next.data !=key){
            current= current.next;

        }
        if (current.next!= null){
            current.next= current.next.next;
        }


    }
    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;

        }
        current.next = newNode;
    }

    // void boolean search(int key){
    //     Node current = head;
    //     while(current != null){
    //         if(current.data == key){
    //             return true;
    //         } 
    //         current = current.next;
    //     }

    //     return false;
    // }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " --> ");
            current = current.next;

        }

        System.out.println("null");
    }

}
}
