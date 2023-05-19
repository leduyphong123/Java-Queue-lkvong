public class Queue {
    private class Node{
        public int data;
        Node link;
        Node(int data){
            this.data=data;
        }
    }
    public int size=0;

    Node font;
    Node rear;
    Queue(){
        font=null;
        rear=null;
    }
    public void enQueue(int data){
        if(isEmtry()){
            font=rear=new Node(data);
            rear.link=font;
            size+=1;
        }else {
            Node temp=font;
            for(int i=0;i<size-1;i++){
                    temp=temp.link;
            }
            temp.link=new Node(data);
            temp.link.link=rear;
            size+=1;
        }

    }
    public void deQueue(){
        if (isEmtry()){
            return;
        }
        if (size==1){
            font=rear=null;
            size=0;
            return;
        }
        Node temp=font;
        rear=temp.link;
        font=temp.link;
        size-=1;
    }
    public void displayQueue(){
        Node temp=font;
        for (int i=0;i<size;i++){
            System.out.println(temp.data);
            temp=temp.link;
        }
    }
    private boolean isEmtry(){
        return font==null && rear==null;
    }
}
