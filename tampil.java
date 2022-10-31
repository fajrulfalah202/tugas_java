import java.lang.reflect.Method;

public class tampil {
    
    
    public static void main(String[] args) {
       //mahasiswa------------------------------------------------
        var mahasiswa1 = new mahasiswa();
        mahasiswa1.nama= "bayu";
        mahasiswa1.nim="001";
        mahasiswa1.alamat_rumah="kalimas";
        mahasiswa1.no_handphone="081234567890";
        mahasiswa1.no_telpon="08112233445";
        mahasiswa1.usia="20";
        mahasiswa1.jmlh_sks="20";
        //---------------------------------------------------

        //dosen-------------------------------------------------
        var dosen1 = new id_dosen();
        dosen1.nama="agus";
        dosen1.nip="12345678";
        dosen1.nidn="12345677";
        dosen1.alamat_rumah="gedangan";
        dosen1.no_telpon= "081333444";
        dosen1.no_handphone="081333445";
        dosen1.usia="30";
        dosen1.jmlh_sks="20";
        dosen1.gaji="4.500.000";

        //karyawan
        var karyawan1 = new karyawan();
        karyawan1.nama="budi";
        karyawan1.nip="12344478";
    
        karyawan1.alamat_rumah="gedangan";
        karyawan1.no_telpon= "081555444";
        karyawan1.no_handphone="081333444";
        karyawan1.usia="30";
    
        //keluar---------------------
        System.out.println("mahasiswa");
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.alamat_rumah);
        System.out.println(mahasiswa1.no_telpon);
        System.out.println(mahasiswa1.no_handphone);
        System.out.println(mahasiswa1.usia);
        System.out.println(mahasiswa1.jmlh_sks);
        

        System.out.println("dosen");
        System.out.println(dosen1.nama);
        System.out.println(dosen1.nip);
        System.out.println(dosen1.nidn);
        System.out.println(dosen1.alamat_rumah);
        System.out.println(dosen1.no_telpon);
        System.out.println(dosen1.no_handphone);
        System.out.println(dosen1.usia);
        System.out.println(dosen1.jmlh_sks);
        System.out.println(dosen1.gaji);

        System.out.println("karyawan");
        System.out.println(karyawan1.nama);
        System.out.println(karyawan1.nip);
        System.out.println(karyawan1.alamat_rumah);
        System.out.println(karyawan1.no_telpon);
        System.out.println(karyawan1.no_handphone);
        System.out.println(karyawan1.usia);




    }
}
