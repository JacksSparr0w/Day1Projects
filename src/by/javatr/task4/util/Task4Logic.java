package by.javatr.task4.util;

public class Task4Logic {
    final static public int LENGTH = 4;
    private int[] params = new int[LENGTH];
    private boolean function;

    public Task4Logic() {
        //
    }

    public void setParams(int[] params) {
        System.arraycopy(params, 0, this.params, 0, LENGTH);
    }

    public void findFunction() {
        //счетчик четных чисел
        int k = 0;
        for (int x : params)
            if (isEven(x)) k++;

        if (k > 1) {
            function = true;
        }
        else {
            function = false;
        }


    }

    private boolean isEven(int x) {
        if (x % 2 == 0) return true;
        return false;
    }

    public boolean getFunction() {
        return function;
    }
}
