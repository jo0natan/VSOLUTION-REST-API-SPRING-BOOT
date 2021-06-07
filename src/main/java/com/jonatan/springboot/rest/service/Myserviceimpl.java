package com.jonatan.springboot.rest.service;

import java.util.List;
import java.util.Optional;

import com.jonatan.springboot.rest.jonatan.JonatanRepository;
import com.jonatan.springboot.rest.model.Empresas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Myserviceimpl implements Myservice {

	@Autowired
	JonatanRepository rest;

	@Override
	public List<Empresas> getEmpresas() {
		// TODO Auto-generated method stub
		return rest.findAll();
	}

	@Override
	public Optional<Empresas> getEmpresaId(int empid) {
		return rest.findById(empid);
	}

	@Override
	public Empresas addNewEmpresas(Empresas emp) {
		return rest.save(emp);
	}

	@Override
	public Empresas updateEmpresa(Empresas emp) {
		return rest.save(emp);
	}

	@Override
	public void deleteEmpresaById(int empid) {
		rest.deleteById(empid);
	}

	@Override
	public void deleteAllEmpresas() {
		rest.deleteAll();
	}

}