package net.opendevup.web;

import java.util.List;

import net.opendevup.dao.EtudiantRepository;
import net.opendevup.entities.Etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/Etudiant")
public class EtudiantController {
	@Autowired
	private EtudiantRepository etudiantRepository;

	@RequestMapping(value = "/Index")
	public String Index(Model model,
			@RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "motCle", defaultValue = "") String mc) {
		Page<Etudiant> pagesEtudiants = etudiantRepository.chercherEtudiants(
				"%" + mc + "%", new PageRequest(p, 5));
		int pagesCount = pagesEtudiants.getTotalPages();
		int[] pages = new int[pagesCount];
		for (int i = 0; i < pagesCount; i++)
			pages[i] = i;
		model.addAttribute("pages", pages);
		model.addAttribute("pageEtudiants", pagesEtudiants);
		model.addAttribute("pageCourante", p);
		model.addAttribute("motCle", mc);
		return "etudiants";
	}
}
