package com.example.zowu.layoutfun;

public class ItemViewData {
    public final String commentary;
    public final String imageUrl;
    public final String text;
    public final String subtext;
    public final String socialFooter;

    ItemViewData(String commentary, String imageUrl, String text, String subtext, String socialFooter) {
        this.commentary = commentary;
        this.imageUrl = imageUrl;
        this.text = text;
        this.subtext = subtext;
        this.socialFooter = socialFooter;
    }
}
