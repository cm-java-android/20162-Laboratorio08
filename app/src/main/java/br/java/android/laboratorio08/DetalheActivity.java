package br.java.android.laboratorio08;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }

        setContentView(R.layout.activity_detalhe);

        //Aqui sera feito com que o texto seja atualizado
        // pegando uma String de uma Activity externa para essa aqui
        Bundle externo = getIntent().getExtras();
        if(externo != null){
            String recebido = externo.getString("stringEnviada");
            TextView detalheTextView = (TextView) findViewById(R.id.detalheTextView);
            detalheTextView.setText(recebido);
        }
    }
}
