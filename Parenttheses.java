import java.io.*;
import java.util.Stack;


public class Parenttheses {
    Stack<String > ss=new Stack<String >();
    String string=readfile();
    String [] inputs=string .split("");


   public String  chuli(String [] inputs){
       for(String input:inputs) {
           if (input.equals("—") || input.equals("{") || inputs.equals("[")) {
               ss.push(input);
           }else if(!ss.isEmpty()){
               if(input.equals("d")){

               }
               if (input.equals("h")){

               }

           }
       }
       return null;
   }



    public String  readfile() {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             return reader.readLine();
        } catch (Exception e){

            e.printStackTrace();

        }
  return null;
    }
    public String   readme(){
        try  {
            InputStream input=new FileInputStream("ts.txt");
            InputStreamReader inputreader=new InputStreamReader(input);
            BufferedReader bufferedReader=new BufferedReader(inputreader);
            String back=bufferedReader.readLine();
            return back;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
