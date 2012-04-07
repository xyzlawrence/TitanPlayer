/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;


import com.titan.bll.Playlist;
import com.titan.bll.Song;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Brandon
 */
public class PlaylistTest {
    
    public PlaylistTest() {
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
    public void emptyPlaylistTest(){
        Playlist emptyPlaylist = new Playlist("My Playlist");
        assertEquals(0, emptyPlaylist.songCount());
        
    }
    
    @Test
    public void verifyNamePlaylistTest(){
        Playlist namePlaylist = new Playlist("Brandon Country Songs");
        assertEquals("Brandon Country Songs", namePlaylist.getPlaylistTitle());
    }
    
    @Test
    public void addSongToPlaylistTest(){
        Playlist addSongToPlaylist = new Playlist("Brandon Rock Songs");
        addSongToPlaylist.addSong(new Song("Rock of Love", "Queen"));
        assertEquals("Brandon Rock Songs", addSongToPlaylist.getPlaylistTitle());
        assertEquals(1, addSongToPlaylist.songCount());
    }
    
    
}
