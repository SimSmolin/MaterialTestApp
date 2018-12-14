package com.example.materialtestapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment representing the login screen for Shrine.
 */
public class FindFragment extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.find_fragment, container, false);
        final TextInputLayout textInputLayout = view.findViewById(R.id.search_input_text_layout);
        final TextInputEditText searchInputEditText = view.findViewById(R.id.search_input_text);
        MaterialButton nextButton = view.findViewById(R.id.find_button);

        // Set an error if the password is less than 8 characters.
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    ((NavigationHost) getActivity()).navigateTo(new RecyclerViewFragment(), true); // Navigate to the next Fragment
            }
        });

        return view;
    }

}
