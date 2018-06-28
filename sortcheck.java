import java.util.Arrays;

public class sortcheck {

    boolean flag=true;
    private Object d;

    public void checksort(String [] a) {
        int len = a.length;
        String[] b = new String[len];
         b = sortequel(a);

         Arrays.sort(a);

        for (int i = 0; i < len - 1; i++)
            if (!b[i].equals(a[i])) {
                flag = false;
            }
    }
        public String[]  sortequel(String[] a){
        int len=a.length;
            int min = 0;
            String temp;
            for (min = 0; min < len - 1; min++) {
                for (int j = min + 1; j < len - 1; j++) {
                    if (a[min].compareTo(a[j]) != -1) {
                        temp = a[min];
                        a[min] = a[j];
                        a[j] = a[min];
                    }
                }

            }
           return a;
        }
    }


