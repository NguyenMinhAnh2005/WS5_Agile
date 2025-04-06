package giaoDien;

import com.example.testAgile.giaoDien.GiaoDien;
import com.example.testAgile.giaoDien.GiaoDienService;

import java.util.ArrayList;
import java.util.List;

public class GiaoDienTest {

        public static void main(String[] args) {
            // Tạo mock data
            List<GiaoDien> danhSach = new ArrayList<>();
            danhSach.add(new GiaoDien("101", "Nguyễn Văn A", "0909123456", "01/01/2025", 6000000, "Đang thuê"));
            danhSach.add(new GiaoDien("102", "Trần Thị B", "0911223344", "10/02/2025", 6500000, "Đang thuê"));
            danhSach.add(new GiaoDien("103", "-", "-", "-", 6000000, "Trống"));

            GiaoDienService service = new GiaoDienService();

            // Kiểm tra tổng số phòng
            int tongSoPhong = danhSach.size();
            System.out.println("Tổng số phòng: " + tongSoPhong + " → " + (tongSoPhong == 3 ? "PASSED" : "FAILED"));

            // Kiểm tra phòng đã thuê
            int soPhongDaThue = service.demPhongTheoTrangThai(danhSach, "Đang thuê");
            System.out.println("Phòng đã thuê: " + soPhongDaThue + " → " + (soPhongDaThue == 2 ? "PASSED" : "FAILED"));

            // Kiểm tra phòng trống
            int soPhongTrong = service.demPhongTheoTrangThai(danhSach, "Trống");
            System.out.println("Phòng trống: " + soPhongTrong + " → " + (soPhongTrong == 1 ? "PASSED" : "FAILED"));

            // Kiểm tra tổng tiền thuê tháng
            long tongTien = service.tongTienThue(danhSach);
            System.out.println("Tổng tiền thuê tháng này: " + tongTien + "đ → " + (tongTien == 12500000 ? "PASSED" : "FAILED"));
        }
    }


