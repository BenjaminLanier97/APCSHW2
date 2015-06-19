import java.util.*
    
public class MyDeque<T>{
    private int Head, Tail, Size;
    private Object[] Objects;
    
    public MyDeque(){
        Size = 0;
        head = 11;
        tail = 10;
        Objects = new Objects[20];
        
        
        
    }
    
    public String name(){
        return "benjamin.lanier";
        
    }
    
    public void Resize(){
        
        
    }
    
    public void addFirst(T data){
        if (isFull()){
            Resize();
            
        }
        Size++;
        Head--;
        if (Head < 0){
            Head = Objects.length -1;
            
        }
        
	Objects[Head] = data;        
        
    }
    
    public void addLast(T data){
        
        
        
    }
    
    public T removeFirst(){
        
    }
    
    public T removeLast(){
        
    }
    
    public T getLast(){
        
               if (Size == 0){
            throw new NoSuchElementException();
            
        }
        
        return (T)Objects[Head];
        
        
        
    }
    
    public T getFirst(){
        if (Size == 0){
            throw new NoSuchElementException();
            
        }
        
        return (T)Objects[Tail];
        
        
    }
    
    public String toString(){
        
        
    }
    
    public boolean isFull(){
        while (int i = 0; i < Objects.length; i ++){
            if (Objects[i] = null){
                return false;
                
            }
            else{
                return true;
                
                
            }
            
            
        }
        
        
    }
    
    public static void main(String[] args){
        
        
    }




}