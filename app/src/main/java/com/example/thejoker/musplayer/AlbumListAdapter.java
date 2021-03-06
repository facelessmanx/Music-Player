package com.example.thejoker.musplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by The Joker on 02/11/2015.
 */
public class AlbumListAdapter extends BaseAdapter
{
    private ArrayList<Song> songs;
    private LayoutInflater songInf;
    public AlbumListAdapter(Context c, ArrayList<Song> theSongs)
    {
        songs = theSongs;
        songInf = LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout songLay = (LinearLayout)songInf.inflate(R.layout.songview,parent,false);
        TextView songtitle = (TextView)songLay.findViewById(R.id.songtitle);
        TextView songalbum = (TextView)songLay.findViewById(R.id.songdetails);
        Song currSong = songs.get(position);
        songtitle.setText(currSong.getTitle());
        songalbum.setText(currSong.getAlbum());
        songLay.setTag(position);
        return songLay;
    }
}
