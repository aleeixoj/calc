package com.calc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btDot,btBackspace,btIgual,btMenos,btSoma,btMultiplica,btDivisao,btClear,nm0,nm1,nm2,nm3,nm4,nm5,nm6,nm7,nm8,nm9;
    TextView lb,res,lb2,op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //linka o front com o back
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btDot = (Button) findViewById(R.id.btDot);
        btBackspace = (Button)findViewById(R.id.btBackspace);
        btIgual = (Button)findViewById(R.id.btIgual);
        btMenos = (Button)findViewById(R.id.btMenos);
        btSoma = (Button)findViewById(R.id.btSoma);
        btMultiplica = (Button)findViewById(R.id.btMultiplica);
        btDivisao = (Button)findViewById(R.id.btDivisao);
        btClear = (Button)findViewById(R.id.btClear);
        nm0 = (Button)findViewById(R.id.nm0);
        nm1 = (Button)findViewById(R.id.nm1);
        nm2 = (Button)findViewById(R.id.nm2);
        nm3 = (Button)findViewById(R.id.nm3);
        nm4 = (Button)findViewById(R.id.nm4);
        nm5 = (Button)findViewById(R.id.nm5);
        nm6 = (Button)findViewById(R.id.nm6);
        nm7 = (Button)findViewById(R.id.nm7);
        nm8 = (Button)findViewById(R.id.nm8);
        nm9 = (Button)findViewById(R.id.nm9);
        lb = (TextView) findViewById(R.id.lb);
        res = (TextView) findViewById(R.id.res);
        lb2 = (TextView) findViewById(R.id.lb2);
        op = (TextView) findViewById(R.id.op);


    }
boolean bool = false;
    //numeros
    public void nm0 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"0");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"0");
        }

    }
    public void nm1 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"1");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"1");
        }
    }
    public void nm2 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"2");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"2");
        }

    }
    public void nm3 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"3");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"3");
        }
    }
    public void nm4 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"4");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"4");
        }
    }
    public void nm5 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"5");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"5");
        }

    }
    public void nm6 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"6");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"6");
        }
    }
    public void nm7 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"7");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"7");
        }

    }
    public void nm8 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"8");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"8");
        }
    }
    public void nm9 (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            lb.setText(str+"9");

        }else {
            String str = lb2.getText().toString();
            lb2.setText(str+"9");
        }

    }
    //ponto
    public void btDot (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            if(str.contains(".")){

            }else{

                lb.setText(str+".");
            }
        }else{
            String str = lb2.getText().toString();
            if(str.contains(".")){

            }else{

                lb2.setText(str+".");
            }
        }

    }
    //botao limpar tudo
    public void btClear (View V) {
        bool = false;
            lb.setText("");
            lb2.setText("");
            op.setText("");
            res.setText("");
    }
    public void btSoma (View V) {
        bool = true;
        op.setText("+");
    }
    public void btDivisao (View V) {
        bool = true;
        op.setText("/");
    }
    public void btMultiplica (View V) {
        bool = true;
        op.setText("*");

    }
    public void btMenos (View V) {
        bool = true;
        op.setText("-");
    }
    //botao apagar apenas 1 numero
    public void btBackspace (View V) {
        if(bool == false){
            String str = lb.getText().toString();
            if(str.length() > 0){
                String str_sub = str.substring(0, str.length() - 1);
                lb.setText(str_sub);
            }else{
                lb.setText("");
            }
        }else {
            String str = lb2.getText().toString();
            if(str.length() > 0){
                String str_sub = str.substring(0, str.length() - 1);
                lb2.setText(str_sub);
            }else{
                lb2.setText("");
            }
        }


    }
    public void btIgual (View V) {
        String text_1 = lb.getText().toString();
        String text_2 = lb2.getText().toString();
        String text_3 = op.getText().toString();

        if(text_2.length() > 0){
            //converte string para inteiro
            int txt1 = Integer.parseInt(text_1);
            int txt2 = Integer.parseInt(text_2);
            //operadores
            if(text_3.contains("*")){
                int contas = txt1*txt2;
                String str = Integer.toString(contas);
                //exibe o resultado
                res.setText(str);

            }else if(text_3.contains("/")){
                int contas = txt1/txt2;
                String str = Integer.toString(contas);
                //exibe o resultado
                res.setText(str);



            }else if(text_3.contains("+")){
                int contas = txt1+txt2;
                String str = Integer.toString(contas);
                //exibe o resultado
                res.setText(str);


            }else if(text_3.contains("-")){
                int contas = txt1-txt2;
                String str = Integer.toString(contas);
                //exibe o resultado
                res.setText(str);


            }else{
                Toast.makeText(this, "Não Foi possivel", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, text_1, Toast.LENGTH_SHORT).show();
        }
    }

}