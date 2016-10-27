package br.java.android.laboratorio08;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListaFragment extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] valores = new String[] { "Java Android", "Java JPA",
                "Java JSF", "Java EE"};

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        valores);
        setListAdapter(adaptador);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String item = (String) getListAdapter().getItem(position);

        DetalheFragment fragment = (DetalheFragment) getFragmentManager()
                .findFragmentById(R.id.detalheFragment);

        if(fragment != null && fragment.isInLayout()){
            fragment.setText(item);
        }else{
            Intent intent = new Intent(getActivity(),DetalheActivity.class);
            intent.putExtra("stringEnviada",item);
            startActivity(intent);
        }
    }
}
