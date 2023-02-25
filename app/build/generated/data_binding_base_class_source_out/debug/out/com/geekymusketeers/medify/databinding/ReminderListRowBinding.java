// Generated by view binder compiler. Do not edit!
package com.geekymusketeers.medify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.geekymusketeers.medify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReminderListRowBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView reminderDofTvw;

  @NonNull
  public final FrameLayout reminderListRowFrameLayout;

  @NonNull
  public final TextView reminderTitleTvw;

  @NonNull
  public final TextView reminderTofTvw;

  private ReminderListRowBinding(@NonNull FrameLayout rootView, @NonNull TextView reminderDofTvw,
      @NonNull FrameLayout reminderListRowFrameLayout, @NonNull TextView reminderTitleTvw,
      @NonNull TextView reminderTofTvw) {
    this.rootView = rootView;
    this.reminderDofTvw = reminderDofTvw;
    this.reminderListRowFrameLayout = reminderListRowFrameLayout;
    this.reminderTitleTvw = reminderTitleTvw;
    this.reminderTofTvw = reminderTofTvw;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ReminderListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReminderListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.reminder_list_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReminderListRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.reminder_dof_tvw;
      TextView reminderDofTvw = ViewBindings.findChildViewById(rootView, id);
      if (reminderDofTvw == null) {
        break missingId;
      }

      FrameLayout reminderListRowFrameLayout = (FrameLayout) rootView;

      id = R.id.reminder_title_tvw;
      TextView reminderTitleTvw = ViewBindings.findChildViewById(rootView, id);
      if (reminderTitleTvw == null) {
        break missingId;
      }

      id = R.id.reminder_tof_tvw;
      TextView reminderTofTvw = ViewBindings.findChildViewById(rootView, id);
      if (reminderTofTvw == null) {
        break missingId;
      }

      return new ReminderListRowBinding((FrameLayout) rootView, reminderDofTvw,
          reminderListRowFrameLayout, reminderTitleTvw, reminderTofTvw);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}