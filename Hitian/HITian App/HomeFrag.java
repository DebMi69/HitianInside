//Home code and Connect Us code//

package com.example.hitianinside;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class homefrag extends Fragment {
    ImageView h55,h22,h33,h44;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {{

        h55 = findViewByid(R.id.h11);
        h22 = findViewByid(R.id.h22);
        h33 = findViewByid(R.id.h33);
        h44 = findViewByid(R.id.h44);

        h22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/HITian.Inside/")
            }
        h33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/channel/UCbIfnsMFKnkONyT8QCPifbw/videos?view=57")
            }
        h44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/hitianinside/?hl=en")
            }
        h55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 gotoUrl("https://www.linkedin.com/company/hitian-inside/?originalSubdomain=in")
            }
        });


    }return inflater.inflate(R.layout.fragment_homefrag, container, false);
    }
    private void gotoUrl(String s) {
        Uri uri =uri.parse(s)
        startActivity(new Intent(Intent.ACTION_VIEW,uri))        
    }
