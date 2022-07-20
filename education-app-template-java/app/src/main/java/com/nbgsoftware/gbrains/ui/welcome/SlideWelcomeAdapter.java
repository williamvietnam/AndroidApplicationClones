package com.nbgsoftware.gbrains.ui.welcome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nbgsoftware.gbrains.data.models.Welcome;
import com.nbgsoftware.gbrains.data.models.response.WelcomeResponse;
import com.nbgsoftware.gbrains.databinding.SlideWelcomeBinding;

public class SlideWelcomeAdapter extends RecyclerView.Adapter<SlideWelcomeAdapter.SlideWelcomeViewHolder> {

    private final WelcomeResponse welcomeResponse;
    private final Context context;

    public SlideWelcomeAdapter(WelcomeResponse welcomeResponse, Context context) {
        this.welcomeResponse = welcomeResponse;
        this.context = context;
    }

    @NonNull
    @Override
    public SlideWelcomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SlideWelcomeViewHolder(SlideWelcomeBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SlideWelcomeViewHolder holder, int position) {
        holder.onBindData(position);
    }

    @Override
    public int getItemCount() {
        if (welcomeResponse.getWelcomeList() != null) {
            return welcomeResponse.getWelcomeList().size();
        }
        return 0;
    }

    class SlideWelcomeViewHolder extends RecyclerView.ViewHolder {
        private final SlideWelcomeBinding binding;

        public SlideWelcomeViewHolder(@NonNull SlideWelcomeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBindData(int position) {
            Welcome welcome = welcomeResponse.getWelcomeList().get(position);
            binding.ivWelcome.setImageResource(welcome.getImageDrawable());
            binding.tvTitle.setText(welcome.getTitle());
            binding.tvDescription.setText(welcome.getDescription());
        }
    }
}
