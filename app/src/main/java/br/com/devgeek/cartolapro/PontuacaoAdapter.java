package br.com.devgeek.cartolapro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by computador1 on 9/2/16.
 */
public class PontuacaoAdapter extends RecyclerView.Adapter<PontuacaoAdapter.PontuacaoViewHolder> {

    private List<Pontuacao> pontuacaoList;

    public PontuacaoAdapter(List<Pontuacao> pontuacaoList) {
        this.pontuacaoList = pontuacaoList;
    }


    @Override
    public int getItemCount() {
            return pontuacaoList.size();
            }

    @Override
    public void onBindViewHolder(PontuacaoViewHolder contactViewHolder, int i) {
            Pontuacao ci = pontuacaoList.get(i);
            contactViewHolder.vName.setText(ci.name);
            contactViewHolder.vSurname.setText(ci.surname);
            contactViewHolder.vEmail.setText(ci.email);
            contactViewHolder.vTitle.setText(ci.name + " " + ci.surname);
            }

    @Override
    public PontuacaoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.
            from(viewGroup.getContext()).
            inflate(R.layout.pontuacao_layout, viewGroup, false);

            return new PontuacaoViewHolder(itemView);
            }

    public static class PontuacaoViewHolder extends RecyclerView.ViewHolder {

        protected TextView vName;
        protected TextView vSurname;
        protected TextView vEmail;
        protected TextView vTitle;

        public PontuacaoViewHolder(View v) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.txtName);
            vSurname = (TextView)  v.findViewById(R.id.txtSurname);
            vEmail = (TextView)  v.findViewById(R.id.txtEmail);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}
