/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Brandon
 */
public class Player{
    
    private Playlist playlist;
    private int currentSong;
    
    public Player(){
    }
    
    public void loadPlaylist(Playlist playlistToLoad) {
        this.playlist = playlistToLoad;
        currentSong = 0;
    }
    
    public String getCurrentSong(){
        return playlist.songList.get(currentSong).title;
    }
    
    public String isPlaylistLoaded(String title){
        return playlist.playlistTitle; 
    }
    
    public void skipSong() {
        currentSong+=1;
    }
}
