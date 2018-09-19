/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatakeluarga;

/**
 *
 * @author ASUS
 */
public class BiodataKeluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Program biodata = new Program();
        biodata.setNamaAyah("Hermawan Setyadi");
        biodata.setNamaIbu("Dieta Fauziyah");
        biodata.setNamaSaudara("Favian Reswara Setyadi");
        biodata.setNamaSaya("Roihan Farras Setyadi");
        biodata.setAlamat("Jl Cokroaminoto No.25 Kanigaran, Probolinggo");
        biodata.setTempatLahir("Probolinggo/13 Maret 2003");
        biodata.setHobi("Olahraga");
        biodata.setCitaCita("Programmer");
        biodata.setNoTelepon("081294628199");
        
        System.out.println("==== BIODATA KELUARGA ====");
        System.out.println();
        System.out.println("Nama Ayah       : " + biodata.getNamaAyah());
        System.out.println("Nama Ibu        : " + biodata.getNamaIbu());
        System.out.println("Nama Saudara    : " + biodata.getNamaSaudara());
        System.out.println("Nama Saya       : " + biodata.getNamaSaya());
        System.out.println("Alamat          : " + biodata.getAlamat());
        System.out.println("Tempat Lahir    : " + biodata.getTempatLahir());
        System.out.println("Hobi            : " + biodata.getHobi());
        System.out.println("Cita-Cita       : " + biodata.getCitaCita());
        System.out.println("No Telepon      : " + biodata.getNoTelepon());
        
    }
    
}
