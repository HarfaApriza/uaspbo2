/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Haris
 */
public class Buku {
    private int id;
    private String nama_buku;
    private String nama_penerbit;
    private int tahun_terbit;

    public Buku(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_buku() {
        return nama_buku;
    }

    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    public String getNama_penerbit() {
        return nama_penerbit;
    }

    public void setNama_penerbit(String nama_penerbit) {
        this.nama_penerbit = nama_penerbit;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public Buku(int id, String nama_buku, String nama_penerbit, int tahun_terbit) {
        this.id = id;
        this.nama_buku = nama_buku;
        this.nama_penerbit = nama_penerbit;
        this.tahun_terbit = tahun_terbit;
    }

    
    public Buku(){
}
}