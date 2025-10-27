import java.util.*;
public class dynamicStack extends CustomStack {
    public dynamicStack(){
        super();
    }
    public dynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        //this takes care of the stack when the stack is full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy the items of the stack to the new stack

            for(int i=0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        //At this point we know array is not full
        //Insert item
        return super.push(item);
    }

}
