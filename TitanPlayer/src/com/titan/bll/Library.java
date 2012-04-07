/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

import java.util.*;


/**
 *
 * @author Brandon
 */
public class Library{
    
    public Set<Song> songs;
    
    public Library(){
        songs = new HashSet<Song>();
    }

    
    public void addSong(Song songToAdd){
       
       songs.add(songToAdd);
       
    }
   

     public void deleteSong(Song songToDelete) {
         Iterator<Song> iterator = songs.iterator();
         
         if(iterator.hasNext()){
             if(songs.equals(songToDelete)){
              songs.remove(songToDelete);
              iterator.next();
             }
         }
     }

     
    public int songCount(){
        return songs.size();
    }
 
    
}
