class  Node{
    public int data;
    public Node prev;
    public Node next;

    public Node(int data) {
        this.data = data;
    }//不设置就会默认生成
}

//无头双向非循环链表
public class DoubleLinkedList {
    public Node head;
    public Node last;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null ){
            this.head=node;
            this.last=node;
        }else {//有else，不加return，如果没有else ，必须加return！！！
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }
    }
    public void disPlay(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else {
            this.last.next=node;
            node.prev=this.last;
            this.last=node;
        }

    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0 || index>size()){
            throw new RuntimeException("插入位置不合法");
        }
        if(index ==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        Node node=new Node(data);
        Node cur=this.head;
        while (index>0){
            cur=cur.next;
            index--;
        }
        node.next=cur;
        node.prev=cur.prev;
        cur.prev=node;
        node.prev.next=node;
    }
    //查找是否包含关键字key是否在单链表当中
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
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //删除第一次出现关键字为key的节点
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur==this.last){
                    cur.prev.next=null;
                    last=cur.prev;
                }else{
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return ;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        //删除第一次出现关键字为key的节点
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur==this.last){
                    cur.prev.next=null;
                    last=cur.prev;
                }else{
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int count=0;
        Node cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    public void clear(){
        this.head=null;
        this.last=null;
    }
}
