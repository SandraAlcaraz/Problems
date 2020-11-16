import java.util.EmptyStackException;

public class Stack<T> {

    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        public StackNode(T data){
            this.data=data;
        }
    }

    private StackNode<T> top;
    public T pop(){

        if(this.top==null){
            throw new EmptyStackException();
        }
        T item= top.data;
        this.top=this.top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> newTop = new StackNode<T>(item);
        newTop.next=this.top;
        this.top=newTop;
    }

    public T peek(){
        if(this.top==null){
            throw new EmptyStackException();
        }
        return this.top.data;
    }

    public boolean isEmpty(){
        return top==null;
    }
}
