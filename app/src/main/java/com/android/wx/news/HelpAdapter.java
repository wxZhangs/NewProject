package com.android.wx.news;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/5/29.
 */

public class HelpAdapter extends RecyclerView.Adapter<HelpAdapter.ViewHoudle> {

    private List<HelpDataBean> list;

    private Context context;

    public HelpAdapter(List<HelpDataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    OnClickItemListener onClickItemListener;

    public void setOnClickItemListener(OnClickItemListener onClickItemListener) {
        this.onClickItemListener = onClickItemListener;
    }

    @Override
    public ViewHoudle onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.help_items, parent, false);
        TextView view = new TextView(parent.getContext());
        ViewHoudle houdle = new ViewHoudle(view);
        return houdle;
    }

    @Override
    public void onBindViewHolder(final ViewHoudle holder, int position) {

//        holder.helpitemTitle.setText(list.get(position).getPost_title());
//        holder.helpitemContent.setText(list.get(position).getPost_excerpt());
//        Glide.with(context)
//                .load(list.get(position).getSmeta())
//                .thumbnail(0.1f)
//                .diskCacheStrategy(DiskCacheStrategy.ALL) //设置缓存
//                .into(holder.helpitemImg);
//        holder.layout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (onClickItemListener != null) {
//                    onClickItemListener.setOnItemClick(holder.getAdapterPosition());
//                }
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return list.isEmpty()?0:list.size();
    }

    public class ViewHoudle extends RecyclerView.ViewHolder {
//        @Bind(R.id.helpitem_img)
//        ImageView helpitemImg;
//        @Bind(R.id.helpitem_title)
//        TextView helpitemTitle;
//        @Bind(R.id.helpitem_content)
//        TextView helpitemContent;
//        @Bind(R.id.helpitem_layout)
//        LinearLayout layout;

        public ViewHoudle(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface OnClickItemListener {
        void setOnItemClick(int position);
    }

}
