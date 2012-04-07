/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;

import com.titan.bll.Player;
import com.titan.bll.Playlist;
import com.titan.bll.Song;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Brandon
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    @Test
    public void createPlayer(){
        Player createPlayer = new Player();
        createPlayer.loadPlaylist(new Playlist("90 Music"));
        assertEquals("90 Music" , createPlayer.isPlaylistLoaded("90 Music"));
    }
    
    @Test
    public void addPlaylistWithSongsToPlayer(){
        Playlist myPlaylist = new Playlist("80 Music");
        Player createPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith"));     
        createPlayer.loadPlaylist(myPlaylist);
        assertEquals("80 Music" , createPlayer.isPlaylistLoaded("80 Music"));
        assertEquals("Three Kings", createPlayer.getCurrentSong()); 
    }
    
    @Test
    public void playSong(){
        Playlist myPlaylist = new Playlist("80 Music");
        Player createPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith"));     
        createPlayer.loadPlaylist(myPlaylist);
        assertEquals("80 Music" , createPlayer.isPlaylistLoaded("80 Music"));
        assertEquals("Three Kings", createPlayer.getCurrentSong()); 
    }
    
    @Test
    public void skipSong(){
        Playlist myPlaylist = new Playlist("80 Music");
        Player myPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith"));
        myPlaylist.addSong(new Song("Rock On", "Allen Smith"));
        myPlaylist.addSong(new Song("Blank Stare", "Allen Smith"));
        myPlayer.loadPlaylist(myPlaylist);
        assertEquals("80 Music" , myPlayer.isPlaylistLoaded("80 Music"));
        assertEquals("Three Kings", myPlayer.getCurrentSong());
        myPlayer.skipSong();
        assertEquals("Rock On", myPlayer.getCurrentSong());
        myPlayer.skipSong();
        assertEquals("Blank Stare", myPlayer.getCurrentSong());
        
    }
    
}
