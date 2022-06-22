package com.nbgsoftware.gbrains.ui.main.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.data.models.DetailFeaturedQuestion;
import com.nbgsoftware.gbrains.data.models.FeaturedQuestion;
import com.nbgsoftware.gbrains.databinding.ItemFeaturedQuestionBinding;

import java.util.List;

public class FeaturedQuestionAdapter extends RecyclerView.Adapter<FeaturedQuestionAdapter.FeaturedQuestionHolder> {

    private final Context context;
    private final List<FeaturedQuestion> featuredQuestionList;
    private ItemOnClick itemOnClick;

    public FeaturedQuestionAdapter(Context context, List<FeaturedQuestion> featuredQuestionList) {
        this.context = context;
        this.featuredQuestionList = featuredQuestionList;
    }

    @NonNull
    @Override
    public FeaturedQuestionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FeaturedQuestionHolder(ItemFeaturedQuestionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedQuestionHolder holder, int position) {
        holder.onBindData(position);
    }

    @Override
    public int getItemCount() {
        if (featuredQuestionList != null) {
            return featuredQuestionList.size();
        }
        return 0;
    }

    public class FeaturedQuestionHolder extends RecyclerView.ViewHolder {
        private final ItemFeaturedQuestionBinding binding;

        public FeaturedQuestionHolder(@NonNull ItemFeaturedQuestionBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBindData(int position) {
            FeaturedQuestion featuredQuestion = featuredQuestionList.get(position);

            Glide.with(context)
                    .load(featuredQuestion.getAvatar())
                    .centerCrop()
                    .placeholder(R.drawable.image_splash)
                    .into(binding.ivAvatar);
            binding.tvName.setText(featuredQuestion.getUserName());
            binding.tvTopic.setText(featuredQuestion.getTopic());
            binding.tvQuestion.setText(featuredQuestion.getContent());
            binding.tvTotalView.setText(String.valueOf(featuredQuestion.getTotalView()));
            binding.tvTotalFollow.setText(String.valueOf(featuredQuestion.getTotalFollow()));
            binding.tvTotalAnswer.setText(String.valueOf(featuredQuestion.getTotalAnswer()));
            binding.getRoot().setOnClickListener(view -> itemOnClick.onClicked(null));
        }
    }

    public interface ItemOnClick {
        void onClicked(DetailFeaturedQuestion detailFeaturedQuestion);
    }
}
