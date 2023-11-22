package td5_java;
import java.time.LocalDate;

public class Achat {
    public static void main(String[] args) {
    	 Article  supermarche[];	
    	 boolean[] exist=new boolean[4];
       supermarche= new Article[4];
       LocalDate L= LocalDate.of(2023, 3, 21);
        supermarche[0] = new Vêtement(123, "Jupe bleue", 39.000f, 2, "bleue", "S");
        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new  Vêtement(178, "Pantalon noir", 42.000f,5, "noir", "M");
        supermarche[3] = new ProduitGC(191, "Pâtes", 0.410f, 18);

        System.out.println(" il ya t'il  0 article de 'Jupe bleue taille s' ? ");
        System.out.println(supermarche[0].estDispo(0));
        exist[0]=supermarche[0].estDispo(0);
        
      
        System.out.println(" il ya t'il 1 article de 'TV Led 80cm' ?");
        System.out.println(supermarche[1].estDispo(1));
        exist[1]=supermarche[1].estDispo(1);
        
      
        System.out.println("il ya til  1 article de 'Pantalon noir' ?");
        System.out.println(supermarche[2].estDispo(1));
        exist[2]=supermarche[2].estDispo(1);
        
 
        System.out.println(" ilya  til 3 articles de 'Pâtes' ?");
        System.out.println(supermarche[3].estDispo(3));
        exist[3]=supermarche[3].estDispo(3);

        
     
        for(int i=0;i<supermarche.length;i++) {
        	if(exist[i]==true) { 
        	
                System.out.println("Affichage de produit : "+(i+1));
                System.out.println(supermarche[i].toString());
                System.out.print("Affichage de prixTTC = ");
                System.out.println(supermarche[i].calculPrixTTC());
        	}else {
        		System.out.println(" cet article est indisponible et le  approvisionnez");

        	}
        }
    	
    	double p=0.0; 
    	for(int i=0;i<supermarche.length;i++) {
    		 if(exist[i]==true) {
    			 if(supermarche[i] instanceof  Vêtement ) {
    				 p+=(( Vêtement) supermarche[i]).prixDeVente("21/03/2023");
    			 }else if(supermarche[i] instanceof ProduitElec) {
    				 p+=((ProduitElec) supermarche[i]).prixDeVente("21/03/2023");
    			 }else
    				 p+=supermarche[i].calculPrixTTC();
    			  
    			
    		 }
    	 }
    	System.out.println("le montant total à payer est :"+p);
 
    	
    }

    }
