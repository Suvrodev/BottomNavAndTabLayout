package com.example.bottomnavandtablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    View view;
    EditText GetTeext;
    Button SendButton,BottomSheet;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_home, container, false);

        // Inflate the layout for this fragment


        GetTeext= view.findViewById(R.id.ed_id);
        SendButton=view.findViewById(R.id.btn);
        BottomSheet=view.findViewById(R.id.bs);


        BottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Dekha Jak",Toast.LENGTH_SHORT).show();
                BottomSheetFragment bottomSheetFragment=new BottomSheetFragment();
                bottomSheetFragment.show(getParentFragmentManager(),bottomSheetFragment.getTag());
            }
        });


        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=GetTeext.getText().toString();
                Toast.makeText(getContext(),str, Toast.LENGTH_SHORT).show();

                Bundle bundle=new Bundle();
                bundle.putString("strr",str);

               // MessageFragment messageFragment=new MessageFragment();
                //messageFragment.setArguments(bundle);


               ///Lagbe->
              //  getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id,messageFragment).commit();

                /////////////////////////
                getParentFragmentManager().setFragmentResult("okk",bundle);


               // f2.setT(str);
            }
        });


        return view ;
    }
}