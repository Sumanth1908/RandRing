package com.sumanthjillepally.randomringtones;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sumanth on 08-12-2017.
 */
public class CustomAdapter extends ArrayAdapter<SearchResults.SongData>
{
    private Activity context;
    private ArrayList<SearchResults.SongData> sngList;
    //private long resourceid;
    public CustomAdapter(Activity context,int textViewResourceId,ArrayList<SearchResults.SongData> snglist) {
        super(context,textViewResourceId,snglist);
            this.context = context;
            this.sngList = snglist;
            //this.resourceid=resourceid;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.custom_adapter,null,true);

        TextView title =(TextView) rowview.findViewById(R.id.songtitle);
        //TextView sngID =(TextView) rowview.findViewById(R.id.songID);
        CheckBox sngID = (CheckBox) rowview.findViewById(R.id.checkBoxRow);
        title.setText(Integer.toString(position+1)+". "+sngList.get(position).getSongTitle());
        //sngID.setText(Integer.toString((int) sngList.get(position).getSongID()));
        //sngID.setText(Integer.toString(position+1)+" ");
        ImageView play = (ImageView) rowview.findViewById(R.id.rowPlay);
        //play.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);

        return rowview;
    }
}
