package br.com.escopac.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.escopac.controllers.GenericController;
import br.com.escopac.model.ProfissionalModel;

@RequestMapping("/profissional")
@RestController
public class ProfissionalController extends GenericController<ProfissionalModel>{
	
}

