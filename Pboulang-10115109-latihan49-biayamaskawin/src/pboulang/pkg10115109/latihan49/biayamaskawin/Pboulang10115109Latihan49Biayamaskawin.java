/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan49.biayamaskawin;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 biaya emas kawin
 */
public class Pboulang10115109Latihan49Biayamaskawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        
        emas.setBerat(15.7);
        emas.setHarga(570000);
        
        System.out.println("hendi membeli mas kawin ");
        System.out.println("berat :"+emas.getBerat());
        System.out.println("harga :"+emas.getHarga());
        System.out.println("total bayar :"+emas.totalharga());
        
        
    }
    
}
