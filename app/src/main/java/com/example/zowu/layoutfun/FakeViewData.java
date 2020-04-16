package com.example.zowu.layoutfun;

public enum FakeViewData {
    ALL("Look at this nice picture that I found through google online. It is a nice picture.",
        "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
        "Sydney Opera House Sunset",
        "google.com",
        "100 likes"),
    COMMENTARY_IMAGE("Look at this nice picture that I found through google online. It is a nice picture.",
                     "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                     null,
                     null,
                     null),
    COMMENTARY_NARROW_IMAGE("Look at this nice narrow picture that I found through google online. It is a nice picture.",
                     "https://marketingchristianbooks.files.wordpress.com/2015/07/narrow.jpg",
                     null,
                     null,
                     null),
    COMMENTARY_SOCIALFOOTER("Look at this nice picture that I found through google online. It is a nice picture.",
                     "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                     null,
                     null,
                            "100 likes"),
    IMAGE_TEXT_SUBTEXT(null,
                       "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                       "Sydney Opera House Sunset",
                       "google.com",
                       null),
    IMAGE_TEXT_SOCIALFOOTER(null,
                            "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                            null,
                            null,
                            "100 likes"),
    IMAGE_ONLY(null,
               "https://images.unsplash.com/photo-1524293581917-878a6d017c71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
               null,
               null,
               null),
    COMMENTARY_ONLY("Look at this nice picture that I found through google online. It is a nice picture.",
                    null,
                    null,
                    null,
                    null),
    MAX_ALL("a very long text used just to measure the max height of this view, a very long text used just to measure the max height of this view, a very long text used just to measure the max height of this view",
            null,
            "a very long text used just to measure the max height of this view, a very long text used just to measure the max height of this view, a very long text used just to measure the max height of this view",
            "a very long text used just to measure the max height of this view, a very long text used just to measure the max height of this view, a very long text used just to measure the max height of this view",
            "socialFooter");

    public final ItemViewData itemViewData;

    FakeViewData(String commentary, String imageUrl, String text, String subtext, String socialFooter) {
        itemViewData = new ItemViewData(commentary, imageUrl, text, subtext, socialFooter);
    }
}
