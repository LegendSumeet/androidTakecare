// Generated by view binder compiler. Do not edit!
package com.geekymusketeers.medify.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.geekymusketeers.medify.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentActivitylanguageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnEnglish;

  @NonNull
  public final Button btnHindi;

  @NonNull
  public final TextView textView;

  private ContentActivitylanguageBinding(@NonNull LinearLayout rootView, @NonNull Button btnEnglish,
      @NonNull Button btnHindi, @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnEnglish = btnEnglish;
    this.btnHindi = btnHindi;
    this.textView = textView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentActivitylanguageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentActivitylanguageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_activitylanguage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentActivitylanguageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnEnglish;
      Button btnEnglish = ViewBindings.findChildViewById(rootView, id);
      if (btnEnglish == null) {
        break missingId;
      }

      id = R.id.btnHindi;
      Button btnHindi = ViewBindings.findChildViewById(rootView, id);
      if (btnHindi == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ContentActivitylanguageBinding((LinearLayout) rootView, btnEnglish, btnHindi,
          textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
