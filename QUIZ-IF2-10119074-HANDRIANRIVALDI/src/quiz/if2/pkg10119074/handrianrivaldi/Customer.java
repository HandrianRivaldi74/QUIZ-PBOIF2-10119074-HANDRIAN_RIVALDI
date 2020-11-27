/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119074.handrianrivaldi;

/**
 *
 * @author Acer
 * NAMA     : HANDRIAN RIVALDI
 * KELAS    : IF2
 * NIM      : 10119074
 * Deskrifsi :
 */
public class Customer extends CustomerInvoice {
    private String name,email;
    public Customer(String name, String email) {
        super(name, email);
        this.name = name;
    }
        
    public String getName() {
        return name;    
    }
    public void setName(Sting name) {
        super.setName();
        System.out.println();
    }
    public String getEmail() {
        return email;
    }
    
    public Boolean getMember() {
        return member;
    
    }   
}
