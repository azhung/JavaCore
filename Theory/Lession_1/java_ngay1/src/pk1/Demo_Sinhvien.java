/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pk1;

/**
 *
 * @author Administrator
 */
public class Demo_Sinhvien {
    public static void main(String[] args) {
        Sinhvien a;//khai báo biến a kiểu dữ liệu là Sinhvien
        //a.hoten = "Nguyễn Văn Nam";//Lỗi vì a hiện tại có giá trị null vì chưa được tạo đối tượng nào gán cho nó
        a = new Sinhvien();//tạo đối tượng Sinhvien gán cho biến a
        a.hoten = "Nguyễn Văn Nam";
        a.tuoi =20;
        a.hienthi();
        Sinhvien b = new Sinhvien();//vừa khai báo biến vừa tạo đối tượng gán cho biến
        b.hoten = "Trần Thị Thơm";
        b.tuoi = 18;
        b.hienthi();
        //gọi hàm nhập và hiển thị lại
        System.out.println("Nhập sinh viên a");
        a.nhapthongtin();
        System.out.println("Thông tin sinh viên a:");
        a.hienthi();
        //sử dụng hàm tạo
        Sinhvien c = new Sinhvien("Lê Văn Dũng",19);
        Sinhvien d = new Sinhvien("Trần Quốc Dũng");
    }

}
