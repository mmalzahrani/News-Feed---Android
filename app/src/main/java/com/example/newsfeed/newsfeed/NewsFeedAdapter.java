package com.example.newsfeed.newsfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class NewsFeedAdapter extends ArrayAdapter<NewsFeed> {


     // Constructs a new {@link NewsFeedAdapter}.
    public NewsFeedAdapter(Context context, List<NewsFeed> newsFeeds) {
        super(context, 0, newsFeeds);
    }

    /**
     * Returns a list item view that displays information about the newsfeed at the given position
     * in the list of newsfeed.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.newsfeed_list_item, parent, false);
        }

        // Find the newsfeed at the given position in the list of newsfeed
        NewsFeed currentBooklist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentBooklist.getTitle());

        // Find the TextView in the list_item.xml layout with the ID section.
        TextView authorView = (TextView) listItemView.findViewById(R.id.section);
        authorView.setText(currentBooklist.getSection());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
