package Day_4;

public class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val)
        {
            if(size==0)
            {
                Node temp = new Node();
                temp.data= val;
                temp.next=null;

                head=tail=temp;
                size++;
            }
            else {
                Node temp = new Node();
                temp.data= val;
                temp.next=null;

                tail.next=temp;
                tail=temp;
                size++;
            }
        }

        public int size()
        {
            return size;
        }

        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
        }


        public int getFirst()
        {
            if(size == 0)
            {
                System.out.println("list is empty");
                return -1;
            }
            else
            {
                return head.data;
            }
        }

        public int getLast()
        {
            if(size==0)
            {
                System.out.println("List is empty");
                return -1;
            }
            else {
                return head.data;
            }
        }

        public int getAt(int idx)
        {
            if(size == 0)
            {
                System.out.println("list is empty");
                return  -1;
            }
            else if(idx<0 || idx>=size)
            {
                System.out.println("Invalid Argument");
                return -1;
            }
            else {
                Node temp = head;
                for(int i=0;i<idx;i++)
                {
                    temp=temp.next;
                }
                return  temp.data;
            }
        }

        public void addFirst(int val)
        {
            Node temp = new Node();
            temp.data= val;
            temp.next=head;
            head= temp;

            if(size==0) {
                tail = temp;

            }

            size++;
        }

        public void addAtIdx(int val, int idx)
        {
            if(size==0)
            {
                addFirst(val);
            }
            else if(idx==size)
            {
                addLast(val);
            }
            else if(idx<0 || idx>size)
            {
                System.out.println("invalid argument");
            }
            else {
                Node temp = new Node();
                temp.data=val;
                temp.next = null;

                Node t = head;
                for(int i =0 ; i<idx;i++)
                {
                    t=t.next;
                }

                temp.next=t.next;
                t.next=temp;
                size++;
            }
        }

        public void removeLast()
        {
            if(size==0)
            {
                System.out.println("list is empty");
            }
            else if(size == 1)
            {
                head = tail= null;
                size =0;
            }
            else {

                Node temp = head;
                for(int i=0 ; i<size-2;i++)
                {
                    temp=temp.next;
                }

                temp.next=null;
                tail=temp;
                size--;
            }
        }

        public void removeFirst()
        {
            if(size==0)
            {
                System.out.println("List is empty");
            }
            else if(size == 1)
            {
                head = tail = null;
                size = 0;
            }
            else
            {
                head = head.next;
                size--;
            }
        }

        public void removeAt(int idx)
        {
            if(size==0)
            {
                System.out.println("List is empty");
            }
            else if(idx<0 || idx>=size)
            {
                System.out.println("invalid argument");
            }
            else if(size==1)
            {
                removeFirst();
            }
            else if(idx==size-1)
            {
                removeLast();
            }
            else {
                Node temp = head;
                for(int i=0 ; i<idx-1;i++)
                {
                    temp=temp.next;
                }

                temp.next=temp.next.next;

                size--;
            }
        }

        public void reverse()
        {
            Node curr= head;
            Node prev = null;

            while(curr!=null)
            {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr= next;
            }

            Node temp = head;
            head = tail;
            tail= head;

        }

        public int mid()
        {
            Node s= head;
            Node f = head;

            while(f.next!=null && f.next.next!=null)
            {
                f=f.next.next;
                s=s.next;
            }

            return s.data;
        }

        public LinkedList mergeTwoSortedLinkedList(LinkedList a , LinkedList b)
        {
            Node one = a.head;
            Node two = b.head;

            LinkedList res = new LinkedList();

            while(one!= null && two!=null)
            {
                if(one.data<two.data)
                {
                    res.addLast(one.data);
                    one=one.next;
                }
                else {
                    res.addLast(two.data);
                    two=two.next;
                }
            }

            while(one!=null)
            {
                res.addLast(one.data);
                one=one.next;
            }

            while(two!=null)
            {
                res.addLast(two.data);
                two=two.next;
            }

            return res;
        }

        public void removeDuplicates()
        {
            LinkedList l = new LinkedList();

            while(this.size>0)
            {
                int val = this.getFirst();
                this.removeLast();

                if(l.size==0 || l.tail.data!=val)
                {
                    l.addLast(val);
                }
            }

            this.head=l.head;
            this.size=l.size;
            this.tail=l.tail;
        }

        public int nthFromLast(int n)
        {
            Node s = head;
            Node f= head;

            for(int i=0;i<n;i++)
            {
                f=f.next;
            }

            while(f!=tail)
            {
                s=s.next;
                f=f.next;
            }

            return s.data;
        }

        public void splitIntoTwo()
        {
            LinkedList L1 = new LinkedList();
            LinkedList L2 = new LinkedList();

            int p =0 ;
            int q =0;

            if(this.size%2 == 0)
            {
                p=q=this.size/2;
            }
            else {
                p=(this.size/2)+1;
                q=this.size-p;
            }

            for(int i = 0; i<p ; i++)
            {
                int val = this.getAt(i);
                L1.addLast(val);
            }

            for(int j=p;j<this.size;j++)
            {
                int val = this.getAt(j);
                L2.addLast(val);
            }

            L1.display();
            L2.display();
        }

        public void detectACycle()
        {
            Node f= head;
            Node s= head;

            int flag=0;
            while(s!=null && f!=null && f.next!=null)
            {
                f=f.next.next;
                s=s.next;
                if(s==f)
                {
                    flag =1;
                    break;
                }
            }
            if(flag == 1)
            {
                System.out.println("List has a cycle ");
            }
            else {
                System.out.println("list has not cycle");
            }
        }

        public int addHelper(Node one , int pv1 , Node two , int pv2 , LinkedList res)
        {
            int data=0;
            if(one== null && two == null)
            {
                return 0;
            }
            if(pv1>pv2)
            {
                int oc = addHelper(one.next,pv1-1, two , pv2,res);
                data= one.data + oc;
            }
            else if(pv2>pv1)
            {
                int oc = addHelper(one,pv1,two.next,pv2-1,res);
                data = two.data+oc;
            }
            else {
                int oc = addHelper(one.next, pv1-1, two.next,pv2-1,res);
                data = one.data + two.data + oc;
            }


            int nd = data%10;
            int nc = data/10;
            res.addFirst(nd);
            return nc;
        }
        public LinkedList addTwoLinkedList(LinkedList l1 , LinkedList l2)
        {
            LinkedList l = new LinkedList();

            int oc= l.addHelper(l1.head, l1.size, l2.head, l2.size, l);
            if(oc>0)
            {
                l.addFirst(oc);
            }
            return l;
        }

        public void rotate (int k)
        {
            if(k==0 )
                return;

            Node temp = head;
            Node last = tail;
            while(k!=0)
            {
                head = head.next;
                temp.next = null;
                last.next = temp;
                last = tail = temp;
                temp=head;
                k--;
            }

        }
}

