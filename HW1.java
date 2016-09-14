/*
 * HW1 for Programming languages and Paradigms
 * Intentionally terrible code showcasing problems with side effects
 * Due 9/15/16
 */

public class HW1 {

    private static int square(Int i) {
	i.setVal(i.getVal() * i.getVal());
	return i.getVal();
    }

    private static int twice(Int i) {
	i.setVal(i.getVal() * 2);
	return i.getVal();
    }

    private static int once(Int i) {
	i.setVal(i.getVal());
	return i.getVal();
    }
    
    public static void main(String[] args) {
       	Int x = new Int(3);
	int y = square(x) + twice(x) + once(x); //y == 45, not 18
	System.out.println(y);
    }
}

class Int {
    private int val;

    public Int(int val) {
	this.val = val;
    }

    public int getVal() {
	return this.val;
    }

    public void setVal(int newVal) {
	this.val = newVal;
    }
}
