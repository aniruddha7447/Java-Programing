package Practice;

import Practice.LL_RemoveNthFromEnd.Node;

public class LL_RemoveNthFromEnd{
	 public static class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public static Node head;
	    public static Node tail;
	    public static int size;
	    
	    
	    // Adding at the beginning of the linked list
	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        size++;
	        if (head == null) {
	            head = tail = newNode;
	            return;
	        }

	        newNode.next = head;
	        head = newNode;
	    }

	    // Adding at the end
	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        size++;

	        if (head == null) {
	            head = tail = newNode;
	            return;
	        }

	        tail.next = newNode;
	        tail = newNode;
	    }
	    
		////Remove nth element from last
		
		public void removenthfromlast(int n) {
			//Calculating Size 
			int sz=0;
			Node temp = head;
			while(temp != null) {
				temp = temp.next;
				sz++;
			}
			System.out.println(sz);
			
			if(n == sz) {//n from last means head from start-->we are going from last...
				head = head.next;///Head will remove ===> (remove first)
				return;
			}
			//sz-n
			Node prev = head;
			for(int i=1;i<sz-n;i++) {
				
				prev = prev.next;
				
			}
			prev.next =prev.next.next; 
			return;
		}

	    // Printing the linked list
		public static void printLinkedList() {
	        if (head == null) {
	            System.out.println("Linked list is Empty");
	            return;
	        }

	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + "->");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	LL_RemoveNthFromEnd ll = new LL_RemoveNthFromEnd();
	        ll.printLinkedList();
	        ll.addFirst(2);
	        ll.printLinkedList();
	        ll.addFirst(1);
	        ll.printLinkedList();
	        ll.addLast(3);
	        ll.printLinkedList();
	        ll.addLast(4);
	        ll.printLinkedList();
	        ll.removenthfromlast(3);
	        ll.printLinkedList();
	        
	    }
}
