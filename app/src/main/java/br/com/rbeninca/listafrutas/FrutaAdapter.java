package br.com.rbeninca.listafrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.zip.Inflater;

public class FrutaAdapter  extends ArrayAdapter<Fruta> {

    Context mContext;
    int mResource;
    public FrutaAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Fruta[] objects) {
        super(context, resource, textViewResourceId, objects);
        mContext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Criando  propriedade LayoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        //Associando elementos da view inflada a váriaveis locais
        TextView tvCodigo = (TextView) convertView.findViewById(R.id.codigo);
        TextView tvNome = (TextView) convertView.findViewById(R.id.nome);
        TextView tvPreco =  (TextView) convertView.findViewById(R.id.preco);
        TextView tvPrecoVenda =(TextView) convertView.findViewById(R.id.preco_venda);
        ImageView imgView = (ImageView) convertView.findViewById(R.id.imageView)

        return convertView;
    }
}
