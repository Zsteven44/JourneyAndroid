package com.zafranitechllcpc.journey.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zafranitechllcpc.journey.R;
import com.zafranitechllcpc.journey.models.Establishment;
import com.zafranitechllcpc.journey.models.Journey;
import com.zafranitechllcpc.journey.models.Location;
import com.zafranitechllcpc.journey.ui.misc.JourneyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.rv_journey_list)
    RecyclerView rvJourneys;

    private JourneyAdapter journeyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        setupRecyclerView();
    }



    private void setupRecyclerView() {
        journeyAdapter = new JourneyAdapter(createDummyData(), this);
        rvJourneys.setLayoutManager(new LinearLayoutManager(this));
        rvJourneys.setAdapter(journeyAdapter);
    }

    private List<Journey> createDummyData() {
        Journey nbJourney = new Journey();
        final List<Establishment> northBeachEstablishments = new ArrayList<>();
        // Tope
        Establishment tope = new Establishment();
        tope.setName("Tope Lounge");
        Location topeLoc = new Location();
        topeLoc.setAddress("1326 Grant Ave, San Francisco, CA 94133");
        tope.setLocation(topeLoc);

        // Maggie McGarry's
        Establishment maggies = new Establishment();
        maggies.setName("Maggie McGarry's");
        Location maggieLoc = new Location();
        maggieLoc.setAddress("1353 Grant Ave, San Francisco, CA 94133");
        maggies.setLocation(maggieLoc);

        northBeachEstablishments.add(tope);
        northBeachEstablishments.add(maggies);
        nbJourney.setEstablishments(northBeachEstablishments);
        nbJourney.setName("North Beach");

        Journey missionJourney = new Journey();
        final List<Establishment> missionEstablishments = new ArrayList<>();
        // Bond Bar
        Establishment bond = new Establishment();
        bond.setName("Bond Bar");
        Location bondLoc = new Location();
        bondLoc.setAddress("3079 16th St, San Francisco, CA 94110");
        bond.setLocation(bondLoc);

        // Casanova Lounge
        Establishment casanova= new Establishment();
        casanova.setName("Casanova Lounge");
        Location casanovaLoc = new Location();
        casanovaLoc.setAddress("527 Valencia St, San Francisco, CA 94110");
        casanova.setLocation(casanovaLoc);

        missionEstablishments.add(bond);
        missionEstablishments.add(casanova);
        missionJourney.setEstablishments(missionEstablishments);
        missionJourney.setName("Mission");

        List<Journey> journeyList = new ArrayList<>();
        journeyList.add(nbJourney);
        journeyList.add(missionJourney);
        return journeyList;
    }


}
