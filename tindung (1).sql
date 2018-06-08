-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 08, 2018 lúc 07:20 PM
-- Phiên bản máy phục vụ: 10.1.30-MariaDB
-- Phiên bản PHP: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `tindung`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `anhkhachhang`
--

CREATE TABLE `anhkhachhang` (
  `Ma` int(11) NOT NULL,
  `DuongDan` varchar(1000) NOT NULL,
  `MaKhachHang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `anhtaisan`
--

CREATE TABLE `anhtaisan` (
  `Ma` int(11) NOT NULL,
  `MaTaiSanHopDong` int(11) NOT NULL,
  `DuongDan` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `batho`
--

CREATE TABLE `batho` (
  `MaHopDong` int(11) NOT NULL,
  `TienDuaKhach` decimal(15,0) NOT NULL,
  `TongTien` decimal(15,0) NOT NULL,
  `TongSoNgay` smallint(5) UNSIGNED NOT NULL,
  `ChuKyDongTien` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `maChucVu` int(11) NOT NULL,
  `chucvu` varchar(200) NOT NULL,
  `mota` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cuahang`
--

CREATE TABLE `cuahang` (
  `MaCuaHang` int(11) NOT NULL,
  `TenCuahang` varchar(30) NOT NULL,
  `SoDienThoai` varchar(15) NOT NULL,
  `DiaChi` varchar(100) NOT NULL,
  `NguoiDaiDien` varchar(50) NOT NULL,
  `VonDauTu` decimal(15,2) UNSIGNED DEFAULT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT '1',
  `NgayTao` date NOT NULL,
  `MaDiaChi` int(11) NOT NULL,
  `QuyTienMat` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `databasechangelog`
--

CREATE TABLE `databasechangelog` (
  `ID` varchar(255) NOT NULL,
  `AUTHOR` varchar(255) NOT NULL,
  `FILENAME` varchar(255) NOT NULL,
  `DATEEXECUTED` datetime NOT NULL,
  `ORDEREXECUTED` int(11) NOT NULL,
  `EXECTYPE` varchar(10) NOT NULL,
  `MD5SUM` varchar(35) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(255) DEFAULT NULL,
  `TAG` varchar(255) DEFAULT NULL,
  `LIQUIBASE` varchar(20) DEFAULT NULL,
  `CONTEXTS` varchar(255) DEFAULT NULL,
  `LABELS` varchar(255) DEFAULT NULL,
  `DEPLOYMENT_ID` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `databasechangeloglock`
--

CREATE TABLE `databasechangeloglock` (
  `ID` int(11) NOT NULL,
  `LOCKED` bit(1) NOT NULL,
  `LOCKGRANTED` datetime DEFAULT NULL,
  `LOCKEDBY` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `databasechangeloglock`
--

INSERT INTO `databasechangeloglock` (`ID`, `LOCKED`, `LOCKGRANTED`, `LOCKEDBY`) VALUES
(1, b'0', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dongtien`
--

CREATE TABLE `dongtien` (
  `Ma` int(11) NOT NULL,
  `MaHopDong` int(11) NOT NULL,
  `NgayBatDau` date NOT NULL,
  `NgayKetThuc` date NOT NULL,
  `SoTien` decimal(15,2) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ghino`
--

CREATE TABLE `ghino` (
  `Ma` int(11) NOT NULL,
  `NgayGhi` date NOT NULL,
  `SoTien` decimal(15,0) NOT NULL,
  `NoTra` enum('ghino','trano') NOT NULL,
  `MaHopDong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `gopvon`
--

CREATE TABLE `gopvon` (
  `Ma` int(11) NOT NULL,
  `NhaDauTu` varchar(100) NOT NULL,
  `DiaChi` varchar(100) NOT NULL,
  `SoDienThoai` varchar(15) DEFAULT NULL,
  `MaCuaHang` int(11) NOT NULL,
  `SoTien` decimal(15,2) NOT NULL,
  `HinhThucTinhLai` tinyint(1) NOT NULL,
  `GhiChu` varchar(450) DEFAULT NULL,
  `SoLai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hopdong`
--

CREATE TABLE `hopdong` (
  `Ma` int(11) NOT NULL,
  `MaKhachHang` int(11) NOT NULL,
  `NgayLap` date NOT NULL,
  `GhiChu` varchar(300) DEFAULT NULL,
  `MaNhanVien` int(11) NOT NULL,
  `LoaiHopDong` tinyint(1) NOT NULL DEFAULT '1',
  `MaCuaHang` int(11) NOT NULL,
  `MaHopDongGoc` int(11) DEFAULT NULL,
  `TrangThai` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `huyen`
--

CREATE TABLE `huyen` (
  `Ma` int(11) NOT NULL,
  `Ten` int(11) NOT NULL,
  `MaTinh` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKhachHang` int(11) NOT NULL,
  `TenKhachHang` varchar(50) NOT NULL,
  `DiaChi` varchar(50) DEFAULT NULL,
  `DienThoai` varchar(15) DEFAULT NULL,
  `CMND` int(11) DEFAULT NULL,
  `MaCuaHang` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT '1',
  `NgayTao` date NOT NULL,
  `MaDiaChi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lichsuthaotachopdong`
--

CREATE TABLE `lichsuthaotachopdong` (
  `Ma` int(11) UNSIGNED NOT NULL,
  `ThoiGian` datetime NOT NULL,
  `MaNhanVienThucHien` int(11) NOT NULL,
  `NoiDung` varchar(300) NOT NULL,
  `MaHopDong` int(11) NOT NULL,
  `SoTien` decimal(15,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` int(11) NOT NULL,
  `TenDangNhap` varchar(50) NOT NULL,
  `MatKhau` varchar(300) NOT NULL,
  `TenNhanVien` varchar(100) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `SoDienThoai` varchar(15) DEFAULT NULL,
  `MaCuaHang` int(11) DEFAULT NULL,
  `TrangThai` tinyint(1) NOT NULL DEFAULT '1',
  `NgayTao` date NOT NULL,
  `ChucVu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quyen`
--

CREATE TABLE `quyen` (
  `maQuyen` int(11) NOT NULL,
  `quyen` varchar(300) NOT NULL,
  `mota` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quyenchucvu`
--

CREATE TABLE `quyenchucvu` (
  `ma` int(11) NOT NULL,
  `maQuyen` int(11) NOT NULL,
  `maChucVu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taisan`
--

CREATE TABLE `taisan` (
  `MaTaiSan` int(11) NOT NULL,
  `TenTaiSan` varchar(200) NOT NULL,
  `GhiChu` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taisanhopdong`
--

CREATE TABLE `taisanhopdong` (
  `Ma` int(11) NOT NULL,
  `ThongTin` varchar(100) NOT NULL,
  `MaHopDong` int(11) NOT NULL,
  `MaTaiSan` int(11) NOT NULL,
  `NoiLuuTru` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thuchi`
--

CREATE TABLE `thuchi` (
  `Ma` int(11) UNSIGNED NOT NULL,
  `NoiDung` varchar(45) NOT NULL,
  `ThuChi` tinyint(1) NOT NULL,
  `CacLoaiThuChi` tinyint(2) DEFAULT NULL,
  `MaNhanVienThucHien` int(11) NOT NULL,
  `SoTien` decimal(15,0) DEFAULT NULL,
  `MaCuaHang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinh`
--

CREATE TABLE `tinh` (
  `Ma` int(11) NOT NULL,
  `Ten` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vaylai`
--

CREATE TABLE `vaylai` (
  `MaHopDong` int(11) NOT NULL,
  `TienVay` decimal(15,0) NOT NULL COMMENT 'Tổng tiền gốc khách hàng vay',
  `HinhThucLai` enum('ngay','tuan','thang','nam','thangcodinh') NOT NULL,
  `ThoiGianVay` smallint(6) NOT NULL COMMENT 'Tổng số thời gian vay theo hình thức lãi',
  `ChuKyLai` smallint(6) NOT NULL COMMENT 'Số chu kỳ lãi',
  `Lai` decimal(15,0) NOT NULL COMMENT 'Tiền lãi tính trên 1 chu kỳ cho 1 triệu',
  `KieuTinhLai` enum('mottrieu','chuky','phantram','') NOT NULL COMMENT 'tính tiền lãi theo 3K 1 triệu 1 ngày, theo 3K/1 chuky, theo phàn trăm chu kỳ'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `xa`
--

CREATE TABLE `xa` (
  `ma` int(11) NOT NULL,
  `ten` int(11) NOT NULL,
  `mahuyen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `anhkhachhang`
--
ALTER TABLE `anhkhachhang`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaKhachHang` (`MaKhachHang`);

--
-- Chỉ mục cho bảng `anhtaisan`
--
ALTER TABLE `anhtaisan`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaTaiSanHopDong_idx` (`MaTaiSanHopDong`);

--
-- Chỉ mục cho bảng `batho`
--
ALTER TABLE `batho`
  ADD PRIMARY KEY (`MaHopDong`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`maChucVu`);

--
-- Chỉ mục cho bảng `cuahang`
--
ALTER TABLE `cuahang`
  ADD PRIMARY KEY (`MaCuaHang`),
  ADD KEY `MaDiaChi` (`MaDiaChi`);

--
-- Chỉ mục cho bảng `databasechangeloglock`
--
ALTER TABLE `databasechangeloglock`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `dongtien`
--
ALTER TABLE `dongtien`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `DongTien_HopDongBatHo_fkey` (`MaHopDong`);

--
-- Chỉ mục cho bảng `ghino`
--
ALTER TABLE `ghino`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaHopDong` (`MaHopDong`);

--
-- Chỉ mục cho bảng `gopvon`
--
ALTER TABLE `gopvon`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaCuaHang_idx` (`MaCuaHang`);

--
-- Chỉ mục cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `HopDongBatHo_KhachHang_fkey` (`MaKhachHang`),
  ADD KEY `MaNhanVien` (`MaNhanVien`),
  ADD KEY `cuahang_fk` (`MaCuaHang`),
  ADD KEY `MaHopDongGoc` (`MaHopDongGoc`);

--
-- Chỉ mục cho bảng `huyen`
--
ALTER TABLE `huyen`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaTinh` (`MaTinh`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKhachHang`),
  ADD KEY `KhachHang_CuaHang_fkey` (`MaCuaHang`),
  ADD KEY `madiachi` (`MaDiaChi`);

--
-- Chỉ mục cho bảng `lichsuthaotachopdong`
--
ALTER TABLE `lichsuthaotachopdong`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaNhanVien_idx` (`MaNhanVienThucHien`),
  ADD KEY `MaHopDong_idx` (`MaHopDong`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNhanVien`),
  ADD UNIQUE KEY `UN_TenDangNhap` (`TenDangNhap`),
  ADD KEY `NhanVien_CuaHang_fkey` (`MaCuaHang`),
  ADD KEY `ChucVu_idx` (`ChucVu`);

--
-- Chỉ mục cho bảng `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`maQuyen`);

--
-- Chỉ mục cho bảng `quyenchucvu`
--
ALTER TABLE `quyenchucvu`
  ADD PRIMARY KEY (`ma`),
  ADD KEY `quyen_idx` (`maQuyen`),
  ADD KEY `chucVu_idx` (`maChucVu`);

--
-- Chỉ mục cho bảng `taisan`
--
ALTER TABLE `taisan`
  ADD PRIMARY KEY (`MaTaiSan`);

--
-- Chỉ mục cho bảng `taisanhopdong`
--
ALTER TABLE `taisanhopdong`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaHopDong` (`MaHopDong`),
  ADD KEY `MaTaiSan_idx` (`MaTaiSan`);

--
-- Chỉ mục cho bảng `thuchi`
--
ALTER TABLE `thuchi`
  ADD PRIMARY KEY (`Ma`),
  ADD KEY `MaNhanVienThucHien_idx` (`MaNhanVienThucHien`),
  ADD KEY `MaCuaHang222` (`MaCuaHang`);

--
-- Chỉ mục cho bảng `tinh`
--
ALTER TABLE `tinh`
  ADD PRIMARY KEY (`Ma`);

--
-- Chỉ mục cho bảng `vaylai`
--
ALTER TABLE `vaylai`
  ADD PRIMARY KEY (`MaHopDong`);

--
-- Chỉ mục cho bảng `xa`
--
ALTER TABLE `xa`
  ADD PRIMARY KEY (`ma`),
  ADD KEY `mahuyen` (`mahuyen`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `anhtaisan`
--
ALTER TABLE `anhtaisan`
  MODIFY `Ma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  MODIFY `maChucVu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `gopvon`
--
ALTER TABLE `gopvon`
  MODIFY `Ma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `lichsuthaotachopdong`
--
ALTER TABLE `lichsuthaotachopdong`
  MODIFY `Ma` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `quyen`
--
ALTER TABLE `quyen`
  MODIFY `maQuyen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `quyenchucvu`
--
ALTER TABLE `quyenchucvu`
  MODIFY `ma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `taisan`
--
ALTER TABLE `taisan`
  MODIFY `MaTaiSan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `thuchi`
--
ALTER TABLE `thuchi`
  MODIFY `Ma` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `anhkhachhang`
--
ALTER TABLE `anhkhachhang`
  ADD CONSTRAINT `anhkhachhang_ibfk_1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`);

--
-- Các ràng buộc cho bảng `anhtaisan`
--
ALTER TABLE `anhtaisan`
  ADD CONSTRAINT `MaTaiSanHopDong` FOREIGN KEY (`MaTaiSanHopDong`) REFERENCES `taisanhopdong` (`Ma`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `batho`
--
ALTER TABLE `batho`
  ADD CONSTRAINT `fk_hopdong` FOREIGN KEY (`MaHopDong`) REFERENCES `hopdong` (`Ma`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `cuahang`
--
ALTER TABLE `cuahang`
  ADD CONSTRAINT `cuahang_ibfk_1` FOREIGN KEY (`MaDiaChi`) REFERENCES `xa` (`ma`);

--
-- Các ràng buộc cho bảng `dongtien`
--
ALTER TABLE `dongtien`
  ADD CONSTRAINT `DongTien_HopDongBatHo_fkey` FOREIGN KEY (`MaHopDong`) REFERENCES `hopdong` (`Ma`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `ghino`
--
ALTER TABLE `ghino`
  ADD CONSTRAINT `ghino_ibfk_1` FOREIGN KEY (`MaHopDong`) REFERENCES `hopdong` (`Ma`);

--
-- Các ràng buộc cho bảng `gopvon`
--
ALTER TABLE `gopvon`
  ADD CONSTRAINT `MaCuaHang` FOREIGN KEY (`MaCuaHang`) REFERENCES `cuahang` (`MaCuaHang`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD CONSTRAINT `HopDongBatHo_KhachHang_fkey` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`MaKhachHang`) ON UPDATE CASCADE,
  ADD CONSTRAINT `cuahang_fk` FOREIGN KEY (`MaCuaHang`) REFERENCES `cuahang` (`MaCuaHang`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`MaHopDongGoc`) REFERENCES `hopdong` (`Ma`) ON DELETE SET NULL;

--
-- Các ràng buộc cho bảng `huyen`
--
ALTER TABLE `huyen`
  ADD CONSTRAINT `huyen_ibfk_1` FOREIGN KEY (`MaTinh`) REFERENCES `tinh` (`Ma`);

--
-- Các ràng buộc cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD CONSTRAINT `KhachHang_CuaHang_fkey` FOREIGN KEY (`MaCuaHang`) REFERENCES `cuahang` (`MaCuaHang`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`MaDiaChi`) REFERENCES `xa` (`ma`);

--
-- Các ràng buộc cho bảng `lichsuthaotachopdong`
--
ALTER TABLE `lichsuthaotachopdong`
  ADD CONSTRAINT `MaHopDong` FOREIGN KEY (`MaHopDong`) REFERENCES `hopdong` (`Ma`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `MaNhanVien` FOREIGN KEY (`MaNhanVienThucHien`) REFERENCES `nhanvien` (`MaNhanVien`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `ChucVu` FOREIGN KEY (`ChucVu`) REFERENCES `chucvu` (`maChucVu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `NhanVien_CuaHang_fkey` FOREIGN KEY (`MaCuaHang`) REFERENCES `cuahang` (`MaCuaHang`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `quyenchucvu`
--
ALTER TABLE `quyenchucvu`
  ADD CONSTRAINT `maChucVu` FOREIGN KEY (`maChucVu`) REFERENCES `chucvu` (`maChucVu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `quyen` FOREIGN KEY (`maQuyen`) REFERENCES `quyen` (`maQuyen`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `taisanhopdong`
--
ALTER TABLE `taisanhopdong`
  ADD CONSTRAINT `MaTaiSan` FOREIGN KEY (`MaTaiSan`) REFERENCES `taisan` (`MaTaiSan`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `taisanhopdong_ibfk_1` FOREIGN KEY (`MaHopDong`) REFERENCES `hopdong` (`Ma`);

--
-- Các ràng buộc cho bảng `thuchi`
--
ALTER TABLE `thuchi`
  ADD CONSTRAINT `MaCuaHang222` FOREIGN KEY (`MaCuaHang`) REFERENCES `cuahang` (`MaCuaHang`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `MaNhanVienThucHien` FOREIGN KEY (`MaNhanVienThucHien`) REFERENCES `nhanvien` (`MaNhanVien`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `vaylai`
--
ALTER TABLE `vaylai`
  ADD CONSTRAINT `vaylai_ibfk_1` FOREIGN KEY (`MaHopDong`) REFERENCES `hopdong` (`Ma`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `xa`
--
ALTER TABLE `xa`
  ADD CONSTRAINT `xa_ibfk_1` FOREIGN KEY (`mahuyen`) REFERENCES `huyen` (`Ma`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
