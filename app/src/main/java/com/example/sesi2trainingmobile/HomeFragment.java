package com.example.sesi2trainingmobile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    TextView changeWord;
    EditText changeHere;
    Button submitBtn;
    AlertDialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        changeHere = v.findViewById(R.id.et_changeHere);
        changeWord = v.findViewById(R.id.tv_changeWord);
        submitBtn = v.findViewById(R.id.submit_btn);

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        builder.setTitle("Konfirmasi").setMessage("Apakah anda ingin mengubah text?").setPositiveButton("Iya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                changeWord.setText(changeHere.getText().toString());
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.dismiss();
                Toast.makeText(getActivity(), "Perubahan tidak jadi", Toast.LENGTH_SHORT).show();
            }
        });
        dialog = builder.create();

        submitBtn.setOnClickListener(view -> {
            dialog.show();
        });


        return v;
    }
}