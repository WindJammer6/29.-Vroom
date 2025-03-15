package com.example.vroomandroidapplicationv4.ui.search.relatedtocalenderview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.example.vroomandroidapplicationv4.R;

public class TimeSelectionBottomSheet extends BottomSheetDialogFragment {

    private String selectedDate; // Store selected date
    private Button btnBook; // Book button reference

    public TimeSelectionBottomSheet(String date) {
        this.selectedDate = date; // Receive date from calendar
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_time_selection, container, false);

        // Set selected date text
        TextView tvSelectedDate = view.findViewById(R.id.tvSelectedDate);

        // Time slot buttons
        Button btn9to11 = view.findViewById(R.id.btn_9to11);
        Button btn1to3 = view.findViewById(R.id.btn_1to3);
        Button btn4to6 = view.findViewById(R.id.btn_4to6);
        Button btn8to10 = view.findViewById(R.id.btn_8to10);
        btnBook = view.findViewById(R.id.btnBook); // Initialize book button

        // Hide book button initially
        btnBook.setVisibility(View.GONE);

        // Handle time slot selection
        View.OnClickListener timeSlotClickListener = v -> {
            v.setEnabled(false);
            String time = ((Button) v).getText().toString();
            Toast.makeText(getActivity(), "Selected: " + time, Toast.LENGTH_SHORT).show();

            // Show book button once a time is selected
            btnBook.setVisibility(View.VISIBLE);
        };

        btn9to11.setOnClickListener(timeSlotClickListener);
        btn1to3.setOnClickListener(timeSlotClickListener);
        btn4to6.setOnClickListener(timeSlotClickListener);
        btn8to10.setOnClickListener(timeSlotClickListener);

        // Book Button Click
        btnBook.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Booking Confirmed for " + selectedDate, Toast.LENGTH_SHORT).show();
            dismiss(); // Close the bottom sheet
        });

        return view;
    }
}
