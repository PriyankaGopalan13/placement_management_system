/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class User {
    private int sno,cmmlevel,recruit_no,annualpackage,phn_no,percentage10,percentage12,btechpercentage;
    private String companyname;
  
    public User(int sno, String companyname, int cmmlevel, int recruit_no, int annualpackage, int phn_no, int percentage10, int percentage12,int btechpercentage )
    {
       this.sno = sno;
       this.companyname = companyname;
       this.cmmlevel = cmmlevel;
       this.recruit_no = recruit_no;
       this.annualpackage = annualpackage;
       this.phn_no = phn_no;
       this.percentage10 = percentage10;
       this.percentage12 = percentage12;
       this.btechpercentage = btechpercentage;
    }
    
    public int getsno(){
         return sno;
    }
    public String getcompanyname(){
         return companyname;
    }
    public int getcmmlevel(){
         return cmmlevel;
    }
    public int getrecruit_no(){
         return recruit_no;
    }
    public int getannualpackage(){
         return annualpackage;
    }
    public int getphn_no(){
         return phn_no;
    }
    public int getpercentage10(){
         return percentage10;
    }
    public int getpercentage12(){
         return percentage12;
    }
    public int getbtechpercentage(){
         return btechpercentage;
    }
    
    
}
    

    

