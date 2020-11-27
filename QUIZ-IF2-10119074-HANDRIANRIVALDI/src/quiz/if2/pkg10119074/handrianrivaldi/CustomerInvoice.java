/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119074.handrianrivaldi;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Acer
 * NAMA     : HANDRIAN RIVALDI
 * KELAS    : IF2
 * NIM      : 10119074
 * Deskrifsi :
 */
public interface CustomerInvoice {
    
    private String getTanggal(){
        DateFormat dateFormat = new.SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
        
    }
    
    private string getWaktu(){
        DateFormat dateFormat = new.SimplDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public static void main(srting[]args){
        CustomerInvoice tgl = new Tanggal();
        System.out.println("Date Transaction : "+tgl.getTanggal() +tgl.getWaktu());
    }
    
}
