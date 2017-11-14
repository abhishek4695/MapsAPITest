package com.streamapp.abhishek.mapsapitest;

/**
 * Created by Abhishek on 13/11/2017.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> Hostels = new ArrayList<String>();
        Hostels.add("Rani Laxmi Bai Hall of Residence");
        Hostels.add("Ambedkar Hall of Residence");
        Hostels.add("Hostel A");
        Hostels.add("Hostel B");
        Hostels.add("Hostel C");
        Hostels.add("Hostel D");
        Hostels.add("Hostel E");
        Hostels.add("Hostel F");
        Hostels.add("Hostel G");
        Hostels.add("Hostel H");
        Hostels.add("Hostel I");
        Hostels.add("Hostel J");
        Hostels.add("Hostel K");

        List<String> eating = new ArrayList<String>();
        eating.add("Shyam Da");
        eating.add("NIT Canteen");
        eating.add("NIT Store");
        eating.add("Sudha");
        eating.add("Amul Cafe");
        eating.add("Pradeep Restaurant");



        List<String> location1 = new ArrayList<String>();
        location1.add("Technology Student Gymkhana (TSG)");
        location1.add("Vikramshila Sabhagriha (VSG)");


        expandableListDetail.put("HOSTELS", Hostels);
        expandableListDetail.put("PLACES TO EAT", eating);
        expandableListDetail.put("EVENT LOCATIONS", location1);
        return expandableListDetail;
    }
}
