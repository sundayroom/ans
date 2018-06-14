public class Operator {

    int priority=-1;
    String value;

    public  String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value=value;
        if (value.equals("+")||value.equals("-")){
            this.priority=1;
        }
        if (value.equals("*")||value.equals("/")){
            this.priority=2;
        }
        if (value.equals("(")||value.equals(")")){
            this.priority=3;
        }
        if (value.equals("=")){
            this.priority=0;
        }

    }
    public int getPriority(){
        return priority;
    }
    public void setPriority(int priority){
        this.priority=priority;
    }
}
