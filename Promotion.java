package td5_java;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;




public interface Promotion {
	public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static final LocalDate debutPromo=LocalDate.parse("19/03/2022",dateFormatter);
	public static final LocalDate finPromo=LocalDate.parse("31/03/2022",dateFormatter);
		
	double prixDeVente(String dateStr);

	default boolean estPeriodePromo(String dateStr) {
	    LocalDate dateAchat = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    
	    return dateAchat.isAfter(debutPromo) && dateAchat.isBefore(finPromo);
	}

	static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
	    return ((prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;
	}
	}

	


