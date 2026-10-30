package com.example.practicalfive;

public class TextProcessor {
    public static int getImageResId(String city) {
        switch (city) {
            case "Beijing (北京)": return R.drawable.beijing;
            case "Tianjin (天津)": return R.drawable.tianjin;
            case "Chongqing (重庆)": return R.drawable.chongqing;
            case "Shanghai (上海)": return R.drawable.shanghai;
            default: return 0;
        }
    }

    public static String getDescription(String city, android.content.Context context) {
        switch (city) {
            case "Beijing (北京)": return context.getString(R.string.beijing_desc);
            case "Tianjin (天津)": return context.getString(R.string.tianjin_desc);
            case "Chongqing (重庆)": return context.getString(R.string.chongqing_desc);
            case "Shanghai (上海)": return context.getString(R.string.shanghai_desc);
            default: return "No description available.";
        }
    }
}
