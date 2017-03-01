package net.opendevup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.opendevup.dao.EtudiantRepository;
import net.opendevup.entities.Etudiant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class TpSpringMvcApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(
				TpSpringMvcApplication.class, args);
		EtudiantRepository etudiantRepository = ctx
				.getBean(EtudiantRepository.class);
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		etudiantRepository.save(new Etudiant("Ahmed", df.parse("1988-10-10"),
//				"Ahmed@gmail.com", "Ahmde.jpg"));
//		etudiantRepository.save(new Etudiant("Mohamed", df.parse("1988-11-10"),
//				"Mohamed@gmail.com", "Mohamed.jpg"));
//		etudiantRepository.save(new Etudiant("Ibrahim", df.parse("1988-12-10"),
//				"Ibrahim@gmail.com", "Ibrahim.jpg"));

//		Page<Etudiant> etds = etudiantRepository.chercherEtudiants("%B%",
//				new PageRequest(0, 5));
//		etds.forEach(e -> System.out.println(e.getNom()));
	}
}
