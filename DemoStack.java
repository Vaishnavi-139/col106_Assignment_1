import java.util.EmptyStackException;

public class DemoStack {
    Character[] base;
    int size = 0;

    public DemoStack(){
        super();
        base = new Character[10];
        
    }
    public void push(Character i){
        if (size == base.length){
            Character[] cae;
        cae = new Character[(size *2)];
        for(var m = 0; m< size; m++){
            cae[m] = base[m];
        }
        base = cae;
        base[size]= i;
        size = size +1;
    }
    else{
        base[size]= i;
        size = size +1;
    }
}

    public Character pop(){
        if (is_empty()){
            throw new EmptyStackException();
        }
        else{
            if (size <= base.length/4){
                Character[] cae;
            cae = new Character[(base.length /2)];
            for(var m = 0; m< size; m++){
                cae[m] = base[m];
            }
            base = cae;}
        Character value= base[size-1];
        size = size -1 ;
        return value ;
    }
}
    
    public Boolean is_empty(){
        if (size==0) {
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public Integer size(){
        return size;
    }
    
    public Character top(){
        if (is_empty()){
            throw new EmptyStackException();
        }
        else{
        return base[size-1];
    }
}

    public Character[] return_base_array(){
        return base;
    }
}
