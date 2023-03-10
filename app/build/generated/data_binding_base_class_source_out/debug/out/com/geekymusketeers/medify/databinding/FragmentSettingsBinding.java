// Generated by view binder compiler. Do not edit!
package com.geekymusketeers.medify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.geekymusketeers.medify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView book;

  @NonNull
  public final CardView createUPI;

  @NonNull
  public final ImageView erfgfggf;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Button logoutButton;

  @NonNull
  public final CardView logoutButton12;

  @NonNull
  public final ImageView pfimageView;

  @NonNull
  public final CardView profile;

  @NonNull
  public final CardView updatePrescription;

  @NonNull
  public final ImageView updatepdfimageView;

  @NonNull
  public final ImageView upiimageView;

  private FragmentSettingsBinding(@NonNull ConstraintLayout rootView, @NonNull TextView book,
      @NonNull CardView createUPI, @NonNull ImageView erfgfggf, @NonNull LinearLayout linearLayout,
      @NonNull Button logoutButton, @NonNull CardView logoutButton12,
      @NonNull ImageView pfimageView, @NonNull CardView profile,
      @NonNull CardView updatePrescription, @NonNull ImageView updatepdfimageView,
      @NonNull ImageView upiimageView) {
    this.rootView = rootView;
    this.book = book;
    this.createUPI = createUPI;
    this.erfgfggf = erfgfggf;
    this.linearLayout = linearLayout;
    this.logoutButton = logoutButton;
    this.logoutButton12 = logoutButton12;
    this.pfimageView = pfimageView;
    this.profile = profile;
    this.updatePrescription = updatePrescription;
    this.updatepdfimageView = updatepdfimageView;
    this.upiimageView = upiimageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.book;
      TextView book = ViewBindings.findChildViewById(rootView, id);
      if (book == null) {
        break missingId;
      }

      id = R.id.createUPI;
      CardView createUPI = ViewBindings.findChildViewById(rootView, id);
      if (createUPI == null) {
        break missingId;
      }

      id = R.id.erfgfggf;
      ImageView erfgfggf = ViewBindings.findChildViewById(rootView, id);
      if (erfgfggf == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.logoutButton;
      Button logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.logoutButton12;
      CardView logoutButton12 = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton12 == null) {
        break missingId;
      }

      id = R.id.pfimageView;
      ImageView pfimageView = ViewBindings.findChildViewById(rootView, id);
      if (pfimageView == null) {
        break missingId;
      }

      id = R.id.profile;
      CardView profile = ViewBindings.findChildViewById(rootView, id);
      if (profile == null) {
        break missingId;
      }

      id = R.id.updatePrescription;
      CardView updatePrescription = ViewBindings.findChildViewById(rootView, id);
      if (updatePrescription == null) {
        break missingId;
      }

      id = R.id.updatepdfimageView;
      ImageView updatepdfimageView = ViewBindings.findChildViewById(rootView, id);
      if (updatepdfimageView == null) {
        break missingId;
      }

      id = R.id.upiimageView;
      ImageView upiimageView = ViewBindings.findChildViewById(rootView, id);
      if (upiimageView == null) {
        break missingId;
      }

      return new FragmentSettingsBinding((ConstraintLayout) rootView, book, createUPI, erfgfggf,
          linearLayout, logoutButton, logoutButton12, pfimageView, profile, updatePrescription,
          updatepdfimageView, upiimageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
