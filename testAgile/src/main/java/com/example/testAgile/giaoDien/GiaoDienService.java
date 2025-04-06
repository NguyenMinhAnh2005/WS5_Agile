package com.example.testAgile.giaoDien;

import java.util.List;

public class GiaoDienService {

        public int demPhongTheoTrangThai(List<GiaoDien> ds, String trangThai) {
            int count = 0;
            for (GiaoDien g : ds) {
                if (g.getTrangThai().equalsIgnoreCase(trangThai)) {
                    count++;
                }
            }
            return count;
        }

        public long tongTienThue(List<GiaoDien> ds) {
            long sum = 0;
            for (GiaoDien g : ds) {
                if (g.getTrangThai().equalsIgnoreCase("Đang thuê")) {
                    sum += g.getTienThueThang();
                }
            }
            return sum;
        }
    }



