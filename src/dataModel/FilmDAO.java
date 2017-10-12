/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;


import databasejavafx.DatabaseJavaFx;
import java.util.logging.Logger;
/**
 *
 * @author chris
 */
public class FilmDAO {
        private String filmTitle;
        private String filmRating;
        private String filmDescription;
        private Double filmPrice;
        private static final Logger logger = Logger.getLogger(FilmDAO.class.getName());
        
    /**
     *
     */
    public FilmDAO(){
        
    }

    /**
     * @return the filmTitle
     */
    public String getFilmTitle() {
        return filmTitle;
    }

    /**
     * @param filmTitle the filmTitle to set
     */
    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    /**
     * @return the filmRating
     */
    public String getFilmRating() {
        return filmRating;
    }

    /**
     * @param filmRating the filmRating to set
     */
    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    /**
     * @return the filmDescription
     */
    public String getFilmDescription() {
        return filmDescription;
    }

    /**
     * @param filmDescription the filmDescription to set
     */
    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    /**
     * @return the filmPrice
     */
    public Double getFilmPrice() {
        return filmPrice;
    }

    /**
     * @param filmPrice the filmPrice to set
     */
    public void setFilmPrice(Double filmPrice) {
        this.filmPrice = filmPrice;
    }
        
        
        
}
