public class Data {
    private Integer[] a = null;
    private Integer[] b = null;

    private int size = 10;

    private static boolean isEmpty(Object[] obj){
        return obj == null;
    }

    public boolean isEmptyA(){
        return isEmpty(a);
    }

    public boolean isEmptyB(){
        return isEmpty(b);
    }

    public Integer[] getDataA(){
        return this.a;
    }

    public Integer[] getDataB(){
        return this.b;
    }


    public void initA() {
        a = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public void initB() {
        b = new Integer[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    public Integer[] sum() {
        Integer[] sum = new Integer[size];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }
        return sum;
    }

    public Integer[] multiply() {
        Integer[] multiply = new Integer[size];
        for (int i = 0; i < a.length; i++) {
            multiply[i] = a[i] * b[i];
        }
        return multiply;
    }

    public Integer[] reverse() {
        Integer[] reverse = new Integer[size];
        int counter = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            reverse[i] = a[counter];
            counter++;
        }
        return reverse;
    }
}
