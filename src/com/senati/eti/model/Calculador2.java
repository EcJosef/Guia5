package com.senati.eti.model;

public class Calculador2 {
	
	//atributos
	private float numero1;
	private float numero2;
	
	//Getter and Setters
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	
	
	// Metodos Constructore
     public Calculador2() {
	     
   }
     public Calculador2(float numero1, float numero2) {
	   this.numero1 = numero1;
	   this.numero2 = numero2;
     }
	
     public float Operar(int tipo) {
    	 float rpta = 0;
    	 
    	 switch (tipo) {
    	 case 1:
    		 rpta = this.numero1 + this.numero2;
    		 break;
    	 case 2:
    		 rpta = this.numero1 - this.numero2;
    		 break;
    	 case 3:
    		 rpta = this.numero1 * this.numero2;
    		 break;
    	 case 4:
    		 float r = 0;
    		 
    		 if (this.numero2 != 0 )
 				r = this.numero1 / this.numero2;
    		 
    		 return r;
    	 case 5:
    		 float n = 0;
 			
 			if (this.numero2 != 0 )
 				n = this.numero1 % this.numero2;
 			
 			return n;
    	 case 6:
    		 rpta = (this.numero1 + this.numero2) / 2;
    		 break;
    	 case 7:
    		 rpta = (float) (Math.pow(this.numero1,2) 	+ Math.pow(this.numero2,2));	
    		 break;
    	 case 8:
    		 rpta = (this.numero1 - this.numero2) / 100;
    		 break;
    	 case 9:
    		 if (this.numero1 > this.numero2)
    		    rpta = this.numero1;
    		 else
    			 rpta = this.numero2;
    		 
    		 break;
    	 case 10:
    		 if (this.numero1 < this.numero2)
    		    rpta = this.numero1;
    		 else
    			 rpta = this.numero2;
    		 
    		 break;
    		  
    		    		  
    		}
		
    	 return rpta;
    	 
    	 
    	 
     }
	
		
	

}
