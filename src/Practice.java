public class Practice {
    public static void main(String[] args) {
    Node myNode = new Node('w', null);
    Node otherNode = new Node('x', null);
    Node coolNode = new Node('e', null);

    Node current = myNode;
    myNode.next = otherNode;
    otherNode.next = coolNode;

    while(current != null) {
        System.out.println(current.value);
        current = current.next;
    }



    // System.out.println(myNode.value);
    // System.out.println(otherNode.value);
    // System.out.println(coolNode.value);

    }
}
