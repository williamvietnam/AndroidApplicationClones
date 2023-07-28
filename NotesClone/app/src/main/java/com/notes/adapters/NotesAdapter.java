package com.notes.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.notes.databinding.ItemContainerNoteBinding;
import com.notes.entities.Note;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {

    private final List<Note> notesList;

    public NotesAdapter(List<Note> notesList) {
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        ItemContainerNoteBinding binding = ItemContainerNoteBinding.inflate(inflater, viewGroup, false);
        return new NotesViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        if (notesList != null) {
            return notesList.size();
        }
        return 0;
    }

    class NotesViewHolder extends RecyclerView.ViewHolder {
        private final ItemContainerNoteBinding binding;

        public NotesViewHolder(@NonNull ItemContainerNoteBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(int position) {
            Note note = notesList.get(position);
            this.binding.textTitle.setText(note.getTitle());
            this.binding.textSubtitle.setText(note.getSubtitle());
            this.binding.textDateTime.setText(note.getDateTime());
        }
    }
}
