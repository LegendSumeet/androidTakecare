package com.geekymusketeers.medify.mainFragments


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geekymusketeers.medify.CheckerActivity
import com.geekymusketeers.medify.Firstaid.firsrActivity
import com.geekymusketeers.medify.MapsActivity
import com.geekymusketeers.medify.Reminder.RemindersActivity
import com.geekymusketeers.medify.prescription.AddPrescriptionActivity
import com.geekymusketeers.medify.profile.ProfileActivity
import com.geekymusketeers.medify.auth.SignIn_Activity
import com.geekymusketeers.medify.databinding.FragmentSettingsBinding
import com.geekymusketeers.medify.databinding.FragmentStatisticsBinding
import com.geekymusketeers.medify.insure.Insure
import com.geekymusketeers.medify.remind.AlarmReceiver
import com.geekymusketeers.medify.remind.reminder
import com.geekymusketeers.medify.sosfeature.SOSdialer

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*


class StatisticsFragment : Fragment() {

    private var _binding:FragmentStatisticsBinding? = null
    private val binding get() = _binding!!
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var db: DatabaseReference
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var userID: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentStatisticsBinding.inflate(inflater, container, false)

        binding.insurance.setOnClickListener {
            startActivity(Intent(requireActivity(), Insure::class.java))
        }
        binding.yt.setOnClickListener {
            startActivity(Intent(requireActivity(), firsrActivity::class.java))
        }
        binding.tytyty.setOnClickListener {
                startActivity(Intent(requireActivity(), CheckerActivity::class.java))
        }
        binding.logoutButton12.setOnClickListener {
            startActivity(Intent(requireActivity(), reminder::class.java))
        }
        binding.SOS1.setOnClickListener {
            startActivity(Intent(requireActivity(), SOSdialer::class.java))

        }
        binding.logoutButton.setOnClickListener {
            startActivity(Intent(requireActivity(), MapsActivity::class.java))

        }

        return binding.root
    }

}