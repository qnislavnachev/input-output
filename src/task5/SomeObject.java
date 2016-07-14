package task5;

import java.io.Serializable;

public class SomeObject implements Serializable{
    public int size;
    public int weigth;

    public SomeObject(int size, int weigth) {
        this.size = size;
        this.weigth = weigth;
    }
}
