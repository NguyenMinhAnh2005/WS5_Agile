package com.example.testAgile.giaoDien;

public class GiaoDien {
        private String tenPhong;
        private String tenKhachThue;
        private String soDienThoai;
        private String ngayBatDau;
        private long tienThueThang;
        private String trangThai;

        public GiaoDien(String tenPhong, String tenKhachThue, String soDienThoai, String ngayBatDau, long tienThueThang, String trangThai) {
            this.tenPhong = tenPhong;
            this.tenKhachThue = tenKhachThue;
            this.soDienThoai = soDienThoai;
            this.ngayBatDau = ngayBatDau;
            this.tienThueThang = tienThueThang;
            this.trangThai = trangThai;
        }

        public String getTrangThai() {
            return trangThai;
        }

        public long getTienThueThang() {
            return tienThueThang;
        }

        public String getTenPhong() {
            return tenPhong;
        }

        public String getTenKhachThue() {
            return tenKhachThue;
        }
    }


