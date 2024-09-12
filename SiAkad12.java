import java.util.Scanner;

public class SiAkad12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUas = sc.nextDouble();

        nilaiAkhir = (nilaiKuis*0.2 + nilaiTugas*0.15 + nilaiUts*0.3 + nilaiUas*0.35) / 3;

        System.out.println(" Nama : " + nama + " NIM : " + nim);
        System.out.println(" Kelas : " + kelas + " Absen : " + absen);
        System.out.println(" Nilai Akhir : " + nilaiAkhir);
    }
}