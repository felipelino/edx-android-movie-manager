package flino.study.moviemanager.models;


import android.net.Uri;

import java.io.Serializable;

/**
 * Created by felipe.lino on 8/4/17.
 */

public class Movie implements Serializable
{
    private String id;
    private String title;
    private String overview;
    private float voteAverage;
    private float voteCount;
    private String posterPath;
    private String backdropPath;

    public Movie(String id,
                 String title,
                 String overview,
                 float voteAverage,
                 float voteCount,
                 String posterPath,
                 String backdropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342%s", posterPath);
    }

    public Uri getPosterPathUri() {
        String strUri = this.getPosterPath();
        Uri uri = Uri.parse(strUri);
        return uri;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w780%s", backdropPath);
    }

    public Uri getBackdropPathUri() {
        String strUri = getBackdropPath();
        Uri uri = Uri.parse(strUri);
        return uri;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }
}
