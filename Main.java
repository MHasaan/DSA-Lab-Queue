public class Main {
    public static void main(String[] args)
    {
        Queue_linked quee = new Queue_linked();
        quee.enqueue(12);
        quee.enqueue(13);
        quee.enqueue(14);
        quee.enqueue(15);
        quee.enqueue(16);
        quee.enqueue(17);

        int returned = quee.dequeue().data;
        System.out.println(returned);

        returned = quee.dequeue().data;
        System.out.println(returned);
        
        // returned = quee.dequeue().data;
        // System.out.println(returned);
        
        // returned = quee.dequeue().data;
        // System.out.println(returned);
        
        System.out.println(quee);
    }
}
