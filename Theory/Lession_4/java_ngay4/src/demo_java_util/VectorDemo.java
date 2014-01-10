package demo_java_util;



import java.util.Vector;


public class VectorDemo {
    
    /** Creates a new instance of VectorDemo */
    public VectorDemo() {
    }
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add(new Integer(1));
        
        System.out.println ("So phan tu: "+v.size());
        
        System.out.println ("Phan tu thu 2 la:"+v.elementAt(2));
        System.out.println ("Phan tu thu 2 la:"+v.get(2));
        //xoa tat ca cac phan tu
        v.clear();
        System.out.println ("So phan tu sau khi xoa: "+v.size());
    }
}
