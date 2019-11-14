package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class ListagemFrutasRecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FrutaController frutaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_frutas_recycler_view);


        recyclerView=findViewById(R.id.recylerView);

        //Configurando RecyclerView.
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


         frutaController =new FrutaController();

        FrutaAdapterRecyclerView frutaAdapterRecyclerView=new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
                );

        recyclerView.setAdapter(frutaAdapterRecyclerView);


        recyclerView.addOnItemTouchListener( recyclerItemClickListener);


    }

    public RecyclerItemClickListener recyclerItemClickListener= new RecyclerItemClickListener(
            getBaseContext(),
            recyclerView,
            new RecyclerItemClickListener.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Intent i = new Intent (getApplicationContext(),ExibeFrutaActivity.class);
                    i.putExtra("id", position );
                    startActivity(i);
                }

                @Override
                public void onLongItemClick(View view, int position) {

                }

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                }
            });
}
