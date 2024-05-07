/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.spotify.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.spotify.entities.*;

/**
 *
 * @author alang
 */
public class Spotify {
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        artista.setNombre("Ezkai");
        artista.setPerfil("Artista versatil y blablabla");
        artista.setOyentesMensuales(10000);
        artista.setFollowers(550000);
        
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Lo minimo");
        cancion1.setDuracion(180);
        
        Cancion cancion2 = new Cancion();
        cancion2.setTitulo("Villain");
        cancion1.setDuracion(200);
        
        List<Cancion> rolas = new ArrayList<>();
        rolas.add(cancion1);
        rolas.add(cancion2);
        
        
        
        Album album = new Album();
        album.setNombre("Rain");
        album.setArtista(artista);
        album.setFechaLanzamiento(new Date());
        album.setCanciones(rolas);
        album.setGenero("Pop");
        
        System.out.println("Nombre del artista: " + album.getArtista().getNombre());
        System.out.println("Nombre del album: " + album.getNombre());
        System.out.println("Genero del album: " + album.getGenero());
        System.out.println("Perfil del artista: " + album.getArtista().getPerfil());
        System.out.println("Oyentes mensuales del artista: " + album.getArtista().getOyentesMensuales());
        System.out.println("Followers del artista: " + album.getArtista().getFollowers());
        for(Cancion c :album.getCanciones()){
             System.out.println(c.getTitulo());
                System.out.println(c.getDuracion());
        }
            System.out.println(album.getNombre());
            System.out.println(album.getGenero());
    }
    
}
