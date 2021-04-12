import java.util.*;
public class DSA {

    public static void main(String[] args) {
        Person p1 = new Person(15,"siva",165);
        Person p2 = new Person(19,"Arvind",169);
        Person p3 = new Person(21,"sudheer",182);
        Person p4 = new Person(26,"srinuvas",165);
        Person p5 = new Person(24,"pratap",156);

        Node root = new Node(p1);
        root.left = new Node(p2);
        root.right = new Node(p3);
        root.left.left = new Node(p4);
        root.left.right = new Node(p5);
        root.right.left = new Node((p1));
        root.right.right = new Node(p2);
        root.left.left.right = new Node(p3);
        root.left.left.left = new Node(p4);
        root.left.right.left = new Node(p5);
        root.left.right.right = new Node(p1);
        root.right.left.left = new Node(p1);
        root.right.left.right = new Node(p3);
        root.right.right.right = new Node(p5);

        DSA d = new DSA();
        HashMap<Person,Integer> h = d.findPersonMap(root);
        for (Map.Entry<Person, Integer> entry : h.entrySet()) {
            System.out.println("Person is "+(entry.getKey()).getName()+", Value Repeated for  "+entry.getValue());
        }
    }

    public  HashMap<Person,Integer> findPersonMap(Node root){
        HashMap<Person,Integer> h = new HashMap<>();

        if(root == null)
            return h;

        Stack<Node> s = new Stack<>();
        Node cur = root;

        while (cur!=null || s.size()>0)
        {
            while (cur!=null)
            {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();

            Person p = cur.person;

            if(h.containsKey(p))
                h.put(p,h.get(p)+1);
            else
                h.put(p,1);

            cur = cur.right;
        }
        return h;
    }
}

class Node{
    Person person;
    Node left;
    Node right;

    public Node(Person person) {
        this.person = person;
        left = null;
        right = null;
    }
}


