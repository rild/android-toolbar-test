package rimp.rild.com.android.android_toolbar_test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rild on 16/07/31.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private List<String> data;

    private LayoutInflater inflater;

    public RecyclerAdapter(Context context, List<String> data) {
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.list_item, parent, false));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.text);
        }
    }
}
