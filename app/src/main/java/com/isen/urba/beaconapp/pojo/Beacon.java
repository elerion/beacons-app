package com.isen.urba.beaconapp.pojo;

import android.content.Intent;

import org.altbeacon.beacon.Identifier;

/**
 * Created by romain on 19/05/2016.
 */

public class Beacon implements Comparable<Beacon>{

    private String name;
    private String bluetoothName;
    private String bluetoothAdress;
    private int rssi;

    public Beacon() {
        this.name = "Inconnu";
        this.bluetoothAdress = "0:0:0:0:0:0";
        this.bluetoothName = "BEACON";
        this.rssi = 0;
    }

    public Beacon(String name, String bluetoothName, String bluetoothAdress, int rssi) {
        this.name = name;
        this.bluetoothName = bluetoothName;
        this.bluetoothAdress = bluetoothAdress;
        this.rssi = rssi;
    }
    public Beacon(String bluetoothName, String bluetoothAdress, int rssi) {
        this.name = "Inconnu";
        this.bluetoothName = bluetoothName;
        this.bluetoothAdress = bluetoothAdress;
        this.rssi = rssi;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBluetoothName() {
        return bluetoothName;
    }

    public void setBluetoothName(String bluetoothName) {
        this.bluetoothName = bluetoothName;
    }

    public String getBluetoothAdress() {
        return bluetoothAdress;
    }

    public void setBluetoothAdress(String bluetoothAdress) {
        this.bluetoothAdress = bluetoothAdress;
    }

    @Override
    public int compareTo(Beacon another) {
        return ((Integer)(this.getRssi())).compareTo((Integer)(another.getRssi()));
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && o instanceof Beacon){
            Beacon other = (Beacon) o;
            return (this.getBluetoothAdress().equals(other.getBluetoothAdress()) && this.getBluetoothName().equals(other.getBluetoothName()));
        }
        return false;
    }
}
