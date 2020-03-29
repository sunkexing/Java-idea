class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class MyLinkedList {
    public Node head=null;

    public MyLinkedList() {
        this.head = null;
    }


    //打印单链表
    public void disPlay(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        Node cur=this.head;
        if(this.head==null){
            this.head=node;
            return;
        }
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    //让一个引用走index-1步
    private Node Index(int index){
        Node cur=this.head;
        while (index-1>0){
            cur=cur.next;
            index=index-2;
        }
        return cur;
    }

    //求长度
    public int size(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //任意位置char，第一个节点为0号下表
    public void addIndex(int index,int data){
       // 1.判断index合法性
        if(index<0 || index>size()){
            throw new RuntimeException("插入位置不合法");
        }
        if(index==0){
            addFirst(data);
        }
        if(index==size()){
            addLast(data);
        }
        Node node=new Node(data);
        //让一个引用走index-1步
        Node prev=Index(index);
        if(prev!=null){
            node.next=prev.next;
            prev.next=node;
        }
    }

    //查找是否关键字key在单链表中
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //找前驱
    private Node findPrev(int key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }

    //删除第一个出现关键字为key的节点
    public void remove(int key){
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        Node prev=findPrev(key);
        if(prev==null){
            System.out.println("找不到要删除的节点");
        }
        Node del=prev.next;
        prev.next=del.next;
    }

    //删除所有关键字为key的节点
    public void removeAllKey(int key){
        Node prev=this.head;
        Node cur=this.head.next;
        while (cur!=null){
            if(cur.data==key){
               prev.next=cur.next;
               cur=cur.next;
            }else {
                cur=cur.next;
                prev=prev.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }

    }

    public void clean(){
        this.head=null;
    }


}
