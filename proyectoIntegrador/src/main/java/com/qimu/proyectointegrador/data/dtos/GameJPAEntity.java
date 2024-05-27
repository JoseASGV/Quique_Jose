package com.qimu.proyectointegrador.data.dtos;

import jakarta.persistence.*;

@Entity(name = "game")
@Table(name = "GAMES")
public class GameJPAEntity {
   @Id
   private String id;

   @Column(nullable = false)
   private String title;

   @Column(nullable = false)
   private String studio;

   @ManyToOne
   @JoinColumn(name="genre_id")
   private GenreJPAEntity genre;


   public GameJPAEntity(String id, String title, String studio, GenreJPAEntity genre) {
      this.id = id;
      this.title = title;
      this.studio = studio;
      this.genre = genre;
   }
   public GameJPAEntity() {
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

   public GenreJPAEntity getGenre() {
      return genre;
   }

   public void setGenre(GenreJPAEntity genre) {
      this.genre = genre;
   }

   public String getStudio() {
      return studio;
   }

   public void setStudio(String studio) {
      this.studio = studio;
   }
}
