package com.example.newsfeed.newsfeed;

public class NewsFeed {

    // Title of the newsfeed
    private String mTitle;

    // Section of the newsfeed
    private String mSection;

    // Website URL of the NewsFeed
    private String mUrl;

     // Constructs a new {@link NewsFeed} object.
    public NewsFeed(String title, String section, String url) {
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    /**
     * Returns the title of the NewsFeed.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the NewsFeed.
     */
    public String getSection() {
        return mSection;
    }


    /**
     * Returns the website URL to find more information about the NewsFeed.
     */
    public String getUrl() {
        return mUrl;
    }

}
