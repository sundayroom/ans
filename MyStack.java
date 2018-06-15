public class MyStack<T> {
    Object[] array = new Object[1];//创建个对象
    int count = 0;//数组个数,栈的长度
    private Object topOfStack = "-1";
    boolean flag=true;
    public void show() {
        Object o = new Object();

        Operator operator = new Operator();
        for (int i = 0; i < array.length; i++) {
            o = array[i];
            if (o instanceof Operator) {
                Operator ceshi = (Operator) o;
                if (!(ceshi.value.equals("(")) && !(ceshi.value.equals(")"))) {
                    System.out.println("" + ceshi.value);
                }
            } else {
                System.out.println("Value:" + o);
            }
        }
    }

    public void push(Object o) {
        if(count==0){
            array[count]=o;
        }else{
            Object []arraynew=new Object[count+1];
            for(int i=0;i<array.length;i++){
                arraynew[i]=array[i];
            }
            arraynew[count+1]=o;
            array=arraynew;
        }
        count++;
        topOfStack=o;

    }

    public Object next() {
        if(count-1>=0){
            return array[count-1];
        }
        return "无元素可返回";

    }
    public boolean hasnext(Object num){
        if(count!=0){
            flag=false;
        }
       return flag;
    }

    public Object pop() {
        Object [] arraynew=new Object[count-1];
        if (count==0){
            try{
                throw new Exception("栈为空时不能pop");
            }catch(Exception e){
                e.printStackTrace();
            }
            return "无元素可pop";
        }else{
            if(count==1){
                topOfStack=array[0];
                count--;
            }else{
                for(int i=0;i<arraynew.length-1;i++){
                    arraynew[i]=array[i];
                }
                array=arraynew;
                count--;
                topOfStack=array[count];
            }
        }
        return topOfStack;
    }
    public Object top(){
        if(count==0){
            try{
                throw new Exception("栈为空时不能pop");
            }catch(Exception e){
                e.printStackTrace();
            }
            return "无元素可pop";
        }else{
            if(count==1){
                topOfStack=array[0];
            }else{
                topOfStack=array[count-1];
            }
        }
        return topOfStack;
    }
}