package td5_java;


public abstract class Article {
				protected long ref;
				protected String lib;
				protected double prixHT;
				protected int qteStock=0;
				protected final double TVA=0.1;
				Article(long ref, String lib, float p, int q) 
				{
					this.ref=ref;
					this.lib=lib;
					this.prixHT=p;
					this.qteStock=q;
							
				}
				void approvisionner(int nb)
				{
					this.qteStock=this.qteStock+nb;
				}
				void decrire()
				{
					System.out.println(toString());
				}
				@Override
				public String toString() {
					return "Article [ref=" + ref + ", lib=" + lib + "]";
				}
				public abstract double calculPrixTTC() ;
				
				public boolean appartientPromo(Article article) {
				    if (article instanceof ProduitElec || article instanceof Vêtement) {
				        return true;
				    }
				    return false;
				}

				boolean estDispo(int qte_acheté)
				{
					if(this.qteStock>=qte_acheté)
						return true;
					return false;
				}
			

			}









