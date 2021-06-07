package com.jonatan.springboot.rest.service;

import java.util.List;
import java.util.Optional;

import com.jonatan.springboot.rest.model.Empresas;

public interface Myservice {

	public List<Empresas> getEmpresas();

	public Optional<Empresas> getEmpresaId(int empid);

	public Empresas addNewEmpresas(Empresas emp);

	public Empresas updateEmpresa(Empresas emp);

	public void deleteEmpresaById(int empid);

	public void deleteAllEmpresas();

}