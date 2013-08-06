package com.example.comunicacionactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends Activity {
	
	private EditText nombre;
	private TextView resultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout1);
		this.nombre = (EditText) findViewById(R.id.eNombre);
		this.resultado = (TextView) findViewById(R.id.tResultado);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad1, menu);
		return true;
	}
	
	public void verificarDatos(View view) {
		Intent i = new Intent(this, Actividad2.class);
		i.putExtra("nombre", this.nombre.getText().toString());
		startActivityForResult(i,1234);
	}

	@Override 
	protected void onActivityResult (int requestCode, int resultCode, Intent data){
		if (requestCode==1234 && resultCode==RESULT_OK) {
			
            String res = data.getExtras().getString("resultado");
            
            this.resultado.setText(this.nombre.getText().toString() + " ha " + res + " la solicitud");
		}
	}
	
}
