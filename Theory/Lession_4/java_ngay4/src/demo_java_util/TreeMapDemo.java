package demo_java_util;




import java.util.*;


public class TreeMapDemo {

     /** Creates a new instance of MapDemo */
    public TreeMapDemo() {
    }

    public static void main(String[] args) {
        //TreeMap la dang du lieu tu dien, khi chen vao ta phai chen 1 cap (key,value)
        //Neu nhu 1 phan moi trung key voi phan tu da co thi no se ghi de len phan tu da co
        TreeMap hm = new TreeMap();
        TreeMap<String,Integer> hm2 = new TreeMap<String,Integer>();//key có kiểu là String, value có kiểu là Integer
        hm.put("cat", "con meo");
        hm.put("apple", "qua tao");
        hm.put("ball", "qua bong");
        hm.put("ball", "bong");

        System.out.println("Size of hm:" + hm.size());

        String b = (String)hm.get("ball");
        System.out.println(b);

        //Tim kiem xem TreeMap co chua 1 key hay khong?
        boolean b1 = hm.containsKey("home");
        System.out.println(b1);//khong tim thay, b1 se la false

        //hm.keySet() tra ve danh sach cac key cua hm
        for (Object k : hm.keySet()) //tu dong duyet tat ca cac key cua TreeMap
        {
            String v = (String) hm.get(k); //tra ve value cua key tuong ung
            System.out.println(k + ":" + v);
        }
    }
}
            

