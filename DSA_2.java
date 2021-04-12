import java.util.*;
public class DSA_2 {
    public static void main(String[] args) {
        ArrayList<Person> a = new ArrayList<>();
        Person p1 = new Person(15,"siva",1);
        Person p2 = new Person(19,"Arvind",2);
        Person p3 = new Person(21,"sudheer",3);
        Person p4 = new Person(26,"srinuvas",4);
        Person p5 = new Person(24,"pratap",5);

        a.add(p1);a.add(p2);a.add(p3);a.add(p4);a.add(p5);
        DSA_2 d = new DSA_2();
        System.out.println("Minimum Height is: "+d.findMinimumOperationSum(a));

        }

    public long findMinimumOperationSum(List<Person> personList) {
        int i=0;
        long sum = 0;
        PriorityQueue<Long> p = new PriorityQueue<>();
        while((i)!=personList.size()){
            p.add(personList.get(i).height);
            i++;
        }

        while(p.size()>1){
            long h1 = p.poll();
            long h2 = p.poll();
            sum = h1+h2+sum;
            p.add(h1+h2);
        }


        return sum;
    }
}
