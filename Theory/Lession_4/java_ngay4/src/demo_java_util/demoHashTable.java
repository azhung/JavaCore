package demo_java_util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Enumeration;
import java.util.Hashtable;


class Mobile{
    String id;
    String name;
    float price;

    public Mobile(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String toString(){
        return "Mobile Name:" +this.getName()+
                "\tPrice:"+this.getPrice();
    }
}
public class demoHashTable {
    Hashtable hTable;
    public demoHashTable(){
        hTable =new Hashtable();
     }
     public demoHashTable(int capa){
        hTable =new Hashtable(capa);
     }
     public void addMobile(Mobile mob){
         hTable.put(mob.getId(), mob);
     }
     public void displayAll(){
         Enumeration enuKey=hTable.keys();
         Enumeration enuValue=hTable.elements();
        // duyet truc tiep cac phan tu thong qua danh sach value
         while(enuValue.hasMoreElements()){
             Mobile mob=(Mobile)enuValue.nextElement();
             System.out.println(mob);
         }
         //duyet cac phan tu thong qua danh sach key
         while(enuKey.hasMoreElements()){
             Mobile mob=(Mobile)hTable.get(enuKey.nextElement()); //tu key phai lay lay ra value bang phuong thuc get()
             System.out.println(mob);
         }
     }

     public static void main(String[] args) {
        demoHashTable demo=new demoHashTable();
        Mobile mob1=new Mobile("M01", "Nokia 2100", 2000);
        Mobile mob2=new Mobile("M02", "Sam sung", 4000);
        demo.addMobile(mob1);
        demo.addMobile(mob2);
        demo.displayAll();

    }
     


}
