package br.com.rbeninca.listafrutas;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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
        return super.getView(position, convertView, parent);


    }
}
