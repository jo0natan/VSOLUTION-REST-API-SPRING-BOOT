package com.jonatan.springboot.rest.controller;

import java.util.List;
import java.util.Optional;

import com.jonatan.springboot.rest.model.Empresas;
import com.jonatan.springboot.rest.service.Myservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jonatan {

	@Autowired
	Myservice service;

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/empresas/all", method = RequestMethod.GET)
	public List<Empresas> getEmpresas() {

		System.out.println(this.getClass().getSimpleName() + " - via get return json - " + service.getEmpresas());
		return service.getEmpresas();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/empresas/{id}", method = RequestMethod.GET)
	public Empresas getEmpresaId(@PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName()
				+ " - Get empresa ID Class with return params filds database json for id: " + id);

		Optional<Empresas> emp = service.getEmpresaId(id);
		if (!emp.isPresent())
			throw new Exception("id not found: " + id);
		else
			return emp.get();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/empresas/add", method = RequestMethod.POST)
	public Empresas createEmployee(@RequestBody Empresas newemp) {
		System.out.println(this.getClass().getSimpleName() + " - Class call to insert.");
		return service.addNewEmpresas(newemp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/empresas/update/{id}", method = RequestMethod.PUT)
	public Empresas updateEmployee(@RequestBody Empresas updemp, @PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Update Class call.");

		Optional<Empresas> emp = service.getEmpresaId(id);
		if (!emp.isPresent())
			throw new Exception("Could not find empresa with id: " + id);

		/*
		 * IMPORTANT - To prevent the overiding of the existing value of the variables
		 * in the database, if that variable is not coming in the @RequestBody
		 * annotation object.
		 */
		if (updemp.getNome() == null || updemp.getNome().isEmpty())
			updemp.setNome(emp.get().getNome());
		if (updemp.getMoeda() == null || updemp.getMoeda().isEmpty())
			updemp.setMoeda(emp.get().getMoeda());
		if (updemp.getCotacao() == 0)
			updemp.setCotacao(emp.get().getCotacao());

		// Required for the "where" clause in the sql query template.
		updemp.setId(id);
		return service.updateEmpresa(updemp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/empresas/delete/{id}", method = RequestMethod.DELETE)
	public void deleteEmployeeById(@PathVariable int id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Class call to delete id.");

		Optional<Empresas> emp = service.getEmpresaId(id);
		if (!emp.isPresent())
			throw new Exception("Could not find empresa with id: " + id);

		service.deleteEmpresaById(id);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/empresas/deleteall", method = RequestMethod.DELETE)
	public void deleteAll() {
		System.out.println(this.getClass().getSimpleName() + " - Delete all invoked.");
		service.deleteAllEmpresas();
	}
}