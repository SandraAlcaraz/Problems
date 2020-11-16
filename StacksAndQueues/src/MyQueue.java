import java.util.NoSuchElementException;

public class MyQueue <T> {
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;


        public QueueNode(T data){
            this.data= data;
        }
    }
    private QueueNode<T> first;
    private QueueNode<T> last;


    public void add(T data){
        QueueNode <T> newNode= new QueueNode(data);
        if(this.last!= null){
            this.last.next= newNode;
        }
        this.last=newNode;
        if(this.first==null){
            this.first=this.last;
        }

    }
    public T remove(){
        if(first==null){
            throw new NoSuchElementException();
        }
        T dataTemporal= this.first.data;
        this.first=this.first.next;
        if(this.first==null){
            this.last=null;
        }
        return dataTemporal;
    }
    public T peek(){
        if(this.first==null){
            throw new NoSuchElementException();
        }
        return  this.first.data;
    }
    public boolean isEmpty(){
        return  this.first.data==null;
    }

}
