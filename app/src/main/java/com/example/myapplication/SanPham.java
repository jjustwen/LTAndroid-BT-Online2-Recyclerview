package com.example.myapplication;

public class SanPham
{
    private String tenSanPham;
    private double GiaSanPham;
    private int hinhSanPham;

    public SanPham(String tenSanPham, double giaSanPham, int hinhSanPham)
    {
        this.tenSanPham = tenSanPham;
        GiaSanPham = giaSanPham;

        this.hinhSanPham = hinhSanPham;
    }

    public String getTenSanPham()
    {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham)
    {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham()
    {
        return GiaSanPham;
    }

    public void setGiaSanPham(double giaSanPham)
    {
        GiaSanPham = giaSanPham;
    }

    public int getHinhSanPham()
    {
        return hinhSanPham;
    }

    public void setHinhSanPham(int hinhSanPham)
    {
        this.hinhSanPham = hinhSanPham;
    }
}
