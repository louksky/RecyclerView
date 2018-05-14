package info.androidhive.Louki;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class birthadapter extends RecyclerView.Adapter<birthadapter.MyViewHolder> {

    private List<BirthDay> birthlist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, fname, date;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            fname = (TextView) view.findViewById(R.id.fname);
            date = (TextView) view.findViewById(R.id.date);
        }
    }


    public birthadapter(List<BirthDay> birthlist) {
        this.birthlist = birthlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.birth_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BirthDay birthDay = birthlist.get(position);
        holder.name.setText(birthDay.getName());
        holder.fname.setText(birthDay.getFname());
        holder.date.setText(birthDay.getDate());
    }

    @Override
    public int getItemCount() {
        return birthlist.size();
    }
}
