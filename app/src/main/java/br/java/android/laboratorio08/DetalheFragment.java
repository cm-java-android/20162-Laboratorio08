package br.java.android.laboratorio08;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetalheFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View visao = inflater.inflate(R.layout.detalhe,container,false);
        return visao;
    }

    /**
     * Permite que o layout detalhe.xml tenha o seu texto alterado externamente
     * @param texto - objeto com o texto que sera alterado
     */
    public void setText(CharSequence texto){
        TextView textoTextView = (TextView) getView().findViewById(R.id.detalheTextView);
        textoTextView.setText(texto);
    }
}


