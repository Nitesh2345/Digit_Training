package Day_4;


    public class Main {
        public static void main(String [] args)
        {
            LinkedList l = new LinkedList();
            l.addLast(10);
            l.addLast(20);
            l.addLast(30);
            l.addLast(40);
            //l.addLast(50);
            l.display();
            //l.splitIntoTwo();
            l.rotate(2);
            l.display();

        }
    }
