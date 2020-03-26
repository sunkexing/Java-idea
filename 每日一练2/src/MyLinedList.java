//节点类
class Node {
    public int data;
    public Node next;

    //来个构造方法
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


//单链表
public class MyLinedList {

    public Node head;
    //构造方法
    public MyLinedList(){

    }

    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;//很关键，不然会死循环
        }
        node.next=head;
        this.head=node;
    }

    //打印
    public void disPlay(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;//很关键，不然会死循环
        }
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    //任意位置插入，第一个节点为0号下标
    public void addIndex(int index,int data){
        if(index<0 || index>size()){
            throw new RuntimeException("非法位置，无法插入");
        }
        if(index==0){
            addFirst(data);
            return;//切记
        }
        if(index==size()){
            addLast(data);
            return;
        }
        //先创建一个引用：这个任意位置前一个位置
        Node prev=findIndex(index);

        //先让插入的地址等于这个任意位置后面的地址
        //再让这个位置的地址等于插入的地址
        Node node=new Node(data);
        node.next=prev.next;
        prev.next=node;
    }

    //一个引用走index-1步
    private Node findIndex(int index){
        Node cur=this.head;
        int count=0;
        while (count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    //得到单链表的长度
    public int size(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //查找是否包含关键字key在单链表当中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        //引入这个关键字的前驱
        Node prev=findPrev(key);
        //如果前驱为空
        if(prev==null){
            System.out.println("没有这个节点");
            return;
        }
        //若不为空，引入del节点(他的地址就是前驱的下一个地址)
        Node del=prev.next;
        //让前驱的地址等于他的地址，取代他，达成删除效果
        prev.next=del.next;
    }

    //找关键字key的前驱
    private Node findPrev(int key){
        Node prev=this.head;
        while (prev.next!=null){
            if(prev.next.data==key){
                return prev;
            }
            prev=prev.next;
        }
        return null;//没有前驱，返回空
    }

    //删除出现所有关键字为key的节点
    public void removeAllkey(int key){
        Node prev=this.head;
        Node cur=this.head.next;
        while (cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else {
                prev=prev.next;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }

}
