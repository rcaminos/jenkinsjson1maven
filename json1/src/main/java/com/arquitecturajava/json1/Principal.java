package com.arquitecturajava.json1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json="{\"nombre\":\"pedro\"}";
		LeerJSONPersona leer =new LeerJSONPersona();
		Persona p=leer.getPersona(json);
		System.out.println(p.getNombre());
	}

}
