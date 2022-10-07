

import javax.swing.JOptionPane;

public class Sorteio {
    public int numsort1;
    public int numsort2;
    public int numsort3;
    public int numsort4;
    public int numeroacertos;
    
    

    
    public int VerificaAcertos(int n1, int n2, int n3, int n4) {
       
            
       

       
        if(this.numsort1 == n1 && this.numsort2 == n2 && this.numsort3 == n3 && this.numsort4 == n4) {            
            numeroacertos = 4;
        } else if (this.numsort1 == n1 && this.numsort2 == n2 && this.numsort3 == n3 || this.numsort1 == n1 && this.numsort2 == n2 && this.numsort4 == n4 || this.numsort1 == n1 && this.numsort3 == n3 && this.numsort4 == n4 || this.numsort2 == n2 && this.numsort3 == n3 && this.numsort4 == n4) {
            numeroacertos = 3;
        } else if (this.numsort1 == n1 && this.numsort2 == n2 || this.numsort1 == n1 && this.numsort3 == n3 || this.numsort1 == n1 && this.numsort4 == n4 || this.numsort2 == n2 && this.numsort3 == n3 || this.numsort2 == n2 && this.numsort4 == n4 || this.numsort3 == n3 && this.numsort4 == n4) {
            numeroacertos = 2;
        } else if (this.numsort1 == n1 || this.numsort2 == n2 || this.numsort3 == n3 || this.numsort4 == n4) {
            numeroacertos = 1;
        }
        else {
            
            numeroacertos=0;
        }
        return numeroacertos;              
    }

    
    public double Premiacao(int numacertos){
        
        numacertos=numeroacertos;
        int premiacao=0;
        if(numacertos==4){
            premiacao=10000;
        } else if(numacertos==3) {
            premiacao=5000;
        } else if(numacertos==2) {
            premiacao=1000;
        } else if (numacertos==1) {
            premiacao=100;
        }
        
        return premiacao;
    }

    
   
}
