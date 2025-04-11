package com.springTest.springSistem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springTest.springSistem.IngresoPaciente.EXME_Paciente;
import com.springTest.springSistem.IngresoPaciente.PacienteRepository;

@Controller
public class CtrlEXME_Paciente {

	@Autowired
	public PacienteRepository pacRep;
	
	@GetMapping("/Paciente") //Inicio
	public String registroPaciente(Model model) {
		model.addAttribute("paciente", new EXME_Paciente());
		model.addAttribute("mensaje","Aqui podemos registrar un paciente");
		
		return "paciente/registrar";
}
	@PostMapping("/guardarPac")
	public String savePaciente(@ModelAttribute EXME_Paciente paciente, Model model) {
        pacRep.save(paciente);  
		
		model.addAttribute("mensaje", "Paciente Guardado correctamente");
		model.addAttribute("paciente", new EXME_Paciente());
		
		return "paciente/registrar";
	}
	
	
	@GetMapping("/verPacientes")
	public String verPacientes(Model model) {
		  List<EXME_Paciente> listaPacientes = pacRep.findAll();
		model.addAttribute("pacientes", listaPacientes);
		model.addAttribute("mensaje", "esta es la lista de pacientes registrados");
		
		return "paciente/listaPacientes";
	}
	
	@PostMapping("/borrar")
	public String deletePac(@RequestParam("EXME_Paciente_ID") int pac_ID, RedirectAttributes redirectAttrs) {
		
		Optional<EXME_Paciente> pac = pacRep.findById(pac_ID);
		pacRep.deleteById(pac_ID);
	//	model.addAttribute("mensaje","se borro el paciente");
		
		return "paciente/listaPacientes";
	}
	
	@GetMapping("/editarPaciente")
	public String editarPaciente(@RequestParam("EXME_Paciente_ID") int EXME_Paciente_ID, Model model) {
	    Optional<EXME_Paciente> pacienteOpt = pacRep.findById(EXME_Paciente_ID);
	    if (pacienteOpt.isPresent()) {
	        model.addAttribute("paciente", pacienteOpt.get());
	        return "paciente/registrar"; // o la vista donde tienes el formulario
	    } else {
	        model.addAttribute("mensaje", "Paciente no encontrado");
	        return "redirect:/listaPacientes";
	    }
	}
	
	
}
