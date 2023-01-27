package controllers;

import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import database.FilmDAO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import models.Film;
import models.filmsList;

public class filmController {
	Gson gson = new	Gson();
	FilmDAO dao = new FilmDAO();
	ArrayList<Film> allFilms = new ArrayList<Film>();
	
	//takes the format and returns a list of films in the requested format
	public String getAllFilmData(String format) {
		allFilms = dao.getAllFilms();
		if(format != null) {
				if(format.equals("json")) {
					return gson.toJson(allFilms);
				}else if(format.equals("xml")) {
					filmsList fl = new filmsList(allFilms);
					StringWriter sw = new StringWriter();
					JAXBContext context;
					try {
						context = JAXBContext.newInstance(filmsList.class);
						Marshaller m = context.createMarshaller();
						m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
						m.marshal(fl, sw);
						return sw.toString();
					} 
					catch (JAXBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(format.equals("text")) {
					ArrayList<String>out = new ArrayList<String>();
			        for(int i = 0;i<allFilms.size(); i++) {
						int id = allFilms.get(i).getId();
						String title = allFilms.get(i).getTitle();
						int year = allFilms.get(i).getYear();
						String director = allFilms.get(i).getDirector();
						String stars = allFilms.get(i).getStars();
						String review = allFilms.get(i).getReview();
						out.add(("$"+id+"#"+title+"#"+year+"#"+director+"#"+stars+"#"+review));	
			        }	
			        return out.toString();
				}
		}
		return "invalid format";
	}
	
	//search film by the user input
	public String searchFilmByInput(String format,String searchBy, String input) {
		if(format != null) {
			ArrayList<Film> allFilms = dao.getFilmBySearch(input,searchBy);
			if(format.equals("json")) { 	
				
				return gson.toJson(allFilms);	
			}else if(format.equals("xml")) {
				filmsList fl = new filmsList(allFilms);
				StringWriter sw = new StringWriter();
				JAXBContext context;
				try {
					context = JAXBContext.newInstance(filmsList.class);
					Marshaller m = context.createMarshaller();
					m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
					m.marshal(fl, sw);
					return sw.toString();
				} 
				catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(format.equals("text")) {
				ArrayList<String>out = new ArrayList<String>();
		        for(int i = 0;i<allFilms.size(); i++) {
					int id = allFilms.get(i).getId();
					String title = allFilms.get(i).getTitle();
					int year = allFilms.get(i).getYear();
					String director = allFilms.get(i).getDirector();
					String stars = allFilms.get(i).getStars();
					String review = allFilms.get(i).getReview();
					out.add(("$"+id+"#"+title+"#"+year+"#"+director+"#"+stars+"#"+review));	
		        }	
		        return out.toString();
			}
		}
		return "invalid format";
	}
	
	//takes the film data from the user and inserts them into the database
	public String insertAMovie(String title,int year,String director,String stars, String review) {
		if(title!= null &&  year != 0 &&  director!= null &&  stars!= null &&  review!= null) {
				Film film = new Film(title,year,director,stars,review);
				try {
					dao.insertContact(film);
					return("film added");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return "one or more fields are empty";
	}
	
	//takes data with the id and sends an update request
	public String updateMovie(int id,String title,int year,String director,String stars, String review) {
		
		if(title!= null &&  year != 0 &&  director!= null &&  stars!= null &&  review!= null) {
				Film film = new Film(id,title,year,director,stars,review);
				try {
					dao.updateFilm(film);
					return("film updated");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return "one or more fields are empty";
	}


	//gets the id and deletes the movie
	public String deleteMovie(int id) {
		if(id != 0) {
			try {
				dao.deleteFilm(id);
				return("film deleted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return "one field is empty";
	}

}