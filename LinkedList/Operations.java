//Builded the LL from scratch and its all required operation:

public class Operations {

    // Define the node:
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

    // Add First O(1)
    public void addFirst(int data) {
        // Step 1: Create New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: Point to head
        newNode.next = head;

        // Step 3: newNode as head
        head = newNode;
    }

    // Add Last:
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: tail.next point towards newNode
        tail.next = newNode;

        // Step 3: Make newNode as tail
        tail = newNode;
    }

    // Print the LinkedList
    public void print() {
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add in middle
    public void addMiddle(int data,int idx){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    //Size of the Linked List:
    public int size() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    //Remove First:
    public int removeFirst(){
        int value = head.data;
        head = head.next;

        return value;
    }
 
    //Remove Last:
    public int removeLast(int size){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //Find the previous node and remove the last index
        Node prev = head;
        for(int i = 0;i < size -2;i++){
            prev = prev.next;
        }
        
        int val =prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Iterative search for key:
    public int search(int key){
       if(head == null){
         return -1;
       }

       Node temp = head;
       int i = 0;
       while(i<size()){
         if(temp.data == key){
           return i;
         }
         temp = temp.next;
         i++;
       }
       return -1;
    }



    // Recursive Search:
    public int searchRecursively(int key){
       return helper(head, key);
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);  //recursive call
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    //Reverse a Linked List:
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //Find and remove the Nth Node from the end in linkedlist:
    public void removeEndNode(int key){
        //calculate the size:
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(key == sz){
           head = head.next;
           return;
        }

        int i = 1;
        int iToFind = sz - key;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Check if the LL is palindrome:
    public Node findMiddle(Node head) { // Helper function to find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the linked list
        Node mid = findMiddle(head);

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightHead = prev; // Start of the reversed second half
        Node leftHead = head; // Start of the first half

        // Step 3: Compare both halves
        while (rightHead != null) {
            if (leftHead.data != rightHead.data) {
                return false; // Not a palindrome
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true; // Palindrome
    }

    // Detect Cycle in the LL:
    public boolean checkCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //Remove the cycle:
    public void removeCycle(){
        //Detect Cycle:
        Node slow = head;
        Node fast = head;
        boolean cycle =false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }
         if(cycle == false){
            return ;
         }

         //meeting point
         slow = head;
         Node prev = null;
         while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
         }
         prev.next = null;
    }


    //Merge Sort in LL:
    public Node merge(Node head){
        if(head == null || head.next==null){
            return head;
        }
        
        //find mid:
        Node mid = getMid(head);
        
        //left&right sort:
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = merge(head);
        Node  newRight = merge(rightHead);
        return mergeTwo(newLeft,newRight);
    }

    private Node mergeTwo(Node head1, Node head2){
        Node meregLL = new Node(-1);
        Node temp = meregLL;

        while(head1 != null && head2 != null){
             if(head1.data <= head2.data){
                  temp.next = head1;
                  head1 = head1.next;
                  temp = temp.next;
             }else{
                  temp.next = head2;
                  head2 = head2.next;
                  temp = temp.next;
             }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return meregLL.next;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Operations ll = new Operations(); //LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addLast(50);
        ll.print();
        ll.addLast(20);
        ll.print();
        ll.addMiddle(55, 1);
        ll.print();
        ll.addMiddle(44, 4);
        ll.print();

        // System.out.println("The size of the linked list is :"+ ll.size());

        // System.out.println("The value found at index  :"+ ll.search(5));
        // System.out.println(ll.searchRecursively(50, 0));

        // System.out.println("The value found at : " + ll.searchRecursively(20));

        // ll.reverse();
        // ll.print();


        // ll.removeEndNode(4);
        // ll.print();
        

        //  System.out.println(ll.checkPalindrome());


        // if(ll.checkCycle()){
        //     System.out.println("Cycle is present");
        // }else{
        //     System.out.println("Cycle not detected.");
        // }
            
        // ll.removeCycle();

        System.out.println(ll.merge(head));
    }
}
