// Generated by view binder compiler. Do not edit!
package com.geekymusketeers.medify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.geekymusketeers.medify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppointmentListBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView diseaseDisplay;

  @NonNull
  public final ImageView downloadPrescription;

  @NonNull
  public final TextView nameDisplay;

  private AppointmentListBinding(@NonNull CardView rootView, @NonNull TextView diseaseDisplay,
      @NonNull ImageView downloadPrescription, @NonNull TextView nameDisplay) {
    this.rootView = rootView;
    this.diseaseDisplay = diseaseDisplay;
    this.downloadPrescription = downloadPrescription;
    this.nameDisplay = nameDisplay;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static AppointmentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppointmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.appointment_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppointmentListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.diseaseDisplay;
      TextView diseaseDisplay = ViewBindings.findChildViewById(rootView, id);
      if (diseaseDisplay == null) {
        break missingId;
      }

      id = R.id.downloadPrescription;
      ImageView downloadPrescription = ViewBindings.findChildViewById(rootView, id);
      if (downloadPrescription == null) {
        break missingId;
      }

      id = R.id.nameDisplay;
      TextView nameDisplay = ViewBindings.findChildViewById(rootView, id);
      if (nameDisplay == null) {
        break missingId;
      }

      return new AppointmentListBinding((CardView) rootView, diseaseDisplay, downloadPrescription,
          nameDisplay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
