class ListElement<E> {
    ListElement next;
    E data;
}

class List<E> {
    private ListElement head;
    private ListElement tail;

    void addFront(E data)
    {
        ListElement a = new ListElement();
        a.data = data;
        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void addBack(E data) {
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void printList()
    {
        ListElement t = head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    void delEl(E data)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        ListElement t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if(tail == t.next)
                {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        List ml = new List();
        ml.addBack(1.0);
        ml.addBack(2);
        ml.addBack(20);
        ml.addFront(6);

        ml.printList();
        System.out.println();
    }
}