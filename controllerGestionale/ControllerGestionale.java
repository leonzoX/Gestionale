package controllerGestionale;

import modelGestionale.*;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class ControllerGestionale{

	private List<ModelCliente> clienti;
	private ArrayList<String> stringClienti;
	private  String dataFile = "datiClienti";

	public ControllerGestionale(){
		String path = new File("modelGestionale").getAbsolutePath();
		System.out.println(path);
		this.dataFile = path+"/"+this.dataFile;

		this.clienti = loadClienti();
		this.stringClienti = toString(this.clienti);
		if(this.clienti == null) this.clienti = new ArrayList<ModelCliente>();


	}

	public void insertCliente(ModelCliente cliente){
		

		this.clienti.add(cliente);
		this.stringClienti.add(cliente.toString());

		saveClienti(this.clienti);
		this.clienti = loadClienti();

	}

	public void removeCliente(ModelCliente cliente){

		if(this.clienti.remove(cliente) == false)	
			System.out.println("cliente non trovato ");
		this.stringClienti.remove(cliente.toString());

		saveClienti(this.clienti);
		this.clienti = loadClienti();

	}

	public void modifyCliente(ModelCliente oldCl,ModelCliente newCl){
		int index = this.clienti.indexOf(oldCl);
		if(index != -1){
			this.clienti.set(index,newCl);
			saveClienti(this.clienti);
			this.clienti = loadClienti();
			this.stringClienti = toString(this.clienti);
		}else{
			System.out.println("cliente non trovato");
		}

	}

	public List<ModelCliente> loadClienti(){

		ArrayList<ModelCliente> clienti = null;


		try (FileInputStream file = new FileInputStream(this.dataFile);
    		ObjectInputStream input = new ObjectInputStream(file);) {

  			clienti = (ArrayList) input.readObject();

		} catch (IOException ioe) {
  			ioe.printStackTrace();
		} catch (ClassNotFoundException exc) {
  			System.out.println("Class not found");
  			exc.printStackTrace();
		}



		return clienti;


	}

	public void saveClienti(List<ModelCliente> clienti){

		try(FileOutputStream file = new FileOutputStream(this.dataFile);
			ObjectOutputStream output = new ObjectOutputStream(file)){

			output.writeObject(clienti);

		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
  			throw new RuntimeException(fnf);

		}catch(IOException ioe){

  			ioe.printStackTrace();
		}

	}

	public List<ModelCliente> getClienti(){
		return this.clienti;
	}

	public ArrayList<String> getStringClienti(){return this.stringClienti;}

	private ArrayList<String> toString(List<ModelCliente> clienti){
		ArrayList<String> stringClienti = new ArrayList<String>();

		for(ModelCliente cliente : clienti){
			stringClienti.add(cliente.toString());
		}

		return stringClienti;
	}



}