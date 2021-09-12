package com.example.skyewall;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    ServiceAdapter serviceAdapter;
    private RoomsModel[] roomsModels;



    public HomeFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        int[] img = {R.drawable.room1, R.drawable.room2, R.drawable.room3, R.drawable.room4};
        String[] title = { "Service Room", "Service Room","Service Room","Service Room"};


        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        //search button click
        ImageView btn=view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Looking for rooms", Toast.LENGTH_LONG).show();

            }
        });
        RecyclerView recycler1 = view.findViewById(R.id.recycler1);

        recycler1.setHasFixedSize(true);
        recycler1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        serviceAdapter = new ServiceAdapter(img, title, getActivity());
        recycler1.setAdapter(serviceAdapter);

        //second Recycler
        roomsModels = new RoomsModel[] {
                new RoomsModel("Service Room", R.drawable.room1),
                new RoomsModel("Duplex Room", R.drawable.room2),
                new RoomsModel("Multi Duplex Room", R.drawable.room3),
                new RoomsModel("Simple Duplex Room", R.drawable.room4)
        };
        RecyclerView recycler2 = view.findViewById(R.id.recycler2);
        RoomNameAdapter roomNameAdapter = new RoomNameAdapter(roomsModels);
        recycler2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,true));

        recycler2.setAdapter(roomNameAdapter);
        return view;


    }

}