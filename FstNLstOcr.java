//Program to find the first and last occurence of an element using recursion

public class FstNLstOcr {
    public static int first = -1;
    public static int last = -1;
    public static void getIndices(String str, char el, int idx){
        if(idx == str.length()){
            return;
        }
        if(str.charAt(idx)==el){
            if(first==-1){
                first = idx;

            }
            else {
                last = idx;
            }
        }
        getIndices(str, el, idx+1);
    }
    public static void main(String args[]){
        String str="tabcdfghijakkk";
        char el = 'a';
        getIndices(str, el, 0);
        System.out.println("First number : "+first);
        System.out.println("Last occurence : "+last);
    }
}
