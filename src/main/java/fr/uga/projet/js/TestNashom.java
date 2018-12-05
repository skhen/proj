package fr.uga.projet.js;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestNashom {

	public TestNashom() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ScriptException, IOException {
		// TODO Auto-generated method stub
		ScriptEngine engine =
				new ScriptEngineManager().getEngineByName("nashorn");
		
		//Evaluation instruction JS
		engine.eval("print('Coucou from JS');");
				
		//Evaluation d'un fichier
		BufferedReader reader = new BufferedReader(new FileReader("mesScripts.js"));
		engine.eval(reader);
		reader.close();
		
	}

}
