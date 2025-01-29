package controllerGestionale;

import modelGestionale.*;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class ControllerGestionale{

	private HashMap<String,ModelCliente> clienti;
	private DefaultListModel listModel;

	private  String dataFile = "datiClienti";

	public ControllerGestionale(){
		String path = new File("modelGestionale").getAbsolutePath();
		System.out.println(path);
		this.dataFile = path+"/"+this.dataFile;
		listModel = new DefaultListModel();
		this.clienti = loadClienti();
		if(this.clienti == null) this.clienti = new HashMap<String,ModelCliente>();


	}

	public void insertCliente(ModelCliente cliente){
		

		this.clienti.put(cliente.toString(),cliente);
		this.listModel.addElement(cliente.toString());


		saveClienti(this.clienti);
		this.clienti = loadClienti();

	}

	public void removeCliente(ModelCliente cliente){

		this.listModel.removeElement(cliente.toString());
		this.clienti.remove(cliente.toString());


		saveClienti(this.clienti);
		this.clienti = loadClienti();

	}

	public void modifyCliente(ModelCliente oldCl,ModelCliente newCl){

		if(this.clienti.containsKey(oldCl.toString())){
			this.listModel.removeElement(oldCl.toString());
			this.clienti.remove(oldCl.toString());

			this.clienti.put(newCl.toString(),newCl);
			this.listModel.addElement(newCl.toString());

			saveClienti(this.clienti);
			this.clienti = loadClienti();

		}else{
			System.out.println("cliente non trovato");
		}

	}

	public HashMap<String,ModelCliente> loadClienti(){

		HashMap<String,ModelCliente> clienti = null;


		try (FileInputStream file = new FileInputStream(this.dataFile);
    		ObjectInputStream input = new ObjectInputStream(file);) {

  			clienti = (HashMap<String,ModelCliente>) input.readObject();

		} catch (IOException ioe) {
  			ioe.printStackTrace();
		} catch (ClassNotFoundException exc) {
  			System.out.println("Class not found");
  			exc.printStackTrace();
		}
		Set<String> s = clienti.keySet();
		for(String element : s){
			this.listModel.addElement(element.toString());
		}



		return clienti;


	}

	public void saveClienti(HashMap<String,ModelCliente> clienti){

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

	public HashMap<String,ModelCliente> getClienti(){
		return this.clienti;
	}

	public ArrayList<String> getStringClienti(){
		ArrayList<String> retVal = new ArrayList<String>();
		retVal.addAll(this.clienti.keySet());

		return retVal;
	}

	public DefaultListModel getListModel(){
		return this.listModel;
	}




}