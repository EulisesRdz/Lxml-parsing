package com.example.echeverria.lxml_parsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class vista_individual  extends Activity {

    // XML node keys
    static final String KEY_ID_A = "id_A";
    static final String KEY_NOMBRE = "nombre";
    static final String KEY_APELLIDOP = "apellido_p";
    static final String KEY_APELLIDOM = "apellido_m";
    static final String KEY_EMAIL = "email";
    static final String KEY_TELEFONO = "telefono";
    static final String KEY_EDAD = "edad";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_individual);

        // getting intent data
        Intent in = getIntent();

        // Get XML values from previous intent
        String id_a = in.getStringExtra(KEY_ID_A);
        String nombre = in.getStringExtra(KEY_NOMBRE);
        String apellidop = in.getStringExtra(KEY_APELLIDOP);
        String apellidom = in.getStringExtra(KEY_APELLIDOM);
        String email = in.getStringExtra(KEY_EMAIL);
        String telefono = in.getStringExtra(KEY_TELEFONO);
        String edad = in.getStringExtra(KEY_EDAD);

        // Displaying all values on the screen
        TextView lblid = (TextView) findViewById(R.id.txtid);
        TextView lblnombre = (TextView) findViewById(R.id.txtnombre);
        TextView lblapellidop = (TextView) findViewById(R.id.txtapllidop);
        TextView lblapellidom = (TextView) findViewById(R.id.txtapellidom);
        TextView lblemail = (TextView) findViewById(R.id.txtemail);
        TextView lbltelefono = (TextView) findViewById(R.id.txttelefono);
        TextView lbledad = (TextView) findViewById(R.id.txtedad);

        lblid.setText(Html.fromHtml("<b>Id:</b> " + id_a));
        lblnombre.setText(Html.fromHtml("<b>Nombre:</b> " + nombre));
        lblapellidop.setText(Html.fromHtml("<b>A Paterno:</b> " + apellidop));
        lblapellidom.setText(Html.fromHtml("<b>A Materno:</b> " + apellidom));
        lblemail.setText(Html.fromHtml("<b>Email:</b> " + email));
        lbltelefono.setText(Html.fromHtml("<b>Telefono:</b> " + telefono));
        lbledad.setText(Html.fromHtml("<b>Edad:</b> " + edad));
    }
}
