package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung hasil tunjangan

public class Tunjangan {
    public int gaji;
    public String menikah;

    public void tunjangan(String menikah, int gaji){
        tampil(gaji,((menikah.equals("sudah")) ? gaji * 0.35 : 0));
    }

    public void tampil(int gaji, double tunjangan){
        System.out.println("==========Hasil Perhitungan gaji anda==========");
        System.out.println("Gaji pokok \t\t: Rp "+gaji);
        System.out.println("Tunjangan \t\t: Rp "+tunjangan);
        System.out.println("Total Gaji \t\t: Rp "+(gaji+tunjangan));
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda? Rp ");
        gaji = scanner.nextInt();
        System.out.print("Apakah anda sudah menikah? (sudah/belum) : ");
        menikah = scanner.next();
    }

    public static void main(String[] args){
        Tunjangan tunj = new Tunjangan();
        tunj.input();
        tunj.tunjangan(tunj.menikah, tunj.gaji);
    }

}

