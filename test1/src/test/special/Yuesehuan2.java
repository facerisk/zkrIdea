package test.special;
// 定义链表节点
class Node{
    int date;
    Node next;

    public Node(int date) {
        this.date = date;
    }
}
public class Yuesehuan2 {
    public static  void main(String[]args){
        System.out.println("hehe:"+solve(11,7));
    }
    public static int solve(int n, int m) {
        if(m == 1 || n < 2)
            return n;
        // 创建环形链表
        Node head = createLinkedList(n);
        // 遍历删除
        int count = 1;
        Node cur = head;
        Node pre = null;//前驱节点
        while (head.next != head ) {
            // 删除节点
            if (count == m) {
                count = 1;
                System.out.println(cur.date);
                pre.next = cur.next;
                cur = pre.next;
            } else {
                count++;
                pre = cur;
                cur = cur.next;
            }
            if(cur.next == cur.next.next)
                break;
        }
        return cur.date;
    }

    static Node createLinkedList(int n) {
        Node head = new Node(1);
        Node next = head;
        for (int i = 2; i <= n; i++) {
            Node tmp = new Node(i);
            next.next = tmp;
            next = next.next;
        }
        // 头尾串联
        next.next = head;
        return head;
    }
}
