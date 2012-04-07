/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

import com.titan.bll.Song;
import java.util.*;

/**
 *
 * @author Brandon
 */
public class Playlist {
    
    List<Song> songList;
    protected String playlistTitle;

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        songList = new LinkedList<Song>();
       }
    
    public int songCount(){
        return songList.size();
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public void addSong(Song songToAdd) {
        songList.add(songToAdd);
    }
    
}
