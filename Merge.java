public class Merge {
    private static Comparable[] aux;

    public  static  void sort(Comparable [] a){
        //为数组分配空间
        aux=new Comparable[a.length-1];
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int low, int hi) {
        if(low>hi) return;
        int mid=low+(hi-low)/2;
        sort(a,low,mid);
        sort(a,mid+1,hi);
        merge(a,low,mid,hi);

    }

    private static void merge(Comparable[] a, int low, int mid, int hi) {
        int i=low,j=hi;
        for(int k=low;k<hi;k++){
            aux[k]=a[k];
        }
        for(int k=low;k<=hi;k++){
            if(i>mid) a[k]=aux[j++];
            else if(j>hi) a[k]=aux[i++];
            else if(less(aux[j],aux[i])) a[k]=aux[j++];
            else a[k]=aux[i++];
        }


    }

    private static boolean less(Comparable aux, Comparable aux1) {
        int flag=aux.compareTo(aux1);
        if(flag>0) return false;
        return true;
    }


}
