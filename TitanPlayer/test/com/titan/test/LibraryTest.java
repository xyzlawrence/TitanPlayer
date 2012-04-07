/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;

import com.titan.bll.Library;
import com.titan.bll.Song;

import org.junit.*;
import static org.junit.Assert.*;


/**
 *
 * @author Brandon
 */
public class LibraryTest {
    
    public LibraryTest() {
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
    public void emptyLibraryTest(){
        Library emptyLibrary = new Library();       
        assertEquals(0, emptyLibrary.songCount());
    }
    
    @Test
    public void addSongTest(){
        Library addLibrary = new Library();
        addLibrary.addSong(new Song("Rock Star", "John Smith"));
        addLibrary.addSong(new Song("Rock On", "Randy Smith"));
        assertEquals(2, addLibrary.songCount());        
    }
    
    @Test
    public void removeSongTest(){
       Library removeLibrary = new Library();
        removeLibrary.addSong(new Song("Rock Star", "John Smith"));
        removeLibrary.addSong(new Song("Rock On", "Randy Smith"));
        removeLibrary.deleteSong(new Song("Rock On", "Randy Smith"));
        assertEquals(1, removeLibrary.songCount());
    }
    
    @Test
    public void songNotExsistAfterRemoveTest(){
        Library removeLibrary = new Library();
        removeLibrary.addSong(new Song("Rock Star", "John Smith"));
        removeLibrary.addSong(new Song("Rock On", "Randy Smith"));
        removeLibrary.deleteSong(new Song("Rock Star", "John Smith"));
        removeLibrary.deleteSong(new Song("Rock On", "Randy Smith"));
        
       // assertEquals(removeLibrary.songs.);
        assertEquals(0, removeLibrary.songCount());   
    }
    

}
