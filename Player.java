/**
 *
 * @author AlcastraxGroup
 */

public class Player {
    Node front, rear;

    class Node {
        Karakter karakter;
        Node next;

        Node(Karakter karakter) {
            this.karakter = karakter;
        }
    }

    public void pilihJawara(Karakter karakter) {
        Node newKarakter = new Node(karakter);

        if (rear == null) {
            front = rear = newKarakter;
            return;
        }

        rear.next = newKarakter;
        rear = newKarakter;
    }

    public Karakter masukJawara() {
        Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return temp.karakter;
    }

    public int hitungKarakter() {
        int jumlah = 0;
        Node current = front;

        while (current != null) {
            jumlah++;
            current = current.next;
        }

        return jumlah;
    }

    public boolean cekKarakter(Karakter karakter) {
        Node current = front;

        while (current != null) {
            if (current.karakter.equals(karakter)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }
}