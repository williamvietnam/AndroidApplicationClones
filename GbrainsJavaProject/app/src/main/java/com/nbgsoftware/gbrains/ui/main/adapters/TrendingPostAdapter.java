package com.nbgsoftware.gbrains.ui.main.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.data.models.TrendPost;
import com.nbgsoftware.gbrains.databinding.ItemTrendingPostBinding;

import java.util.List;

public class TrendingPostAdapter extends RecyclerView.Adapter<TrendingPostAdapter.TrendPostHolder> {

    private ItemOnClickListener itemOnClickListener;
    private List<TrendPost> trendPostList;
    private Context context;

    public TrendingPostAdapter(List<TrendPost> trendPostList, Context context) {
        this.trendPostList = trendPostList;
        this.context = context;
    }

    @NonNull
    @Override
    public TrendPostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TrendPostHolder(ItemTrendingPostBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TrendPostHolder holder, int position) {
        holder.onBindData(position);
    }

    @Override
    public int getItemCount() {
        if (trendPostList != null) {
            return trendPostList.size();
        }
        return 0;
    }

    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }

    public class TrendPostHolder extends RecyclerView.ViewHolder {
        final ItemTrendingPostBinding binding;

        public TrendPostHolder(@NonNull ItemTrendingPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBindData(int position) {
            TrendPost trendPost = trendPostList.get(position);

            Glide.with(context)
                    .load(trendPost.getThumbnail())
                    .centerCrop()
                    .placeholder(R.drawable.image_splash)
                    .into(binding.imNews);
            binding.tvTitleNews.setText(trendPost.getTitle());
            binding.tvTopic.setText(trendPost.getTopic());
            binding.tvContentNews.setText(trendPost.getContent());
            binding.tvTotalView.setText(String.valueOf(trendPost.getTotalView()));
            binding.tvDateTime.setText(String.valueOf(trendPost.getDate()));
            binding.tvTotalShare.setText(String.valueOf(trendPost.getTotalShare()));
//            binding.getRoot().setOnClickListener(view -> itemOnClick.onClicked(null));


//            binding.getRoot().setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    itemOnClickListener.onItemClicked();
//                }
//            });
        }
    }

    public interface ItemOnClickListener {
        void onItemClicked();
    }
}
