/**
 *
 * @author AlcastraxGroup
 */

public class Giliran {
    Node head;

    class Node {
        Karakter karakter;
        Node next;

        Node(Karakter karakter) {
            this.karakter = karakter;
        }
    }

    // Insert Back
    public void masukJawara(Karakter karakter) {
        Node newKarakter = new Node(karakter);

        if (head == null) {
            head = newKarakter;
            head.next = head;
        } else {
            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            last.next = newKarakter;
            newKarakter.next = head;
        }
    }

    public void masukJawaraHead(Karakter karakter) {
        Node newKarakter = new Node(karakter);

        if (head == null) {
            head = newKarakter;
            head.next = head;
        } else {
            Node last = head;

            while (last.next != head) {
                last = last.next;
            }
            
            newKarakter.next = last;
            head = newKarakter;
        }
    }

    public void keluarJawara(Karakter karakter) {
        Node current = head;
        Node previous = null;

        if (head.karakter.equals(karakter)) {
            if (head.next == head) {
                head = null;
                return;
            }

            while (current.next != head) {
                current = current.next;
            }

            current.next = head.next;
            head = head.next;
            return;
        }

        do {
            previous = current;
            current = current.next;
        } while (current != head && !current.karakter.equals(karakter));

        if (current.karakter.equals(karakter)) {
            previous.next = current.next;
        }
    }
}