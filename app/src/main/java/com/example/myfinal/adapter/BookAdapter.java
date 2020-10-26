package com.example.myfinal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfinal.R;
import com.example.myfinal.vo.Book;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context context;
    private ArrayList<Book> booksEntities;
    private View inflater;

    public BookAdapter(Context context, ArrayList<Book> booksEntities) {
        this.context = context;
        this.booksEntities = booksEntities;
    }

    @NonNull
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       inflater = LayoutInflater.from(context).inflate(R.layout.item_home,parent,false);
       BookViewHolder bookViewHolder = new BookViewHolder(inflater);
       return bookViewHolder;
    }


    public void onBindViewHolder(@NonNull BookAdapter.BookViewHolder holder, int position) {

        Book data = booksEntities.get(position);
        holder.tv_title.setText(data.name);
        holder.tv_container.setText(data.container);

    }


    public int getItemCount() {
        return booksEntities.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_pic;
        private TextView tv_title;
        private TextView tv_container;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_pic = itemView.findViewById(R.id.ivpic);
            tv_title = itemView.findViewById(R.id.tvtitle);
            tv_container = itemView.findViewById(R.id.tvcontainer);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (onItemClickListener != null){
                        onItemClickListener.OnItemClick(v,booksEntities.get(getLayoutPosition()));
                    }
                }
            });


        }
    }
    public interface OnItemClickListener {
        /**
         * 接口中的点击每一项的实现方法，参数自己定义
         *
         * @param view 点击的item的视图
         * @param data 点击的item的数据
         */
        public void OnItemClick(View view, Book data);
    }

    private BookAdapter.OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(BookAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
