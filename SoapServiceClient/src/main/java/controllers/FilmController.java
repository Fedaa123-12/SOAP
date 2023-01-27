/**
 * FilmController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package controllers;

public interface FilmController extends java.rmi.Remote {
    public java.lang.String updateMovie(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException;
    public java.lang.String deleteMovie(int id) throws java.rmi.RemoteException;
    public java.lang.String getAllFilmData(java.lang.String format) throws java.rmi.RemoteException;
    public java.lang.String searchFilmByInput(java.lang.String format, java.lang.String searchBy, java.lang.String input) throws java.rmi.RemoteException;
    public java.lang.String insertAMovie(java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException;
}
