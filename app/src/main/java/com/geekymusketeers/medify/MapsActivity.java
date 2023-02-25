package com.geekymusketeers.medify;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.geekymusketeers.medify.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng hospitalLatLng = new LatLng(19.21662456493429, 73.0828609002468);
        // Add a marker in Sydney and move the camera
        CameraPosition googlePlex = CameraPosition.builder()
                .target(hospitalLatLng)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng).title("KALYAN HOSPITAL"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex), 2000, null);
        LatLng hospitalLatLng1 = new LatLng(19.03122191006914, 72.86681592400076);
        CameraPosition googlePlex1 = CameraPosition.builder()
                .target(hospitalLatLng1)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng1).title("Pooja Nursing Home"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex1), 2000, null);


        LatLng hospitalLatLng2 = new LatLng(19.02958055071627, 72.8554241737601);
        CameraPosition googlePlex2 = CameraPosition.builder()
                .target(hospitalLatLng2)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng2).title("Nirmal Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex2), 2000, null);


        LatLng hospitalLatLng3 = new LatLng(19.02737028570604, 72.85576254096122);
        CameraPosition googlePlex3 = CameraPosition.builder()
                .target(hospitalLatLng3)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng3).title("Sobti Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex3), 2000, null);


        LatLng hospitalLatLng4 = new LatLng(19.026518301439154, 72.85456091136986);
        CameraPosition googlePlex4 = CameraPosition.builder()
                .target(hospitalLatLng4)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng4).title("Matunga Clinic & Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex4), 2000, null);


        LatLng hospitalLatLng5 = new LatLng(19.034012201017376, 72.86687224983666);
        CameraPosition googlePlex5 = CameraPosition.builder()
                .target(hospitalLatLng5)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng5).title("Antop Hill Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex5), 2000, null);


        LatLng hospitalLatLng6 = new LatLng(19.037703934721076, 72.86004871049603);
        CameraPosition googlePlex6 = CameraPosition.builder()
                .target(hospitalLatLng6)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng6).title("Sion Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex6), 2000, null);


        LatLng hospitalLatLng7 = new LatLng(19.031637748419463, 72.87145483422057);
        CameraPosition googlePlex7 = CameraPosition.builder()
                .target(hospitalLatLng7)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng7).title("Dr. Mukesh Bhanushali's Clinic"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex7), 2000, null);


        LatLng hospitalLatLng8 = new LatLng(19.039868088600585, 72.86206055884277);
        CameraPosition googlePlex8 = CameraPosition.builder()
                .target(hospitalLatLng8)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng8).title("New Sunita Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex8), 2000, null);


        LatLng hospitalLatLng9 = new LatLng(19.047439799350524, 72.84293655633878);
        CameraPosition googlePlex9 = CameraPosition.builder()
                .target(hospitalLatLng9)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng9).title("S L Raheja Hospital - Fortis"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex9), 2000, null);


        LatLng hospitalLatLng10 = new LatLng(19.041273702664967, 72.85160545530857);
        CameraPosition googlePlex10 = CameraPosition.builder()
                .target(hospitalLatLng10)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng10).title("Si hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex10), 2000, null);


        LatLng hospitalLatLng11 = new LatLng(19.040218952659416, 72.84954551891971);
        CameraPosition googlePlex11 = CameraPosition.builder()
                .target(hospitalLatLng11)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng11).title("Mahanagar Palika Hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex11), 2000, null);


        LatLng hospitalLatLng12 = new LatLng(19.03534211237022, 72.8389370190034);
        CameraPosition googlePlex12 = CameraPosition.builder()
                .target(hospitalLatLng12)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng12).title("Hinduja Hospital OPD Building"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex12), 2000, null);


        LatLng hospitalLatLng13 = new LatLng(19.02512945703856, 72.8428212723084);
        CameraPosition googlePlex13 = CameraPosition.builder()
                .target(hospitalLatLng13)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng13).title("Diwan hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex13), 2000, null);


        LatLng hospitalLatLng14 = new LatLng(19.04142350766467, 72.85447403222344);
        CameraPosition googlePlex14 = CameraPosition.builder()
                .target(hospitalLatLng14)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng14).title("AAYUSH HOSPITAL"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex14), 2000, null);


        LatLng hospitalLatLng15 = new LatLng(19.051692354225892, 72.82917318178296);
        CameraPosition googlePlex15 = CameraPosition.builder()
                .target(hospitalLatLng15)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng15).title("Lilavati Hospital And Research Centre"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex15), 2000, null);


        LatLng hospitalLatLng16 = new LatLng(19.0310238263901, 72.84102407628293);
        CameraPosition googlePlex16 = CameraPosition.builder()
                .target(hospitalLatLng16)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng16).title("suvidha hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex16), 2000, null);


        LatLng hospitalLatLng17 = new LatLng(19.018918712674797, 72.8676300042663);
        CameraPosition googlePlex17 = CameraPosition.builder()
                .target(hospitalLatLng17)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng17).title("R S V hospital"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex17), 2000, null);


        LatLng hospitalLatLng18 = new LatLng(19.030116383703273, 72.8519229893012);
        CameraPosition googlePlex18 = CameraPosition.builder()
                .target(hospitalLatLng18)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng18).title("Raheja Fortis associate Hospital , Mahim"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex18), 2000, null);


        LatLng hospitalLatLng19 = new LatLng(19.014455639628242, 72.86217338021925);
        CameraPosition googlePlex19 = CameraPosition.builder()
                .target(hospitalLatLng19)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng19).title("MbPT Hospital Entrance"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex19), 2000, null);


        LatLng hospitalLatLng20 = new LatLng(19.01812264202373, 72.84676074052732);
        CameraPosition googlePlex20 = CameraPosition.builder()
                .target(hospitalLatLng20)
                .zoom(16f)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.addMarker(new MarkerOptions().position(hospitalLatLng20).title("Dr .amonkars"));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex20), 2000,null);

    }
}