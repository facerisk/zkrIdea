//package test.special;
//
//import java.util.Scanner;
//class Node {
//    Node next;
//    int data;
//
//    public Node(Node next, int data) {
//        this.next = next;
//        this.data = data;
//    }
//
//    public Node(int data) {
//        this.data = data;
//    }
//
//    int date;
//
//}
//public class Lianbiao {
//    static Node head=new Node(1);
//    static void Init(int n){
//        Node s=head;
//        for(int i=2;i<=n;i++){
//            Node p=new Node(i);
//            s.next=p;s=s.next;
//        }
//        s.next=head;
//    }
//    static void pai(int m){
//        Node p=head;
//        Node q=null;
//        Node c=head;//注意头结点在过程中可能会直接被删除
//        for(int i=1;q!=p;i++){//当只剩余一个节点时停止
//            if(i==m){//每次到m时删除节点
//                System.out.println(p.data);
//                q.next=p.next;//上一个节点直接指向下下个节点
//                i=0;//初始化i
//                p=q.next;//将p指向q的下一个节点
//            }else {
//                q = p;p = p.next;//继续向下遍历
//            }
//        }
//        System.out.println(q.data);//输出为最后一个节点时的情况
//    }
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("输入");
//        int n=scanner.nextInt();
//        System.out.println("输入");
//        int m=scanner.nextInt();
//        Init(n);//初始化链表
//        if(n!=0)
//            pai(m);//对循环链表进行筛选删除
//    }
//}
///**
// * 7      7
// * 3      3
// * 11     11
// * 9      9
// * 8      8
// * 10     10
// * 2      2
// * 6      6
// * 1      1
// * 4      4
// * 5      5
// */
//
//
//
