package modelGestionale;

import java.util.*;
import java.io.*;
import modelGestionale.ModelCliente;

public class ModelGestionale{
	private List<ModelCliente> clienti;


	private final String dataFile = "Gestionale/modelGestionale/datiClienti";

	public ModelGestionale(){}

	public void setClienti(List<ModelCliente> clienti){
		this.clienti = clienti;
	}

	public List<ModelCliente> getClienti(){
		return clienti;
	}

	public String getDataFile(){
		return this.dataFile;
	}


}


