package controllers;

public class FilmControllerProxy implements controllers.FilmController {
  private String _endpoint = null;
  private controllers.FilmController filmController = null;
  
  public FilmControllerProxy() {
    _initFilmControllerProxy();
  }
  
  public FilmControllerProxy(String endpoint) {
    _endpoint = endpoint;
    _initFilmControllerProxy();
  }
  
  private void _initFilmControllerProxy() {
    try {
      filmController = (new controllers.FilmControllerServiceLocator()).getfilmController();
      if (filmController != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)filmController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)filmController)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (filmController != null)
      ((javax.xml.rpc.Stub)filmController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public controllers.FilmController getFilmController() {
    if (filmController == null)
      _initFilmControllerProxy();
    return filmController;
  }
  
  public java.lang.String updateMovie(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException{
    if (filmController == null)
      _initFilmControllerProxy();
    return filmController.updateMovie(id, title, year, director, stars, review);
  }
  
  public java.lang.String deleteMovie(int id) throws java.rmi.RemoteException{
    if (filmController == null)
      _initFilmControllerProxy();
    return filmController.deleteMovie(id);
  }
  
  public java.lang.String getAllFilmData(java.lang.String format) throws java.rmi.RemoteException{
    if (filmController == null)
      _initFilmControllerProxy();
    return filmController.getAllFilmData(format);
  }
  
  public java.lang.String searchFilmByInput(java.lang.String format, java.lang.String searchBy, java.lang.String input) throws java.rmi.RemoteException{
    if (filmController == null)
      _initFilmControllerProxy();
    return filmController.searchFilmByInput(format, searchBy, input);
  }
  
  public java.lang.String insertAMovie(java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException{
    if (filmController == null)
      _initFilmControllerProxy();
    return filmController.insertAMovie(title, year, director, stars, review);
  }
  
  
}