package com.example.camilo.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public final static String CHARACTER_ADD = "+";
    public final static String CHARACTER_MIN = "-";
    public final static String CHARACTER_DIV = "/";
    public final static String CHARACTER_MUL = "*";

    private Button boton0;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private Button boton8;
    private Button boton9;
    private Button botonAdd;
    private Button botonDiv;
    private Button botonMin;
    private Button botonMul;
    private Button botonEqual;
    private Button botonAC;
    private Button botonCE;

    private TextView txtPanel;
    private TextView txtMessage;

    private String message;
    private String ultimoOperador;
    private double ultimoNumero;
    private double ultimoResultado;
    private boolean operacion;

    //private double valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		// hide the window title.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // hide the status bar and other OS-level chrome
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
        boton0=(Button) findViewById(R.id.btn0);
        boton1=(Button) findViewById(R.id.btn1);
        boton2=(Button) findViewById(R.id.btn2);
        boton3=(Button) findViewById(R.id.btn3);
        boton4=(Button) findViewById(R.id.btn4);
        boton5=(Button) findViewById(R.id.btn5);
        boton6=(Button) findViewById(R.id.btn6);
        boton7=(Button) findViewById(R.id.btn7);
        boton8=(Button) findViewById(R.id.btn8);
        boton9=(Button) findViewById(R.id.btn9);
        botonAdd=(Button) findViewById(R.id.btnAdd);
        botonDiv=(Button) findViewById(R.id.btnDivide);
        botonMin=(Button) findViewById(R.id.btnSubtract);
        botonMul=(Button) findViewById(R.id.btnMultiply);
        botonEqual=(Button) findViewById(R.id.btnEquals);
        botonAC=(Button) findViewById(R.id.btnAC);
        botonCE=(Button) findViewById(R.id.btnCE);

        AC_CE_Result();

        txtPanel=(TextView) findViewById(R.id.txtInput);
        txtPanel.setText("");
        txtMessage= (TextView) findViewById(R.id.txtSolution);
        txtMessage.setText("");

        message = "";
        ultimoNumero = 0;
        ultimoOperador = "";
        ultimoResultado = 0;
        operacion = false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }    

    public void on7(View v){
        //Toast.makeText(getBaseContext(), "7", Toast.LENGTH_LONG).show();
        if(operacion) {
            txtPanel.setText("7");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"7");
        AC_CE_Typing();
    }
    public void on8(View v){
        if(operacion){
            txtPanel.setText("8");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"8");
        AC_CE_Typing();
    }
    public void on9(View v){
        if(operacion){
            txtPanel.setText("9");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"9");
        AC_CE_Typing();
    }
    public void on6(View v){
        if(operacion){
            txtPanel.setText("6");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"6");
        AC_CE_Typing();
    }
    public void on5(View v){
        if(operacion){
            txtPanel.setText("5");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"5");
        AC_CE_Typing();
    }
    public void on4(View v){
        if(operacion){
            txtPanel.setText("4");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"4");
        AC_CE_Typing();
    }
    public void on3(View v){
        if(operacion){
            txtPanel.setText("3");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"3");
        AC_CE_Typing();
    }

    public void on2(View v){
        if(operacion){
            txtPanel.setText("2");
            operacion=false;
        }
        else
            txtPanel.setText( txtPanel.getText()+"2");
        AC_CE_Typing();
    }

    public void on1(View v){
        if(operacion){
            txtPanel.setText("1");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"1");
        AC_CE_Typing();
    }

    public void on0(View v){
        if(operacion){
            txtPanel.setText("0");
            operacion=false;
        }
        else
            txtPanel.setText(txtPanel.getText()+"0");
        AC_CE_Typing();
    }

    public void onDiv(View v){
        double d1 = darNumIngresado();
        if(!operacion) {
            txtMessage.setText(ultimoResultado + CHARACTER_DIV + ultimoNumero);
            ultimoResultado = ultimoResultado / d1;
        }
        else{
            ultimoResultado = d1;
        }
        txtPanel.setText(ultimoResultado+"");
        operacion = true;
        ultimoNumero = d1;
        ultimoOperador = CHARACTER_DIV;
        AC_CE_Result();
    }

    public void onMul(View v){
        double d1 = darNumIngresado();
        if(!operacion) {
            txtMessage.setText(ultimoResultado + CHARACTER_MUL+ ultimoNumero);
            ultimoResultado = ultimoResultado * d1;
        }
        else{
            ultimoResultado = d1;
        }
        txtPanel.setText(ultimoResultado+"");
        operacion = true;
        ultimoNumero = d1;
        ultimoOperador = CHARACTER_MUL;
        AC_CE_Result();
    }

    public void onMin(View v){
        double d1 = darNumIngresado();
        if(!operacion) {
            txtMessage.setText(ultimoResultado + CHARACTER_MIN + ultimoNumero);
            ultimoResultado = ultimoResultado - d1;
        }
        else{
            ultimoResultado = d1;
        }
        txtPanel.setText(ultimoResultado+"");
        operacion = true;
        ultimoNumero = d1;
        ultimoOperador = CHARACTER_MIN;
        AC_CE_Result();
    }

    public void onAdd(View v){
        double d1 = darNumIngresado();
        if(!operacion) {
            txtMessage.setText(ultimoResultado + CHARACTER_ADD + ultimoNumero);
            ultimoResultado = ultimoResultado + d1;
        }
        else{
            ultimoResultado = d1;
        }
        txtPanel.setText(ultimoResultado+"");
        operacion = true;
        ultimoNumero = d1;
        ultimoOperador = CHARACTER_ADD;
        AC_CE_Result();
    }

    public double operar(double d1, double d2, String operando){
        double d3 = 0;
        if (operando.equals(CHARACTER_ADD))
            d3 = d1+d2;
        else if (operando.equals(CHARACTER_DIV))
            d3 = d1/d2;
        else if (operando.equals(CHARACTER_MIN))
            d3 = d1-d2;
        else if (operando.equals(CHARACTER_MUL))
            d3 = d1*d2;
        return d3;
    }

    public void onEqual(View v){
        double d1 = darNumIngresado();
        if(ultimoOperador.equals("")){
            txtMessage.setText(d1+"");
            txtPanel.setText(d1+"");
        }
        else{
            if(!operacion)
                ultimoNumero = darNumIngresado();
            if(ultimoOperador.equals(CHARACTER_ADD)){
                double d2 = ultimoResultado + ultimoNumero;
                txtMessage.setText(ultimoResultado+"+"+ultimoNumero);
                txtPanel.setText(d2+"");
                ultimoResultado = d2;
            }
            else if(ultimoOperador.equals(CHARACTER_DIV)){
                double d2 = ultimoResultado / ultimoNumero;
                txtMessage.setText(ultimoResultado+"/"+ultimoNumero);
                txtPanel.setText(d2+"");
                ultimoResultado = d2;
            }
            else if(ultimoOperador.equals(CHARACTER_MIN)){
                double d2 = ultimoResultado - ultimoNumero;
                txtMessage.setText(ultimoResultado+"-"+ultimoNumero);
                txtPanel.setText(d2+"");
                ultimoResultado = d2;
            }
            else if(ultimoOperador.equals(CHARACTER_MUL)){
                double d2 = ultimoResultado * ultimoNumero;
                txtMessage.setText(ultimoResultado+"*"+ultimoNumero);
                txtPanel.setText(d2+"");
                ultimoResultado = d2;
            }
        }
        operacion = true;
        AC_CE_Result();
    }

    public void onAC(View v){
        //message = "";
        ultimoNumero = 0;
        ultimoOperador = "";
        ultimoResultado = 0;
        txtMessage.setText("");
        txtPanel.setText(ultimoNumero+"");
        operacion=true;
    }

    public void onCE(View v){
        ultimoResultado = 0;
        txtPanel.setText("0");
        operacion=true;
    }

    public void AC_CE_Typing(){
        botonAC.setEnabled(false);
        botonCE.setEnabled(true);
    }

    public void AC_CE_Result(){
        botonAC.setEnabled(true);
        botonCE.setEnabled(false);
    }

    public double darNumIngresado(){
        String s1 = txtPanel.getText()+"";
        //if(s1 == null || s1.trim().equals(""))
        //    return 0;
        return  Double.parseDouble(s1);
    }
}