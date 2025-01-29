package modelGestionale;
import java.io.*;
import java.util.*;

public class ModelCliente implements Serializable{

	private static final long serialVersionUID = -2493707818753101601L;
	private String nome,cognome,email,telefono;

	public ModelCliente(String nome,String cognome,String email,String telefono){
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCognome(String cognome){
		this.cognome = cognome;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getNome(){
		return this.nome;
	}

	public String getCognome(){
		return this.cognome;
	}

	public String getEmail(){
		return this.email;
	}

	public String getTelefono(){
		return this.telefono;
	}

	@Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ModelCliente))
            return false;
        ModelCliente cl = (ModelCliente)o;
        return cl.getNome().equals(this.nome) && cl.getCognome().equals(this.cognome)
                && cl.getEmail().equals(this.email) && cl.getTelefono().equals(this.telefono);
    }
    

    @Override
    public int hashCode() {
    	
		final int prime = 31;
        int result = 1;
        result = prime * result + ((this.nome == null) ? 0 : this.nome.hashCode());
        result = prime * result + (this.cognome == null ? 0  : this.cognome.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + (this.telefono == null ? 0  : this.telefono.hashCode());
        System.out.println(result);
        
        return result;

    }





}