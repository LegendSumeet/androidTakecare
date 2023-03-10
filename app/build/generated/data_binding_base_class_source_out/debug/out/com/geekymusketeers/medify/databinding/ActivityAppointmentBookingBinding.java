// Generated by view binder compiler. Do not edit!
package com.geekymusketeers.medify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.geekymusketeers.medify.R;
import com.google.android.material.textfield.TextInputLayout;
import com.ncorti.slidetoact.SlideToActView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAppointmentBookingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView bookText;

  @NonNull
  public final SlideToActView btnFinalbook;

  @NonNull
  public final AutoCompleteTextView diseaseDropdown;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextInputLayout menuDisease;

  @NonNull
  public final TextInputLayout menuSituation;

  @NonNull
  public final TextInputLayout menuTime;

  @NonNull
  public final EditText selectDate;

  @NonNull
  public final TextView signUph2;

  @NonNull
  public final AutoCompleteTextView situationDropdown;

  @NonNull
  public final AutoCompleteTextView timeDropdown;

  private ActivityAppointmentBookingBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView bookText, @NonNull SlideToActView btnFinalbook,
      @NonNull AutoCompleteTextView diseaseDropdown, @NonNull LinearLayout linearLayout,
      @NonNull TextInputLayout menuDisease, @NonNull TextInputLayout menuSituation,
      @NonNull TextInputLayout menuTime, @NonNull EditText selectDate, @NonNull TextView signUph2,
      @NonNull AutoCompleteTextView situationDropdown, @NonNull AutoCompleteTextView timeDropdown) {
    this.rootView = rootView;
    this.bookText = bookText;
    this.btnFinalbook = btnFinalbook;
    this.diseaseDropdown = diseaseDropdown;
    this.linearLayout = linearLayout;
    this.menuDisease = menuDisease;
    this.menuSituation = menuSituation;
    this.menuTime = menuTime;
    this.selectDate = selectDate;
    this.signUph2 = signUph2;
    this.situationDropdown = situationDropdown;
    this.timeDropdown = timeDropdown;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAppointmentBookingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAppointmentBookingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_appointment_booking, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAppointmentBookingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.book_text;
      TextView bookText = ViewBindings.findChildViewById(rootView, id);
      if (bookText == null) {
        break missingId;
      }

      id = R.id.btn_finalbook;
      SlideToActView btnFinalbook = ViewBindings.findChildViewById(rootView, id);
      if (btnFinalbook == null) {
        break missingId;
      }

      id = R.id.disease_dropdown;
      AutoCompleteTextView diseaseDropdown = ViewBindings.findChildViewById(rootView, id);
      if (diseaseDropdown == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.menu_disease;
      TextInputLayout menuDisease = ViewBindings.findChildViewById(rootView, id);
      if (menuDisease == null) {
        break missingId;
      }

      id = R.id.menu_situation;
      TextInputLayout menuSituation = ViewBindings.findChildViewById(rootView, id);
      if (menuSituation == null) {
        break missingId;
      }

      id = R.id.menu_time;
      TextInputLayout menuTime = ViewBindings.findChildViewById(rootView, id);
      if (menuTime == null) {
        break missingId;
      }

      id = R.id.select_date;
      EditText selectDate = ViewBindings.findChildViewById(rootView, id);
      if (selectDate == null) {
        break missingId;
      }

      id = R.id.signUph2;
      TextView signUph2 = ViewBindings.findChildViewById(rootView, id);
      if (signUph2 == null) {
        break missingId;
      }

      id = R.id.situation_dropdown;
      AutoCompleteTextView situationDropdown = ViewBindings.findChildViewById(rootView, id);
      if (situationDropdown == null) {
        break missingId;
      }

      id = R.id.time_dropdown;
      AutoCompleteTextView timeDropdown = ViewBindings.findChildViewById(rootView, id);
      if (timeDropdown == null) {
        break missingId;
      }

      return new ActivityAppointmentBookingBinding((ConstraintLayout) rootView, bookText,
          btnFinalbook, diseaseDropdown, linearLayout, menuDisease, menuSituation, menuTime,
          selectDate, signUph2, situationDropdown, timeDropdown);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
