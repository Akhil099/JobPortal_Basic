package JavaLrn;

public class LchLrn {
    public static void main(String[] args) {
        var num = 144;
        System.out.println(num);
        for(int i = 0; i < 5; ++i){
            System.out.println(i);
        }
        int j = 10;
        int l = ++j;
        System.out.println(l);
        System.out.println(j);
        int k = j++;
        System.out.println(k);
        int[] ar = new int[2];
        try{
            ar[2] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is the runtime error due to this exception: "+e);
        }
        finally {
            System.out.println("This is the last print statement");
        }

    }
}
