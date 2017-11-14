package com.streamapp.abhishek.mapsapitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   /* EditText etX,etY;
    Button button;*/
    public double x = 22.7765673;
    public double y = 86.1437094;
    public String label = "Marker";
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*etX = (EditText) findViewById(R.id.edittextX);
        etY = (EditText) findViewById(R.id.edittextY);
        button =(Button) findViewById(R.id.button);
        etX.setText(Double.toString(x));
        etY.setText(Double.toString(y));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                x = Double.parseDouble(etX.getText().toString());
                y = Double.parseDouble(etY.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putDouble("Xcoordinate", x);
                bundle.putDouble("Ycoordinate", y);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });*/

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        java.util.Collections.sort(expandableListTitle);
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Expanded.",
                        Toast.LENGTH_SHORT).show();*/
            }
        });
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " List Collapsed.",
                        Toast.LENGTH_SHORT).show();*/

            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
               /* Toast.makeText(
                        getApplicationContext(),
                        expandableListTitle.get(groupPosition)
                                + " -> "
                                + expandableListDetail.get(
                                expandableListTitle.get(groupPosition)).get(
                                childPosition) + "   " + groupPosition + "," + childPosition + "." + id, Toast.LENGTH_SHORT
                ).show();*/
                if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel A")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.780257;
                    y = 86.144046;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);

                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel B")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.781518;
                    y = 86.144176;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel C")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.781648;
                    y = 86.142468;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel D")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.780168;
                    y = 86.142686;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel E")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.773396;
                    y = 86.143955;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel F")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.773324;
                    y = 86.142748;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel G")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.7721714;
                    y = 86.1425037;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel H")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.771869;
                    y = 86.1435038;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel I")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.7719442;
                    y = 86.1448979;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel J")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.7718403;
                    y = 86.1459633;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Hostel K")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.77172;
                    y = 86.1468302;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Rani Laxmi Bai Hall of Residence")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.777976;
                    y = 86.146188;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Ambedkar Hall of Residence")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.778205;
                    y = 86.145484;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Shyam Da")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.771659;
                    y = 86.143602;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("NIT Canteen")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.778740;
                    y = 86.143004;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("NIT Store")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.777984;
                    y = 86.144303;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Sudha")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.777691;
                    y = 86.144950;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Amul Cafe")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.7749516;
                    y = 86.14407;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Pradeep Restaurant")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.779535;
                    y = 86.143044;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Vikramshila Sabhagriha (VSG)")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.777102;
                    y = 86.143569;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else if (expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition).equals("Technology Student Gymkhana (TSG)")){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    Bundle bundle = new Bundle();
                    x = 22.775086;
                    y = 86.143805;
                    label = expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition);
                    bundle.putString("MarkerText", label);
                    bundle.putDouble("Xcoordinate", x);
                    bundle.putDouble("Ycoordinate", y);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                return false;
            }

        });

    }
}
